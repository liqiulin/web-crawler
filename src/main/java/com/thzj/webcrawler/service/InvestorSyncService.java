package com.thzj.webcrawler.service;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.entity.CrawlHisSrcTypeEnum;
import com.thzj.webcrawler.entity.CrawlTypeEnum;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.entity.TInvestorProject;
import com.thzj.webcrawler.manager.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * 投资人业务类
 */
@Service
@Slf4j
public class InvestorSyncService {

    @Resource
    private CrawlHisManager crawlHisManager;
    @Resource
    private ImgManager imgManager;
    @Resource
    private InvestorManager investorManager;
    @Resource
    private InvestorIndustryManager investorIndustryManager;
    @Resource
    private InvestorRoundManager investorRoundManager;
    @Resource
    private UnitMessageManager unitMessageManager;
    @Resource
    private InvestorProjectManager investorProjectManager;

    /**
     * 同步所有有投资人
     */
    public void doSync() {
        log.info("start ...");
        Stopwatch stopwatch = Stopwatch.createStarted();

        Map<String, Investor> investorMap = CrawlResult.INVESTOR;
        investorMap.forEach((crawlId, crawlInvestor) -> {
            // 同步主体对象
            String imgSavePath = imgManager.getSavePathByImgPath(crawlInvestor.getAvatarUrl());
            int entityId;
            Optional<TCrawlHis> tCrawlHisOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
            if (tCrawlHisOptional.isPresent()) {
                entityId = Integer.parseInt(tCrawlHisOptional.get().getModelId());
                investorManager.updateByCrawlInvestor(entityId, crawlInvestor, imgSavePath);
            } else {
                entityId = investorManager.saveByCrawlInvestor(crawlInvestor, imgSavePath);

                // 保存抓取历史
                TCrawlHis crawlHis = new TCrawlHis();
                crawlHis.setSrcType(CrawlHisSrcTypeEnum.VC.getCode());
                crawlHis.setModelId(Integer.toString(entityId));
                crawlHis.setCrawlId(crawlId);
                crawlHis.setCrawlType(CrawlTypeEnum.INVESTOR.getCode());
                crawlHis.setCreateTime(new Date());
                crawlHisManager.save(crawlHis);
            }

            // 处理投资领域
            investorIndustryManager.update(entityId, crawlInvestor.getInvestIndustries());

            // 处理投资轮次
            investorRoundManager.update(entityId, crawlInvestor.getInvestRounds());

            // 处理工作经历
            unitMessageManager.update(entityId, crawlInvestor.getWorkExperiences());

            // 处理投资案例
            syncInvestCase(crawlInvestor, entityId);
        });

        stopwatch.elapsed(MILLISECONDS);
        log.info("complete. elapsed[{}]", stopwatch);

    }

    private void syncInvestCase(Investor investor, int entityId) {
        List<TInvestorProject> tInvestorProjectList = Lists.newArrayList();
        if (!CollectionUtils.isEmpty(investor.getInvestCase())) {
            investor.getInvestCase().forEach(investCase -> {
                TInvestorProject investorProject = investorProjectManager.translate(investCase);
                investorProject.setInvestmentId(entityId);
            });
        }
        investorProjectManager.updateByInvestorId(entityId, tInvestorProjectList);
    }
}


