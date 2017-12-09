package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.manager.ImgManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Service
public class ImgSyncService {

    private static ExecutorService executorService = Executors.newFixedThreadPool(15);

    @Resource
    private ImgManager imgManager;

    public void doSyncImgConcurrent() {
        doSyncStartupImg();

        doSyncInvestorImg();

        doSyncInvestmentImg();
    }

    public void doSyncStartupImg() {
        Map<String, Startup> startupMap = CrawlResult.STARTUP;
        startupMap.forEach((crawlId, startup) -> {
            executorService.submit(() -> {
                log.info("statup avatar img sync start . id [{}]", startup.getId());
                imgManager.getSavePathByImgPath(startup.getAvatarUrl());
                log.info("statup avatar img sync end . id [{}]", startup.getId());
            });
            executorService.submit(() -> {
                log.info("statup product img sync start . id [{}]", startup.getId());
                imgManager.getSavePathByImgPath(startup.getProductImgUrl());
                log.info("statup product img synced . id [{}]", startup.getId());
            });
        });
    }

    public void doSyncInvestmentImg() {
        Map<String, InvestInstitution> investInstitutionMap = CrawlResult.INVESTINSTITUTION;
        investInstitutionMap.forEach((crawlId, institution) -> {
            executorService.submit(() -> {
                log.info("institution avatar img sync start . id [{}]", institution.getId());
                imgManager.getSavePathByImgPath(institution.getAvatarUrl());
                log.info("institution avatar img sync end . id [{}]", institution.getId());
            });
        });
    }

    public void doSyncInvestorImg() {
        Map<String, Investor> investorMap = CrawlResult.INVESTOR;
        investorMap.forEach((crawlId, investor) -> {
            executorService.submit(() -> {
                log.info("investor avatar img sync start . id [{}]", investor.getId());
                imgManager.getSavePathByImgPath(investor.getAvatarUrl());
                log.info("investor avatar img sync end . id [{}]", investor.getId());
            });
        });
    }
}
