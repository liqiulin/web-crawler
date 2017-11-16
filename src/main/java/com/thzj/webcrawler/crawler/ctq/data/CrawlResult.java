package com.thzj.webcrawler.crawler.ctq.data;

import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.Startup;

import java.util.Map;

/**
 * 抓取结果
 */
public class CrawlResult {
    public static final Map<String, Startup> STARTUP = Maps.newConcurrentMap();

    public static final Map<String, Investor> INVESTOR = Maps.newConcurrentMap();

    public static final Map<String, InvestInstitution> INVESTINSTITUTION = Maps.newConcurrentMap();

}