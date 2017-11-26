package com.thzj.webcrawler.crawler.ctq.service.impl;

import antlr.StringUtils;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.WorkExperience;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
import com.thzj.webcrawler.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class GrabInvestorServiceImpl implements GrabInvestorService {

    static final String userDetailsUrl = "https://www.vc.cn/users/";

    @Override
    public Map<String, Investor> grabInvestorInfo(List<String> userIdList) {
        Map<String, Investor> investors = Maps.newConcurrentMap();

        try {
            for (String userId : userIdList) {
                String url = userDetailsUrl + userId;
                Document doc = Jsoup.connect(url).get();
                Investor investor = getInvestor(userId, doc, url);
                investors.put(userId, investor);
            }
            return investors;
        } catch (IOException ie) {
            ie.printStackTrace();
            log.warn("grabInvestorInfo failed! instituteIdList[{}]", userIdList, ie);
        } catch (Exception e) {
            e.printStackTrace();
            log.warn("grabInvestorInfo failed! instituteIdList[{}]", userIdList, e);

        }
        return investors;
    }

    private Investor getInvestor(String userId, Document doc, String url) throws IOException {

        Investor investor = new Investor();

        //基本信息
        Elements baseInfoElements = doc.getElementsByClass("users_details");
        //投资人头像
        String avatarUrl = baseInfoElements.select("img").attr("src");
        //投资人姓名
        String name = baseInfoElements.select("div.name").text();

        //公司信息
        String[] companyInfo = baseInfoElements.select("div.pitch").text().split("·");

        //职位
        String position = companyInfo[1];

        //公司名称
        String company = companyInfo[0];

        //简介
        String profile = doc.getElementById("user_intro").select("p").text();

        //判断是否为空
        Elements elements = doc.getElementById("module_keyword").select(".details");
        //投资行业
        List<String> investIndustries = new ArrayList<>();
        Elements focusIndustryElements = elements.select("li.field").select("a");
        for (Element e : focusIndustryElements) {
            investIndustries.add(e.text());
        }

        //投资阶段
        List<String> investRounds = new ArrayList<>();
        Elements investStageElements = elements.select("li.stage").select("a");
        for (Element e : investStageElements) {
            investRounds.add(e.text());
        }

        //投资案例
        List<InvestCase> investCaseList = new ArrayList<>();
        getInvestCase(doc, investCaseList);

        //工作经历
        List<WorkExperience> workExperienceList = new ArrayList<>();
        buildWorkExperience(doc, workExperienceList);

        //个人信息
        String location = doc.getElementsByClass("authenticated").select("li.location").get(0).getElementsByTag("span").text();
        location = org.apache.commons.lang.StringUtils.deleteWhitespace(location);
        String[] string = location.split("·");
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
        return investor;
    }

    //Todo 翻页暂不处理
    private void getInvestCase(Document doc, List<InvestCase> investCaseList) {
        Elements investCases = doc.getElementById("invest_cases").getElementsByClass("case_card");
        for (Element element : investCases) {
            InvestCase investCase = new InvestCase();
            investCase.setAvatarUrl(element.getElementsByTag("img").attr("src"));
            investCase.setName(element.getElementsByClass("name").text());
            investCase.setProfile(element.getElementsByClass("pitch").text());
            investCase.setInvestorMoney(element.getElementsByClass("money").text());
            investCase.setInvestorRound(element.getElementsByClass("round").text());
            investCase.setTime(element.getElementsByClass("cell date").text());
            investCaseList.add(investCase);
        }
    }

    private void buildWorkExperience(Document doc, List<WorkExperience> workExperienceList) {
        Elements workExperiences = doc.getElementById("module_work").getElementsByClass("experience-item");
        for (Element element : workExperiences) {
            WorkExperience workExperience = new WorkExperience();
            String workPeriod = element.getElementsByTag("span").text();
            String[] workPeriods = workPeriod.split("~");
            workExperience.setTimeFrom(DateUtil.stringToDate(workPeriods[0]));
            if (workPeriods[1] == "至今") {
                workExperience.setTimeTo(null);
            } else {
                workExperience.setTimeTo(DateUtil.stringToDate(workPeriods[1]));
            }
            workExperience.setCompany(element.getElementsByClass("info").select("div").get(0).text());
            workExperience.setPosition(element.getElementsByClass("info").select("div").get(1).text());
            workExperienceList.add(workExperience);
        }
    }

    /**
     * 获取所有投资人/user的ID
     */
    @Override
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




    public static void main (String[] args) {
        List<String> list = new ArrayList<>();
//        Map<String, Investor> result = grabInvestorInfo(list);
        //result = grabInvestorInfo(list);
 //       System.out.println(result);
    }
}
