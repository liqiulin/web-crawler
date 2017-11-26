package com.thzj.webcrawler.service;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.entity.CrawlHisSrcTypeEnum;
import com.thzj.webcrawler.entity.CrawlTypeEnum;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.entity.TInvestorProject;
import com.thzj.webcrawler.manager.*;
import com.thzj.webcrawler.manager.impl.CrawlHisManagerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@Service
@Slf4j
public class InvestInstitutionSyncService {
    @Resource
    private InvestorManager investorManager;
    @Resource
    private CrawlHisManagerImpl crawlHisManager;
    @Resource
    private ImgManager imgManager;
    @Resource
    private InvestorIndustryManager investorIndustryManager;
    @Resource
    private InvestorRoundManager investorRoundManager;
    @Resource
    private InvestorProjectManager investorProjectManager;


    public void doSync() {
        log.info("start ...");
        Stopwatch stopwatch = Stopwatch.createStarted();

        final Map<String, InvestInstitution> investInstitutionMap = CrawlResult.INVESTINSTITUTION;
        investInstitutionMap.forEach((crawlId, institution) -> {
            Optional<TCrawlHis> tCrawlHisOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
            String imgSavePath = imgManager.getSavePathByImgPath(institution.getAvatarUrl());
            int entityId;
            if (tCrawlHisOptional.isPresent()) {
                entityId = Integer.parseInt(tCrawlHisOptional.get().getModelId());
                investorManager.updateByCrawlInstitution(entityId, institution, imgSavePath);
            } else {
                entityId = investorManager.saveByCrawlInstitution(institution, imgSavePath);

                // 保存抓取历史
                TCrawlHis crawlHis = new TCrawlHis();
                crawlHis.setSrcType(CrawlHisSrcTypeEnum.VC.getCode());
                crawlHis.setModelId(Integer.toString(entityId));
                crawlHis.setCrawlId(crawlId);
                crawlHis.setCrawlType(CrawlTypeEnum.INVEST_INSTITUTION.getCode());
                crawlHis.setCreateTime(new Date());
                crawlHisManager.insert(crawlHis);
            }

            // 处理投资领域
            investorIndustryManager.update(entityId, institution.getInvestIndustries());

            // 处理投资轮次
            investorRoundManager.update(entityId, institution.getInvestRounds());

            // 投资案例
            syncInvestCase(institution, entityId);
        });

        stopwatch.elapsed(MILLISECONDS);
        log.info("complete. elapsed[{}]", stopwatch);

    }

    private void syncInvestCase(InvestInstitution institution, int entityId) {
        List<TInvestorProject> tInvestorProjectList = Lists.newArrayList();
        if (!CollectionUtils.isEmpty(institution.getInvestCases())) {
            institution.getInvestCases().forEach(investCase -> {
                TInvestorProject investorProject = investorProjectManager.translate(investCase);
                investorProject.setInvestmentId(entityId);
                tInvestorProjectList.add(investorProject);
            });
        }
        investorProjectManager.updateByInvestorId(entityId, tInvestorProjectList);
    }
}
