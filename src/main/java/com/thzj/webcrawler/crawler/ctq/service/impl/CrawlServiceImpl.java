package com.thzj.webcrawler.crawler.ctq.service.impl;


import com.alibaba.fastjson.TypeReference;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.crawler.ctq.service.*;
import com.thzj.webcrawler.util.FileUtil;
import com.thzj.webcrawler.util.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


@Slf4j
@Service
public class CrawlServiceImpl implements CrawlService {

    @Resource
    private GrabInvestorService grabInvestorService;
    @Resource
    private GrabInvestInstitutionService grabInvestInstitutionService;
    @Resource
    private GrabStartUpService grabStartUpService;
    @Value("${crawl.result.save.path}")
    private String crawlResultSavePath;

    @Override
    public void grabStartup() {
        log.info("grabStartup start...");
        List<String> startupCrawlIds = this.getCrawlIds(CrawlTypeEnum.STARTUP);
        log.info("grabStartup userIds[{}]", startupCrawlIds);

        Map<String, Startup> grabStartupInfoMap = grabStartUpService.grabStartUpInfo(startupCrawlIds);
        log.info("grabStartup grabStartupInfoMap[{}]", grabStartupInfoMap);

        CrawlResult.STARTUP.putAll(grabStartupInfoMap);
    }

    @Override
    public List<String> getCrawlIds(CrawlTypeEnum crawlTypeEnum) {
        Optional<List<String>> crawlIdsOptional = getCrawlIdsFromSaveFile(crawlTypeEnum);
        List<String> crawlIds;
        if (crawlIdsOptional.isPresent()) {
            crawlIds = crawlIdsOptional.get();
            log.info("从文件中读到 crawlType[{}] crawlIds [[}]", crawlTypeEnum, crawlIds);
        } else {
            log.info("开始从目标网站抓取crawlIds. crawlTypeEnum[{}]", crawlTypeEnum);
            if (Objects.equals(CrawlTypeEnum.STARTUP, crawlTypeEnum)) {
                crawlIds = grabStartUpService.getStartUpIds();
            } else if (Objects.equals(CrawlTypeEnum.INVESTOR, crawlTypeEnum)) {
                crawlIds = grabInvestorService.getUserIds();
            } else if (Objects.equals(CrawlTypeEnum.INVEST_INSTITUTION, crawlTypeEnum)) {
                crawlIds = grabInvestInstitutionService.getInstitutionIds();
            } else {
                throw new RuntimeException("crawlType["+crawlTypeEnum+"] error. ");
            }
            log.info("结束从目标网站抓取crawlIds. crawlTypeEnum[{}] crawlIds[{}]", crawlTypeEnum, crawlIds );
            this.saveCrawlIds(crawlTypeEnum, crawlIds);
        }
        return crawlIds;
    }


    @Override
    public <T> List<T> getCrawlResultFromSaveFile(CrawlTypeEnum crawlTypeEnum, Class<T> clazz) {
        String savePath = this.crawlResultSavePath;
        String fileName = getCrawlResultSaveFileName(crawlTypeEnum);
        List<String> crawlResultStringList = FileUtil.readLines(savePath, fileName);
        if (CollectionUtils.isEmpty(crawlResultStringList)) {
            return new ArrayList<>(0);
        }
        return crawlResultStringList.stream()
                .map(crawlResultString -> JSONUtil.json2object(crawlResultString, clazz))
                .collect(Collectors.toList());

    }

    @Override
    public Optional<List<String>> getCrawlIdsFromSaveFile(CrawlTypeEnum crawlType) {
        String savePath = this.crawlResultSavePath;
        String fileName = getCrawlIdsSaveFileName(crawlType);
        List<String> idsList = FileUtil.readLines(savePath, fileName);
        if (CollectionUtils.isEmpty(idsList)) {
            return Optional.empty();
        } else {
            String idsJsonStr = idsList.get(idsList.size() - 1);
            return Optional.of(JSONUtil.json2objectByType(idsJsonStr, new TypeReference<List<String>>(){}));
        }
    }

    @Override
    public void saveCrawlIds(CrawlTypeEnum crawlType, List<String> crawIds) {
        String savePath = this.crawlResultSavePath;
        String fileName = getCrawlIdsSaveFileName(crawlType);
        FileUtil.appendToFile(savePath, fileName, JSONUtil.object2json(crawIds));
    }

    @Override
    public void saveCrawlResultToFile(CrawlTypeEnum crawlType, Object crawlResult) {
        String savePath = this.crawlResultSavePath;
        String fileName = getCrawlResultSaveFileName(crawlType);
        FileUtil.appendToFile(savePath, fileName, JSONUtil.object2json(crawlResult));
    }

    private String getCrawlResultSaveFileName(CrawlTypeEnum crawlTypeEnum) {
        return "crawlResult_" + crawlTypeEnum + "_" + LocalDate.now().toString()+".txt";
    }

    private String getCrawlIdsSaveFileName(CrawlTypeEnum crawlType) {
        return "crawlIds_"+ crawlType + "_" + LocalDate.now().toString()+".txt";
    }

    @Override
    public void grabInvestor() {
        log.info("grabInvestor start...");
        List<String> userIds = this.getCrawlIds(CrawlTypeEnum.INVESTOR);
        log.info("grabInvestor userIds[{}]", userIds);

        Map<String, Investor> grabInvestorInfoMap = grabInvestorService.grabInvestorInfo(userIds);
        log.info("grabInvestor grabInvestorInfoMap[{}]", grabInvestorInfoMap);

        CrawlResult.INVESTOR.putAll(grabInvestorInfoMap);
    }

    @Override
    public void grabInvestInstitution() {
        log.info("grabInvestInstitution start...");
        List<String> institutionIds = this.getCrawlIds(CrawlTypeEnum.INVEST_INSTITUTION);
        log.info("grabInvestInstitution institutionIds[{}]", institutionIds);

        Map<String, InvestInstitution> grabInvestInstitutionInfoMap =
                grabInvestInstitutionService.grabInvestInstitutionInfo(institutionIds);
        log.info("grabInvestInstitution grabInvestInstitutionInfoMap[{}]", grabInvestInstitutionInfoMap);

        CrawlResult.INVESTINSTITUTION.putAll(grabInvestInstitutionInfoMap);
    }

}
