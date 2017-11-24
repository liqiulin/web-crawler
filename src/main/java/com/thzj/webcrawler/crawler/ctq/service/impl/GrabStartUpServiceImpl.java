package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.FinancingHistory;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.crawler.ctq.model.StartupMember;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
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
    public Map<String, Startup> grabStartUpInfo() {

        return Maps.newConcurrentMap();
    }

    public static List<String> getStartUpIds() {
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
        String logo = baseInfo.select(".avatar").select("a").attr("src");

        //项目名称
        String name = baseInfo.select(".baseInfo").select("li.name").text();

        //项目所属行业
        String industry = baseInfo.select(".baseInfo").select("li.industry").select("a").first().text();

        //项目摘要
        String label = baseInfo.select(".baseInfo").select("li.pitch").text();

        Elements companyInfo = doc.getElementsByClass("company-info").select(".info");
        String location = companyInfo.first().text();

        //地区：省、市
        String[] locationArray = location.split("·");
        String province = locationArray[0];
        String city = locationArray[1];

        //公司全称
        String companyName = companyInfo.get(2).select("span").text();

        //成立时间
        String setUpTimeString = companyInfo.last().text();
        String setUpTime = setUpTimeString.substring(setUpTimeString.indexOf("：") + 1);

        //项目简介
        String instruction = doc.getElementById("basic_info").select("item-content").select("p").text();

        //融资历史 Todo 这里可能需要翻页处理，暂不处理
        Elements financingHistoryElements = doc.getElementById("financing_info").getElementsByClass("financing-history").select("li");
        List<FinancingHistory> financingHistories = buildFinancingHistory(startupId, financingHistoryElements);


        //项目成员 Todo 翻页-暂不处理
        Elements startupMembersElements = doc.getElementById("team_info").
                getElementsByClass("div.startup_members").select("li.member");
        List<StartupMember> startupMembers = buildStartupMembers(startupId, startupMembersElements);

        //产品链接



        return new Startup();

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
        List<String> list = getStartUpIds();
        System.out.println(list);
    }
}
