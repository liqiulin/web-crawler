package com.thzj.webcrawler.crawler.ctq.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Matthew
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CrawlServiceTest {
    @Resource
    private CrawlService crawlService;

    @Resource
    private GrabInvestorService grabInvestorService;

    @Resource
    private GrabInvestInstitutionService grabInvestInstitutionService;

    @Resource
    private GrabStartUpService grabStartUpService;

    @Test
    public void getCrawlIds_All_Success() {
        crawlService.getCrawlIds(CrawlTypeEnum.STARTUP);
        crawlService.getCrawlIds(CrawlTypeEnum.INVEST_INSTITUTION);
        crawlService.getCrawlIds(CrawlTypeEnum.INVESTOR);
    }

    @Test
    public void getInvestorIdsFromSaveFileTest() {
        List<String> crawlIds = grabInvestorService.getUserIds();
        crawlService.saveCrawlIds(CrawlTypeEnum.INVESTOR, crawlIds);
    }

    @Test
    public void getInstitutionIdsFromSaveFileTest() {
        List<String> crawlIds = grabInvestInstitutionService.getInstitutionIds();
        crawlService.saveCrawlIds(CrawlTypeEnum.INVEST_INSTITUTION, crawlIds);
    }

    @Test
    public void getStartupIdsFromSaveFileTest() {
        List<String> crawlIds = grabStartUpService.getStartUpIds();
        crawlService.saveCrawlIds(CrawlTypeEnum.STARTUP, crawlIds);
    }

    @Test
    public void grabInvestorTest() {
        crawlService.grabInvestor();
    }

    @Test
    public void grabStartup() {
        crawlService.grabStartup();
    }

    @Test
    public void grabInvestInstitution() {
        crawlService.grabInvestInstitution();
    }

}
