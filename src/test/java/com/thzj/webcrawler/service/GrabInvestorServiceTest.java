package com.thzj.webcrawler.service;

import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GrabInvestorServiceTest {

    @Resource
    private GrabInvestorService grabInvestorService;

    @Test
    public void grabInvestorInfo() {
        List<String> userIdList = new ArrayList<>();

        Map<String, Investor> result = Maps.newConcurrentMap();

        result = grabInvestorService.grabInvestorInfo(userIdList);

        System.out.println(result);

    }

    @Test
    public void getInvestorIds() {
        List<String> userIdList = grabInvestorService.getUserIds();

        System.out.println(userIdList);
    }

}
