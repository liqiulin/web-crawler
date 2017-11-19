package com.thzj.webcrawler.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
@Table(name="t_investor_industry")
public class InvestorIndustry implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 投资人/投资机构ID
     */
    private Integer investorId;

    /**
     * 关注领域
     */
    private String industry;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Integer investorId) {
        this.investorId = investorId;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
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
        InvestorIndustry other = (InvestorIndustry) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInvestorId() == null ? other.getInvestorId() == null : this.getInvestorId().equals(other.getInvestorId()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInvestorId() == null) ? 0 : getInvestorId().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", investorId=").append(investorId);
        sb.append(", industry=").append(industry);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}