package com.thzj.webcrawler.controller;

import com.thzj.webcrawler.dao.InvestorRoundMapper;
import com.thzj.webcrawler.entity.InvestorRound;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @Autowired
    private InvestorRoundMapper investorRoundMapper;

    @RequestMapping("/insertRound")
    @ResponseBody
    public void insertRound() {
        InvestorRound investorRound = new InvestorRound();
        investorRound.setRound("A");
        investorRoundMapper.insert(investorRound);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TestController.class, args);
    }
}