package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.entity.TCrawlHis;

import java.util.Optional;

public interface CrawlHisManager {
    int save(TCrawlHis entity);
    Optional<TCrawlHis> queryInvestInstitutionByCrawlId(String crawlId);
    Optional<TCrawlHis> queryInvestorByCrawlId(String crawlId);
    Optional<TCrawlHis> queryProjectByCrawlId(String crawlId);
}
