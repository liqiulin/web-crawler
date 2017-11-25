package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.io.Serializable;


/**
 * 投融项目的发展历史
 *
 * @author Matthew
 */
@Data
public class DevelopmentHistory implements Serializable {
    private static final long serialVersionUID = 4219818208958449420L;

    private String StartupId;               //项目ID
    private String historyTime;             //事件时间
    private String profile;                 //简介
    private String investRound;             //投资阶段
}
