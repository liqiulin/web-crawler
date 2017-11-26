package com.thzj.webcrawler.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TTeamMembers implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 成员名字
     */
    private String membersName;

    /**
     * 头像地址
     */
    private String photographsUrl;

    /**
     * 身份
     */
    private String identity;

    /**
     * 简介
     */
    private String profile;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getMembersName() {
        return membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    public String getPhotographsUrl() {
        return photographsUrl;
    }

    public void setPhotographsUrl(String photographsUrl) {
        this.photographsUrl = photographsUrl;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TTeamMembers other = (TTeamMembers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getMembersName() == null ? other.getMembersName() == null : this.getMembersName().equals(other.getMembersName()))
            && (this.getPhotographsUrl() == null ? other.getPhotographsUrl() == null : this.getPhotographsUrl().equals(other.getPhotographsUrl()))
            && (this.getIdentity() == null ? other.getIdentity() == null : this.getIdentity().equals(other.getIdentity()))
            && (this.getProfile() == null ? other.getProfile() == null : this.getProfile().equals(other.getProfile()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getMembersName() == null) ? 0 : getMembersName().hashCode());
        result = prime * result + ((getPhotographsUrl() == null) ? 0 : getPhotographsUrl().hashCode());
        result = prime * result + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        result = prime * result + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectId=").append(projectId);
        sb.append(", membersName=").append(membersName);
        sb.append(", photographsUrl=").append(photographsUrl);
        sb.append(", identity=").append(identity);
        sb.append(", profile=").append(profile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}