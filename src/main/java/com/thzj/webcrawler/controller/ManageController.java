package com.thzj.webcrawler.controller;

import com.thzj.webcrawler.service.ImgSyncService;
import com.thzj.webcrawler.service.SyncService;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/manage")
public class ManageController {

    @Resource
    private SyncService syncService;

    @Resource
    private ImgSyncService imgSyncService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/doSync")
    @ResponseBody
    public void doSync() {
        syncService.doSync();
    }

    @RequestMapping("/doSyncImg")
    @ResponseBody
    public String doSyncImg() {
        imgSyncService.doSyncImgConcurrent();
        return "doSyncImgConcurrent start success";
    }

}