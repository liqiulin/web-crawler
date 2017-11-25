package com.thzj.webcrawler.manager;

import java.util.List;

public interface InvestorIndustryManager {

    /**
     * 更新投资人的关注领域
     * @param investorId
     * @param industries
     */
    void update(int investorId, List<String> industries);

}
