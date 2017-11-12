package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.util.List;

/**
 * 创投圈投资人VO
 */
@Data
public class investorVO {
    private String name;                     //姓名
    private String avatarUrl;                //头像
    private String company;                  //所属机构
    private String position;                 //职位
    private String province;                 //地区

    private String detailContentUrl;         //详情URL
    private String personalProfile;          //投资人介绍
    private List<String> investIndustries;   //关注行业
    private List<String> investRounds;       //投资阶段
    private String investPlan;               //投资计划
    private String perRoundMoney;                 //单笔可投
    private List<InvestCase> investCase;               //投资案例
    private List<String> workExperiences;           //工作经历
    private List<String> educationExperiences;      //教育经历

    @Data
    public static class InvestCase {
        private String time;
    }

    @Data
    public static class WorkExperience {
        private String time;
        private String company;
        private String position;
    }

    @Data
    public static class EducationExperience {
        private String time;
    }


}
