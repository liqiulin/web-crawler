package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.WorkExperience;
import com.thzj.webcrawler.crawler.ctq.service.CrawlService;
import com.thzj.webcrawler.crawler.ctq.service.CrawlTypeEnum;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static com.thzj.webcrawler.common.Constants.INVERTOR_ID_URL;
import static com.thzj.webcrawler.common.Constants.USER_DETAIL_URL;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

@Slf4j
@Service
public class GrabInvestorServiceImpl implements GrabInvestorService {

    @Resource
    private CrawlService crawlService;

    @Override
    public Map<String, Investor> grabInvestorInfo(List<String> userIdList) {
        CrawlTypeEnum crawlType = CrawlTypeEnum.INVESTOR;
        // 先从保存的文件中获取已经抓取的结果
        List<Investor> savedInvestorList = crawlService.getCrawlResultFromSaveFile(crawlType, Investor.class);
        Map<String, Investor> investorMap = savedInvestorList.stream().collect(Collectors.toMap(Investor::getId, o -> o, (n, o)-> o, ConcurrentHashMap::new));
        List<String> notFoundIds = Lists.newArrayList();
        List<String> exceptionIds = Lists.newArrayList();
        try {
            for (String userId : userIdList) {
                log.info("投资人抓取开始 crawlId[{}]", userId);
                if (investorMap.containsKey(userId)) {
                    log.info("投资人存在抓取历史 crawlId[{}]", userId);
                    continue;
                }
                String url = USER_DETAIL_URL + userId;
                Document doc;
                try {
                    doc = BaseUtil.connect(url);
                } catch (GrabResourceNotFoundException e) {
                    log.warn("grab error. url[{}]", url, e);
                    notFoundIds.add(userId);
                    continue;
                }

                try {
                    Investor investor = getInvestor(userId, doc, url);
                    log.info("投资人抓取完成 crawlId[{}], crawlResult[{}]", userId, investor);

                    // 保存抓取结果
                    crawlService.saveCrawlResultToFile(crawlType, investor);
                    investorMap.put(userId, investor);
                } catch (Exception e) {
                    log.warn("getInvestor failed!  crawlId[{}]", userId, e);
                    exceptionIds.add(userId);
                    continue;
                }
            }

            log.info("所有项目抓取完成， 共有ID[{}]个， 共抓取到[{}]个对象, notFoundIds.size[{}], notFoundIds[{}], exceptionIds.size[{}], exceptionIds[{}]",
                    userIdList.size(), investorMap.size(), notFoundIds.size(), notFoundIds, exceptionIds.size(), exceptionIds);
            return investorMap;
        } catch (Exception e) {
            log.warn("grabInvestorInfo failed!", e);
        }
        return investorMap;
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
        String position = "";
        String company = "";
        if (null != baseInfoElements.select("div.pitch").text()){
            String[] companyInfo = baseInfoElements.select("div.pitch").text().split("·");
            if (2 == companyInfo.length) {
                //职位
                position = companyInfo[1];
                //公司名称
                company = companyInfo[0];
            }
        }


        //简介
        String profile = "";
        if (null != doc.getElementById("user_intro")){
            profile = doc.getElementById("user_intro").select("p").text();
        }

        //判断是否为空
        List<String> investIndustries = new ArrayList<>();
        List<String> investRounds = new ArrayList<>();
        Elements elements = doc.getElementById("module_keyword").select(".details");
        if (null != elements && CollectionUtils.isEmpty(elements)) {
            //投资行业
            if (null != elements.select("li.field")) {
                Elements focusIndustryElements = elements.select("li.field").select("a");
                for (Element e : focusIndustryElements) {
                    investIndustries.add(e.text());
                }
            }

            //投资阶段
            if (null != elements.select("li.stage")) {
                Elements investStageElements = elements.select("li.stage").select("a");
                for (Element e : investStageElements) {
                    investRounds.add(e.text());
                }
            }
        }


        //投资案例
        List<InvestCase> investCaseList = new ArrayList<>();
        if (null != doc.getElementById("invest_cases")) {
            getInvestCase(doc, investCaseList);
        }

        //工作经历
        List<WorkExperience> workExperienceList = new ArrayList<>();
        if (null != doc.getElementById("module_work")){
            buildWorkExperience(doc, workExperienceList);
        }

        //个人信息
        String location;
        String province = "";
        String city = "";
        if (null != doc.getElementsByClass("authenticated").select("li.location")) {
            location = doc.getElementsByClass("authenticated").select("li.location").select("span").text();
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
        if (null == investCases || CollectionUtils.isEmpty(investCases)) {
            return;
        }
        for (Element element : investCases) {
            InvestCase investCase = new InvestCase();
            investCase.setAvatarUrl(element.getElementsByTag("img").attr("src"));
            investCase.setName(element.getElementsByClass("name").text());
            investCase.setProfile(element.getElementsByClass("pitch").text());
            investCase.setInvestorMoney(element.getElementsByClass("money").text());
            investCase.setInvestorRound(element.getElementsByClass("round").text());
            Date investTime = DateUtil.stringToDate(element.getElementsByClass("cell date").text());
            investCase.setTime(investTime);
            investCaseList.add(investCase);
        }
    }

    private void buildWorkExperience(Document doc, List<WorkExperience> workExperienceList) {
        Elements workExperiences = doc.getElementById("module_work").getElementsByClass("experience-item");

        if ( null == workExperiences || CollectionUtils.isEmpty(workExperiences)) {
            return;
        }

        for (Element element : workExperiences) {
            WorkExperience workExperience = new WorkExperience();
            String workPeriod = element.select(".date").select("span").text();

            if (workPeriod.contains("-")) {
                workExperience.setTimeTo(null);
                workExperience.setTimeFrom(null);
            } else if (!org.apache.commons.lang.StringUtils.isEmpty(workPeriod) && null != workPeriod){
                String[] workPeriods = workPeriod.split("~");
                workExperience.setTimeFrom(DateUtil.stringToDate(workPeriods[0]));
                if ("至今".equals(workPeriods[1])) {
                    workExperience.setTimeTo(null);
                } else {
                    workExperience.setTimeTo(DateUtil.stringToDate(workPeriods[1]));
                }
            }
            Elements companyinfoElements =  element.select("td.info > div");
            List<String> companyinfoList = Lists.newArrayList(Splitter.on(' ')
                    .trimResults()
                    .omitEmptyStrings()
                    .split(companyinfoElements.first().text()));
            workExperience.setCompany(companyinfoList.get(0));
            workExperience.setPosition(companyinfoElements.get(1).text());
            workExperienceList.add(workExperience);
        }
    }

    /**
     * 获取所有投资人/user的ID
     */
    @Override
    public List<String> getUserIds() {
        log.info("getUserIds start...");
        Stopwatch stopwatchOuter = Stopwatch.createStarted();

        List<String> userIds = new ArrayList<>();
        String url;

        try {
            for (Integer i = 1; ; i++) {
                log.info("getUserIds 第{}次 start...", i);
                Stopwatch stopwatchInner = Stopwatch.createStarted();
                url = INVERTOR_ID_URL + i.toString();
                Document doc = Jsoup.connect(url).get();
                Element tableList = doc.getElementById("user-list");
                Elements personalInfo = tableList.getElementsByTag("tr");
                log.debug("{}", personalInfo);

                if (null == personalInfo || personalInfo.isEmpty()) {
                    break;
                }

                for (Element pInfo : personalInfo) {
                    String infoDetailsUrl = pInfo.getElementsByClass("name").select("a").attr("href");
                    String userId = infoDetailsUrl.substring(7);
                    userIds.add(userId);
                }
                stopwatchInner.elapsed(TimeUnit.MILLISECONDS);
                log.info("getUserIds 第{}次 end. 共抓到{}个Id,  elapsed[{}]", i, userIds.size(), stopwatchInner);
            }

            stopwatchOuter.elapsed(TimeUnit.MILLISECONDS);
            log.info("getUserIds end. total[{}] elapsed[{}]", userIds.size(), stopwatchOuter);
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
