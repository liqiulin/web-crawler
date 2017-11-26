package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.crawler.ctq.model.WorkExperience;
import com.thzj.webcrawler.dao.RbUnitMessageMapper;
import com.thzj.webcrawler.entity.RbUnitMessage;
import com.thzj.webcrawler.entity.RbUnitMessageExample;
import com.thzj.webcrawler.manager.UnitMessageManager;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UnitMessageManagerImpl implements UnitMessageManager {
    @Resource
    private RbUnitMessageMapper rbUnitMessageMapper;

    @Override
    public void update(int userId, List<WorkExperience> workExperiences) {
        RbUnitMessageExample deleteExample = new RbUnitMessageExample();
        deleteExample.createCriteria().andUserIdEqualTo(userId);
        rbUnitMessageMapper.deleteByExample(deleteExample);

        if (CollectionUtils.isEmpty(workExperiences)) {
            return;
        }

        workExperiences.forEach(workExperience -> {
            RbUnitMessage rbUnitMessage = new RbUnitMessage();
            rbUnitMessage.setUserId(userId);
            rbUnitMessage.setServeTime(workExperience.getTimeFrom());
            rbUnitMessage.setToServeTime(workExperience.getTimeTo());
            rbUnitMessage.setCompanyName(workExperience.getCompany());

//            rbUnitMessage.setZhiwei(workExperience.getPosition());   todo 现在职位是个int开，不能存抓取的职位

        });
    }
}
