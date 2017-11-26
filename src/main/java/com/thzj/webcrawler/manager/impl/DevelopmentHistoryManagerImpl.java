package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.TDevelopmentHistoryMapper;
import com.thzj.webcrawler.entity.TDevelopmentHistory;
import com.thzj.webcrawler.entity.TDevelopmentHistoryExample;
import com.thzj.webcrawler.manager.DevelopmentHistoryManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class DevelopmentHistoryManagerImpl implements DevelopmentHistoryManager {
    @Resource
    private TDevelopmentHistoryMapper developmentHistoryMapper;

    @Override
    public void updateByProjectId(int projectId, List<TDevelopmentHistory> developmentHistoryList) {
        TDevelopmentHistoryExample deleteExample = new TDevelopmentHistoryExample();
        deleteExample.createCriteria().andProjectIdEqualTo(projectId);
        developmentHistoryMapper.deleteByExample(deleteExample);

        if (CollectionUtils.isEmpty(developmentHistoryList)) {
            return;
        }

        developmentHistoryList.forEach(developmentHistory -> developmentHistoryMapper.insertSelective(developmentHistory));
    }
}
