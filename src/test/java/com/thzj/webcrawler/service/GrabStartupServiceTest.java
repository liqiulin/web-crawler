package com.thzj.webcrawler.service;

import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
import com.thzj.webcrawler.crawler.ctq.service.impl.GrabStartUpServiceImpl;
import com.thzj.webcrawler.util.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GrabStartupServiceTest {
    GrabStartUpService grabStartUpService = new GrabStartUpServiceImpl();

    @Test
    public void grabStartupInfoTest() {
        Map<String, Startup> result;
        List<String> userIds = Arrays.stream(ints).map(integer -> integer.toString()).collect(Collectors.toList());
        //List<String> userIds = Lists.newArrayList();
        //userIds.add("99927");
        result = grabStartUpService.grabStartUpInfo(userIds);
        System.out.println(result);
        System.out.println(result.size());
        System.out.println(userIds.size());
        log.info("{}", JSONUtil.object2json(result));

    }

    @Test
    public void getStartupIdsTest() {
        List<String> userIdList = Lists.newArrayList();
        userIdList = grabStartUpService.getStartUpIds();

        System.out.println(userIdList);
    }


    private final static Integer[] ints = {84317, 114534, 114647, 121935, 86180, 99927, 116727, 124782, 124781, 104387,
            122693, 122692, 93023, 122684, 122662, 122659, 122658, 119830, 122665, 122664, 122666, 122667};

}
