package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.*;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
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
import java.util.regex.Pattern;

@Slf4j
@Service
public class GrabStartUpServiceImpl implements GrabStartUpService {

    @Override
    public Map<String, Startup> grabStartUpInfo(List<String> startupIds) {
        Map<String, Startup> startupMaps = Maps.newConcurrentMap();
        final String startupDetailUrl = "https://www.vc.cn/startups/";
        Startup startup;
        try {
            for (String startupId : startupIds) {
                String url = startupDetailUrl + startupId + "?show_investment=true";
                Document doc = Jsoup.connect(url).get();
                startup = getStartUpFromHtml(doc, startupId, url);
                startupMaps.put(startupId, startup);
            }
            return startupMaps;
        } catch (IOException e) {
            e.printStackTrace();
            log.warn("grabStartupInfo failed! startupIdList[{}]", startupIds, e);
        }
        return startupMaps;
    }

    @Override
    public List<String> getStartUpIds() {
        // Todo 写在ConfigCenter里面
        final String startUpUrl = "https://www.vc.cn/investments?action=index&controller=investments&page=";
        List<String> startUpIds = new ArrayList<>();
        String url;

        try {
            for (Integer i = 1; ; i++) {
                url =  startUpUrl + i.toString() + "&tab=t24&type=investment";
                org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
                Elements tableList = doc.getElementById("investment-list").select("tbody");
                Elements startUpInfo = tableList.select("tr");
                if (null == startUpInfo || startUpInfo.isEmpty()) {
                    break;
                }

                for (Element element : startUpInfo) {
                    Elements elements = element.getElementsByClass("avatar square").select("a");
                    String infoDetailsUrl = elements.attr("href");
                    int startUpIndex = infoDetailsUrl.lastIndexOf("startups");
                    String userId = infoDetailsUrl.substring(startUpIndex+9);
                    startUpIds.add(userId);
                }
            }
            return startUpIds;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return startUpIds;
    }

    private Startup getStartUpFromHtml(Document doc, String startupId, String url) {

        Startup startup = new Startup();

        //融资项目基本信息
        Elements baseInfo = doc.getElementsByClass("main-startups").select(".startups-info");

        //项目logo
        String avatarUrl = baseInfo.select(".avatar").select("a").attr("src");

        //项目名称
        String name = baseInfo.select(".baseInfo").select("li.name").text();

        //项目所属行业
        String industry = baseInfo.select(".baseInfo").select("li.industry").select("a").first().text();

        //项目摘要
        String summary = baseInfo.select(".baseInfo").select("li.pitch").text();

        Elements companyInfo = doc.getElementsByClass("company-info").select(".info");
        String location = companyInfo.first().text();

        //地区：省、市
        String[] locationArray = location.split("·");
        String province = locationArray[0];
        String city = locationArray[1];

        //公司全称
        String companyName = companyInfo.get(2).select("span").text();

        //成立时间
        String establishTimeString = companyInfo.last().text();
        String establishTime = establishTimeString.substring(establishTimeString.indexOf("：") + 1);

        //项目简介
        String profile = doc.getElementById("basic_info").select("item-content").select("p").text();

        //融资历史 Todo 这里可能需要翻页处理，暂不处理
        Elements financingHistoryElements = doc.getElementById("financing_info").getElementsByClass("financing-history").select("li");
        List<FinancingHistory> financingHistories = buildFinancingHistory(startupId, financingHistoryElements);


        //项目成员 Todo 翻页-暂不处理
        Elements startupMembersElements = doc.getElementById("team_info").
                getElementsByClass("div.startup_members").select("li.member");
        List<StartupMember> startupMembers = buildStartupMembers(startupId, startupMembersElements);

        //产品链接
        Element productElement = doc.getElementById("product_info");
        //Todo 图片链接可能是List类型，暂不处理
        String productsUrl = productElement.select("div.photos-views").select("img").attr("src");

        //产品网站 Todo 这里可能会有好几个产品网址，目前只取第一个
        String productsWebsite = productElement.select(".main-products-list").select("li").
                select("a[href]").first().attr("href");

        //发展历程 Todo 目前没发现投融项目里有发展历程的，先不抓取
        List<DevelopmentHistory> developmentHistorys = Lists.newArrayList();

        startup.setName(name);
        startup.setCity(city);
        startup.setId(startupId);
        startup.setDetailUrl(url);
        startup.setSummary(summary);
        startup.setProfile(profile);
        startup.setIndustry(industry);
        startup.setProvince(province);
        startup.setAvatarUrl(avatarUrl);
        startup.setMembers(startupMembers);
        startup.setCompanyName(companyName);
        startup.setProductImgUrl(productsUrl);
        startup.setProductHomePage(productsWebsite);
        startup.setEstablishTime(DateUtil.stringToDate(establishTime));
        startup.setHistory(developmentHistorys);
        startup.setFinancingHistories(financingHistories);

        return startup;

    }

    /**
     * 获取融资历史的投资方
     *
     * @param element
     * @return
     */
    List<String> getFinancingHistoryInvestorList(Element element) {
        List<String> result = new ArrayList<>();
        int index;
        element.select("div.investors-list").select("a").forEach(element1 -> {
            //Todo 直接取子串
            result.add(element1.attr("href").substring(14));
        });
        return result;
    }

    /**
     * 获取融资历史
     *
     * @param startupId
     * @param financingHistoryElements
     * @return
     */
    private List<FinancingHistory> buildFinancingHistory(String startupId, Elements financingHistoryElements) {
        List<FinancingHistory> financingHistories = Lists.newArrayList();
        for (Element element : financingHistoryElements) {
            FinancingHistory financingHistory = new FinancingHistory();
            financingHistory.setTime(element.select("div.time").text());
            financingHistory.setRound(element.select("div.round").select("a").text());
            financingHistory.setFinancingAmount(element.select("div.number").text());
            financingHistory.setStartupId(startupId);
            List<String> investInstitutionIds = getFinancingHistoryInvestorList(element);
            financingHistory.setInvestInstitutionIds(investInstitutionIds);
            financingHistories.add(financingHistory);
        }
        return financingHistories;
    }

    private List<StartupMember> buildStartupMembers(String startupId, Elements startupMemberElements) {
        List<StartupMember> startupMembers = Lists.newArrayList();
        for (Element element : startupMemberElements) {
            StartupMember startupMember = new StartupMember();
            startupMember.setStartUpId(startupId);
            startupMember.setAvatarUrl(element.getElementsByClass("avatar").select("img").attr("src"));
            Elements memberBaseInfo = element.getElementsByClass("message");
            startupMember.setIdentity(memberBaseInfo.select("span.tag").text());
            startupMember.setProfile(memberBaseInfo.select("p.pitch").text());
            startupMember.setMemberName(memberBaseInfo.select("a").text());

            startupMembers.add(startupMember);
        }
        return startupMembers;
    }




    public static void main (String[] args) {
        //List<String> list = getStartUpIds();
        //System.out.println(list);
    }
}
