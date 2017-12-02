package com.thzj.webcrawler.service;


import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.util.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class SyncServiceTest {

    @Resource
    private SyncService syncService;

    @Resource
    private InvestorSyncService investorSyncService;
    @Resource
    private InvestInstitutionSyncService investInstitutionSyncService;
    @Resource ProjectSyncService projectSyncService;

    @Test
    public void doSync_Success() {
        String investorCrawlResult = "";
        String investitutionCrawlResult = "";
        String startupCrawlResult = "";

        CrawlResult.STARTUP.putAll(JSONUtil.json2object(startupCrawlResult, Map.class));
        CrawlResult.INVESTOR.putAll(JSONUtil.json2object(startupCrawlResult, Map.class));
        CrawlResult.INVESTINSTITUTION.putAll(JSONUtil.json2object(startupCrawlResult, Map.class));

        // 同步抓取内容到业务目标
        investInstitutionSyncService.doSync();
        investorSyncService.doSync();
        projectSyncService.doSync();
    }
}
