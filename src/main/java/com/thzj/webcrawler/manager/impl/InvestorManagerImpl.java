package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.dao.RbUserMapper;
import com.thzj.webcrawler.dao.TInvestorMapper;
import com.thzj.webcrawler.entity.InvestorFormEnum;
import com.thzj.webcrawler.entity.TInvestor;
import com.thzj.webcrawler.manager.InvestorManager;
import com.thzj.webcrawler.manager.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Slf4j
@Service
public class InvestorManagerImpl implements InvestorManager {
    @Resource
    private TInvestorMapper tInvestorMapper;
    @Resource
    private UserManager userManager;

    @Override
    public void updateByCrawlInstitution(int investorId, InvestInstitution investInstitution, String orgLogoPath) {
        TInvestor tInvestor = tInvestorMapper.selectByPrimaryKey(investorId);
        tInvestor.setOrgLogoImg(orgLogoPath);
        setCrawInstitutionProperty(investInstitution, tInvestor);
        tInvestorMapper.updateByPrimaryKey(tInvestor);
    }

    @Override
    public void updateByCrawlInvestor(int investorId, Investor investor, String logoPath) {
        TInvestor tInvestor = tInvestorMapper.selectByPrimaryKey(investorId);
        tInvestor.setVisitImg(logoPath);
        setCrawInvestorProperty(investor, tInvestor);
        tInvestorMapper.updateByPrimaryKey(tInvestor);
    }

    @Override
    public int saveByCrawlInstitution(InvestInstitution investInstitution, String orgLogoPath) {
        TInvestor tInvestor = new TInvestor();

        // 默认属性
        tInvestor.setInvestorForm(InvestorFormEnum.INVEST_INSTITUTION.getCode());
        tInvestor.setAuditor("超级管理员");
        tInvestor.setAuditorState("2");
        tInvestor.setAuditorTime(new Date());

        setCrawInstitutionProperty(investInstitution, tInvestor);
        return tInvestorMapper.insertSelective(tInvestor);
    }

    @Override
    public int saveByCrawlInvestor(Investor investor, String logoPath) {
        TInvestor tInvestor = new TInvestor();

        // 同步增加人员记录
        userManager.createByInvestorName(investor.getName());

        // 默认属性
        tInvestor.setInvestorForm(InvestorFormEnum.INVESTOR.getCode());
        tInvestor.setAuditor("超级管理员");
        tInvestor.setAuditorState("2");
        tInvestor.setAuditorTime(new Date());


        setCrawInvestorProperty(investor, tInvestor);
        return tInvestorMapper.insertSelective(tInvestor);
    }

    private void setCrawInstitutionProperty(InvestInstitution institution, TInvestor tInvestor) {
        tInvestor.setOrgName(institution.getName());
        tInvestor.setOrgWebsite(institution.getHomePage());
        tInvestor.setPhone(institution.getPhone());
        tInvestor.setMailBox(institution.getEmail());
        tInvestor.setProvince(institution.getProvince());
        tInvestor.setCity(institution.getCity());
        tInvestor.setOrgIntroduce(institution.getProfile());
    }

    private void setCrawInvestorProperty(Investor investor, TInvestor tInvestor) {
        tInvestor.setRealName(investor.getName());
        tInvestor.setInvestorCompany(investor.getCompany());
        tInvestor.setInvestorPosition(investor.getPosition());
        tInvestor.setProvince(investor.getProvince());
        tInvestor.setCity(investor.getCity());
        tInvestor.setInvestorsProfile(investor.getProfile());
    }
}
