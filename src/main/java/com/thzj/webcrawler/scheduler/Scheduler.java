package com.thzj.webcrawler.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Scheduler {

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