package com.thzj.webcrawler.crawler.ctq.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 工作经历
 */
@Data
public class WorkExperience implements Serializable{
    private static final long serialVersionUID = 2025596005957180518L;
    private String time;
    private String company;
    private String position;
}
