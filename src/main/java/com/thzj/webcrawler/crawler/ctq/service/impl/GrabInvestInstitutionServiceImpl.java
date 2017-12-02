package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.service.GrabInvestInstitutionService;
import com.thzj.webcrawler.util.BaseUtil;
import com.thzj.webcrawler.common.Constants;
import com.thzj.webcrawler.util.DateUtil;
import com.thzj.webcrawler.util.JSONUtil;
import lombok.extern.slf4j.Slf4j;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;


import java.util.*;
import java.util.stream.Collectors;

import static com.thzj.webcrawler.common.Constants.INSTITUTION_DETAIL_URL;


/**
 * @author Matthew
 */
@Slf4j
@Service
public class GrabInvestInstitutionServiceImpl implements GrabInvestInstitutionService{

    @Override
    public Map<String, InvestInstitution> grabInvestInstitutionInfo(List<String> instituteIdList) {
        String url = "";
        Map<String, InvestInstitution> investInstitutions = Maps.newConcurrentMap();
        InvestInstitution investInstitution;
        try {
            for (String institutionId : instituteIdList) {
                url = INSTITUTION_DETAIL_URL + institutionId;
                Document doc = BaseUtil.connect(url);
                investInstitution = getInvestInstitution(doc, institutionId, url);
                investInstitutions.put(institutionId, investInstitution);
            }
            return investInstitutions;
        } catch (Exception e) {
            e.printStackTrace();
            log.warn("grabInvestInstitutionInfo failed! url[{}]", url, e);
        }
        return investInstitutions;
    }


    /**
     * 获取所有投资机构的ID
     */
    @Override
    public List<String> getInstitutionIds() {
        // Todo 写在ConfigCenter里面
        final String institutionUrl = "https://www.vc.cn/institutions?action=index&controller=institutions&page=";
        List<String> institutionIds = new ArrayList<>();
        String url = "";

        try {
            for (Integer i = 1; ; i++) {
                url =  institutionUrl + i.toString() + "&type=active";
                Document doc = BaseUtil.connect(url);
                Elements tableList = doc.getElementById("institutions-list").select("tbody.table-list");
                Elements institutionInfo = tableList.select("tr");
                if (null == institutionInfo || institutionInfo.isEmpty()) {
                    break;
                }

                for (Element element : institutionInfo) {
                    Elements elements = element.getElementsByClass("avatar square").select("a");
                    String infoDetailsUrl = elements.get(1).attr("href");
                    String userId = infoDetailsUrl.substring(14);
                    institutionIds.add(userId);
                }
            }
            return institutionIds;
        } catch (Exception e) {
            e.printStackTrace();
            log.warn("getUserIds failed! url[{}]", url, e);
        }
        return institutionIds;
    }

    private InvestInstitution getInvestInstitution(Document doc, String instituteId, String url) {
        InvestInstitution investInstitution = new InvestInstitution();

        //投资机构基本信息
        Elements institutionInfo = doc.getElementsByClass("institutions_info");

        //机构logo
        String avatarUrl = institutionInfo.select("img").attr("src");

        //机构名称
        String name = institutionInfo.select("div.name").text();

        //网址
        String homePage = institutionInfo.select("div.url").select("a").attr("href");

        //投资机构简介
        Element profileElement = doc.getElementById("user_intro");
        String profile = String.join("",profileElement.getElementsByTag("p").eachText());

        //投资风格：关注行业&投资轮次
        Elements investStyle = doc.getElementById("module_style").getElementsByClass("tag-list row");
        String tag;
        List<String> investIndustries = new ArrayList<>();
        List<String> investRounds = new ArrayList<>();
        for (Element element : investStyle) {
            tag = element.getElementsByClass("cell label-name").text();
            if ("投资行业：".equals(tag)) {
                investIndustries = element.getElementsByClass("cell label-item").select("a").eachText();
            } else {
                investRounds = element.getElementsByClass("cell label-item").select("a").eachText();
            }
        }

        //投资案例:抓取全部信息 TODO 可能需要分页处理
        List<InvestCase> investCases = Lists.newArrayList();
        investCases = buildInvestCaseList(doc);

        //投资机构基本信息：电话、邮箱、地址 Todo 处理边界条件
        String email = "";
        String phone = "";
        String province = "";
        String city = "";
        Elements contactUsElements = doc.getElementsByClass("details_institutions_sidebar").select("div.contact-us-item");
        List<String> baseInfoList = Lists.newArrayList();
        if (Objects.nonNull(contactUsElements) && contactUsElements.size() > 0) {
            if (null != contactUsElements.select("div.text")) {
                baseInfoList = contactUsElements.select("div.text").eachText();
                //模式匹配
                for (String baseInfo : baseInfoList){
                    if (BaseUtil.emailPattern(baseInfo)) {
                        email = baseInfo;
                    } else if (baseInfo.contains("-")) {
                        phone = baseInfo;
                    }
                }
            }

            if (null != contactUsElements.select("div.city")) {
                String location = contactUsElements.select("div.city").text();
                String[] locations = location.split(" · ");
                province = locations[0];
                city = locations[1];
            }
        }

        //机构成员:这里只保存成员ID
        List<String> members = doc.getElementById("working-member-list").select("a").stream().map(
                (e) -> e.attr("href").substring(7)).collect(Collectors.toList());

        investInstitution.setName(name);
        investInstitution.setId(instituteId);
        investInstitution.setProfile(profile);
        investInstitution.setEmail(email);
        investInstitution.setPhone(phone);
        investInstitution.setMembers(members);
        investInstitution.setProvince(province);
        investInstitution.setCity(city);
        investInstitution.setDetailUrl(url);
        investInstitution.setAvatarUrl(avatarUrl);
        investInstitution.setHomePage(homePage);
        investInstitution.setInvestCases(investCases);
        investInstitution.setInvestRounds(investRounds);
        investInstitution.setInvestIndustries(investIndustries);

        return investInstitution;
    }

    //TODO 1）InvestCase里是否需要保存投资机构的ID 2）是否翻页处理
    private List<InvestCase> buildInvestCaseList(Document doc) {
        Elements investCaseElements = doc.getElementById("module_invest_case").
                select("div#invest_cases").select("div.case_card");
        List<InvestCase> investCaseList = Lists.newArrayList();
        for (Element element : investCaseElements) {
            InvestCase investCase = new InvestCase();
            Date invsetTime = DateUtil.stringToDate(element.getElementsByClass("cell date").text());
            investCase.setTime(invsetTime);
            String name = element.select("div.name").select("a").text();
            String industry = element.select("div.name").select("span").text();
            String startupIdString = element.select("div.name").select("a").attr("href");
            List<String> investInstitutions = element.select("div.cell.keywords").select("a").eachText();
            String investInstitution = Joiner.on(",").skipNulls().join(investInstitutions);
            investCase.setName(name);
            investCase.setStartupIndustry(industry);
            investCase.setInvestInstitutions(investInstitution);
            investCase.setStartupId(BaseUtil.getIdfromUrl("startups", startupIdString));
            investCase.setProfile(element.select("div.pitch").text());
            investCase.setAvatarUrl(element.select("cell avatar").select("img").attr("src"));
            investCase.setInvestorRound(element.select("div.round").text());
            investCase.setInvestorMoney(element.select("div.money").text());

            investCaseList.add(investCase);

        }
        return investCaseList;
    }




    public static void main (String[] args) {
        GrabInvestInstitutionService grabInvestInstitutionService = new GrabInvestInstitutionServiceImpl();

        String grabId = "188";
        Map<String, InvestInstitution> grabResult = grabInvestInstitutionService.grabInvestInstitutionInfo(Lists.newArrayList(grabId));
        System.out.println(JSONUtil.object2json(grabResult));
        System.out.println(JSONUtil.object2json(grabResult.get(grabId)));

    }

}
