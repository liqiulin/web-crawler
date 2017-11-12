package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 融资历史
 */
@Data
public class FinancingHistory implements Serializable{
    private static final long serialVersionUID = 9193399368288964105L;

    private String time;                        //融资时间
    private String sum;                         //融资金额
    private String round;                       //轮次
    private String startupId;                   //项目ID

    private List<String> investInstitutionIds;  //投资机构
}
