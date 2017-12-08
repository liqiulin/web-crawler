package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.manager.InvestorRoundManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class InvestorRoundManagerImpl implements InvestorRoundManager {
    @Resource
    private TInvestorRoundMapper tInvestorRoundMapper;

    @Override
    public void update(int investorId, List<String> roundList) {
        TInvestorRoundExample deleteExample = new TInvestorRoundExample();
        deleteExample.createCriteria().andInvestorIdEqualTo(investorId);
        tInvestorRoundMapper.deleteByExample(deleteExample);

        if (CollectionUtils.isEmpty(roundList)) {
            return ;
        }

        roundList.forEach(round -> {
            TInvestorRound tInvestorRound = new TInvestorRound();
            tInvestorRound.setInvestorId(investorId);
            tInvestorRound.setRound(round);
            tInvestorRoundMapper.insertSelective(tInvestorRound);
        });

    }
}
