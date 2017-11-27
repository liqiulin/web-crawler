package com.thzj.webcrawler.util;

import com.alibaba.fastjson.JSON;

public class JSONUtil {

    public static final String object2json(Object object) {
        if (null == object) {
            return null;
        }
        return JSON.toJSONString(object);
    }

    public static final <T> T json2object(String json, Class<T> clazz) {
        if (null == json || "".equals(json) || null == clazz) {
            return null;
        }
        return JSON.parseObject(json, clazz);
    }
}
