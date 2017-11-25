package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.dao.TInvestorMapper;
import com.thzj.webcrawler.dao.TInvestorProjectMapper;
import com.thzj.webcrawler.entity.InvestorFormEnum;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.entity.TInvestor;
import com.thzj.webcrawler.manager.ImgManager;
import com.thzj.webcrawler.manager.InvestorIndustryManager;
import com.thzj.webcrawler.manager.InvestorManager;
import com.thzj.webcrawler.manager.InvestorRoundManager;
import com.thzj.webcrawler.manager.impl.CrawlHisManagerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

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
        final Map<String, InvestInstitution> investInstitutionMap = CrawlResult.INVESTINSTITUTION;
        investInstitutionMap.forEach((crawlId, institution) -> {
            Optional<TCrawlHis> tCrawlHisOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
            String imgSavePath = imgManager.getSavePathByImgPath(institution.getAvatarUrl());
            int investorId;
            if (tCrawlHisOptional.isPresent()) {
                investorId = Integer.parseInt(tCrawlHisOptional.get().getModelId());
                investorManager.updateByCrawlInstitution(investorId, institution, imgSavePath);
            } else {
                investorId = investorManager.saveByCrawlInstitution(institution, imgSavePath);
            }

            // 处理投资领域
            investorIndustryManager.update(investorId, institution.getInvestIndustries());

            // 处理投资轮次
            investorRoundManager.update(investorId, institution.getInvestRounds());

            // 处理投资案例 (这里也不处理，待项目主抓完后再处理)

            // 更新机构成员名称 （这里不处理，待投资人主体同步完成后再处理）
        });

    }

}
