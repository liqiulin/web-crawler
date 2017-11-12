package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 投资人
 */
@Data
public class Investor implements Serializable {
    private static final long serialVersionUID = 2404483051525208389L;
    private String id;
    private String name;                                               //姓名
    private String avatarUrl;                                          //头像
    private String company;                                            //所属机构
    private String position;                                           //职位
    private String province;                                           //地区

    private String detailUrl;                                          //详情URL
    private String profile;                                            //投资人介绍
    private List<String> investIndustries;                             //投资行业
    private List<String> investRounds;                                 //投资阶段
    private String investPlan;                                         //投资计划
    private String perRoundMoney;                                      //单笔可投
    private List<InvestCase> investCase;                               //投资案例
    private List<WorkExperience> workExperiences;                      //工作经历
    private List<EducationExperience> educationExperiences;            //教育经历

}
