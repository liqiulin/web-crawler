package com.thzj.webcrawler.service;

import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GrabInvestorServiceTest {
    private GrabInvestorService grabInvestorService;

    @Test
    public void grabInvestorInfo() {
        List<String> userIdList = new ArrayList<>();
        userIdList.add("109485");

        List<Investor> result = new ArrayList<>();
        //result = grabInvestorService.grabInvestorInfo(userIdList);

        System.out.println(result);

    }

}
