package com.thzj.webcrawler.manager;

import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.model.DevelopmentHistory;
import com.thzj.webcrawler.crawler.ctq.model.FinancingHistory;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
@Transactional
@Rollback
public class ProjectManagerTest {

    @Resource
    private ProjectManager projectManager;


    @Test
    public void saveByCrawlStartup_Success() {
        String startupId = "1001";
        Startup startup = new Startup();
        startup.setId(startupId);
        startup.setAvatarUrl("www.baidu.com");
        startup.setCity("深圳");
        startup.setCompanyName("天地会");
        startup.setEstablishTime(new Date());

        FinancingHistory financingHistory = new FinancingHistory();
        financingHistory.setFinancingAmount("100万");
        financingHistory.setInvestInstitutionIds(Lists.newArrayList("1"));
        financingHistory.setRound("F轮");
        financingHistory.setStartupId("1000");
        financingHistory.setTime(new Date());
        startup.setFinancingHistories(Lists.newArrayList(financingHistory));
        startup.setDetailUrl("www.sina.com");
        startup.setIndustry("电子产品");

        DevelopmentHistory developmentHistory = new DevelopmentHistory();
        developmentHistory.setHistoryTime(new Date());
        developmentHistory.setInvestRound("E+_+");
        developmentHistory.setProfile("hahahah");
        developmentHistory.setStartupId(startupId);
        startup.setHistory(Lists.newArrayList(developmentHistory));

        startup.setEstablishTime(new Date());
        startup.setName("百度");
        startup.setProductHomePage("www.baidu.com");
        startup.setProvince("广东");
        startup.setSummary("hahaha, just test");
        String productImagePath = "https://a3.fspage.com/FSC/EM/Avatar/GetAvatar?path=N_201708_16_bc5c37312ce9493f8e8d84a02196d0ba.png&size=150_150&ea=appCenter&type=WEB";
        startup.setProductImgUrl(productImagePath);

        String logoPath = productImagePath;
        projectManager.saveByCrawlStartup(startup, logoPath, productImagePath);
    }

}
