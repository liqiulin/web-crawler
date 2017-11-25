package com.thzj.webcrawler.util;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class BaseUtil {

    /**
     * 从Url中提取数值类型ID
     * @return
     */
    public static String getIdfromUrl(String pattern, String url) {
        int patternLocation = url.lastIndexOf(pattern);
        if (patternLocation < 0) {
            log.warn("url中没有匹配的字符串，emailPattern[{}], url[{}], patterLocation[{}]",
                    pattern, url, patternLocation);
            return "";
        }

        int length = pattern.length();
        return url.substring(patternLocation + length + 1);
    }

    /**
     * 匹配是否为邮箱
     * @param s
     * @return
     */
    public static boolean emailPattern(String s){
        //电子邮件
        String check = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(s);
        return matcher.matches();
    }

/*    public static void main (String[] args) {
        String url = "/startups/87176";
        String emailPattern = "startups";

        System.out.println(getIdfromUrl(emailPattern, url));
    }*/
}
