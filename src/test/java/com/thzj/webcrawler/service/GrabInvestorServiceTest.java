package com.thzj.webcrawler.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestorService;
import com.thzj.webcrawler.crawler.ctq.service.impl.GrabInvestorServiceImpl;
import com.thzj.webcrawler.util.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class GrabInvestorServiceTest {

    GrabInvestorService grabInvestorService = new GrabInvestorServiceImpl();

    @Test
    public void grabInvestorInfo() {
        //List<String> userIdList = grabInvestorService.getUserIds();
        Map<String, Investor> result;
        List<String> userIds = Arrays.stream(ints).map(integer -> integer.toString()).collect(Collectors.toList());
        result = grabInvestorService.grabInvestorInfo(userIds);
        System.out.println(result);
        log.info("{}", JSONUtil.object2json(result));
    }

    @Test
    public void getInvestorIds() {
        List<String> userIdList = Lists.newArrayList();
        userIdList = grabInvestorService.getUserIds();

        System.out.println(userIdList);
    }


    private final static Integer[] ints = {117108, 72314, 175020, 56053, 23046, 47350, 110546, 31941, 23433, 23075, 34499, 46145, 30421, 25616, 51611, 31631, 77671, 98458, 25847, 187146, 192519, 182411, 121951, 133895};
}
