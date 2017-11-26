package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.crawler.ctq.model.Startup;

public interface ProjectManager {
    void updateByCrawlStartup(int entityId, Startup startup, String logoPath, String productImgPath);

    int saveByCrawlStartup(Startup startup, String logoPath, String productImgPath);
}
