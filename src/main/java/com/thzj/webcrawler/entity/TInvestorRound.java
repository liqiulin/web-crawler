package com.thzj.webcrawler.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TInvestorRound implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 投资人/投资机构ID
     */
    private Integer investorId;

    /**
     * 偏好轮次
     */
    private String round;

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

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
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
        TInvestorRound other = (TInvestorRound) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInvestorId() == null ? other.getInvestorId() == null : this.getInvestorId().equals(other.getInvestorId()))
            && (this.getRound() == null ? other.getRound() == null : this.getRound().equals(other.getRound()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInvestorId() == null) ? 0 : getInvestorId().hashCode());
        result = prime * result + ((getRound() == null) ? 0 : getRound().hashCode());
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
        sb.append(", round=").append(round);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}