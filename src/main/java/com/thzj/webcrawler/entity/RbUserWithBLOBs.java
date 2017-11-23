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
@Table(name="rb_user")
public class RbUserWithBLOBs extends RbUser implements Serializable {
    /**
     * 提醒设置
     */
    private String userRemind;

    /**
     * 隐私设置
     */
    private String userPrivacy;

    private static final long serialVersionUID = 1L;

    public String getUserRemind() {
        return userRemind;
    }

    public void setUserRemind(String userRemind) {
        this.userRemind = userRemind;
    }

    public String getUserPrivacy() {
        return userPrivacy;
    }

    public void setUserPrivacy(String userPrivacy) {
        this.userPrivacy = userPrivacy;
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
        RbUserWithBLOBs other = (RbUserWithBLOBs) that;
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
            && (this.getWeixin() == null ? other.getWeixin() == null : this.getWeixin().equals(other.getWeixin()))
            && (this.getUserRemind() == null ? other.getUserRemind() == null : this.getUserRemind().equals(other.getUserRemind()))
            && (this.getUserPrivacy() == null ? other.getUserPrivacy() == null : this.getUserPrivacy().equals(other.getUserPrivacy()));
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
        result = prime * result + ((getUserRemind() == null) ? 0 : getUserRemind().hashCode());
        result = prime * result + ((getUserPrivacy() == null) ? 0 : getUserPrivacy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRemind=").append(userRemind);
        sb.append(", userPrivacy=").append(userPrivacy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}