package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.crawler.ctq.model.FinancingHistory;
import com.thzj.webcrawler.entity.TInvestorProject;

import java.util.List;

public interface InvestorProjectManager {

    void updateByProjectId(int projectId, List<TInvestorProject> investorProjectList);

    void updateByInvestorId(int investorId, List<TInvestorProject> investorProjectList);

}
