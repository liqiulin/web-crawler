package com.thzj.webcrawler.crawler.ctq.service.impl;


import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.FinancingHistory;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.crawler.ctq.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;


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
        List<String> startupIds = grabStartUpService.getStartUpIds();




        log.info("grabStartup startupIds[{}]", startupIds);

        Map<String, Startup> grabStartupInfoMap = grabStartUpService.grabStartUpInfo(startupIds);
        log.info("grabStartup grabStartupInfoMap[{}]", grabStartupInfoMap);

        CrawlResult.STARTUP.putAll(grabStartupInfoMap);
    }

    private void saveCrawlIds(CrawlTypeEnum crawlType) {
        File crawlIdsSaveFile = gettCrawlIdsSaveFile(crawlType);



    }


    private File gettCrawlIdsSaveFile(CrawlTypeEnum crawlType) {
        File savePathFile = new File(crawlResultSavePath);
        if (!savePathFile.exists()) {
            if (!savePathFile.mkdirs()) {
                log.error("创建保存抓取ID的文件目录失败 savePathFile[{}]", savePathFile);
                throw new RuntimeException("创建保存抓取ID的文件目录失败 savePathFile["+savePathFile+"]");
            }
        }

        String resultSaveFileName = crawlType + "_" + LocalDate.now().toString();
        return new File(savePathFile + "/" + resultSaveFileName);
    }

    @Override
    public void grabInvestor() {
        log.info("grabInvestor start...");
        List<String> userIds = grabInvestorService.getUserIds();
        log.info("grabInvestor userIds[{}]", userIds);

        Map<String, Investor> grabInvestorInfoMap = grabInvestorService.grabInvestorInfo(userIds);
        log.info("grabInvestor grabInvestorInfoMap[{}]", grabInvestorInfoMap);

        CrawlResult.INVESTOR.putAll(grabInvestorInfoMap);
    }

    @Override
    public void grabInvestInstitution() {
        log.info("grabInvestInstitution start...");
        List<String> institutionIds = grabInvestInstitutionService.getInstitutionIds();
        log.info("grabInvestInstitution institutionIds[{}]", institutionIds);

        Map<String, InvestInstitution> grabInvestInstitutionInfoMap =
                grabInvestInstitutionService.grabInvestInstitutionInfo(institutionIds);
        log.info("grabInvestInstitution grabInvestInstitutionInfoMap[{}]", grabInvestInstitutionInfoMap);

        CrawlResult.INVESTINSTITUTION.putAll(grabInvestInstitutionInfoMap);
    }

}
