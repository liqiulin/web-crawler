package com.thzj.webcrawler.service;

import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class ProjectSyncServiceTest {

    @Resource
    private ProjectSyncService projectSyncService;

    @Test
    public void doSync_Success() {
        Startup startup = new Startup();
        startup.setId("80373");
        startup.setAvatarUrl("https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/80373/thumb/d6cb96794a9232cb476a885c8ba325d4.jpg?1510728891");
        startup.setName("摩拜单车");
        startup.setIndustry("汽车交通, 交通出行");
        startup.setSummary("一家互联网短途出行解决方案");
        startup.setProvince("北京");
        startup.setCity("海淀区");
        startup.setCompanyName("北京摩拜科技有限公司");
        startup.setEstablishTime(new Date());
        startup.setProfile("摩拜单车是一家互联网短途出行解决方案，是无桩借还车模式的智能硬件，旨在让用户无需办卡,只需下载摩拜单车App完成注册,扫码解锁,支付的全过程。还车时只需在路边白线内, 手动关锁,无固定车桩。");
        startup.setProductImgUrl("https://assets1.vc.cn/assets.vc.cn/system/photos/avatars/000/082/430/original/4.png?1510728892");
        startup.setProductHomePage("https://mobike.com/cn/");

        FinancingHistory financingHistory = new FinancingHistory();
        financingHistory.setFinancingAmount("6亿美元");
        financingHistory.setInvestInstitutionIds(Lists.newArrayList("2752", "6155"));
        financingHistory.setRound("EE+");
        financingHistory.setStartupId(startup.getId());
        financingHistory.setTime(new Date());
        FinancingHistory financingHistory2 = new FinancingHistory();
        financingHistory2.setFinancingAmount("10亿美元");
        financingHistory2.setInvestInstitutionIds(Lists.newArrayList("2752", "6155", "2996"));
        financingHistory2.setRound("战略投资");
        financingHistory2.setStartupId(startup.getId());
        financingHistory2.setTime(new Date());
        startup.setFinancingHistories(Lists.newArrayList(financingHistory, financingHistory2));

        StartupMember startupMember = new StartupMember();
        startupMember.setAvatarUrl("https://assets0.vc.cn/assets.vc.cn/system/user/avatars/142322/thumb/ff5ad66d65fafba6efea24b5ee341e7c.jpg?1490075681");
        startupMember.setMemberName("王晓峰");
        startupMember.setProfile("王晓峰，北京摩拜科技有限公司CEO，曾担任Uber上海总经理、腾讯副总经理、Coty销售总监、Google中国华东渠道负责人等，还曾在宝洁先后担任各种销售岗位销售各种产品 从纸尿裤到SK II ...");
        startupMember.setStartUpId(startup.getId());
        startupMember.setIdentity("创始人");
        StartupMember startupMember2 = new StartupMember();
        startupMember2.setAvatarUrl("https://assets0.vc.cn/assets.vc.cn/system/user/avatars/156825/thumb/f1ed3b6b2f5f201a5d1357013b77b2f6.jpg?1490080156");
        startupMember2.setMemberName("胡玮炜");
        startupMember2.setProfile("胡玮炜，摩拜单车联合创始人、总裁，前GeekCar极客汽车创始人、CEO，资深媒体人。行走于汽车江湖多年，职业贯穿汽车厂商、财经类报纸、都市类媒体、网络媒体和一线杂志，以灵秀气质、犀利笔锋和上下...");
        startupMember2.setStartUpId(startup.getId());
        startupMember2.setIdentity("创始人");
        startup.setMembers(Lists.newArrayList(startupMember, startupMember2));

        DevelopmentHistory developmentHistory = new DevelopmentHistory();
        developmentHistory.setStartupId(startup.getId());
        developmentHistory.setHistoryTime(new Date());
        developmentHistory.setInvestRound("E+++++++++++");
        developmentHistory.setProfile("Elkafkajsdf;akjsfEEEEEEEEEEEEEEEE+++++++++++++++++++++++");
        startup.setHistory(Lists.newArrayList(developmentHistory));

        Map<String, Startup> startupMap = CrawlResult.STARTUP;
        startupMap.put(startup.getId(), startup);

        projectSyncService.doSync();
        projectSyncService.doSync();
        projectSyncService.doSync();
    }
}
