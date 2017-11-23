package com.thzj.webcrawler.crawler.ctq.service;

import com.thzj.webcrawler.crawler.ctq.model.Investor;

import java.util.List;
import java.util.Map;

public interface GrabInvestorService {

    /**
     * 获取投资人详细信息
     */
    Map<String, Investor> grabInvestorInfo(List<String> userIdList);
}
