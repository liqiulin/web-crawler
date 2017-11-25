package com.thzj.webcrawler.entity;

public enum CrawlTypeEnum {
    INVEST_INSTITUTION(1, "投资机构"),
    INVESTOR(2, "投资人"),
    PROJECT(3, "项目"),

    ;

    CrawlTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private int code;
    private String desc;


}
