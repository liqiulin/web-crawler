package com.thzj.webcrawler.manager;

import java.util.List;

public interface InvestorProjectManager {

    void updateByProject(int investorId, List<String> roundList);

}
