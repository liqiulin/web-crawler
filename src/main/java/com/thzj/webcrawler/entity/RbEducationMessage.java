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
@Table(name="rb_education_message")
public class RbEducationMessage implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    /**
     * 最高学历
     */
    private Integer maxEducation;

    /**
     * 最高学历学院
     */
    private String college;

    /**
     * 专业
     */
    private String major;

    /**
     * 开始时间
     */
    @NotEmpty
    private Date dateFrom;

    /**
     * 结束时间
     */
    @NotEmpty
    private Date dateTo;

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

    public Integer getMaxEducation() {
        return maxEducation;
    }

    public void setMaxEducation(Integer maxEducation) {
        this.maxEducation = maxEducation;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
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
        RbEducationMessage other = (RbEducationMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMaxEducation() == null ? other.getMaxEducation() == null : this.getMaxEducation().equals(other.getMaxEducation()))
            && (this.getCollege() == null ? other.getCollege() == null : this.getCollege().equals(other.getCollege()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getDateFrom() == null ? other.getDateFrom() == null : this.getDateFrom().equals(other.getDateFrom()))
            && (this.getDateTo() == null ? other.getDateTo() == null : this.getDateTo().equals(other.getDateTo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMaxEducation() == null) ? 0 : getMaxEducation().hashCode());
        result = prime * result + ((getCollege() == null) ? 0 : getCollege().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getDateFrom() == null) ? 0 : getDateFrom().hashCode());
        result = prime * result + ((getDateTo() == null) ? 0 : getDateTo().hashCode());
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
        sb.append(", maxEducation=").append(maxEducation);
        sb.append(", college=").append(college);
        sb.append(", major=").append(major);
        sb.append(", dateFrom=").append(dateFrom);
        sb.append(", dateTo=").append(dateTo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}