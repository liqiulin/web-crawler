package com.thzj.webcrawler.crawler.ctq.service;

import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;

import java.util.List;
import java.util.Map;

public interface GrabInvestInstitutionService {
    /**
     * 获取投资机构详细信息
     */
    Map<String, InvestInstitution> grabInvestInstitutionInfo(List<String> instituteId);
}
