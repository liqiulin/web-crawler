package com.thzj.webcrawler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.thzj.webcrawler.dao")
public class AppTests {


    @Autowired
    private TInvestorRoundMapper investorRoundMapper;

    @Test
    public void testInvestorRound() {
        TInvestorRound investorRound = new TInvestorRound();
        investorRound.setRound("A");
        investorRoundMapper.insert(investorRound);
    }

}
