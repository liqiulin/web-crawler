package com.thzj.webcrawler.manager;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
@Transactional
@Rollback
public class DevelopmentHistoryManagerTest {
    @Resource
    private DevelopmentHistoryManager developmentHistoryManager;
    @Resource
    private ProjectManager projectManager;

    @Test
    public void updateByProjectId_Success() {

//        developmentHistoryManager.u
    }
}
