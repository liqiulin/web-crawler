package com.thzj.webcrawler.dao;

import com.thzj.webcrawler.entity.TInvestor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class TInvestorMapperTest {

    @Resource
    private TInvestorMapper tInvestorMapper;

    @Test
    public void insertSelective_Success() {
        TInvestor t = new TInvestor();
        t.setOrgName("haha");

        tInvestorMapper.insertSelective(t);

        System.out.println(t);
    }

}
