package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.manager.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Optional;

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

    /**
     * 同步所有有投资人
     */
    public void doSync() {
        Map<String, Investor> investorMap = CrawlResult.INVESTOR;

        investorMap.forEach((crawlId, crawlInvestor) -> {
            Optional<TCrawlHis> tCrawlHisOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
            String imgSavePath = imgManager.getSavePathByImgPath(crawlInvestor.getAvatarUrl());
            int investorId;
            if (tCrawlHisOptional.isPresent()) {
                investorId = Integer.parseInt(tCrawlHisOptional.get().getModelId());
                investorManager.updateByCrawlInvestor(investorId, crawlInvestor, imgSavePath);
            } else {
                investorId = investorManager.saveByCrawlInvestor(crawlInvestor, imgSavePath);
            }

            // 处理投资领域
            investorIndustryManager.update(investorId, crawlInvestor.getInvestIndustries());

            // 处理投资轮次
            investorRoundManager.update(investorId, crawlInvestor.getInvestRounds());

            // 处理工作经历
            unitMessageManager.update(investorId, crawlInvestor.getWorkExperiences());

        });
    }

}
