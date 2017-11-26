package com.thzj.webcrawler.util;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class DateUtil {

    public static Date stringToDate(String s) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
            return sdf.parse(s);
        } catch(Exception e) {
            e.printStackTrace();
            log.warn("日期转换失败. String[{}]", s, e);
        }
        return new Date(); //TODO 不应该返回new吧？
    }
}
