package com.thzj.webcrawler.crawler.ctq.service;

import com.thzj.webcrawler.crawler.ctq.model.Investor;

import java.util.List;

public interface GrabInvestorService {

    /**
     * 获取投资人详细信息
     */
    List<Investor> grabInvestorInfo(List<String> userIdList);
}
