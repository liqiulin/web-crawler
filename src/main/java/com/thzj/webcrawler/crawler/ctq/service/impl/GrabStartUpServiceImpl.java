package com.thzj.webcrawler.crawler.ctq.service.impl;

import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.crawler.ctq.service.GrabStartUpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class GrabStartUpServiceImpl implements GrabStartUpService {

    @Override
    public List<Startup> grabStartUpInfo() {

        return new ArrayList<>();
    }

    public List<String> getStartUpId() {

        return new ArrayList<>();
    }

    private Startup getStartUpFromHtml(Document doc, String startUpId, String url) {

        return new Startup();
    }
}
