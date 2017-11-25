package com.thzj.webcrawler.entity;

public enum CrawlHisSrcTypeEnum {
    VC(1, "创投圈");

    CrawlHisSrcTypeEnum(int code, String desc) {
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
