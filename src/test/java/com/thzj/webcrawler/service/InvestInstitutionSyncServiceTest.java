package com.thzj.webcrawler.service;

import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.data.CrawlResult;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.util.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvestInstitutionSyncServiceTest {

    @Resource
    private InvestInstitutionSyncService investInstitutionSyncService;

    @Test
    @Transactional
    @Rollback
    public void doSync_Success() {
        String investInstitutionJson = "{\"avatarUrl\":\"https://assets2.vc.cn/assets.vc.cn/system/institution/avatars/188/thumb/50a25ba869b8575a88bb19b1be20f239.jpg?1490089763\",\"city\":\"\",\"detailUrl\":\"https://www.vc.cn/institutions/188\",\"email\":\"\",\"homePage\":\"\",\"id\":\"188\",\"investCases\":[{\"avatarUrl\":\"\",\"investorMoney\":\"3.5亿人民币\",\"investorRound\":\"战略投资\",\"name\":\"高思教育\",\"profile\":\"教育是一个中小学教学培训机构，由教育专家徐鸣皋教授的带...\",\"startupId\":\"87176\",\"time\":1508774400000},{\"avatarUrl\":\"\",\"investorMoney\":\"5.5亿人民币\",\"investorRound\":\"新三板\",\"name\":\"高思教育\",\"profile\":\"教育是一个中小学教学培训机构，由教育专家徐鸣皋教授的带...\",\"startupId\":\"87176\",\"time\":1505836800000},{\"avatarUrl\":\"\",\"investorMoney\":\"数千万人民币\",\"investorRound\":\"天使轮\",\"name\":\"悦旅汇\",\"profile\":\"会员制特权旅行俱乐部\",\"startupId\":\"122571\",\"time\":1505404800000}],\"investIndustries\":[\"互联网\",\"移动互联网\",\"医疗健康\",\"消费\",\"企业服务\",\"电子商务\",\"文化娱乐\"],\"investRounds\":[\"Pre-A轮\",\"A轮\",\"B轮\"],\"members\":[\"19671\",\"19671\",\"184864\",\"184864\"],\"name\":\"沸点资本\",\"phone\":\"\",\"profile\":\"沸点资本成立于2016年3月，是一家关注TMT、消费升级的投资基金，创始合伙人为前高原资本董事总经理涂鸿川、前360高级副总裁于光东、前高原资本董事总经理姚亚平。\",\"province\":\"\"}";
        Map<String, InvestInstitution> investInstitutionMap = Maps.newConcurrentMap();
        investInstitutionMap.put("188", JSONUtil.json2object(investInstitutionJson, InvestInstitution.class));

        CrawlResult.INVESTINSTITUTION.putAll(investInstitutionMap);

        investInstitutionSyncService.doSync();

        investInstitutionSyncService.doSync();


    }
}
