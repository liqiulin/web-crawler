package com.thzj.webcrawler.crawler.ctq.service;

import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;

import java.util.List;

public interface GrabInvestInstitutionService {
    /**
     * 获取投资机构详细信息
     */
    List<InvestInstitution> grabInvestInstitutionInfo(List<String> instituteId);
}
