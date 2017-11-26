package com.thzj.webcrawler.service;

import com.google.common.base.Stopwatch;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.dao.TInvestorMapper;
import com.thzj.webcrawler.dao.TInvestorProjectMapper;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.manager.ImgManager;
import com.thzj.webcrawler.manager.InvestorIndustryManager;
import com.thzj.webcrawler.manager.InvestorManager;
import com.thzj.webcrawler.manager.InvestorRoundManager;
import com.thzj.webcrawler.manager.impl.CrawlHisManagerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Optional;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@Service
@Slf4j
public class InvestInstitutionSyncService {
    @Resource
    private InvestorManager investorManager;
    @Resource
    private TInvestorMapper tInvestorMapper;
    @Resource
    private TInvestorProjectMapper tInvestorProjectMapper;
    @Resource
    private CrawlHisManagerImpl crawlHisManager;
    @Resource
    private ImgManager imgManager;
    @Resource
    private InvestorIndustryManager investorIndustryManager;
    @Resource
    private InvestorRoundManager investorRoundManager;


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
            }

            // 处理投资领域
            investorIndustryManager.update(entityId, institution.getInvestIndustries());

            // 处理投资轮次
            investorRoundManager.update(entityId, institution.getInvestRounds());
        });

        stopwatch.elapsed(MILLISECONDS);
        log.info("complete. elapsed[{}]", stopwatch);

    }

}
