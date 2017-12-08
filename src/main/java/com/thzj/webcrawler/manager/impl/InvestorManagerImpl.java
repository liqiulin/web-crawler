package com.thzj.webcrawler.manager.impl;

import com.google.common.collect.Lists;
import com.thzj.webcrawler.crawler.ctq.model.InvestCase;
import com.thzj.webcrawler.crawler.ctq.model.InvestInstitution;
import com.thzj.webcrawler.crawler.ctq.model.Investor;
import com.thzj.webcrawler.dao.TInvestorMapper;
import com.thzj.webcrawler.entity.InvestorFormEnum;
import com.thzj.webcrawler.entity.TInvestor;
import com.thzj.webcrawler.manager.InvestorManager;
import com.thzj.webcrawler.manager.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;

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
        tInvestorMapper.insertSelective(tInvestor);
        return tInvestor.getId();
    }

    @Override
    public int saveByCrawlInvestor(Investor investor, String logoPath) {
        TInvestor tInvestor = new TInvestor();

        // 同步增加人员记录
        int userId = userManager.createByInvestorName(investor.getName());
        tInvestor.setUserId(userId);

        // 默认属性
        tInvestor.setInvestorForm(InvestorFormEnum.INVESTOR.getCode());
        tInvestor.setAuditor("超级管理员");
        tInvestor.setAuditorState("2");
        tInvestor.setAuditorTime(new Date());


        setCrawInvestorProperty(investor, tInvestor);
        tInvestorMapper.insertSelective(tInvestor);
        return tInvestor.getId();
    }

    @Override
    public TInvestor queryById(int id) {
        return tInvestorMapper.selectByPrimaryKey(id);
    }

    private void setCrawInstitutionProperty(InvestInstitution institution, TInvestor tInvestor) {
        tInvestor.setOrgName(institution.getName());
        tInvestor.setOrgWebsite(institution.getHomePage());
        tInvestor.setPhone(institution.getPhone());
        tInvestor.setMailBox(institution.getEmail());
        tInvestor.setProvince(institution.getProvince());
        tInvestor.setCity(institution.getCity());
        // 投资行业及投资轮次，抓取程会把抓取内容拼接好设置到List中，同步时只需取第一条元素就好了
        if (!CollectionUtils.isEmpty(institution.getInvestIndustries())) {
            tInvestor.setIndustry(institution.getInvestIndustries().get(0));
        }
        if (!CollectionUtils.isEmpty(institution.getInvestRounds())) {
            tInvestor.setRound(institution.getInvestRounds().get(0));
        }
        //最新投资时间
        tInvestor.setInvestmentTime(getLatestInvestTime(institution));
        tInvestor.setOrgIntroduce(institution.getProfile());
    }

    private Date getLatestInvestTime(InvestInstitution institution) {
        if (!CollectionUtils.isEmpty(institution.getInvestCases())) {
            Optional<InvestCase> lastInvestCaseOptional = institution.getInvestCases().stream()
                    .sorted(Comparator.comparing(InvestCase::getTime).reversed())
                    .findFirst();
            if (lastInvestCaseOptional.isPresent()) {
                return lastInvestCaseOptional.get().getTime();
            }
        }
        return null;

    }

    private void setCrawInvestorProperty(Investor investor, TInvestor tInvestor) {
        tInvestor.setRealName(investor.getName());
        tInvestor.setInvestorCompany(investor.getCompany());
        tInvestor.setInvestorPosition(investor.getPosition());
        tInvestor.setProvince(investor.getProvince());
        tInvestor.setCity(investor.getCity());
        // 投资行业及投资轮次，抓取程会把抓取内容拼接好设置到List中，同步时只需取第一条元素就好了
        if (!CollectionUtils.isEmpty(investor.getInvestIndustries())) {
            tInvestor.setIndustry(investor.getInvestIndustries().get(0));
        }
        if (!CollectionUtils.isEmpty(investor.getInvestRounds())) {
            tInvestor.setRound(investor.getInvestRounds().get(0));
        }

        tInvestor.setInvestorsProfile(investor.getProfile());
    }
}
