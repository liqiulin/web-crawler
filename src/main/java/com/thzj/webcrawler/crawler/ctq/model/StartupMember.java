package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.io.Serializable;


/**
 * 投融项目成员
 */
@Data
public class StartupMember implements Serializable {
    private static final long serialVersionUID = -5307023284627589161L;

    private String startUpId;                   //投融项目ID
    private String memberName;                  //姓名
    private String profile;                     //简介
    private String avatarUrl;               //头像
    private String identity;                    //身份
}