package com.thzj.webcrawler;

import com.thzj.webcrawler.dao.TInvestorRoundMapper;
import com.thzj.webcrawler.entity.TInvestorRound;
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
