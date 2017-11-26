package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.TInvestorProjectMapper;
import com.thzj.webcrawler.entity.TInvestorProject;
import com.thzj.webcrawler.entity.TInvestorProjectExample;
import com.thzj.webcrawler.manager.InvestorProjectManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class InvestorProjectManagerImpl implements InvestorProjectManager {
    @Resource
    private TInvestorProjectMapper investorProjectMapper;

    @Override
    public void updateByProjectId(int projectId, List<TInvestorProject> investorProjectList) {
        TInvestorProjectExample deleteExample = new TInvestorProjectExample();
        deleteExample.createCriteria().andProjectIdEqualTo(projectId);
        investorProjectMapper.deleteByExample(deleteExample);

        if (CollectionUtils.isEmpty(investorProjectList)) {
            return;
        }

        investorProjectList.forEach(investorProject -> investorProjectMapper.insertSelective(investorProject));
    }

    @Override
    public void updateByInvestorId(int investorId, List<TInvestorProject> investorProjectList) {
        TInvestorProjectExample deleteExample = new TInvestorProjectExample();
        deleteExample.createCriteria().andInvestmentIdEqualTo(investorId);
        investorProjectMapper.deleteByExample(deleteExample);

        if (CollectionUtils.isEmpty(investorProjectList)) {
            return;
        }

        investorProjectList.forEach(investorProject -> investorProjectMapper.insertSelective(investorProject));
    }
}
