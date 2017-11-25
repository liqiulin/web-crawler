package com.thzj.webcrawler.crawler.ctq.service;

import com.thzj.webcrawler.crawler.ctq.model.Startup;

import java.util.List;
import java.util.Map;

/**
 * @author Matthew
 */
public interface GrabStartUpService {
    /**
     * 抓取融资项目信息
     */
    Map<String, Startup> grabStartUpInfo(List<String> startupIds);

    /**
     * 抓取所有融资项目ID
     */
    List<String> getStartUpIds();
}
