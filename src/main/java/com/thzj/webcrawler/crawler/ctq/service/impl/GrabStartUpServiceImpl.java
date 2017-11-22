package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.google.common.collect.Maps;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class GrabStartUpServiceImpl implements GrabStartUpService {

    @Override
    public Map<String, Startup> grabStartUpInfo() {

        return Maps.newConcurrentMap();
    }

    public List<String> getStartUpIds() {
        // Todo 写在ConfigCenter里面
        final String startUpUrl = "https://www.vc.cn/investments?action=index&controller=investments&page=";
        List<String> startUpIds = new ArrayList<>();
        String url;

        try {
            for (Integer i = 1; ; i++) {
                url =  startUpUrl + i.toString() + "&tab=t24&type=investment";
                org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
                Elements tableList = doc.getElementById("investment-list").select("tbody");
                Elements startUpInfo = tableList.select("tr");
                if (null == startUpInfo || startUpInfo.isEmpty()) {
                    break;
                }

                for (Element element : startUpInfo) {
                    Elements elements = element.getElementsByClass("avatar square").select("a");
                    String infoDetailsUrl = elements.get(1).attr("href");
                    String userId = infoDetailsUrl.substring(10);
                    startUpIds.add(userId);
                }
            }
            return startUpIds;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return startUpIds;
    }

    private Startup getStartUpFromHtml(Document doc, String startUpId, String url) {

        return new Startup();
    }
}
