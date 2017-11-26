package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.service.CrawlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class SyncService {
    @Resource
    private InvestInstitutionSyncService investInstitutionSyncService;
    @Resource
    private InvestorSyncService investorSyncService;
    @Resource
    private ProjectSyncService projectSyncService;
    @Resource
    private CrawlService crawlService;

    public void doSync() {
        // 同步前初始化
        CrawlResult.INVESTOR.clear();
        CrawlResult.INVESTINSTITUTION.clear();
        CrawlResult.STARTUP.clear();

        // 抓取目前内容
        crawlService.grabStartup();
        crawlService.grabInvestInstitution();
        crawlService.grabInvestor();

        // 同步抓取内容到业务目标
        investInstitutionSyncService.doSync();
        investorSyncService.doSync();
        projectSyncService.doSync();
    }
}
