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
     * 获取抓取对象的ID列表，先从文件中读取，若没有再从目标网站抓取并保存到文件
     * @param crawlTypeEnum
     * @return
     */
    List<String> getCrawlIds(CrawlTypeEnum crawlTypeEnum);

    /**
     * 从保存的文件中获取抓取的ID记录
     */
    Optional<List<String>> getCrawlIdsFromSaveFile(CrawlTypeEnum crawlType);

    /**
     * 从保存的文件中读取抓取结果
     */
    <T> List<T> getCrawlResultFromSaveFile(CrawlTypeEnum crawlTypeEnum, Class<T> clazz);

    /**
     * 保存抓取的ID列表
     */
    void saveCrawlIds(CrawlTypeEnum crawlType, List<String> crawIds);

    /**
     * 保存抓取结果到文件
     */
    void saveCrawlResultToFile(CrawlTypeEnum crawlType, Object crawlResult);
}
