package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.entity.TInvestor;

public interface InvestorManager {
    void updateByCrawlInstitution(int investorId, InvestInstitution investInstitution, String logoPath);

    void updateByCrawlInvestor(int investorId, Investor investor, String logoPath);

    int saveByCrawlInstitution(InvestInstitution investInstitution, String logoPath);

    int saveByCrawlInvestor(Investor investor, String logoPath);

    TInvestor queryById(int id);

}
