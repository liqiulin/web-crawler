package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
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
        // 同步前初始化
        CrawlResult.INVESTOR.clear();
        CrawlResult.INVESTINSTITUTION.clear();
        CrawlResult.STARTUP.clear();

        // 同步主体对象
        investInstitutionSyncService.doSync();
        investorSyncService.doSync();
        projectSyncService.doSync();

        // 处理投资案例

        // 更新机构成员名称

        //
    }
}
