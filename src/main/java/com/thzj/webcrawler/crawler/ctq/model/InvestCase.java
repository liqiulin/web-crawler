package com.thzj.webcrawler.crawler.ctq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 投资案例
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvestCase implements Serializable {
    private static final long serialVersionUID = 8245661419067598218L;

    private String time;                        //投资时间
    private String avatarUrl;                   //投资项目logo
    private String name;                        //案例名称
    private String profile;                     //简介
    private String investorRound;               //投资阶段
    private String investorMoney;               //投资金额
}
