package com.thzj.webcrawler.crawler.ctq.service;

import com.thzj.webcrawler.crawler.ctq.model.Startup;

import java.util.List;

public interface GrabStartUpService {
    /**
     * 抓取投资项目信息
     */
    List<Startup> grabStartUpInfo();
}
