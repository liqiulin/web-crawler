package com.thzj.webcrawler.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="t_investor_project")
public class TInvestorProject implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 投资人id
     */
    private Integer investmentId;

    /**
     * 投资时间
     */
    private Date investmentTime;

    /**
     * 项目简介
     */
    private String projectProfile;

    /**
     * 项目logo
     */
    private String projectUrl;

    /**
     * 融资轮次
     */
    private String investmentRounds;

    /**
     * 项目id
     */
    private Integer projectId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(Integer investmentId) {
        this.investmentId = investmentId;
    }

    public Date getInvestmentTime() {
        return investmentTime;
    }

    public void setInvestmentTime(Date investmentTime) {
        this.investmentTime = investmentTime;
    }

    public String getProjectProfile() {
        return projectProfile;
    }

    public void setProjectProfile(String projectProfile) {
        this.projectProfile = projectProfile;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getInvestmentRounds() {
        return investmentRounds;
    }

    public void setInvestmentRounds(String investmentRounds) {
        this.investmentRounds = investmentRounds;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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
        TInvestorProject other = (TInvestorProject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getInvestmentId() == null ? other.getInvestmentId() == null : this.getInvestmentId().equals(other.getInvestmentId()))
            && (this.getInvestmentTime() == null ? other.getInvestmentTime() == null : this.getInvestmentTime().equals(other.getInvestmentTime()))
            && (this.getProjectProfile() == null ? other.getProjectProfile() == null : this.getProjectProfile().equals(other.getProjectProfile()))
            && (this.getProjectUrl() == null ? other.getProjectUrl() == null : this.getProjectUrl().equals(other.getProjectUrl()))
            && (this.getInvestmentRounds() == null ? other.getInvestmentRounds() == null : this.getInvestmentRounds().equals(other.getInvestmentRounds()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getInvestmentId() == null) ? 0 : getInvestmentId().hashCode());
        result = prime * result + ((getInvestmentTime() == null) ? 0 : getInvestmentTime().hashCode());
        result = prime * result + ((getProjectProfile() == null) ? 0 : getProjectProfile().hashCode());
        result = prime * result + ((getProjectUrl() == null) ? 0 : getProjectUrl().hashCode());
        result = prime * result + ((getInvestmentRounds() == null) ? 0 : getInvestmentRounds().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectName=").append(projectName);
        sb.append(", investmentId=").append(investmentId);
        sb.append(", investmentTime=").append(investmentTime);
        sb.append(", projectProfile=").append(projectProfile);
        sb.append(", projectUrl=").append(projectUrl);
        sb.append(", investmentRounds=").append(investmentRounds);
        sb.append(", projectId=").append(projectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}