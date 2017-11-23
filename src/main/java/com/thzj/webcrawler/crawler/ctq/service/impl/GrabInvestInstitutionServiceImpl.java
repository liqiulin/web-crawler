package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestInstitutionService;
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
import java.util.stream.Collectors;


@Slf4j
@Service
public class GrabInvestInstitutionServiceImpl implements GrabInvestInstitutionService{

    @Override
    public Map<String, InvestInstitution> grabInvestInstitutionInfo(List<String> instituteIdList) {
        String url;
        Map<String, InvestInstitution> investInstitutions = Maps.newConcurrentMap();
        final String institueDetailUrl = "https://www.vc.cn/institutions/";
        InvestInstitution investInstitution;
        try {
            for (String institueId : instituteIdList) {
                url = institueDetailUrl + institueId;
                Document doc = Jsoup.connect(url).get();
                investInstitution = getInvestInstitution(doc, institueId, url);
                investInstitutions.put(institueId, investInstitution);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.warn("grabInvestInstitutionInfo failed! instituteIdList[{}]", instituteIdList, e);
        }
        return Maps.newConcurrentMap();
    }


    /**
     * 获取所有投资机构的ID
     */
    public static List<String> getInstitutionIds() {
        // Todo 写在ConfigCenter里面
        final String institutionUrl = "https://www.vc.cn/institutions?action=index&controller=institutions&page=";
        List<String> institutionIds = new ArrayList<>();
        String url;

        try {
            for (Integer i = 1; ; i++) {
                url =  institutionUrl + i.toString() + "&type=active";
                Document doc = Jsoup.connect(url).get();
                Elements tableList = doc.getElementById("institutions-list").select("tbody.table-list");
                Elements institutionInfo = tableList.select("tr");
                if (null == institutionInfo || institutionInfo.isEmpty()) {
                    break;
                }

                for (Element element : institutionInfo) {
                    Elements elements = element.getElementsByClass("avatar square").select("a");
                    String infoDetailsUrl = elements.get(1).attr("href");
                    String userId = infoDetailsUrl.substring(14);
                    institutionIds.add(userId);
                }
            }
            return institutionIds;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return institutionIds;
    }

    private InvestInstitution getInvestInstitution(Document doc, String instituteId, String url) {
        InvestInstitution investInstitution = new InvestInstitution();

        //投资机构基本信息
        Elements institutionInfo = doc.getElementsByClass("institutions_info");
        String avatarUrl = institutionInfo.select("img").attr("src");
        String name = institutionInfo.select("div.name").text();
        String homePage = institutionInfo.select("div.url").select("a").attr("href");

        //投资机构简介
        Element profileElement = doc.getElementById("user_intro");
        String profile = String.join("",profileElement.getElementsByTag("p").eachText());

        //投资风格：关注行业&投资轮次
        Elements investStyle = doc.getElementById("module_style").getElementsByClass("tag-list row");
        String tag;
        List<String> investIndustries = new ArrayList<>();
        List<String> investRounds = new ArrayList<>();
        for (Element element : investStyle) {
            tag = element.getElementsByClass("cell label-name").text();
            if ("投资行业：".equals(tag)) {
                investIndustries = element.getElementsByClass("cell label-item").select("a").eachText();
            } else {
                investRounds = element.getElementsByClass("cell label-item").select("a").eachText();
            }
        }

        //投资案例:暂时只保存项目ID
        //Todo 机构投资案例可以跳转至投资项目，投资人不可以

        //机构成员:这里只保存成员ID
        List<String> members = doc.getElementById("working-member-list").select("a").stream().map(
                (e) -> e.attr("href").substring(7)).collect(Collectors.toList());

        investInstitution.setName(name);
        investInstitution.setId(instituteId);
        investInstitution.setProfile(profile);
        //investInstitution.setEmail();
        //investInstitution.setPhone();
        investInstitution.setMembers(members);
        //investInstitution.setProvince();
        //investInstitution.setCity();
        investInstitution.setDetailUrl(url);
        investInstitution.setAvatarUrl(avatarUrl);
        investInstitution.setHomePage(homePage);
        //investInstitution.setInvestCases();
        investInstitution.setInvestRounds(investRounds);
        investInstitution.setInvestIndustries(investIndustries);

        return investInstitution;
    }

    public static void main (String[] args) {
        List<String> list = getInstitutionIds();
        System.out.println(list);
    }
}
