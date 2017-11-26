package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.RbUserMapper;
import com.thzj.webcrawler.entity.RbUserWithBLOBs;
import com.thzj.webcrawler.manager.UserManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserManagerImpl implements UserManager {
    @Resource
    private RbUserMapper rbUserMapper;

    @Override
    public int createByInvestorName(String investorName) {
        RbUserWithBLOBs user = new RbUserWithBLOBs();
        user.setUserRealname(investorName);
        return rbUserMapper.insertSelective(user);
    }
}
