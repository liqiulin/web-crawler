package com.thzj.webcrawler.util;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thzj.webcrawler.exception.GrabResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
            con.header("Connection", "close");
            con.header("Host", url);
            con.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:26.0) Gecko/20100101 Firefox/26.0");
            Connection.Response response = con.execute();
            return response.parse();
        } catch (HttpStatusException e) {
            log.warn("HttpStatusException. statusCode[{}],  url[{}]", e.getStatusCode(), url);
            if (e.getStatusCode() == 404) {
                throw new GrabResourceNotFoundException("404 error. ", e);
            } else {
                int sleepTime = 10000;
                log.info("retry after[{}]ms", sleepTime);
                sleep(sleepTime);
                return connect(url);
            }
        } catch (IOException ie) {
            log.warn("connect with IOException. url[{}]", url, ie);
            int sleepTime = 10000;
            log.info("retry after[{}]ms", sleepTime);
            sleep(sleepTime);
            return connect(url);
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
        return url.substring(patternLocation + length);
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

    /**
     * 休眠时间
     * @param integer 休眠时间：小于零时休眠随机时间，大于零时休眠固定时间
     * @return void
     */
    public static void sleep(Integer integer) {
        try {
            if (integer < 0) {
                Thread.sleep((int)Math.random()*2000);
            }
            else {
                Thread.sleep(integer);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 拆分字符串为列表
     *
     * @param target 目标字符串
     * @param pattern 匹配模式
     * @return  List<String></>
     */
    public static List<String> splitter(String target, char pattern) {
        return Lists.newArrayList(Splitter.on(pattern).trimResults().omitEmptyStrings().split(target));
    }

    public static String joiner(List<String> stringList, String pattern) {
        return Joiner.on(pattern).skipNulls().join(stringList.toArray());
    }

    public static void main(String[] args) {
        String location = "上海 · 徐汇区";
        String province = "";
        String city = "";

        List<String> strings = Lists.newArrayList();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");

        System.out.println(joiner(strings, "、"));


        //getLocation(location, province, city);
    }
}
