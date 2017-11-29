package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.entity.CrawlHisSrcTypeEnum;
import com.thzj.webcrawler.entity.CrawlTypeEnum;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.manager.CrawlHisManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class CrawlHisManagerTest {

    @Resource
    private CrawlHisManager crawlHisManager;

    @Test
    @Transactional
    @Rollback
    public void insert_Success() {
        TCrawlHis entity = new TCrawlHis();
        String crawlId = "1234";
        String modelId = "1";
        entity.setCrawlId(crawlId);
        entity.setCrawlType(CrawlTypeEnum.INVEST_INSTITUTION.getCode());
        entity.setSrcType(CrawlHisSrcTypeEnum.VC.getCode());
        entity.setCreateTime(new Date());
        entity.setModelId(modelId);

        int insertResult = crawlHisManager.insert(entity);
        Assert.assertTrue(insertResult == 1);

        Optional<TCrawlHis> queryResultOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
        Assert.assertTrue(queryResultOptional.isPresent());
        TCrawlHis queryResult = queryResultOptional.get();
        log.info("queryResult[{}]", queryResult);
    }

    @Test
    @Transactional
    @Rollback
    public void queryInvestInstitutionByCrawlId_Success() {
        TCrawlHis entity = new TCrawlHis();
        String crawlId = "1234";
        String modelId = "1";
        entity.setCrawlId(crawlId);
        entity.setCrawlType(CrawlTypeEnum.INVEST_INSTITUTION.getCode());
        entity.setSrcType(CrawlHisSrcTypeEnum.VC.getCode());
        entity.setCreateTime(new Date());
        entity.setModelId(modelId);

        int insertResult = crawlHisManager.insert(entity);
        Assert.assertTrue(insertResult == 1);

        Optional<TCrawlHis> queryResultOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
        Assert.assertTrue(queryResultOptional.isPresent());
        TCrawlHis queryResult = queryResultOptional.get();
        log.info("queryResult[{}]", queryResult);
        Assert.assertEquals(queryResult.getCrawlId(), crawlId);
    }

}
