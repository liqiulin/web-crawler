package com.thzj.webcrawler.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TProject implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 项目发起人id
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 项目名
     */
    private String projectName;

    /**
     * 公司名


     */
    private String companyName;

    /**
     * 项目logo地址
     */
    private String logoUrl;

    /**
     * 我的身份
     */
    private String myIdentity;

    /**
     * 项目阶段
     */
    private String projectStage;

    /**
     * 省
     */
    private String province;

    /**
     * 市 (地区)
     */
    private String city;

    /**
     * 所在行业
     */
    private String industry;

    /**
     * 项目摘要
     */
    private String labelling;

    /**
     * 创建时间
     */
    private Date addTime;

    /**
     * 融资轮次
     */
    private String financingRounds;

    /**
     * 审核人
     */
    private String auditor;

    private Date auditTime;

    /**
     * 状态（0未审核，1已通过，2未通过）
     */
    private String auditState;

    /**
     * 备注
     */
    private String remark;

    /**
     * 项目关注数
     */
    private Integer collectNumber;

    /**
     * 融资额度
     */
    private String amountOfFinancing;

    /**
     * 融资状态(0-进行中,1已结束)
     */
    private String financingState;

    /**
     * 商业计划书保存路径
     */
    private String businessPlanUrl;

    /**
     * 是否公开给投资人  0-为不公开 1-为公开
     */
    private String isOpen;

    /**
     * 公司成立时间
     */
    private Date companySetUpTime;

    /**
     * 发展历程
     */
    private String developJourney;

    /**
     * 产品图片
     */
    private String productsUrl;

    /**
     * 官网
     */
    private String website;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getMyIdentity() {
        return myIdentity;
    }

    public void setMyIdentity(String myIdentity) {
        this.myIdentity = myIdentity;
    }

    public String getProjectStage() {
        return projectStage;
    }

    public void setProjectStage(String projectStage) {
        this.projectStage = projectStage;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLabelling() {
        return labelling;
    }

    public void setLabelling(String labelling) {
        this.labelling = labelling;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getFinancingRounds() {
        return financingRounds;
    }

    public void setFinancingRounds(String financingRounds) {
        this.financingRounds = financingRounds;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(Integer collectNumber) {
        this.collectNumber = collectNumber;
    }

    public String getAmountOfFinancing() {
        return amountOfFinancing;
    }

    public void setAmountOfFinancing(String amountOfFinancing) {
        this.amountOfFinancing = amountOfFinancing;
    }

    public String getFinancingState() {
        return financingState;
    }

    public void setFinancingState(String financingState) {
        this.financingState = financingState;
    }

    public String getBusinessPlanUrl() {
        return businessPlanUrl;
    }

    public void setBusinessPlanUrl(String businessPlanUrl) {
        this.businessPlanUrl = businessPlanUrl;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public Date getCompanySetUpTime() {
        return companySetUpTime;
    }

    public void setCompanySetUpTime(Date companySetUpTime) {
        this.companySetUpTime = companySetUpTime;
    }

    public String getDevelopJourney() {
        return developJourney;
    }

    public void setDevelopJourney(String developJourney) {
        this.developJourney = developJourney;
    }

    public String getProductsUrl() {
        return productsUrl;
    }

    public void setProductsUrl(String productsUrl) {
        this.productsUrl = productsUrl;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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
        TProject other = (TProject) that;
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
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()));
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
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", projectName=").append(projectName);
        sb.append(", companyName=").append(companyName);
        sb.append(", logoUrl=").append(logoUrl);
        sb.append(", myIdentity=").append(myIdentity);
        sb.append(", projectStage=").append(projectStage);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", industry=").append(industry);
        sb.append(", labelling=").append(labelling);
        sb.append(", addTime=").append(addTime);
        sb.append(", financingRounds=").append(financingRounds);
        sb.append(", auditor=").append(auditor);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditState=").append(auditState);
        sb.append(", remark=").append(remark);
        sb.append(", collectNumber=").append(collectNumber);
        sb.append(", amountOfFinancing=").append(amountOfFinancing);
        sb.append(", financingState=").append(financingState);
        sb.append(", businessPlanUrl=").append(businessPlanUrl);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", companySetUpTime=").append(companySetUpTime);
        sb.append(", developJourney=").append(developJourney);
        sb.append(", productsUrl=").append(productsUrl);
        sb.append(", website=").append(website);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}