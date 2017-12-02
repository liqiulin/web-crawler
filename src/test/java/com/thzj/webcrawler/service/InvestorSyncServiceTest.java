package com.thzj.webcrawler.service;

import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.WorkExperience;
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
public class InvestorSyncServiceTest {

    @Resource
    private InvestorSyncService investorSyncService;

    @Test
    public void doSync_Success() {
        Investor investor = new Investor();
        investor.setAvatarUrl("https://assets1.vc.cn/assets.vc.cn/system/user/avatars/117108/thumb/84554d46dfc51bd00adb74f760641fb2.png?1471610449");
        investor.setCity("");
        investor.setCompany("拙扑投资");
        investor.setId("117108");
        investor.setName("许志淳");
        investor.setPosition("创始合伙人");
        investor.setProfile("haaha, test a a ");
        investor.setProvince("上海");
        investor.setInstitutionId("6155");

        InvestCase investCase = new InvestCase();
        investCase.setAvatarUrl("https://assets0.vc.cn/assets.vc.cn/system/startup/avatars/80373/thumb/d6cb96794a9232cb476a885c8ba325d4.jpg?1510728891");
        investCase.setInvestorMoney("100亿人民币");
        investCase.setInvestorRound("E++++++轮");
        investCase.setName("摩拜单车");
        investCase.setTime(new Date());
        investCase.setStartupId("80373");
        investCase.setStartupIndustry("教育");
        investCase.setInvestInstitutions("阿里、腾讯");
        investor.setInvestCase(Lists.newArrayList(investCase));

        investor.setInvestIndustries(Lists.newArrayList("分享", "乱搞"));
        investor.setInvestRounds(Lists.newArrayList("A", "B"));

        WorkExperience workExperience = new WorkExperience();
        workExperience.setTimeFrom(new Date());
        workExperience.setTimeTo(new Date());
        workExperience.setCompany("天上");
        workExperience.setPosition("如来");

        WorkExperience workExperience2 = new WorkExperience();
        workExperience2.setTimeFrom(new Date());
        workExperience2.setTimeTo(new Date());
        workExperience2.setCompany("地下");
        workExperience2.setPosition("阎王");
        investor.setWorkExperiences(Lists.newArrayList(workExperience, workExperience2));

        Map<String, Investor> investorMap = CrawlResult.INVESTOR;
        investorMap.put(investor.getId(), investor);

        investorSyncService.doSync();
        investorSyncService.doSync();
        investorSyncService.doSync();

    }
}
