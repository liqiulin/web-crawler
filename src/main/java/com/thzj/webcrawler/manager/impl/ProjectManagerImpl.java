package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.dao.TProjectMapper;
import com.thzj.webcrawler.entity.TProject;
import com.thzj.webcrawler.manager.ProjectManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class ProjectManagerImpl implements ProjectManager {
    @Resource
    private TProjectMapper projectMapper;


    @Override
    public void updateByCrawlStartup(int entityId, Startup startup, String logoPath, String productImgPath) {
        TProject entity = projectMapper.selectByPrimaryKey(entityId);
        entity.setLogoUrl(logoPath);
        entity.setProjectName(startup.getName());
        entity.setIndustry(startup.getIndustry());
        entity.setLabelling(startup.getSummary());
        entity.setProvince(startup.getProvince());
        entity.setCity(startup.getCity());
        entity.setCompanyName(startup.getCompanyName());
        entity.setCompanySetUpTime(startup.getEstablishTime());
//        entity.setIn
        entity.setProductsUrl(productImgPath);
        entity.setWebsite(startup.getProductHomePage());
        projectMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int saveByCrawlStartup(Startup startup, String logoPath, String productImgPath) {
        return 0;
    }
}
