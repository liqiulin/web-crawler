package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.TInvestorIndustryMapper;
import com.thzj.webcrawler.entity.TInvestorIndustry;
import com.thzj.webcrawler.entity.TInvestorIndustryExample;
import com.thzj.webcrawler.manager.InvestorIndustryManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class InvestorIndustryManagerImpl implements InvestorIndustryManager {
    @Resource
    private TInvestorIndustryMapper tInvestorIndustryMapper;

    @Override
    public void update(int investorId, List<String> industries) {

        TInvestorIndustryExample deleteExample = new TInvestorIndustryExample();
        deleteExample.createCriteria().andInvestorIdEqualTo(investorId);
        tInvestorIndustryMapper.deleteByExample(deleteExample);


        if (CollectionUtils.isEmpty(industries)) {
            return;
        }

        industries.forEach(industry -> {
            TInvestorIndustry t = new TInvestorIndustry();
            t.setInvestorId(investorId);
            t.setIndustry(industry);
            tInvestorIndustryMapper.insertSelective(t);
        });
    }
}
