package com.thzj.webcrawler.crawler.ctq.service;

import java.util.List;
import java.util.Optional;

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

    /**
     * 从保存的文件中获取抓取的ID记录
     */
    Optional<List<String>> getCrawlIdsFromSaveFile(CrawlTypeEnum crawlType);

    /**
     * 保存抓取的ID列表
     */
    void saveCrawlIds(CrawlTypeEnum crawlType, List<String> crawIds);

}
