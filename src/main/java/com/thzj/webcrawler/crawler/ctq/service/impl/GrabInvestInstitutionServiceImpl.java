package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.thzj.webcrawler.crawler.ctq.service.GrabInvestInstitutionService;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class GrabInvestInstitutionServiceImpl implements GrabInvestInstitutionService{

    @Override
    public void grabInvestInstitutionInfo() {

    }


    /**
     * 获取所有投资机构的ID
     */
    private List<String> getInstitutionIds() {
        // Todo 写在ConfigCenter里面
        final String institutionUrl = "https://www.vc.cn/institutions?action=index&controller=institutions&page=";
        List<String> institutionIds = new ArrayList<>();
        String url;

        try {
            for (Integer i = 1; ; i++) {
                url =  institutionUrl + i.toString();
                Document doc = Jsoup.connect(url).get();
                Element tableList = doc.getElementById("institutions-list");
                Elements personalInfo = tableList.getElementsByTag("tr");
                if (null == personalInfo || personalInfo.isEmpty()) {
                    break;
                }

                for (Element pInfo : personalInfo) {
                    String infoDetailsUrl = pInfo.getElementsByClass("avatar square").select("a").get(1).attr("href");
                    String userId = infoDetailsUrl.substring(14);
                    institutionIds.add(userId);
                }
            }
            return institutionIds;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return new ArrayList<>();
    }
}
