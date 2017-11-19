package com.thzj.webcrawler.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="t_project")
public class ProjectWithBLOBs extends Project implements Serializable {
    /**
     * 项目简介
     */
    private String instruction;

    /**
     * 团队亮点
     */
    private String teamLightspot;

    private static final long serialVersionUID = 1L;

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getTeamLightspot() {
        return teamLightspot;
    }

    public void setTeamLightspot(String teamLightspot) {
        this.teamLightspot = teamLightspot;
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
        ProjectWithBLOBs other = (ProjectWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getLogoUrl() == null ? other.getLogoUrl() == null : this.getLogoUrl().equals(other.getLogoUrl()))
            && (this.getMyIdentity() == null ? other.getMyIdentity() == null : this.getMyIdentity().equals(other.getMyIdentity()))
            && (this.getProjectStage() == null ? other.getProjectStage() == null : this.getProjectStage().equals(other.getProjectStage()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getLabelling() == null ? other.getLabelling() == null : this.getLabelling().equals(other.getLabelling()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getFinancingRounds() == null ? other.getFinancingRounds() == null : this.getFinancingRounds().equals(other.getFinancingRounds()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCollectNumber() == null ? other.getCollectNumber() == null : this.getCollectNumber().equals(other.getCollectNumber()))
            && (this.getAmountOfFinancing() == null ? other.getAmountOfFinancing() == null : this.getAmountOfFinancing().equals(other.getAmountOfFinancing()))
            && (this.getFinancingState() == null ? other.getFinancingState() == null : this.getFinancingState().equals(other.getFinancingState()))
            && (this.getBusinessPlanUrl() == null ? other.getBusinessPlanUrl() == null : this.getBusinessPlanUrl().equals(other.getBusinessPlanUrl()))
            && (this.getIsOpen() == null ? other.getIsOpen() == null : this.getIsOpen().equals(other.getIsOpen()))
            && (this.getCompanySetUpTime() == null ? other.getCompanySetUpTime() == null : this.getCompanySetUpTime().equals(other.getCompanySetUpTime()))
            && (this.getDevelopJourney() == null ? other.getDevelopJourney() == null : this.getDevelopJourney().equals(other.getDevelopJourney()))
            && (this.getProductsUrl() == null ? other.getProductsUrl() == null : this.getProductsUrl().equals(other.getProductsUrl()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getInstruction() == null ? other.getInstruction() == null : this.getInstruction().equals(other.getInstruction()))
            && (this.getTeamLightspot() == null ? other.getTeamLightspot() == null : this.getTeamLightspot().equals(other.getTeamLightspot()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getLogoUrl() == null) ? 0 : getLogoUrl().hashCode());
        result = prime * result + ((getMyIdentity() == null) ? 0 : getMyIdentity().hashCode());
        result = prime * result + ((getProjectStage() == null) ? 0 : getProjectStage().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getLabelling() == null) ? 0 : getLabelling().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getFinancingRounds() == null) ? 0 : getFinancingRounds().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCollectNumber() == null) ? 0 : getCollectNumber().hashCode());
        result = prime * result + ((getAmountOfFinancing() == null) ? 0 : getAmountOfFinancing().hashCode());
        result = prime * result + ((getFinancingState() == null) ? 0 : getFinancingState().hashCode());
        result = prime * result + ((getBusinessPlanUrl() == null) ? 0 : getBusinessPlanUrl().hashCode());
        result = prime * result + ((getIsOpen() == null) ? 0 : getIsOpen().hashCode());
        result = prime * result + ((getCompanySetUpTime() == null) ? 0 : getCompanySetUpTime().hashCode());
        result = prime * result + ((getDevelopJourney() == null) ? 0 : getDevelopJourney().hashCode());
        result = prime * result + ((getProductsUrl() == null) ? 0 : getProductsUrl().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getInstruction() == null) ? 0 : getInstruction().hashCode());
        result = prime * result + ((getTeamLightspot() == null) ? 0 : getTeamLightspot().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instruction=").append(instruction);
        sb.append(", teamLightspot=").append(teamLightspot);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}