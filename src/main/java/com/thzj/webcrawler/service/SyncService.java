package com.thzj.webcrawler.service;

import com.google.common.base.Stopwatch;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.service.CrawlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

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

    private static ExecutorService executorService = Executors.newCachedThreadPool();


    public void doSync() {
        // 同步前初始化
        initBeforeSync();

        // 抓取目前内容
        crawlService.grabInvestInstitution();
        crawlService.grabInvestor();
        crawlService.grabStartup();

        // 同步抓取内容到业务目标
        investInstitutionSyncService.doSync();
        investorSyncService.doSync();
        projectSyncService.doSync();
    }

    private void initBeforeSync() {
        CrawlResult.INVESTOR.clear();
        CrawlResult.INVESTINSTITUTION.clear();
        CrawlResult.STARTUP.clear();
    }

    public void doSynConcurrent() {
        // 同步前初始化
        initBeforeSync();

        log.info("doSynConcurrent start ................. ...");
        Stopwatch stopwatch = Stopwatch.createStarted();

        log.info("do grab start ................. ...");
        Stopwatch grabStopwatch = Stopwatch.createStarted();
        // 抓取目前内容
        Future grabInstitutionFuture = executorService.submit(() -> crawlService.grabInvestInstitution());
        Future grabStartupFuture = executorService.submit(() -> crawlService.grabStartup());
        Future grabInvestorFuture = executorService.submit(() -> crawlService.grabInvestor());
        try {
            grabStartupFuture.get();
            grabInstitutionFuture.get();
            grabInvestorFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            log.error("", e);
        }
        grabStopwatch.elapsed(MILLISECONDS);
        log.info("do grab complete. elapsed[{}]", grabStopwatch);


        // 同步抓取内容到业务目标
        Future syncInstitutionFuture = executorService.submit(() -> investInstitutionSyncService.doSync());
        Future syncInvestorFuture = executorService.submit(() -> investorSyncService.doSync());
        Future syncProjectFuture = executorService.submit(() -> projectSyncService.doSync());
        try {
            syncInstitutionFuture.get();
            syncInvestorFuture.get();
            syncProjectFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            log.error("", e);
        }

        stopwatch.elapsed(MILLISECONDS);
        log.info("doSynConcurrent complete. elapsed[{}]", grabStopwatch);
    }
}
