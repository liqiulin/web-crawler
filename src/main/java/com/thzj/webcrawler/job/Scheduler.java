package com.thzj.webcrawler.job;

import com.thzj.webcrawler.service.SyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Slf4j
@EnableScheduling
public class Scheduler {
    private static final String SYNC_SWITCH_ON = "1";

    @Value("${sync.switch}")
    private String syncSwitch;
    @Resource
    private SyncService syncService;

    /**
     * 每晚1点开始同步
     */
    @Scheduled(cron="${sync.scheduler.cron}")
    public void sync() {
        log.info("scheduled to sync start. swith[{}]", syncSwitch);
        if (SYNC_SWITCH_ON.equals(syncSwitch)) {
            syncService.doSync();
        }
        log.info("scheduled to sync end. swith[{}]", syncSwitch);
    }

    /**
     * 每分钟执行一次
     */
    @Scheduled(cron="0 0/1 * * * ?")
    public void statusCheck() {
        log.info("每分钟执行一次。开始……");
        log.info("每分钟执行一次。结束。");
    }

    @Scheduled(fixedRate=20000)
    public void testTasks() {
        log.info("每20秒执行一次。开始……");
        //statusTask.healthCheck();
        log.info("每20秒执行一次。结束。");
    }
}