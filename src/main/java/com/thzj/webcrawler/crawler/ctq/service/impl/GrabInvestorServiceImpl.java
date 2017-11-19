package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.base.Strings;
import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.WorkExperience;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class GrabInvestorServiceImpl implements GrabInvestorService {

    List<String> userIdList = getUserIds();
    @Override
    public List<Investor> grabInvestorInfo(List<String> userIdList) {

        String url;
        List<Investor> investors = new ArrayList<>();
        final String userDetailsUrl = "https://www.vc.cn/users/";
        for (String userId : userIdList) {
            url = userDetailsUrl + userId;

            try {
                Investor investor = new Investor();
                Document doc = Jsoup.connect(url).get();
                String avatarUrl = doc.getElementsByAttributeValue("class", "relative").select("img").attr("src");
                String name = doc.getElementsByAttributeValue("class", "name").get(0).text();
                Elements companyInfo = doc.getElementsByAttributeValue("class", "pitch");
                String position = companyInfo.get(0).text();
                String company = companyInfo.get(0).select("a").text();
                String profile = doc.getElementById("user_intro").select("p").text();
                //判断是否为空
                Elements elements = doc.getElementsByAttributeValue("class", "cell label_list");

                //投资行业
                List<String> investIndustries = new ArrayList<>();
                Elements focusIndustryElements = elements.get(0).getElementsByTag("a");
                for (Element e : focusIndustryElements) {
                    investIndustries.add(e.text());
                }

                //投资阶段
                List<String> investRounds = new ArrayList<>();
                Elements investStageElements = elements.get(1).getElementsByTag("a");
                for (Element e : investStageElements) {
                    investRounds.add(e.text());
                }

                //投资计划
                Elements investPlanElements = doc.getElementsByClass("column");
                String investPlan = Jsoup.parse(investPlanElements.toString()).getElementsByClass("cont").text();

                //单笔可投
                Elements singleInvestElements = doc.getElementsByClass("money");
                String perRoundMoney = Jsoup.parse(singleInvestElements.toString()).getElementsByClass("cont").text();

                //投资案例
                InvestCase investCase = new InvestCase();
                List<InvestCase> investCaseList = new ArrayList<>();
                Elements investCases = doc.getElementById("invest_cases").getElementsByClass("case_card");
                for (Element element : investCases) {
                   investCase.setAvatarUrl(element.getElementsByTag("img").attr("src"));
                   investCase.setName(element.getElementsByClass("name").text());
                   investCase.setProfile(element.getElementsByClass("pitch").text());
                   investCase.setInvestorMoney(element.getElementsByClass("money").text());
                   investCase.setInvestorRound(element.getElementsByClass("round").text());
                   investCase.setTime(element.getElementsByClass("cell date").text());
                   investCaseList.add(investCase);
                }

                //工作经历
                WorkExperience workExperience = new WorkExperience();
                List<WorkExperience> workExperienceList = new ArrayList<>();
                Elements workExperiences = doc.getElementById("module_work").getElementsByClass("experience-item");
                for (Element element : workExperiences) {
                    workExperience.setTime(element.getElementById("span").text());
                    workExperience.setCompany(element.getElementsByClass("info").select("div").get(0).text());
                    workExperience.setPosition(element.getElementsByClass("info").select("div").get(0).text());
                    workExperienceList.add(workExperience);
                }

                //个人信息
                String location = doc.getElementsByClass("authenticated").select("li.location").get(0).getElementById("span").text();
                String[] string = location.split(".");
                String province = string[0];
                String city = string[1];

                investor.setName(name);
                investor.setId(userId);
                investor.setAvatarUrl(avatarUrl);
                investor.setPosition(position);
                investor.setProfile(profile);
                investor.setProvince(province);
                investor.setCity(city);
                investor.setInvestRounds(investRounds);
                investor.setCompany(company);
                investor.setDetailUrl(url);
                investor.setInvestIndustries(investIndustries);
                investor.setInvestCase(investCaseList);
                investor.setWorkExperiences(workExperienceList);

                investors.add(investor);
            } catch (IOException ie) {
                ie.printStackTrace();
                log.warn("grabInvestorInfo failed! instituteIdList[{}]", userIdList, ie);
            } catch (Exception e) {
                e.printStackTrace();
                log.warn("grabInvestorInfo failed! instituteIdList[{}]", userIdList, e);

            }
        }

        return investors;
    }

    /**
     * 获取所有投资人/user的ID
     */
    public List<String> getUserIds() {
        // Todo 写在ConfigCenter里面
        final String userListUrl = "https://www.vc.cn/investors?action=index&controller=investors&page=";
        List<String> userIds = new ArrayList<>();
        String url;

        try {
            for (Integer i = 1; ; i++) {
                url = userListUrl + i.toString();
                Document doc = Jsoup.connect(url).get();
                Element tableList = doc.getElementById("user-list");
                Elements personalInfo = tableList.getElementsByTag("tr");
                if (null == personalInfo || personalInfo.isEmpty()) {
                    break;
                }

                for (Element pInfo : personalInfo) {
                    String infoDetailsUrl = pInfo.getElementsByClass("name").select("a").attr("href");
                    String userId = infoDetailsUrl.substring(7);
                    userIds.add(userId);
                }
            }
            return userIds;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return userIds;
    }
}
