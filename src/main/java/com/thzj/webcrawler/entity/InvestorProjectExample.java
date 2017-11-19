package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class InvestorProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InvestorProjectExample() {
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdIsNull() {
            addCriterion("investment_id is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdIsNotNull() {
            addCriterion("investment_id is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdEqualTo(Integer value) {
            addCriterion("investment_id =", value, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdNotEqualTo(Integer value) {
            addCriterion("investment_id <>", value, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdGreaterThan(Integer value) {
            addCriterion("investment_id >", value, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("investment_id >=", value, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdLessThan(Integer value) {
            addCriterion("investment_id <", value, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("investment_id <=", value, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdIn(List<Integer> values) {
            addCriterion("investment_id in", values, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdNotIn(List<Integer> values) {
            addCriterion("investment_id not in", values, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdBetween(Integer value1, Integer value2) {
            addCriterion("investment_id between", value1, value2, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("investment_id not between", value1, value2, "investmentId");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeIsNull() {
            addCriterion("investment_time is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeIsNotNull() {
            addCriterion("investment_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeEqualTo(Date value) {
            addCriterion("investment_time =", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeNotEqualTo(Date value) {
            addCriterion("investment_time <>", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeGreaterThan(Date value) {
            addCriterion("investment_time >", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("investment_time >=", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeLessThan(Date value) {
            addCriterion("investment_time <", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("investment_time <=", value, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeIn(List<Date> values) {
            addCriterion("investment_time in", values, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeNotIn(List<Date> values) {
            addCriterion("investment_time not in", values, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeBetween(Date value1, Date value2) {
            addCriterion("investment_time between", value1, value2, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andInvestmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("investment_time not between", value1, value2, "investmentTime");
            return (Criteria) this;
        }

        public Criteria andProjectProfileIsNull() {
            addCriterion("project_profile is null");
            return (Criteria) this;
        }

        public Criteria andProjectProfileIsNotNull() {
            addCriterion("project_profile is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProfileEqualTo(String value) {
            addCriterion("project_profile =", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileNotEqualTo(String value) {
            addCriterion("project_profile <>", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileGreaterThan(String value) {
            addCriterion("project_profile >", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileGreaterThanOrEqualTo(String value) {
            addCriterion("project_profile >=", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileLessThan(String value) {
            addCriterion("project_profile <", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileLessThanOrEqualTo(String value) {
            addCriterion("project_profile <=", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileLike(String value) {
            addCriterion("project_profile like", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileNotLike(String value) {
            addCriterion("project_profile not like", value, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileIn(List<String> values) {
            addCriterion("project_profile in", values, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileNotIn(List<String> values) {
            addCriterion("project_profile not in", values, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileBetween(String value1, String value2) {
            addCriterion("project_profile between", value1, value2, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectProfileNotBetween(String value1, String value2) {
            addCriterion("project_profile not between", value1, value2, "projectProfile");
            return (Criteria) this;
        }

        public Criteria andProjectUrlIsNull() {
            addCriterion("project_url is null");
            return (Criteria) this;
        }

        public Criteria andProjectUrlIsNotNull() {
            addCriterion("project_url is not null");
            return (Criteria) this;
        }

        public Criteria andProjectUrlEqualTo(String value) {
            addCriterion("project_url =", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotEqualTo(String value) {
            addCriterion("project_url <>", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlGreaterThan(String value) {
            addCriterion("project_url >", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("project_url >=", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlLessThan(String value) {
            addCriterion("project_url <", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlLessThanOrEqualTo(String value) {
            addCriterion("project_url <=", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlLike(String value) {
            addCriterion("project_url like", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotLike(String value) {
            addCriterion("project_url not like", value, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlIn(List<String> values) {
            addCriterion("project_url in", values, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotIn(List<String> values) {
            addCriterion("project_url not in", values, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlBetween(String value1, String value2) {
            addCriterion("project_url between", value1, value2, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andProjectUrlNotBetween(String value1, String value2) {
            addCriterion("project_url not between", value1, value2, "projectUrl");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsIsNull() {
            addCriterion("investment_rounds is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsIsNotNull() {
            addCriterion("investment_rounds is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsEqualTo(String value) {
            addCriterion("investment_rounds =", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsNotEqualTo(String value) {
            addCriterion("investment_rounds <>", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsGreaterThan(String value) {
            addCriterion("investment_rounds >", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsGreaterThanOrEqualTo(String value) {
            addCriterion("investment_rounds >=", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsLessThan(String value) {
            addCriterion("investment_rounds <", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsLessThanOrEqualTo(String value) {
            addCriterion("investment_rounds <=", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsLike(String value) {
            addCriterion("investment_rounds like", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsNotLike(String value) {
            addCriterion("investment_rounds not like", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsIn(List<String> values) {
            addCriterion("investment_rounds in", values, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsNotIn(List<String> values) {
            addCriterion("investment_rounds not in", values, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsBetween(String value1, String value2) {
            addCriterion("investment_rounds between", value1, value2, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsNotBetween(String value1, String value2) {
            addCriterion("investment_rounds not between", value1, value2, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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