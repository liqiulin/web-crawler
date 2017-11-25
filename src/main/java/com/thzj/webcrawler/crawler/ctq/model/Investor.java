package com.thzj.webcrawler.crawler.ctq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 投资人
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Investor implements Serializable {
    private static final long serialVersionUID = 2404483051525208389L;
    private String id;
    private String detailUrl;                                          //详情URL
    private String name;                                               //姓名
    private String avatarUrl;                                          //头像
    private String institutionId;                                     //所属机构ID
    private String company;                                            //所属机构名称
    private String position;                                           //职位
    private String province;                                           //所在地址：省
    private String city;                                               //所在地址：市

    private String profile;                                            //投资人介绍
    private List<String> investIndustries;                             //投资行业
    private List<String> investRounds;                                 //投资阶段
    private List<InvestCase> investCase;                               //投资案例
    private List<WorkExperience> workExperiences;                      //工作经历
}
