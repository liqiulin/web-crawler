package com.thzj.webcrawler.manager;

import com.thzj.webcrawler.entity.TTeamMembers;

import java.util.List;

public interface TeamMemberManager {
    void updateByProjectId(int projectId, List<TTeamMembers> membersList);
}
