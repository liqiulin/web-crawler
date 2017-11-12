package com.thzj.webcrawler.crawler.ctq.service;

public interface CrawlService {
    /**
     * 抓取项目
     */
    void grabStartup();

    /**
     * 抓取投资人
     */
    void grabInvestor();

    /**
     * 抓取投资机构
     */
    void grabInvestInstitution();
}
