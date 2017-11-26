package com.thzj.webcrawler.service;

import com.google.common.base.Stopwatch;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.entity.TCrawlHis;
import com.thzj.webcrawler.manager.CrawlHisManager;
import com.thzj.webcrawler.manager.ImgManager;
import com.thzj.webcrawler.manager.ProjectManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Optional;

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

    public void doSync() {
        log.info("start ...");
        Stopwatch stopwatch = Stopwatch.createStarted();


        Map<String, Startup> investorMap = CrawlResult.STARTUP;
        investorMap.forEach((crawlId, startup) -> {
            // 同步主体对象
            Optional<TCrawlHis> tCrawlHisOptional = crawlHisManager.queryInvestInstitutionByCrawlId(crawlId);
            String logoSavePath = imgManager.getSavePathByImgPath(startup.getAvatarUrl());
            String productImgSavePath = imgManager.getSavePathByImgPath(startup.getProductImgUrl());
            int entityId;
            if (tCrawlHisOptional.isPresent()) {
                entityId = Integer.parseInt(tCrawlHisOptional.get().getModelId());
                projectManager.updateByCrawlStartup(entityId, startup, logoSavePath, productImgSavePath);
            } else {
                entityId = projectManager.saveByCrawlStartup(startup, logoSavePath, productImgSavePath);
            }


        });


        stopwatch.elapsed(MILLISECONDS);
        log.info("complete. elapsed[{}]", stopwatch);
    }

    public static void main(String[] args) {
        log.info("start ...");
        Stopwatch stopwatch = Stopwatch.createStarted();



        stopwatch.elapsed(MILLISECONDS);
        log.info("complete. elapsed[{}]", stopwatch);
    }
}
