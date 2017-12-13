package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.common.Constants;
import com.thzj.webcrawler.crawler.ctq.model.Startup;
import com.thzj.webcrawler.dao.TProjectMapper;
import com.thzj.webcrawler.entity.TProject;
import com.thzj.webcrawler.entity.TProjectWithBLOBs;
import com.thzj.webcrawler.manager.ProjectManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;

@Service
@Slf4j
public class ProjectManagerImpl implements ProjectManager {
    @Resource
    private TProjectMapper projectMapper;

    @Override
    public void updateByCrawlStartup(int entityId, Startup startup, String logoPath, String productImgPath) {
        TProjectWithBLOBs entity = projectMapper.selectByPrimaryKey(entityId);
        setCrawlStartupProperties(startup, logoPath, productImgPath, entity);
        projectMapper.updateByPrimaryKey(entity);
    }

    private void setCrawlStartupProperties(Startup startup, String logoPath, String productImgPath, TProjectWithBLOBs entity) {
        entity.setLogoUrl(logoPath);
        entity.setProjectName(startup.getName());
        entity.setIndustry(startup.getIndustry());
        entity.setLabelling(startup.getSummary());
        entity.setProvince(startup.getProvince());
        entity.setCity(startup.getCity());
        entity.setCompanyName(startup.getCompanyName());
        entity.setCompanySetUpTime(startup.getEstablishTime());
        entity.setInstruction(startup.getProfile());
        entity.setProductsUrl(productImgPath);
        entity.setWebsite(startup.getProductHomePage());
        if (CollectionUtils.isEmpty(startup.getFinancingHistories())) {
            entity.setFinancingRounds("A轮");  // 按用户要求，无融资历史时默认A轮
        } else {
            entity.setFinancingRounds(startup.getFinancingHistories().get(0).getRound());
        }
    }

    @Override
    public int saveByCrawlStartup(Startup startup, String logoPath, String productImgPath) {
        TProjectWithBLOBs entity = new TProjectWithBLOBs();
        // 默认字段
        entity.setAuditor("超级管理员");
        entity.setAuditState("1");
        entity.setAuditTime(new Date());
        entity.setIsGrab(Constants.PROJECT_IS_GRAB_TRUE);

        // 抓取字段
        setCrawlStartupProperties(startup, logoPath, productImgPath, entity);

        projectMapper.insertSelective(entity);
        return entity.getId();
    }

    @Override
    public TProject getById(int id) {
        return this.projectMapper.selectByPrimaryKey(id);
    }
}
