package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.entity.TInvestorProject;

import java.util.List;

public interface InvestorProjectManager {

    TInvestorProject translate(InvestCase investCase);

    void updateByProjectId(int projectId, List<TInvestorProject> investorProjectList);

    void updateByInvestorId(int investorId, List<TInvestorProject> investorProjectList);

}
