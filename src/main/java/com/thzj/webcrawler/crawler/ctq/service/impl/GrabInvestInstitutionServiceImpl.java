package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.base.Joiner;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.service.CrawlService;
import com.thzj.webcrawler.crawler.ctq.service.CrawlTypeEnum;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestInstitutionService;
import com.thzj.webcrawler.exception.GrabResourceNotFoundException;
import com.thzj.webcrawler.util.BaseUtil;
import com.thzj.webcrawler.util.DateUtil;

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

import static com.thzj.webcrawler.common.Constants.INSTITUTION_DETAIL_URL;
import static com.thzj.webcrawler.common.Constants.INSTITUTION_ID_URL;
import static com.thzj.webcrawler.util.HttpClientUtils.httpGetRequest;


/**
 * @author Matthew
 */
@Slf4j
@Service
public class GrabInvestInstitutionServiceImpl implements GrabInvestInstitutionService{
    @Resource
    private CrawlService crawlService;

    @Override
    public Map<String, InvestInstitution> grabInvestInstitutionInfo(List<String> instituteIdList) {
        CrawlTypeEnum crawlType = CrawlTypeEnum.INVEST_INSTITUTION;
        // 先从保存的文件中获取已经抓取的结果
        List<InvestInstitution> savedInstitutionList = crawlService.getCrawlResultFromSaveFile(crawlType, InvestInstitution.class);
        Map<String, InvestInstitution> investInstitutionMap = savedInstitutionList.stream().collect(Collectors.toMap(InvestInstitution::getId, o -> o, (n, o)-> o, ConcurrentHashMap::new));
        InvestInstitution investInstitution;
        List<String> notFoundIds = Lists.newArrayList();
        List<String> exceptionIds = Lists.newArrayList();
         try {
            for (String institutionId : instituteIdList) {
                log.info("机构抓取开始 crawlId[{}]", institutionId);
                if (investInstitutionMap.containsKey(institutionId)) {
                    log.info("机构存在抓取历史 crawlId[{}]", institutionId);
                    continue;
                }

                String url = INSTITUTION_DETAIL_URL + institutionId;
                Document doc;
                try {
                    doc = BaseUtil.connect(url);
                } catch (GrabResourceNotFoundException e) {
                    log.warn("grab error. url[{}]", url, e);
                    notFoundIds.add(institutionId);
                    continue;
                }

                try {
                    investInstitution = getInvestInstitution(doc, institutionId, url);
                    log.info("机构抓取完成 crawlId[{}], crawlResult[{}]", institutionId, investInstitution);
                    crawlService.saveCrawlResultToFile(crawlType, investInstitution);

                    // 保存抓取结果
                    investInstitutionMap.put(institutionId, investInstitution);
                } catch (Exception e) {
                    log.warn("getInvestInstitution failed!  crawlId[{}]", institutionId, e);
                    exceptionIds.add(institutionId);
                    continue;
                }

            }
            log.info("所有项目抓取完成, 共有ID[{}]个， 共抓取到[{}]个对象, notFoundIds.size[{}], notFoundIds[{}], exceptionIds.size[{}], exceptionIds[{}]",
                    instituteIdList.size(), investInstitutionMap.size(), notFoundIds.size(), notFoundIds, exceptionIds.size(), exceptionIds);
            return investInstitutionMap;
        } catch (Exception e) {
            log.warn("grabInvestInstitutionInfo failed! ", e);
        }
        return investInstitutionMap;
    }



    /**
     * 获取所有投资机构的ID
     */
    @Override
    public List<String> getInstitutionIds() {
        log.info("getInstitutionIds start...");
        Stopwatch stopwatchOuter = Stopwatch.createStarted();

        List<String> institutionIds = new ArrayList<>();
        String url = "";
        try {
            for (Integer i = 1; ; i++) {
                log.info("getInstitutionIds 第{}次 start...", i);
                Stopwatch stopwatchInner = Stopwatch.createStarted();

                url =  INSTITUTION_ID_URL + i.toString() + "&type=active";
                Document doc = BaseUtil.connect(url);
                Elements tableList = doc.getElementById("institutions-list").select("tbody.table-list");
                Elements institutionInfo = tableList.select("tr");
                log.debug("{}", institutionInfo);

                if (null == institutionInfo || institutionInfo.isEmpty()) {
                    break;
                }

                for (Element element : institutionInfo) {
                    Elements elements = element.getElementsByClass("avatar square").select("a");
                    String infoDetailsUrl = elements.get(1).attr("href");
                    String userId = infoDetailsUrl.substring(14);
                    institutionIds.add(userId);
                }

                stopwatchInner.elapsed(TimeUnit.MILLISECONDS);
                log.info("getInstitutionIds 第{}次 end. 共抓到{}个Id,  elapsed[{}]", i, institutionIds.size(), stopwatchInner);
            }

            stopwatchOuter.elapsed(TimeUnit.MILLISECONDS);
            log.info("getInstitutionIds end. total[{}] elapsed[{}]", institutionIds.size(), stopwatchOuter);
            return institutionIds;
        } catch (Exception e) {
            e.printStackTrace();
            log.warn("getUserIds failed! url[{}]", url, e);
        }
        return institutionIds;
    }

    private InvestInstitution getInvestInstitution(Document doc, String instituteId, String url) {
        InvestInstitution investInstitution = new InvestInstitution();

        //投资机构基本信息
        Elements institutionInfo = doc.getElementsByClass("institutions_info");

        //机构logo
        String avatarUrl = institutionInfo.select("img").attr("src");

        //机构名称
        String name = institutionInfo.select("div.name").text();

        //网址
        String homePage = institutionInfo.select("div.url").select("a").attr("href");

        //投资机构简介
        String profile = "";
        Elements profileElements = doc.getElementsByClass("user_intro user_intro_overflow");
        if (null != profileElements && !CollectionUtils.isEmpty(profileElements)) {
            profile = String.join("",profileElements.select("div.cont").select("p").eachText());
        }


        //投资风格：关注行业&投资轮次
        String tag;
        List<String> investRounds = new ArrayList<>();
        List<String> investIndustries = new ArrayList<>();
        Elements investStyle = doc.getElementById("module_style").getElementsByClass("tag-list row");
        if (null != investStyle && !CollectionUtils.isEmpty(investStyle)) {
            for (Element element : investStyle) {
                tag = element.getElementsByClass("cell label-name").text();
                if ("投资行业：".equals(tag)) {
                    List<String> investIndustryList = element.getElementsByClass("cell label-item").select("a").eachText();
                    investIndustries.add(BaseUtil.joiner(investIndustryList, "、"));
                } else {
                    List<String> investRoundList = element.getElementsByClass("cell label-item").select("a").eachText();
                    investRounds.add(BaseUtil.joiner(investRoundList, "、"));
                }
            }
        }

        //投资案例:抓取全部信息
        List<InvestCase> investCases = Lists.newArrayList();
        if (null != doc.getElementById("module_invest_case")) {
            Elements investCasesElements = doc.getElementById("module_invest_case").
                    select("div#invest_cases").select("div.case_card");
            if (null != investCasesElements && CollectionUtils.isEmpty(investCasesElements)) {
                investCases.addAll(buildInvestCaseList(investCasesElements));
            }
            Elements loadMoreCaseElements = doc.getElementById("module_invest_case").select("div.center.load_more_cases");
            if (null != loadMoreCaseElements
                    && !CollectionUtils.isEmpty(loadMoreCaseElements)
                    && !CollectionUtils.isEmpty(loadMoreCaseElements.select("a"))) {
                getAllInvestCase(investCases, instituteId);
            }
        }

        //投资机构基本信息：电话、邮箱、地址
        String email = "";
        String phone = "";
        String province = "";
        String city = "";
        Elements contactUsElements = doc.getElementsByClass("details_institutions_sidebar").select("div.contact-us-item");
        if (Objects.nonNull(contactUsElements) && contactUsElements.size() > 0) {
            Elements phoneElements = contactUsElements.select("i.fa.fa-phone + div");
            if (null != phoneElements && !CollectionUtils.isEmpty(phoneElements)) {
                phone = phoneElements.text();
            }

            Elements emailElements = contactUsElements.select("i.fa.fa-envelope + div");
            if (null != emailElements && !CollectionUtils.isEmpty(emailElements)) {
                email = emailElements.text();
            }

            if (null != contactUsElements.select("div.city") && !CollectionUtils.isEmpty(contactUsElements.select("div.city"))) {
                String location = contactUsElements.select("div.city").first().text();
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
        }

        //机构成员:这里只保存成员ID
        List<String> members = Lists.newArrayList();
        Elements membersElements = doc.getElementsByClass("member-list");
        if (null != membersElements && !CollectionUtils.isEmpty(membersElements)) {
            log.debug("members institutionID:[{}]", instituteId);
            members = doc.getElementsByClass("member-list").select("div.avatar").select("a").stream().map(
                    e -> e.attr("href").substring(7)).collect(Collectors.toList());
        }

        investInstitution.setName(name);
        investInstitution.setId(instituteId);
        investInstitution.setProfile(profile);
        investInstitution.setEmail(email);
        investInstitution.setPhone(phone);
        investInstitution.setMembers(members);
        investInstitution.setProvince(province);
        investInstitution.setCity(city);
        investInstitution.setDetailUrl(url);
        investInstitution.setAvatarUrl(avatarUrl);
        investInstitution.setHomePage(homePage);
        investInstitution.setInvestCases(investCases);
        investInstitution.setInvestRounds(investRounds);
        investInstitution.setInvestIndustries(investIndustries);

        return investInstitution;
    }


    private List<InvestCase> buildInvestCaseList(Elements investCaseElements) {
        List<InvestCase> investCaseList = Lists.newArrayList();

        if (null == investCaseElements || CollectionUtils.isEmpty(investCaseElements)) {
            return investCaseList;
        }

        for (Element element : investCaseElements) {
            InvestCase investCase = new InvestCase();
            Date invsetTime = DateUtil.stringToDate(element.getElementsByClass("cell date").text());
            investCase.setTime(invsetTime);
            String name = element.select("div.name").select("a").text();
            String industry = element.select("div.name").select("span").text();
            String startupIdString = element.select("div.name").select("a").attr("href");
            List<String> investInstitutions = element.select("div.cell.keywords").select("a").eachText();
            String investInstitution = Joiner.on("、").skipNulls().join(investInstitutions);
            investCase.setName(name);
            investCase.setStartupIndustry(industry);
            investCase.setInvestInstitutions(investInstitution);
            investCase.setStartupId(BaseUtil.getIdfromUrl("startups", startupIdString));
            investCase.setProfile(element.select("div.pitch").text());
            investCase.setAvatarUrl(element.select("cell avatar").select("img").attr("src"));
            investCase.setInvestorRound(element.select("div.round").text());
            investCase.setInvestorMoney(element.select("div.money").text());

            investCaseList.add(investCase);
        }
        return investCaseList;
    }

    //InvestCase翻页处理
    private void getAllInvestCase(List<InvestCase> investCaseList, String institutionId) {
        String moreInvestCaseUrl = "https://www.vc.cn/institutions/";
        Map<String, Object> params = Maps.newHashMap();
        String url = moreInvestCaseUrl + institutionId + "/invest_cases";
        String result;
        Document doc;

        try {
            for (int i = 2; ; i++) {
                params.put("page", i);
                result = httpGetRequest(url, params).substring(15);
                if ("\";".equals(result)) {
                    log.info("getAllInstitutionInvestCase finished.");
                    break;
                }
                doc = Jsoup.parseBodyFragment(result);
                Elements investCaseElements = doc.select("div.case_card");
                investCaseList.addAll(buildInvestCaseList(investCaseElements));
            }
        } catch (Exception e) {
            log.warn("getAllInstitutionInvestCase failed! crawerId[{}]", institutionId, e);
        }
    }

    public static void main (String[] args) {
/*
        List<InvestCase> investCaseList = Lists.newArrayList();
        getAllInvestCase1(investCaseList, "1656");
        System.out.println(investCaseList);
*/

    }

}
