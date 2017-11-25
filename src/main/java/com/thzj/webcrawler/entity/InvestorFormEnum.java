package com.thzj.webcrawler.entity;

public enum InvestorFormEnum {
    INVEST_INSTITUTION("2", "投资机构"),
    INVESTOR("1", "投资人"),
    ;

    private String code;
    private String desc;

    InvestorFormEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
