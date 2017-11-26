package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.entity.TDevelopmentHistory;

import java.util.List;

public interface DevelopmentHistoryManager {

    void updateByProjectId(int projectId, List<TDevelopmentHistory> developmentHistoryList);
}
