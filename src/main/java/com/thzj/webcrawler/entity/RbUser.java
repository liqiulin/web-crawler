package com.thzj.webcrawler.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class RbUser implements Serializable {
    private Integer id;

    /**
     * 1.钻石会员 2.黄金会员3.白银会员4.普通会员5.客服  //1.普通会员 2.高级会员
     */
    private Integer typeId;

    private String userAccount;

    private String userPassword;

    private String userPaypassword;

    /**
     * 担保资格 0否，1
     */
    private Integer userVouch;

    /**
     * 0否，1是
     */
    private Integer userIslock;

    /**
     * 邀请好友
     */
    private Integer inviteUserid;

    /**
     * 邀请注册提成
     */
    private String inviteMoney;

    private Integer cardType;

    private String cardNumber;

    private String cardFrontImg;

    private String cardBackImg;

    private String userNation;

    private String userRealname;

    /**
     * 资料完整度
     */
    private String userIntegral;

    private Integer avatarStatus;

    /**
     * -2 未申请，-1申请中，1未通过，2，通过
     */
    private Integer realnameStatus;

    private Integer emailStatus;

    private Integer phoneStatus;

    /**
     * 视频认证
     */
    private Integer videoStatus;

    /**
     * 现场认证
     */
    private Integer sceneStatus;

    private String userEmail;

    private String userSex;

    private String avatarImg;

    private String userTel;

    private String userPhone;

    private String userQq;

    private String userQuestion;

    private String userAnswer;

    private Date userBirthday;

    private String userProvince;

    private String userCity;

    private String userArea;

    private String userAddress;

    private Date userAddtime;

    private String userAddip;

    private Date userLogintime;

    private String userLoginip;

    /**
     * 1，是 2，不是
     */
    private Integer isSystem;

    private Integer isthirdparty;

    private String uid;

    /**
     * 邀请码
     */
    private String invitationCode;

    /**
     * 易宝注册状态（-2 未申请，-1申请中，1通过，0，未通过）
     */
    private Integer ybRegisterStatus;

    /**
     * 易宝注册时间
     */
    private Date ybRegisterTime;

    /**
     * 是否合伙企业账号(0:不是；1:是)
     */
    private Integer partnerAccount;

    /**
     * 开启自动打开红包;1不开启；2开启
     */
    private Integer autoredFlag;

    private String depositUserid;

    private String depositUsrcustid;

    /**
     * 业主认证 1 已认证 其他 未认证
     */
    private Integer isownerauthed;

    private String userDes;

    private String compDes;

    private String weixin;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPaypassword() {
        return userPaypassword;
    }

    public void setUserPaypassword(String userPaypassword) {
        this.userPaypassword = userPaypassword;
    }

    public Integer getUserVouch() {
        return userVouch;
    }

    public void setUserVouch(Integer userVouch) {
        this.userVouch = userVouch;
    }

    public Integer getUserIslock() {
        return userIslock;
    }

    public void setUserIslock(Integer userIslock) {
        this.userIslock = userIslock;
    }

    public Integer getInviteUserid() {
        return inviteUserid;
    }

    public void setInviteUserid(Integer inviteUserid) {
        this.inviteUserid = inviteUserid;
    }

    public String getInviteMoney() {
        return inviteMoney;
    }

    public void setInviteMoney(String inviteMoney) {
        this.inviteMoney = inviteMoney;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardFrontImg() {
        return cardFrontImg;
    }

    public void setCardFrontImg(String cardFrontImg) {
        this.cardFrontImg = cardFrontImg;
    }

    public String getCardBackImg() {
        return cardBackImg;
    }

    public void setCardBackImg(String cardBackImg) {
        this.cardBackImg = cardBackImg;
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public String getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(String userIntegral) {
        this.userIntegral = userIntegral;
    }

    public Integer getAvatarStatus() {
        return avatarStatus;
    }

    public void setAvatarStatus(Integer avatarStatus) {
        this.avatarStatus = avatarStatus;
    }

    public Integer getRealnameStatus() {
        return realnameStatus;
    }

    public void setRealnameStatus(Integer realnameStatus) {
        this.realnameStatus = realnameStatus;
    }

    public Integer getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Integer getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(Integer phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
    }

    public Integer getSceneStatus() {
        return sceneStatus;
    }

    public void setSceneStatus(Integer sceneStatus) {
        this.sceneStatus = sceneStatus;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getUserAddtime() {
        return userAddtime;
    }

    public void setUserAddtime(Date userAddtime) {
        this.userAddtime = userAddtime;
    }

    public String getUserAddip() {
        return userAddip;
    }

    public void setUserAddip(String userAddip) {
        this.userAddip = userAddip;
    }

    public Date getUserLogintime() {
        return userLogintime;
    }

    public void setUserLogintime(Date userLogintime) {
        this.userLogintime = userLogintime;
    }

    public String getUserLoginip() {
        return userLoginip;
    }

    public void setUserLoginip(String userLoginip) {
        this.userLoginip = userLoginip;
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    public Integer getIsthirdparty() {
        return isthirdparty;
    }

    public void setIsthirdparty(Integer isthirdparty) {
        this.isthirdparty = isthirdparty;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Integer getYbRegisterStatus() {
        return ybRegisterStatus;
    }

    public void setYbRegisterStatus(Integer ybRegisterStatus) {
        this.ybRegisterStatus = ybRegisterStatus;
    }

    public Date getYbRegisterTime() {
        return ybRegisterTime;
    }

    public void setYbRegisterTime(Date ybRegisterTime) {
        this.ybRegisterTime = ybRegisterTime;
    }

    public Integer getPartnerAccount() {
        return partnerAccount;
    }

    public void setPartnerAccount(Integer partnerAccount) {
        this.partnerAccount = partnerAccount;
    }

    public Integer getAutoredFlag() {
        return autoredFlag;
    }

    public void setAutoredFlag(Integer autoredFlag) {
        this.autoredFlag = autoredFlag;
    }

    public String getDepositUserid() {
        return depositUserid;
    }

    public void setDepositUserid(String depositUserid) {
        this.depositUserid = depositUserid;
    }

    public String getDepositUsrcustid() {
        return depositUsrcustid;
    }

    public void setDepositUsrcustid(String depositUsrcustid) {
        this.depositUsrcustid = depositUsrcustid;
    }

    public Integer getIsownerauthed() {
        return isownerauthed;
    }

    public void setIsownerauthed(Integer isownerauthed) {
        this.isownerauthed = isownerauthed;
    }

    public String getUserDes() {
        return userDes;
    }

    public void setUserDes(String userDes) {
        this.userDes = userDes;
    }

    public String getCompDes() {
        return compDes;
    }

    public void setCompDes(String compDes) {
        this.compDes = compDes;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
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
        RbUser other = (RbUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserPaypassword() == null ? other.getUserPaypassword() == null : this.getUserPaypassword().equals(other.getUserPaypassword()))
            && (this.getUserVouch() == null ? other.getUserVouch() == null : this.getUserVouch().equals(other.getUserVouch()))
            && (this.getUserIslock() == null ? other.getUserIslock() == null : this.getUserIslock().equals(other.getUserIslock()))
            && (this.getInviteUserid() == null ? other.getInviteUserid() == null : this.getInviteUserid().equals(other.getInviteUserid()))
            && (this.getInviteMoney() == null ? other.getInviteMoney() == null : this.getInviteMoney().equals(other.getInviteMoney()))
            && (this.getCardType() == null ? other.getCardType() == null : this.getCardType().equals(other.getCardType()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getCardFrontImg() == null ? other.getCardFrontImg() == null : this.getCardFrontImg().equals(other.getCardFrontImg()))
            && (this.getCardBackImg() == null ? other.getCardBackImg() == null : this.getCardBackImg().equals(other.getCardBackImg()))
            && (this.getUserNation() == null ? other.getUserNation() == null : this.getUserNation().equals(other.getUserNation()))
            && (this.getUserRealname() == null ? other.getUserRealname() == null : this.getUserRealname().equals(other.getUserRealname()))
            && (this.getUserIntegral() == null ? other.getUserIntegral() == null : this.getUserIntegral().equals(other.getUserIntegral()))
            && (this.getAvatarStatus() == null ? other.getAvatarStatus() == null : this.getAvatarStatus().equals(other.getAvatarStatus()))
            && (this.getRealnameStatus() == null ? other.getRealnameStatus() == null : this.getRealnameStatus().equals(other.getRealnameStatus()))
            && (this.getEmailStatus() == null ? other.getEmailStatus() == null : this.getEmailStatus().equals(other.getEmailStatus()))
            && (this.getPhoneStatus() == null ? other.getPhoneStatus() == null : this.getPhoneStatus().equals(other.getPhoneStatus()))
            && (this.getVideoStatus() == null ? other.getVideoStatus() == null : this.getVideoStatus().equals(other.getVideoStatus()))
            && (this.getSceneStatus() == null ? other.getSceneStatus() == null : this.getSceneStatus().equals(other.getSceneStatus()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserSex() == null ? other.getUserSex() == null : this.getUserSex().equals(other.getUserSex()))
            && (this.getAvatarImg() == null ? other.getAvatarImg() == null : this.getAvatarImg().equals(other.getAvatarImg()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserQq() == null ? other.getUserQq() == null : this.getUserQq().equals(other.getUserQq()))
            && (this.getUserQuestion() == null ? other.getUserQuestion() == null : this.getUserQuestion().equals(other.getUserQuestion()))
            && (this.getUserAnswer() == null ? other.getUserAnswer() == null : this.getUserAnswer().equals(other.getUserAnswer()))
            && (this.getUserBirthday() == null ? other.getUserBirthday() == null : this.getUserBirthday().equals(other.getUserBirthday()))
            && (this.getUserProvince() == null ? other.getUserProvince() == null : this.getUserProvince().equals(other.getUserProvince()))
            && (this.getUserCity() == null ? other.getUserCity() == null : this.getUserCity().equals(other.getUserCity()))
            && (this.getUserArea() == null ? other.getUserArea() == null : this.getUserArea().equals(other.getUserArea()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getUserAddtime() == null ? other.getUserAddtime() == null : this.getUserAddtime().equals(other.getUserAddtime()))
            && (this.getUserAddip() == null ? other.getUserAddip() == null : this.getUserAddip().equals(other.getUserAddip()))
            && (this.getUserLogintime() == null ? other.getUserLogintime() == null : this.getUserLogintime().equals(other.getUserLogintime()))
            && (this.getUserLoginip() == null ? other.getUserLoginip() == null : this.getUserLoginip().equals(other.getUserLoginip()))
            && (this.getIsSystem() == null ? other.getIsSystem() == null : this.getIsSystem().equals(other.getIsSystem()))
            && (this.getIsthirdparty() == null ? other.getIsthirdparty() == null : this.getIsthirdparty().equals(other.getIsthirdparty()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getInvitationCode() == null ? other.getInvitationCode() == null : this.getInvitationCode().equals(other.getInvitationCode()))
            && (this.getYbRegisterStatus() == null ? other.getYbRegisterStatus() == null : this.getYbRegisterStatus().equals(other.getYbRegisterStatus()))
            && (this.getYbRegisterTime() == null ? other.getYbRegisterTime() == null : this.getYbRegisterTime().equals(other.getYbRegisterTime()))
            && (this.getPartnerAccount() == null ? other.getPartnerAccount() == null : this.getPartnerAccount().equals(other.getPartnerAccount()))
            && (this.getAutoredFlag() == null ? other.getAutoredFlag() == null : this.getAutoredFlag().equals(other.getAutoredFlag()))
            && (this.getDepositUserid() == null ? other.getDepositUserid() == null : this.getDepositUserid().equals(other.getDepositUserid()))
            && (this.getDepositUsrcustid() == null ? other.getDepositUsrcustid() == null : this.getDepositUsrcustid().equals(other.getDepositUsrcustid()))
            && (this.getIsownerauthed() == null ? other.getIsownerauthed() == null : this.getIsownerauthed().equals(other.getIsownerauthed()))
            && (this.getUserDes() == null ? other.getUserDes() == null : this.getUserDes().equals(other.getUserDes()))
            && (this.getCompDes() == null ? other.getCompDes() == null : this.getCompDes().equals(other.getCompDes()))
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserPaypassword() == null) ? 0 : getUserPaypassword().hashCode());
        result = prime * result + ((getUserVouch() == null) ? 0 : getUserVouch().hashCode());
        result = prime * result + ((getUserIslock() == null) ? 0 : getUserIslock().hashCode());
        result = prime * result + ((getInviteUserid() == null) ? 0 : getInviteUserid().hashCode());
        result = prime * result + ((getInviteMoney() == null) ? 0 : getInviteMoney().hashCode());
        result = prime * result + ((getCardType() == null) ? 0 : getCardType().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getCardFrontImg() == null) ? 0 : getCardFrontImg().hashCode());
        result = prime * result + ((getCardBackImg() == null) ? 0 : getCardBackImg().hashCode());
        result = prime * result + ((getUserNation() == null) ? 0 : getUserNation().hashCode());
        result = prime * result + ((getUserRealname() == null) ? 0 : getUserRealname().hashCode());
        result = prime * result + ((getUserIntegral() == null) ? 0 : getUserIntegral().hashCode());
        result = prime * result + ((getAvatarStatus() == null) ? 0 : getAvatarStatus().hashCode());
        result = prime * result + ((getRealnameStatus() == null) ? 0 : getRealnameStatus().hashCode());
        result = prime * result + ((getEmailStatus() == null) ? 0 : getEmailStatus().hashCode());
        result = prime * result + ((getPhoneStatus() == null) ? 0 : getPhoneStatus().hashCode());
        result = prime * result + ((getVideoStatus() == null) ? 0 : getVideoStatus().hashCode());
        result = prime * result + ((getSceneStatus() == null) ? 0 : getSceneStatus().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserSex() == null) ? 0 : getUserSex().hashCode());
        result = prime * result + ((getAvatarImg() == null) ? 0 : getAvatarImg().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserQq() == null) ? 0 : getUserQq().hashCode());
        result = prime * result + ((getUserQuestion() == null) ? 0 : getUserQuestion().hashCode());
        result = prime * result + ((getUserAnswer() == null) ? 0 : getUserAnswer().hashCode());
        result = prime * result + ((getUserBirthday() == null) ? 0 : getUserBirthday().hashCode());
        result = prime * result + ((getUserProvince() == null) ? 0 : getUserProvince().hashCode());
        result = prime * result + ((getUserCity() == null) ? 0 : getUserCity().hashCode());
        result = prime * result + ((getUserArea() == null) ? 0 : getUserArea().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getUserAddtime() == null) ? 0 : getUserAddtime().hashCode());
        result = prime * result + ((getUserAddip() == null) ? 0 : getUserAddip().hashCode());
        result = prime * result + ((getUserLogintime() == null) ? 0 : getUserLogintime().hashCode());
        result = prime * result + ((getUserLoginip() == null) ? 0 : getUserLoginip().hashCode());
        result = prime * result + ((getIsSystem() == null) ? 0 : getIsSystem().hashCode());
        result = prime * result + ((getIsthirdparty() == null) ? 0 : getIsthirdparty().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getInvitationCode() == null) ? 0 : getInvitationCode().hashCode());
        result = prime * result + ((getYbRegisterStatus() == null) ? 0 : getYbRegisterStatus().hashCode());
        result = prime * result + ((getYbRegisterTime() == null) ? 0 : getYbRegisterTime().hashCode());
        result = prime * result + ((getPartnerAccount() == null) ? 0 : getPartnerAccount().hashCode());
        result = prime * result + ((getAutoredFlag() == null) ? 0 : getAutoredFlag().hashCode());
        result = prime * result + ((getDepositUserid() == null) ? 0 : getDepositUserid().hashCode());
        result = prime * result + ((getDepositUsrcustid() == null) ? 0 : getDepositUsrcustid().hashCode());
        result = prime * result + ((getIsownerauthed() == null) ? 0 : getIsownerauthed().hashCode());
        result = prime * result + ((getUserDes() == null) ? 0 : getUserDes().hashCode());
        result = prime * result + ((getCompDes() == null) ? 0 : getCompDes().hashCode());
        result = prime * result + ((getWeixin() == null) ? 0 : getWeixin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userPaypassword=").append(userPaypassword);
        sb.append(", userVouch=").append(userVouch);
        sb.append(", userIslock=").append(userIslock);
        sb.append(", inviteUserid=").append(inviteUserid);
        sb.append(", inviteMoney=").append(inviteMoney);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", cardFrontImg=").append(cardFrontImg);
        sb.append(", cardBackImg=").append(cardBackImg);
        sb.append(", userNation=").append(userNation);
        sb.append(", userRealname=").append(userRealname);
        sb.append(", userIntegral=").append(userIntegral);
        sb.append(", avatarStatus=").append(avatarStatus);
        sb.append(", realnameStatus=").append(realnameStatus);
        sb.append(", emailStatus=").append(emailStatus);
        sb.append(", phoneStatus=").append(phoneStatus);
        sb.append(", videoStatus=").append(videoStatus);
        sb.append(", sceneStatus=").append(sceneStatus);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userSex=").append(userSex);
        sb.append(", avatarImg=").append(avatarImg);
        sb.append(", userTel=").append(userTel);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userQq=").append(userQq);
        sb.append(", userQuestion=").append(userQuestion);
        sb.append(", userAnswer=").append(userAnswer);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userProvince=").append(userProvince);
        sb.append(", userCity=").append(userCity);
        sb.append(", userArea=").append(userArea);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", userAddtime=").append(userAddtime);
        sb.append(", userAddip=").append(userAddip);
        sb.append(", userLogintime=").append(userLogintime);
        sb.append(", userLoginip=").append(userLoginip);
        sb.append(", isSystem=").append(isSystem);
        sb.append(", isthirdparty=").append(isthirdparty);
        sb.append(", uid=").append(uid);
        sb.append(", invitationCode=").append(invitationCode);
        sb.append(", ybRegisterStatus=").append(ybRegisterStatus);
        sb.append(", ybRegisterTime=").append(ybRegisterTime);
        sb.append(", partnerAccount=").append(partnerAccount);
        sb.append(", autoredFlag=").append(autoredFlag);
        sb.append(", depositUserid=").append(depositUserid);
        sb.append(", depositUsrcustid=").append(depositUsrcustid);
        sb.append(", isownerauthed=").append(isownerauthed);
        sb.append(", userDes=").append(userDes);
        sb.append(", compDes=").append(compDes);
        sb.append(", weixin=").append(weixin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}