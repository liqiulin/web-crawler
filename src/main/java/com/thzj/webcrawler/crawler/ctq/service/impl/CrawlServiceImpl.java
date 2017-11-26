package com.thzj.webcrawler.crawler.ctq.service.impl;


import com.thzj.webcrawler.crawler.ctq.service.CrawlService;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestInstitutionService;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


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

    }

    @Override
    public void grabInvestor() {

    }

    @Override
    public void grabInvestInstitution() {

    }

}
