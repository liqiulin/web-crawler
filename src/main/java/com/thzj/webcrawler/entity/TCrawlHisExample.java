package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCrawlHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TCrawlHisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(String value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(String value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(String value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(String value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(String value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLike(String value) {
            addCriterion("model_id like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotLike(String value) {
            addCriterion("model_id not like", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<String> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<String> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(String value1, String value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(String value1, String value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdIsNull() {
            addCriterion("crawl_id is null");
            return (Criteria) this;
        }

        public Criteria andCrawlIdIsNotNull() {
            addCriterion("crawl_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlIdEqualTo(String value) {
            addCriterion("crawl_id =", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdNotEqualTo(String value) {
            addCriterion("crawl_id <>", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdGreaterThan(String value) {
            addCriterion("crawl_id >", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdGreaterThanOrEqualTo(String value) {
            addCriterion("crawl_id >=", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdLessThan(String value) {
            addCriterion("crawl_id <", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdLessThanOrEqualTo(String value) {
            addCriterion("crawl_id <=", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdLike(String value) {
            addCriterion("crawl_id like", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdNotLike(String value) {
            addCriterion("crawl_id not like", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdIn(List<String> values) {
            addCriterion("crawl_id in", values, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdNotIn(List<String> values) {
            addCriterion("crawl_id not in", values, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdBetween(String value1, String value2) {
            addCriterion("crawl_id between", value1, value2, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdNotBetween(String value1, String value2) {
            addCriterion("crawl_id not between", value1, value2, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeIsNull() {
            addCriterion("crawl_type is null");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeIsNotNull() {
            addCriterion("crawl_type is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeEqualTo(Integer value) {
            addCriterion("crawl_type =", value, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeNotEqualTo(Integer value) {
            addCriterion("crawl_type <>", value, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeGreaterThan(Integer value) {
            addCriterion("crawl_type >", value, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("crawl_type >=", value, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeLessThan(Integer value) {
            addCriterion("crawl_type <", value, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeLessThanOrEqualTo(Integer value) {
            addCriterion("crawl_type <=", value, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeIn(List<Integer> values) {
            addCriterion("crawl_type in", values, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeNotIn(List<Integer> values) {
            addCriterion("crawl_type not in", values, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeBetween(Integer value1, Integer value2) {
            addCriterion("crawl_type between", value1, value2, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCrawlTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("crawl_type not between", value1, value2, "crawlType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSrcTypeIsNull() {
            addCriterion("src_type is null");
            return (Criteria) this;
        }

        public Criteria andSrcTypeIsNotNull() {
            addCriterion("src_type is not null");
            return (Criteria) this;
        }

        public Criteria andSrcTypeEqualTo(Integer value) {
            addCriterion("src_type =", value, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeNotEqualTo(Integer value) {
            addCriterion("src_type <>", value, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeGreaterThan(Integer value) {
            addCriterion("src_type >", value, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("src_type >=", value, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeLessThan(Integer value) {
            addCriterion("src_type <", value, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeLessThanOrEqualTo(Integer value) {
            addCriterion("src_type <=", value, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeIn(List<Integer> values) {
            addCriterion("src_type in", values, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeNotIn(List<Integer> values) {
            addCriterion("src_type not in", values, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeBetween(Integer value1, Integer value2) {
            addCriterion("src_type between", value1, value2, "srcType");
            return (Criteria) this;
        }

        public Criteria andSrcTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("src_type not between", value1, value2, "srcType");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}