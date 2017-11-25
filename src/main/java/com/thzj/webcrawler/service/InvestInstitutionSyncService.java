package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.dao.TInvestorMapper;
import com.thzj.webcrawler.dao.TInvestorProjectMapper;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.entity.TInvestor;
import com.thzj.webcrawler.manager.ImgManager;
import com.thzj.webcrawler.manager.InvestorIndustryManager;
import com.thzj.webcrawler.manager.impl.CrawlHisManagerImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class InvestInstitutionSyncService {

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


    public void doSync() {
        final Map<String, InvestInstitution> investInstitutionMap = CrawlResult.INVESTINSTITUTION;
        investInstitutionMap.forEach((crawlId, institution) -> {

            Optional<TCrawlHis> tCrawlHisOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
            if (tCrawlHisOptional.isPresent()) {
                int modelId = Integer.parseInt(tCrawlHisOptional.get().getModelId());
                TInvestor tInvestor = tInvestorMapper.selectByPrimaryKey(modelId);
                tInvestor.setOrgLogoImg(imgManager.getSavePathByImgPath(institution.getAvatarUrl()));
                tInvestor.setOrgName(institution.getName());
                tInvestor.setOrgWebsite(institution.getHomePage());
                tInvestor.setPhone(institution.getPhone());
                tInvestor.setMailBox(institution.getEmail());
                tInvestor.setProvince(institution.getProvince());
                tInvestor.setCity(institution.getCity());
                tInvestor.setArea(institution.getArea());
                tInvestor.setOrgIntroduce(institution.getProfile());

                // 处理投资领域
                investorIndustryManager.update(modelId, institution.getInvestIndustries());

                // 处理投资轮次


                // 处理投资案例

                // 更新机构成员名称
            }



        });

    }
}
