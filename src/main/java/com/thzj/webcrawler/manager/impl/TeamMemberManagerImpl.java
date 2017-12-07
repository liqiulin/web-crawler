package com.thzj.webcrawler.manager.impl;

import com.thzj.webcrawler.dao.TTeamMembersMapper;
import com.thzj.webcrawler.entity.TTeamMembers;
import com.thzj.webcrawler.entity.TTeamMembersExample;
import com.thzj.webcrawler.manager.TeamMemberManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class TeamMemberManagerImpl implements TeamMemberManager {
    @Resource
    private TTeamMembersMapper teamMembersMapper;

    @Override
    public void updateByProjectId(int projectId, List<TTeamMembers> membersList) {
        if (CollectionUtils.isEmpty(membersList)) {
            return;
        }

        TTeamMembersExample deleteExample = new TTeamMembersExample();
        deleteExample.createCriteria().andProjectIdEqualTo(projectId);
        teamMembersMapper.deleteByExample(deleteExample);

        membersList.forEach(tTeamMembers -> teamMembersMapper.insertSelective(tTeamMembers));
    }
}
