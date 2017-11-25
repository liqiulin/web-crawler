package com.thzj.webcrawler.crawler.ctq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 工作经历
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience implements Serializable{
    private static final long serialVersionUID = 2025596005957180518L;
    private Date timeFrom;
    private Date timeTo;
    private String company;
    private String position;
}
