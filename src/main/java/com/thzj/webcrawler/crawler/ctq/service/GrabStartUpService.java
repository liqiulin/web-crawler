package com.thzj.webcrawler.crawler.ctq.service;

import com.thzj.webcrawler.crawler.ctq.model.Startup;

import java.util.List;
import java.util.Map;

public interface GrabStartUpService {
    /**
     * 抓取投资项目信息
     */
    Map<String, Startup> grabStartUpInfo();
}
