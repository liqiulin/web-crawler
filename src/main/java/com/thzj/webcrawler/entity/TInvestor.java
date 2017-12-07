package com.thzj.webcrawler.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TInvestor implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    private Integer userId;

    /**
     * 投资人类型(1表示投资人，2表示投资机构)
     */
    private String investorForm;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 名片地址
     */
    private String area;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 投资人所属公司简称
     */
    private String investorCompany;

    /**
     * 职位
     */
    private String investorPosition;

    /**
     * 身份证号码
     */
    private String investorCard;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 微信号
     */
    private String weixin;

    /**
     * 头像地址
     */
    private String visitImg;

    /**
     * 资产
     */
    private String investorAsset;

    /**
     * 机构logo地址
     */
    private String orgLogoImg;

    /**
     * 投资机构简称
     */
    private String orgName;

    /**
     * 营业执照
     */
    private String orgLicense;

    /**
     * 机构网站
     */
    private String orgWebsite;

    /**
     * 投资机构人数
     */
    private Integer orgMembers;

    /**
     * 投资笔数
     */
    private Integer investedCount;

    /**
     * 被收藏数
     */
    private Integer collectNumber;

    /**
     * 审核人
     */
    private String auditor;

    /**
     * 审核状态(0-待审核,1审核未通过,2审核通过)
     */
    private String auditorState;

    /**
     * 审核时间
     */
    private Date auditorTime;

    /**
     * 审核备注
     */
    private String auditorComment;

    /**
     * 投资人认证申请时间
     */
    private Date reqauthTime;

    /**
     * 邮箱
     */
    private String mailBox;

    /**
     * 投资人简介
     */
    private String investorsProfile;

    /**
     * 公司全名
     */
    private String investorsCompanyName;

    /**
     * 最新投资时间,用于排序
     */
    private Date investmentTime;

    /**
     * 投资机构介绍
     */
    private String orgIntroduce;

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

    public String getInvestorForm() {
        return investorForm;
    }

    public void setInvestorForm(String investorForm) {
        this.investorForm = investorForm;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getInvestorCompany() {
        return investorCompany;
    }

    public void setInvestorCompany(String investorCompany) {
        this.investorCompany = investorCompany;
    }

    public String getInvestorPosition() {
        return investorPosition;
    }

    public void setInvestorPosition(String investorPosition) {
        this.investorPosition = investorPosition;
    }

    public String getInvestorCard() {
        return investorCard;
    }

    public void setInvestorCard(String investorCard) {
        this.investorCard = investorCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getVisitImg() {
        return visitImg;
    }

    public void setVisitImg(String visitImg) {
        this.visitImg = visitImg;
    }

    public String getInvestorAsset() {
        return investorAsset;
    }

    public void setInvestorAsset(String investorAsset) {
        this.investorAsset = investorAsset;
    }

    public String getOrgLogoImg() {
        return orgLogoImg;
    }

    public void setOrgLogoImg(String orgLogoImg) {
        this.orgLogoImg = orgLogoImg;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgLicense() {
        return orgLicense;
    }

    public void setOrgLicense(String orgLicense) {
        this.orgLicense = orgLicense;
    }

    public String getOrgWebsite() {
        return orgWebsite;
    }

    public void setOrgWebsite(String orgWebsite) {
        this.orgWebsite = orgWebsite;
    }

    public Integer getOrgMembers() {
        return orgMembers;
    }

    public void setOrgMembers(Integer orgMembers) {
        this.orgMembers = orgMembers;
    }

    public Integer getInvestedCount() {
        return investedCount;
    }

    public void setInvestedCount(Integer investedCount) {
        this.investedCount = investedCount;
    }

    public Integer getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(Integer collectNumber) {
        this.collectNumber = collectNumber;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getAuditorState() {
        return auditorState;
    }

    public void setAuditorState(String auditorState) {
        this.auditorState = auditorState;
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }

    public String getAuditorComment() {
        return auditorComment;
    }

    public void setAuditorComment(String auditorComment) {
        this.auditorComment = auditorComment;
    }

    public Date getReqauthTime() {
        return reqauthTime;
    }

    public void setReqauthTime(Date reqauthTime) {
        this.reqauthTime = reqauthTime;
    }

    public String getMailBox() {
        return mailBox;
    }

    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

    public String getInvestorsProfile() {
        return investorsProfile;
    }

    public void setInvestorsProfile(String investorsProfile) {
        this.investorsProfile = investorsProfile;
    }

    public String getInvestorsCompanyName() {
        return investorsCompanyName;
    }

    public void setInvestorsCompanyName(String investorsCompanyName) {
        this.investorsCompanyName = investorsCompanyName;
    }

    public Date getInvestmentTime() {
        return investmentTime;
    }

    public void setInvestmentTime(Date investmentTime) {
        this.investmentTime = investmentTime;
    }

    public String getOrgIntroduce() {
        return orgIntroduce;
    }

    public void setOrgIntroduce(String orgIntroduce) {
        this.orgIntroduce = orgIntroduce;
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
        TInvestor other = (TInvestor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getInvestorForm() == null ? other.getInvestorForm() == null : this.getInvestorForm().equals(other.getInvestorForm()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getInvestorCompany() == null ? other.getInvestorCompany() == null : this.getInvestorCompany().equals(other.getInvestorCompany()))
            && (this.getInvestorPosition() == null ? other.getInvestorPosition() == null : this.getInvestorPosition().equals(other.getInvestorPosition()))
            && (this.getInvestorCard() == null ? other.getInvestorCard() == null : this.getInvestorCard().equals(other.getInvestorCard()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
            && (this.getVisitImg() == null ? other.getVisitImg() == null : this.getVisitImg().equals(other.getVisitImg()))
            && (this.getInvestorAsset() == null ? other.getInvestorAsset() == null : this.getInvestorAsset().equals(other.getInvestorAsset()))
            && (this.getOrgLogoImg() == null ? other.getOrgLogoImg() == null : this.getOrgLogoImg().equals(other.getOrgLogoImg()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgLicense() == null ? other.getOrgLicense() == null : this.getOrgLicense().equals(other.getOrgLicense()))
            && (this.getOrgWebsite() == null ? other.getOrgWebsite() == null : this.getOrgWebsite().equals(other.getOrgWebsite()))
            && (this.getOrgMembers() == null ? other.getOrgMembers() == null : this.getOrgMembers().equals(other.getOrgMembers()))
            && (this.getInvestedCount() == null ? other.getInvestedCount() == null : this.getInvestedCount().equals(other.getInvestedCount()))
            && (this.getCollectNumber() == null ? other.getCollectNumber() == null : this.getCollectNumber().equals(other.getCollectNumber()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditorState() == null ? other.getAuditorState() == null : this.getAuditorState().equals(other.getAuditorState()))
            && (this.getAuditorTime() == null ? other.getAuditorTime() == null : this.getAuditorTime().equals(other.getAuditorTime()))
            && (this.getAuditorComment() == null ? other.getAuditorComment() == null : this.getAuditorComment().equals(other.getAuditorComment()))
            && (this.getReqauthTime() == null ? other.getReqauthTime() == null : this.getReqauthTime().equals(other.getReqauthTime()))
            && (this.getMailBox() == null ? other.getMailBox() == null : this.getMailBox().equals(other.getMailBox()))
            && (this.getInvestorsProfile() == null ? other.getInvestorsProfile() == null : this.getInvestorsProfile().equals(other.getInvestorsProfile()))
            && (this.getInvestorsCompanyName() == null ? other.getInvestorsCompanyName() == null : this.getInvestorsCompanyName().equals(other.getInvestorsCompanyName()))
            && (this.getInvestmentTime() == null ? other.getInvestmentTime() == null : this.getInvestmentTime().equals(other.getInvestmentTime()))
            && (this.getOrgIntroduce() == null ? other.getOrgIntroduce() == null : this.getOrgIntroduce().equals(other.getOrgIntroduce()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getInvestorForm() == null) ? 0 : getInvestorForm().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getInvestorCompany() == null) ? 0 : getInvestorCompany().hashCode());
        result = prime * result + ((getInvestorPosition() == null) ? 0 : getInvestorPosition().hashCode());
        result = prime * result + ((getInvestorCard() == null) ? 0 : getInvestorCard().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        result = prime * result + ((getVisitImg() == null) ? 0 : getVisitImg().hashCode());
        result = prime * result + ((getInvestorAsset() == null) ? 0 : getInvestorAsset().hashCode());
        result = prime * result + ((getOrgLogoImg() == null) ? 0 : getOrgLogoImg().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgLicense() == null) ? 0 : getOrgLicense().hashCode());
        result = prime * result + ((getOrgWebsite() == null) ? 0 : getOrgWebsite().hashCode());
        result = prime * result + ((getOrgMembers() == null) ? 0 : getOrgMembers().hashCode());
        result = prime * result + ((getInvestedCount() == null) ? 0 : getInvestedCount().hashCode());
        result = prime * result + ((getCollectNumber() == null) ? 0 : getCollectNumber().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditorState() == null) ? 0 : getAuditorState().hashCode());
        result = prime * result + ((getAuditorTime() == null) ? 0 : getAuditorTime().hashCode());
        result = prime * result + ((getAuditorComment() == null) ? 0 : getAuditorComment().hashCode());
        result = prime * result + ((getReqauthTime() == null) ? 0 : getReqauthTime().hashCode());
        result = prime * result + ((getMailBox() == null) ? 0 : getMailBox().hashCode());
        result = prime * result + ((getInvestorsProfile() == null) ? 0 : getInvestorsProfile().hashCode());
        result = prime * result + ((getInvestorsCompanyName() == null) ? 0 : getInvestorsCompanyName().hashCode());
        result = prime * result + ((getInvestmentTime() == null) ? 0 : getInvestmentTime().hashCode());
        result = prime * result + ((getOrgIntroduce() == null) ? 0 : getOrgIntroduce().hashCode());
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
        sb.append(", investorForm=").append(investorForm);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", realName=").append(realName);
        sb.append(", investorCompany=").append(investorCompany);
        sb.append(", investorPosition=").append(investorPosition);
        sb.append(", investorCard=").append(investorCard);
        sb.append(", phone=").append(phone);
        sb.append(", weixin=").append(weixin);
        sb.append(", visitImg=").append(visitImg);
        sb.append(", investorAsset=").append(investorAsset);
        sb.append(", orgLogoImg=").append(orgLogoImg);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgLicense=").append(orgLicense);
        sb.append(", orgWebsite=").append(orgWebsite);
        sb.append(", orgMembers=").append(orgMembers);
        sb.append(", investedCount=").append(investedCount);
        sb.append(", collectNumber=").append(collectNumber);
        sb.append(", auditor=").append(auditor);
        sb.append(", auditorState=").append(auditorState);
        sb.append(", auditorTime=").append(auditorTime);
        sb.append(", auditorComment=").append(auditorComment);
        sb.append(", reqauthTime=").append(reqauthTime);
        sb.append(", mailBox=").append(mailBox);
        sb.append(", investorsProfile=").append(investorsProfile);
        sb.append(", investorsCompanyName=").append(investorsCompanyName);
        sb.append(", investmentTime=").append(investmentTime);
        sb.append(", orgIntroduce=").append(orgIntroduce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}