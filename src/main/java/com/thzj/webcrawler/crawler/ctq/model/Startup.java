package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 项目
 */
@Data
public class Startup implements Serializable {
    private static final long serialVersionUID = -4842478848780733552L;
    private String id;
    private String detailUrl;
    private String avatarUrl;                                          //项目logo
    private String name;                                               //项目名称
    private String industry;                                           //行业类型
    private String summary;                                             //项目摘要
    private String province;                                           //所在地址：省
    private String city;                                               //所在地址：市
    //private String area;                                             //所在地址：区
    private String companyName;                                        //公司名称
    private Date establishTime;                                      //成立时间
    private String profile;                                            //基本介绍
    private List<FinancingHistory> financingHistories;                 //融资历史
    private List<StartupMember> members;                               // 团队成员
    private String productImgUrl;                                      //产品图片
    private String productHomePage;                                    //产品网站
    private List<DevelopmentHistory> history;                          //发展历程




}
