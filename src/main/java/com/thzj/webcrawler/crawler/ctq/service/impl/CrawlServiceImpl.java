package com.thzj.webcrawler.crawler.ctq.service.impl;


import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.crawler.ctq.service.CrawlService;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestInstitutionService;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class CrawlServiceImpl implements CrawlService {

    @Resource
    private GrabInvestorService grabInvestorService;

    @Resource
    private GrabInvestInstitutionService grabInvestInstitutionService;

    @Resource
    private GrabStartUpService grabStartUpService;

    @Override
    public void grabStartup() {
        log.info("grabStartup start...");
        List<String> startupIds = grabStartUpService.getStartUpIds();
        log.info("grabStartup startupIds[{}]", startupIds);

        Map<String, Startup> grabStartupInfoMap = grabStartUpService.grabStartUpInfo(startupIds);
        log.info("grabStartup grabStartupInfoMap[{}]", grabStartupInfoMap);

        CrawlResult.STARTUP.putAll(grabStartupInfoMap);
    }

    @Override
    public void grabInvestor() {
        log.info("grabInvestor start...");
        List<String> userIds = grabInvestorService.getUserIds();
        log.info("grabInvestor userIds[{}]", userIds);

        Map<String, Investor> grabInvestorInfoMap = grabInvestorService.grabInvestorInfo(userIds);
        log.info("grabInvestor grabInvestorInfoMap[{}]", grabInvestorInfoMap);

        CrawlResult.INVESTOR.putAll(grabInvestorInfoMap);
    }

    @Override
    public void grabInvestInstitution() {
        log.info("grabInvestInstitution start...");
        List<String> institutionIds = grabInvestInstitutionService.getInstitutionIds();
        log.info("grabInvestInstitution institutionIds[{}]", institutionIds);

        Map<String, InvestInstitution> grabInvestInstitutionInfoMap =
                grabInvestInstitutionService.grabInvestInstitutionInfo(institutionIds);
        log.info("grabInvestInstitution grabInvestInstitutionInfoMap[{}]", grabInvestInstitutionInfoMap);

        CrawlResult.INVESTINSTITUTION.putAll(grabInvestInstitutionInfoMap);
    }

}
