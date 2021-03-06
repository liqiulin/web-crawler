package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.model.*;
import com.thzj.webcrawler.crawler.ctq.service.CrawlService;
import com.thzj.webcrawler.crawler.ctq.service.CrawlTypeEnum;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
import com.thzj.webcrawler.exception.GrabResourceNotFoundException;
import com.thzj.webcrawler.util.BaseUtil;
import com.thzj.webcrawler.util.DateUtil;
import com.thzj.webcrawler.util.HttpClientUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static com.thzj.webcrawler.common.Constants.STARTUP_DETAIL_URL;
import static com.thzj.webcrawler.common.Constants.STARTUP_ID_URL;


/**
 * 抓取投融项目详情
 *
 * @author Matthew
 */
@Slf4j
@Service
public class GrabStartUpServiceImpl implements GrabStartUpService {
    @Resource
    private CrawlService crawlService;

    @Override
    public Map<String, Startup> grabStartUpInfo(List<String> startupIds) {
        CrawlTypeEnum crawlType = CrawlTypeEnum.STARTUP;
        // 先从保存的文件中获取已经抓取的结果
        List<Startup> savedStartupList = crawlService.getCrawlResultFromSaveFile(crawlType, Startup.class);
        Map<String, Startup> startupMaps = savedStartupList.stream().collect(Collectors.toMap(Startup::getId, o -> o, (n, o)-> o, ConcurrentHashMap::new));
        List<String> notFoundIds = Lists.newArrayList();
        List<String> exceptionIds = Lists.newArrayList();
        Startup startup;
        try {
            for (String startupId : startupIds) {
                log.info("项目抓取开始 crawlId[{}]", startupId);
                if (startupMaps.containsKey(startupId)) {
                    log.info("项目存在抓取历史 crawlId[{}]", startupId);
                    continue;
                }

                String url = STARTUP_DETAIL_URL + startupId + "?show_investment=true";
                Document doc;
                try {
                    doc = BaseUtil.connect(url);
                } catch (GrabResourceNotFoundException e) {
                    log.warn("grab error. url[{}]", url, e);
                    notFoundIds.add(startupId);
                    continue;
                }

                try {
                    startup = getStartUpFromHtml(doc, startupId, url);

                    log.info("项目抓取完成 crawlId[{}], crawlResult[{}]", startupId, startup);

                    // 保存抓取结果
                    crawlService.saveCrawlResultToFile(crawlType, startup);
                    startupMaps.put(startupId, startup);
                } catch (Exception e) {
                    log.warn("getStartUpFromHtml failed!  crawlId[{}]", startupId, e);
                    exceptionIds.add(startupId);
                    continue;
                }
            }

            log.info("所有项目抓取完成， 共有ID[{}]个， 共抓取到[{}]个对象, notFoundIds.size[{}], notFoundIds[{}], exceptionIds.size[{}], exceptionIds[{}]",
                    startupIds.size(), startupMaps.size(), notFoundIds.size(), notFoundIds, exceptionIds.size(), exceptionIds);
            return startupMaps;
        } catch (Exception e) {
            log.warn("grabStartupInfo failed!", e);
        }
        return startupMaps;
    }

    @Override
    public List<String> getStartUpIds() {
        log.info("getStartUpIds start...");
        Stopwatch stopwatchOuter = Stopwatch.createStarted();

        List<String> startUpIds = new ArrayList<>();
        String url;

        for (Integer i = 1; ; i++) {
            log.info("getStartUpIds 第{}次 start...", i);
            Stopwatch stopwatchInner = Stopwatch.createStarted();

            url = STARTUP_ID_URL + i.toString() + "&type=hot";
            org.jsoup.nodes.Document doc = BaseUtil.connect(url);
            Elements tableList = doc.getElementById("startups-list").select("tbody");
            Elements startUpInfo = tableList.select("tr");
            log.debug("{}", startUpInfo);

            if (null == startUpInfo || startUpInfo.isEmpty()) {
                break;
            }

            for (Element element : startUpInfo) {
                Element elements = element.select("td.cover-info").select("div.info").select("div.name").select("a").first();
                String infoDetailsUrl = elements.attr("href");
                int startUpIndex = infoDetailsUrl.lastIndexOf("startups");
                String userId = infoDetailsUrl.substring(startUpIndex + 9);
                startUpIds.add(userId);
            }
            stopwatchInner.elapsed(TimeUnit.MILLISECONDS);
            log.info("getStartUpIds 第{}次 end. 共抓到{}个Id,  elapsed[{}]", i, startUpInfo.size(), stopwatchInner);
        }

        stopwatchOuter.elapsed(TimeUnit.MILLISECONDS);
        log.info("getStartUpIds end. total[{}] elapsed[{}]", startUpIds.size(), stopwatchOuter);
        return startUpIds;
    }

    private Startup getStartUpFromHtml(Document doc, String startupId, String url) {

        Startup startup = new Startup();

        //融资项目基本信息
        Elements baseInfo = doc.getElementsByClass("main-startups").select(".startups-info");

        //项目logo
        String avatarUrl = baseInfo.select(".avatar").select("img").attr("src");

        //项目名称
        String name = baseInfo.select("li.name").text();

        //项目所属行业
        String industry = baseInfo.select("li.industry").text();

        //项目摘要
        String summary = baseInfo.select("li.pitch").text();

        String province = "";
        String city = "";
        String companyName = "";
        Date time = new Date();
        Elements companyInfo = doc.getElementsByClass("company-info").select("li");
        if (null != companyInfo && !CollectionUtils.isEmpty(companyInfo)) {
            if (!CollectionUtils.isEmpty(companyInfo.select(".iconfont.icon-diqu"))) {
                String location = companyInfo.select(".iconfont.icon-diqu").next("div.info").text();
                //地区：省、市
                if (StringUtils.isNotEmpty(location) && null != location) {
                    location = StringUtils.deleteWhitespace(location);
                    if (location.contains("·")) {
                        String[] string = location.split("·");
                        province = string[0];
                        city  = string[1];
                    } else {
                        province = location;
                    }
                }
            }

            //公司全称
            if (!CollectionUtils.isEmpty(companyInfo.select(".iconfont-new.icon-gongshi"))) {
                String companyNameString = companyInfo.select(".iconfont-new.icon-gongshi").next("div.info").text();
                companyName = companyNameString.substring(companyNameString.indexOf("：") + 1);
            }

            //成立时间
            if (!CollectionUtils.isEmpty(companyInfo.select(".iconfont-new.icon-shijian1"))) {
                String establishTimeString = companyInfo.select(".iconfont-new.icon-shijian1").next("div.info").text();
                String establishTime = establishTimeString.substring(establishTimeString.indexOf("：") + 1);
                time = DateUtil.stringToDate(establishTime);
            }
        }

        //项目简介
        String profile = "";
        Elements profileElements = doc.getElementsByClass("startups-info-card").select("div.item-content");
        if (null != profileElements && !CollectionUtils.isEmpty(profileElements)) {
            profile = profileElements.select("p").text();
        }

        //融资历史
        List<FinancingHistory> financingHistories = Lists.newArrayList();
        if (null != doc.getElementById("financing_info")) {
            Elements financeElements = doc.getElementById("financing_info").getElementsByClass("financing-history");
            if (null != financeElements && !CollectionUtils.isEmpty(financeElements)) {
                Elements financingHistoryElements = financeElements.select("li");
                financingHistories = buildFinancingHistory(startupId, financingHistoryElements);
            }
            Elements loadMoreCaseElements = financeElements.select("div.center");
            if (null != loadMoreCaseElements
                    && !CollectionUtils.isEmpty(loadMoreCaseElements)
                    && !CollectionUtils.isEmpty(loadMoreCaseElements.select("a"))) {
                getAllFinancingHistory(startupId, financingHistories);
            }
        }


        //项目成员
        List<StartupMember> startupMembers = Lists.newArrayList();
        Elements startupMemberElements = doc.getElementById("team_info").select("ul.members-list");
        if (null != startupMemberElements && !CollectionUtils.isEmpty(startupMemberElements)) {
            Elements startupMembersElements = startupMemberElements.select("li.member");
            startupMembers = buildStartupMembers(startupId, startupMembersElements);
        }

        //产品链接
        String productsUrl = "";
        String productsWebsite = "";
        Element productElement = doc.getElementById("product_info");
        if (null != productElement) {
            // 图片链接可能是List类型，暂不处理
            Elements productsUrlElements = productElement.select("div.photos-views").select("img");
            if (null != productsUrlElements && !CollectionUtils.isEmpty(productsUrlElements) ) {
                productsUrl = productElement.select("div.photos-views").select("img").first().attr("src");
            }

            //产品网站 这里可能会有好几个产品网址，目前只取第一个
            Elements elements = productElement.select("ul.main-products-list");
            if (null != elements && !CollectionUtils.isEmpty(elements)) {
                productsWebsite = productElement.select(".main-products-list").select("li").first().
                        select("a").attr("href");
            }
        }

        //发展历程 Todo 目前没发现投融项目里有发展历程的，先不抓取
        List<DevelopmentHistory> developmentHistorys = Lists.newArrayList();
        if (null == doc.getElementById("status_info")) {
            log.info("该融资项目有发展历史。StartupId[{}]", startupId);
        }

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
        startup.setEstablishTime(time);
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
        //TODO 拉取的可能有投资人
        element.select("div.investors-list").select("a").forEach(element1 ->
            result.add(BaseUtil.getIdfromUrl("/", element1.attr("href"))));
        return result;
    }

    /**
     * 获取融资历史的投资方姓名：顿号隔开
     *
     * @param element
     * @return
     */
    private String getFinancingHistoryInvestorName(Element element) {
        List<String> NameList = new ArrayList<>();
        //TODO 拉取的可能有投资人
        NameList = element.select("div.investors-list").select("a").eachText();
        return BaseUtil.joiner(NameList, "、");
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

        if (null == financingHistoryElements || CollectionUtils.isEmpty(financingHistoryElements)) {
            return financingHistories;
        }

        for (Element element : financingHistoryElements) {
            FinancingHistory financingHistory = new FinancingHistory();
            Date time = DateUtil.stringToDate(element.select("div.time").text());
            financingHistory.setTime(time);
            financingHistory.setRound(element.select("div.round").select("a").text());
            String amount = element.select("div.number").text().substring(4);
            financingHistory.setFinancingAmount(amount);
            financingHistory.setStartupId(startupId);
            List<String> investInstitutionIds = getFinancingHistoryInvestorList(element);
            financingHistory.setInvestInstitutionIds(investInstitutionIds);
            financingHistory.setInvestInstitutionNames(getFinancingHistoryInvestorName(element));
            financingHistories.add(financingHistory);
        }
        return financingHistories;
    }

    private void getAllFinancingHistory(String startupId, List<FinancingHistory> financingHistories) {
        String moreInvestCaseUrl = "https://www.vc.cn/startups/";
        String url = moreInvestCaseUrl + startupId + "/investments";
        String result;
        Document doc;

        try {
            for (Integer i = 2; ; i++) {
                String crawlUrl = url + "?page=" + i.toString();
                result = HttpClientUtils.OkHttpClient(crawlUrl);
                if ("\";".equals(result)) {
                    log.info("getAllStartupFinancingHistory finished.");
                    break;
                }
                doc = Jsoup.parseBodyFragment(result);
                Elements financingHistoryElements = doc.select("li");
                financingHistories.addAll(buildFinancingHistory(startupId, financingHistoryElements));
            }
        } catch (Exception e) {
            log.warn("getAllStartupFinancingHistory failed! crawlId[{}]", startupId, e);
        }
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
/*        List<FinancingHistory> investCaseList = Lists.newArrayList();
        getAllFinancingHistory1("80373", investCaseList);
        System.out.println(investCaseList);*/
    }
}
