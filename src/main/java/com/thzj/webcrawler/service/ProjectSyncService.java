package com.thzj.webcrawler.service;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.entity.*;
import com.thzj.webcrawler.manager.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@Service
@Slf4j
public class ProjectSyncService {
    @Resource
    private CrawlHisManager crawlHisManager;
    @Resource
    private ImgManager imgManager;
    @Resource
    private ProjectManager projectManager;
    @Resource
    private TeamMemberManager teamMemberManager;
    @Resource
    private DevelopmentHistoryManager developmentHistoryManager;
    @Resource
    private InvestorProjectManager investorProjectManager;

    private static ExecutorService executorService = Executors.newFixedThreadPool(30);

    public void doSyncImgConcurrent() {
        Map<String, Startup> investorMap = CrawlResult.STARTUP;
        investorMap.forEach((crawlId, startup) -> {
            executorService.submit(() -> {
                log.info("statup avatar img sync start . id [{}]", startup.getId());
                imgManager.getSavePathByImgPath(startup.getAvatarUrl());
                log.info("statup avatar img sync end . id [{}]", startup.getId());
            });
            executorService.submit(() -> {
                log.info("statup product img sync start . id [{}]", startup.getId());
                imgManager.getSavePathByImgPath(startup.getProductImgUrl());
                log.info("statup product img synced . id [{}]", startup.getId());
            });
        });
    }

    public void doSync() {
        log.info("start ...");
        Stopwatch stopwatch = Stopwatch.createStarted();


        Map<String, Startup> investorMap = CrawlResult.STARTUP;
        investorMap.forEach((crawlId, startup) -> {
            // 同步主体对象
            String logoSavePath = imgManager.getSavePathByImgPath(startup.getAvatarUrl());
            String productImgSavePath = imgManager.getSavePathByImgPath(startup.getProductImgUrl());
            int entityId;
            Optional<TCrawlHis> tCrawlHisOptional = crawlHisManager.queryProjectByCrawlId(crawlId);
            if (tCrawlHisOptional.isPresent()) {
                entityId = Integer.parseInt(tCrawlHisOptional.get().getModelId());
                projectManager.updateByCrawlStartup(entityId, startup, logoSavePath, productImgSavePath);
            } else {
                entityId = projectManager.saveByCrawlStartup(startup, logoSavePath, productImgSavePath);

                // 保存抓取历史
                TCrawlHis crawlHis = new TCrawlHis();
                crawlHis.setSrcType(CrawlHisSrcTypeEnum.VC.getCode());
                crawlHis.setModelId(Integer.toString(entityId));
                crawlHis.setCrawlId(crawlId);
                crawlHis.setCrawlType(CrawlTypeEnum.PROJECT.getCode());
                crawlHis.setCreateTime(new Date());
                crawlHisManager.save(crawlHis);
            }

            // 同步融资历史
            sycFinancingHistory(startup, entityId);

            // 同步团队成员
            syncMembers(startup, entityId);

            // 同步发展历程   todo  创投圈还没看到相关内容，不知有些啥字段，待明确后再处理
//            syncDevelopmentHistory(startup, entityId);
        });

        stopwatch.elapsed(MILLISECONDS);
        log.info("complete. elapsed[{}]", stopwatch);
    }

    private void sycFinancingHistory(Startup startup, int entityId) {
        List<TInvestorProject> investorProjectList = Lists.newArrayList();
        if (!CollectionUtils.isEmpty(startup.getFinancingHistories())) {
            startup.getFinancingHistories().forEach(financingHistory -> {
                TInvestorProject investorProject = new TInvestorProject();
                investorProject.setProjectId(entityId);
                investorProject.setAmount(financingHistory.getFinancingAmount());
                investorProject.setInvestmentRounds(financingHistory.getRound());
                investorProject.setInvestmentTime(financingHistory.getTime());

                // 默认字段
                investorProject.setAuditMan("超级管理员");
                investorProject.setAuditState("1");
                investorProject.setAuditTime(new Date());

                investorProjectList.add(investorProject);
            });
        }
        investorProjectManager.updateByProjectId(entityId, investorProjectList);
    }


    private void syncDevelopmentHistory(Startup startup, int entityId) {
        List<TDevelopmentHistory> tDevelopmentHistoryList = Lists.newArrayList();
        if (!CollectionUtils.isEmpty(startup.getHistory())) {
            startup.getHistory().forEach(developmentHistory -> {
                TDevelopmentHistory tDevelopmentHistory = new TDevelopmentHistory();
                tDevelopmentHistory.setProjectId(entityId);
                tDevelopmentHistory.setProfile(developmentHistory.getProfile());
                tDevelopmentHistory.setStage(developmentHistory.getInvestRound());
                tDevelopmentHistory.setAddTime(developmentHistory.getHistoryTime());
                tDevelopmentHistoryList.add(tDevelopmentHistory);
            });
        }
        developmentHistoryManager.updateByProjectId(entityId, tDevelopmentHistoryList);
    }

    private void syncMembers(Startup startup, int entityId) {
        List<TTeamMembers> tTeamMembersList = Lists.newArrayList();
        if (!CollectionUtils.isEmpty(startup.getMembers())) {
            startup.getMembers().forEach(startupMember -> {
                TTeamMembers teamMembers = new TTeamMembers();
                teamMembers.setProjectId(entityId);
                String photographSavePath = imgManager.getSavePathByImgPath(startupMember.getAvatarUrl());
                teamMembers.setPhotographsUrl(photographSavePath);
                teamMembers.setMembersName(startupMember.getMemberName());
                teamMembers.setIdentity(startupMember.getIdentity());
                teamMembers.setProfile(startupMember.getProfile());
                tTeamMembersList.add(teamMembers);
            });
        }
        teamMemberManager.updateByProjectId(entityId, tTeamMembersList);
    }

    public static void main(String[] args) {
        log.info("start ...");
        Stopwatch stopwatch = Stopwatch.createStarted();



        stopwatch.elapsed(MILLISECONDS);
        log.info("complete. elapsed[{}]", stopwatch);
    }
}
