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
@Table(name="t_crawl_his")
public class TCrawlHis implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 抓取对象存储表ID
     */
    @NotEmpty
    private String modelId;

    /**
     * 抓取
     */
    @NotEmpty
    private String crawlId;

    /**
     * 抓取类型：1 投资机构 2 投资人 3 项目
     */
    @NotEmpty
    private Integer crawlType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 数据来源：1 创投圈
     */
    @NotEmpty
    private Integer srcType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getCrawlId() {
        return crawlId;
    }

    public void setCrawlId(String crawlId) {
        this.crawlId = crawlId;
    }

    public Integer getCrawlType() {
        return crawlType;
    }

    public void setCrawlType(Integer crawlType) {
        this.crawlType = crawlType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSrcType() {
        return srcType;
    }

    public void setSrcType(Integer srcType) {
        this.srcType = srcType;
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
        TCrawlHis other = (TCrawlHis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getCrawlId() == null ? other.getCrawlId() == null : this.getCrawlId().equals(other.getCrawlId()))
            && (this.getCrawlType() == null ? other.getCrawlType() == null : this.getCrawlType().equals(other.getCrawlType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getSrcType() == null ? other.getSrcType() == null : this.getSrcType().equals(other.getSrcType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getCrawlId() == null) ? 0 : getCrawlId().hashCode());
        result = prime * result + ((getCrawlType() == null) ? 0 : getCrawlType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getSrcType() == null) ? 0 : getSrcType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", modelId=").append(modelId);
        sb.append(", crawlId=").append(crawlId);
        sb.append(", crawlType=").append(crawlType);
        sb.append(", createTime=").append(createTime);
        sb.append(", srcType=").append(srcType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}