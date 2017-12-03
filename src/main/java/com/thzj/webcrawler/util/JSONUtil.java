package com.thzj.webcrawler.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.crawler.ctq.model.Startup;

import java.util.Map;

public class JSONUtil {

    public static String object2json(Object object) {
        if (null == object) {
            return null;
        }
        return JSON.toJSONString(object);
    }

    public static <T> T json2object(String json, Class<T> clazz) {
        if (null == json || "".equals(json) || null == clazz) {
            return null;
        }
        return JSON.parseObject(json, clazz);
    }

    public static <T> T json2objectByType(String json, TypeReference<T> type) {
        if (null == json || "".equals(json) || null == type) {
            return null;
        }
        return JSON.parseObject(json, type);
    }

    public static void main(String[] args) {
        String investorCrawlResult = "{\"avatarUrl\":\"https://assets0.vc.cn/assets.vc.cn/system/startup/avatars/80373/thumb/d6cb96794a9232cb476a885c8ba325d4.jpg?1510728891\",\"city\":\"海淀区\",\"companyName\":\"北京摩拜科技有限公司\",\"detailUrl\":\"https://www.vc.cn/startups/80373?show_investment=true\",\"establishTime\":1422288000000,\"financingHistories\":[{\"financingAmount\":\"未透露\",\"investInstitutionIds\":[\"999\"],\"round\":\"战略投资\",\"startupId\":\"80373\",\"time\":1510675200000},{\"financingAmount\":\"6亿美元\",\"investInstitutionIds\":[\"155\",\"752\",\"996\",\"982\",\"171\",\"734\"],\"round\":\"E轮\",\"startupId\":\"80373\",\"time\":1497542400000},{\"financingAmount\":\"亿元及以上美元\",\"investInstitutionIds\":[\"855\"],\"round\":\"E轮\",\"startupId\":\"80373\",\"time\":1487520000000}],\"history\":[],\"id\":\"80373\",\"industry\":\"汽车交通\",\"members\":[],\"name\":\"摩拜单车\",\"productHomePage\":\"http://www.mobike.com\",\"productImgUrl\":\"https://assets2.vc.cn/assets.vc.cn/system/photos/avatars/000/082/430/original/4.png?1510728892\",\"profile\":\"摩拜单车是一家互联网短途出行解决方案，是无桩借还车模式的智能硬件，旨在让用户无需办卡,只需下载摩拜单车App完成注册,扫码解锁,支付的全过程。还车时只需在路边白线内, 手动关锁,无固定车桩。\",\"province\":\"北京\",\"summary\":\"一家互联网短途出行解决方案\"}{\"avatarUrl\":\"https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/124403/thumb/96b9ca05b271de606ec907b62d114cb8.jpg?1510305042\",\"city\":\"广州\",\"companyName\":\"广州市创鸿信息技术有限公司\",\"detailUrl\":\"https://www.vc.cn/startups/124403?show_investment=true\",\"establishTime\":1414771200000,\"financingHistories\":[{\"financingAmount\":\"数千万人民币\",\"investInstitutionIds\":[\"004\",\"959\"],\"round\":\"A轮\",\"startupId\":\"124403\",\"time\":1510243200000}],\"history\":[],\"id\":\"124403\",\"industry\":\"企业服务\",\"members\":[],\"name\":\"上海劳勤COHO\",\"productHomePage\":\"\",\"productImgUrl\":\"https://assets0.vc.cn/assets.vc.cn/system/photos/avatars/000/132/911/original/5bdcaa36002418a87a7aec101626138b.jpg?1510305042\",\"profile\":\"COHO是一个劳动力与考勤管理套件，专注于劳动力管理软件领域的研发和服务，隶属于上海劳勤信息技术有限公司。\",\"province\":\"广东\",\"summary\":\"劳动力与考勤管理套件\"}{\"avatarUrl\":\"https://assets1.vc.cn/assets.vc.cn/system/startup/avatars/124086/thumb/04dcf09be32eeec3fbaad36fd3bf1d8d.png?1509523049\",\"city\":\"成都\",\"companyName\":\"\",\"detailUrl\":\"https://www.vc.cn/startups/124086?show_investment=true\",\"establishTime\":1483200000000,\"financingHistories\":[{\"financingAmount\":\"450万人民币\",\"investInstitutionIds\":[],\"round\":\"种子轮\",\"startupId\":\"124086\",\"time\":1509465600000}],\"history\":[],\"id\":\"124086\",\"industry\":\"消费\",\"members\":[],\"name\":\"果以优\",\"productHomePage\":\"\",\"productImgUrl\":\"https://assets3.vc.cn/assets.vc.cn/system/photos/avatars/000/132/231/original/7b237777050eac30fa05cdc47f875d13.png?1509523049\",\"profile\":\"果以优是一个水果新零售品牌，产品包括整果、果切以及果汁；通过办公室无人零售冷柜和线下体验店，向中高端客户提供全球优选水果。\",\"province\":\"四川\",\"summary\":\"水果新零售品牌\"}";

        json2objectByType(investorCrawlResult, new TypeReference<Startup>(){});
    }
}
