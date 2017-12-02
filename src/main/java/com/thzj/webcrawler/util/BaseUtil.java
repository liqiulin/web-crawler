package com.thzj.webcrawler.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.thzj.webcrawler.common.Constants.USER_AGENT;

/**
 * @author Matthew
 */
@Slf4j
public class BaseUtil {

    /**
     * connect
     */
    public static Document connect(String url) {
        try {
            Connection con = Jsoup.connect(url);
            con.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            con.header("Accept-Encoding", "gzip, deflate");
            con.header("Accept-Language", "zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3");
            con.header("Connection", "keep-alive");
            con.header("Host", url);
            con.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:26.0) Gecko/20100101 Firefox/26.0");
            Document doc = con.get();
            return doc;
        } catch (IOException ie) {
            ie.printStackTrace();
            log.warn("grabInvestorInfo failed!", ie);
            throw new RuntimeException("IOException IO异常");
        }
    }

    /**
     * 从Url中提取数值类型ID
     *
     * @return
     */
    public static String getIdfromUrl(String pattern, String url) {
        int patternLocation = url.lastIndexOf(pattern);
        if (patternLocation < 0) {
            log.warn("url中没有匹配的字符串，Pattern[{}], url[{}], patterLocation[{}]",
                    pattern, url, patternLocation);
            return "";
        }

        int length = pattern.length();
        return url.substring(patternLocation + length + 1);
    }

    /**
     * 匹配是否为邮箱
     *
     * @param s
     * @return
     */
    public static boolean emailPattern(String s) {
        //电子邮件
        String check = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(s);
        return matcher.matches();
    }

    /**
     * 从类似"北京 · 朝阳区"抽取出省市
     */
    public static Object getLocation(String location) {
        location = org.apache.commons.lang.StringUtils.deleteWhitespace(location);
        if (location.contains("·")) {
            String[] string = location.split("·");
            return string;
        } else {
            return location;
        }
    }

/*    public static void main (String[] args) {
        String url = "/startups/87176";
        String emailPattern = "startups";

        System.out.println(getIdfromUrl(emailPattern, url));
    }*/

    public static void main(String[] args) {
        String location = "上海 · 徐汇区";
        String province = "";
        String city = "";

        //getLocation(location, province, city);
    }
}
