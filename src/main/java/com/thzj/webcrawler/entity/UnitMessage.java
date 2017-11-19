package com.thzj.webcrawler.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="rb_unit_message")
public class UnitMessage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer userId;

    /**
     * 单位名称
     */
    private String companyName;

    /**
     * 单位性质
     */
    private Integer companyIndustry;

    /**
     * 单位行业
     */
    private Integer work;

    /**
     * 工作级别
     */
    private String workGrade;

    /**
     * 职 位
     */
    private Integer zhiwei;

    /**
     * 服务时间
     */
    private Date serveTime;

    /**
     * 服务时间
     */
    private Date toServeTime;

    /**
     * 工作年限
     */
    private Integer workYear;

    /**
     * 工作电话
     */
    private String workTel;

    /**
     * 公司地址
     */
    private String companyAdd;

    /**
     * 公司网站
     */
    private String companyWebsite;

    /**
     * 备注说明
     */
    private String remark;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(Integer companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
    }

    public String getWorkGrade() {
        return workGrade;
    }

    public void setWorkGrade(String workGrade) {
        this.workGrade = workGrade;
    }

    public Integer getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(Integer zhiwei) {
        this.zhiwei = zhiwei;
    }

    public Date getServeTime() {
        return serveTime;
    }

    public void setServeTime(Date serveTime) {
        this.serveTime = serveTime;
    }

    public Date getToServeTime() {
        return toServeTime;
    }

    public void setToServeTime(Date toServeTime) {
        this.toServeTime = toServeTime;
    }

    public Integer getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getCompanyAdd() {
        return companyAdd;
    }

    public void setCompanyAdd(String companyAdd) {
        this.companyAdd = companyAdd;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        UnitMessage other = (UnitMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyIndustry() == null ? other.getCompanyIndustry() == null : this.getCompanyIndustry().equals(other.getCompanyIndustry()))
            && (this.getWork() == null ? other.getWork() == null : this.getWork().equals(other.getWork()))
            && (this.getWorkGrade() == null ? other.getWorkGrade() == null : this.getWorkGrade().equals(other.getWorkGrade()))
            && (this.getZhiwei() == null ? other.getZhiwei() == null : this.getZhiwei().equals(other.getZhiwei()))
            && (this.getServeTime() == null ? other.getServeTime() == null : this.getServeTime().equals(other.getServeTime()))
            && (this.getToServeTime() == null ? other.getToServeTime() == null : this.getToServeTime().equals(other.getToServeTime()))
            && (this.getWorkYear() == null ? other.getWorkYear() == null : this.getWorkYear().equals(other.getWorkYear()))
            && (this.getWorkTel() == null ? other.getWorkTel() == null : this.getWorkTel().equals(other.getWorkTel()))
            && (this.getCompanyAdd() == null ? other.getCompanyAdd() == null : this.getCompanyAdd().equals(other.getCompanyAdd()))
            && (this.getCompanyWebsite() == null ? other.getCompanyWebsite() == null : this.getCompanyWebsite().equals(other.getCompanyWebsite()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyIndustry() == null) ? 0 : getCompanyIndustry().hashCode());
        result = prime * result + ((getWork() == null) ? 0 : getWork().hashCode());
        result = prime * result + ((getWorkGrade() == null) ? 0 : getWorkGrade().hashCode());
        result = prime * result + ((getZhiwei() == null) ? 0 : getZhiwei().hashCode());
        result = prime * result + ((getServeTime() == null) ? 0 : getServeTime().hashCode());
        result = prime * result + ((getToServeTime() == null) ? 0 : getToServeTime().hashCode());
        result = prime * result + ((getWorkYear() == null) ? 0 : getWorkYear().hashCode());
        result = prime * result + ((getWorkTel() == null) ? 0 : getWorkTel().hashCode());
        result = prime * result + ((getCompanyAdd() == null) ? 0 : getCompanyAdd().hashCode());
        result = prime * result + ((getCompanyWebsite() == null) ? 0 : getCompanyWebsite().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", companyName=").append(companyName);
        sb.append(", companyIndustry=").append(companyIndustry);
        sb.append(", work=").append(work);
        sb.append(", workGrade=").append(workGrade);
        sb.append(", zhiwei=").append(zhiwei);
        sb.append(", serveTime=").append(serveTime);
        sb.append(", toServeTime=").append(toServeTime);
        sb.append(", workYear=").append(workYear);
        sb.append(", workTel=").append(workTel);
        sb.append(", companyAdd=").append(companyAdd);
        sb.append(", companyWebsite=").append(companyWebsite);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}