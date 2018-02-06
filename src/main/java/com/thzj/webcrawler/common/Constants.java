package com.thzj.webcrawler.common;

public class Constants {
    public static final String DEFAULT_LOGO = "/files/default/default.png";
    /**
     * 抓取项目标识
     */
    public static final String PROJECT_IS_GRAB_TRUE = "1";

    /**
     * 主站
     */
    final static String HOME_PAGE_URL = "https://www.vc.cn";

    /**
     * 投资人详情URL前缀
     */
    public static final String USER_DETAIL_URL = "https://www.vc.cn/users/";

    /**
     * 投资机构详情URL前缀
     */
    public static final String INSTITUTION_DETAIL_URL = "https://www.vc.cn/institutions/";

    /**
     * 投融项目详情URL前缀
     */
    public static final String STARTUP_DETAIL_URL = "https://www.vc.cn/startups/";


    /**
     * 抓取投资人ID的URL
     */
    public static final String INVERTOR_ID_URL = "https://www.vc.cn/investors?action=index&controller=investors&page=";

    /**
     * 抓取投资机构ID的URL
     */
    public static final String INSTITUTION_ID_URL = "https://www.vc.cn/institutions?action=index&controller=institutions&page=";


    /**
     * 抓取投融项目ID的URL
     */
    public static final String STARTUP_ID_URL = "https://www.vc.cn/startups?action=index&controller=startups&page=";






    /**
     * http 请求头userAgent
     */
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.64 Safari/537.31";
}
