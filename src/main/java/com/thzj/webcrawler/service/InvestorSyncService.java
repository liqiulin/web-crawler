package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 投资人业务类
 */
@Service
@Slf4j
public class InvestorSyncService {

    /**
     * 同步所有有投资人
     */
    public void doSync() {
        Map<String, Investor> investorMap = CrawlResult.INVESTOR;

    }

}
