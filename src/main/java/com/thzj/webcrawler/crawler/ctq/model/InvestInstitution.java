package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 投资机构
 */
@Data
public class InvestInstitution implements Serializable {
    private static final long serialVersionUID = 463247472853089187L;
    private String id;
    private String detailUrl;
    private String name;                                               //姓名
    private String avatarUrl;                                          //头像
    private String homePage;                                           //网址
    private String phone;                                              //电话
    private String email;                                              //邮箱
    private String province;                                           //所在地址：省
    private String city;                                               //所在地址：市

    private String profile;                                            //介绍
    private List<String> investIndustries;                             //投资行业
    private List<String> investRounds;                                 //投资阶段
    private List<InvestCase> investCases;                              //投资案例
    private List<String> members;                                      //成员
}
