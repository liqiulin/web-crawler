package com.thzj.webcrawler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class SyncService {
    @Resource
    private InvestInstitutionSyncService investInstitutionSyncService;
    @Resource
    private InvestorSyncService investorSyncService;
    @Resource
    private ProjectSyncService projectSyncService;

    public void doSync() {
        // 同步完主体对象
        investInstitutionSyncService.doSync();
        investorSyncService.doSync();
        projectSyncService.doSync();

        //
    }
}
