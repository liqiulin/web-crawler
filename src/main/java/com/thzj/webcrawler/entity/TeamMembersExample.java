package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class TeamMembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TeamMembersExample() {
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

        public Criteria andMembersNameIsNull() {
            addCriterion("members_name is null");
            return (Criteria) this;
        }

        public Criteria andMembersNameIsNotNull() {
            addCriterion("members_name is not null");
            return (Criteria) this;
        }

        public Criteria andMembersNameEqualTo(String value) {
            addCriterion("members_name =", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameNotEqualTo(String value) {
            addCriterion("members_name <>", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameGreaterThan(String value) {
            addCriterion("members_name >", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameGreaterThanOrEqualTo(String value) {
            addCriterion("members_name >=", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameLessThan(String value) {
            addCriterion("members_name <", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameLessThanOrEqualTo(String value) {
            addCriterion("members_name <=", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameLike(String value) {
            addCriterion("members_name like", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameNotLike(String value) {
            addCriterion("members_name not like", value, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameIn(List<String> values) {
            addCriterion("members_name in", values, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameNotIn(List<String> values) {
            addCriterion("members_name not in", values, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameBetween(String value1, String value2) {
            addCriterion("members_name between", value1, value2, "membersName");
            return (Criteria) this;
        }

        public Criteria andMembersNameNotBetween(String value1, String value2) {
            addCriterion("members_name not between", value1, value2, "membersName");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlIsNull() {
            addCriterion("photographs_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlIsNotNull() {
            addCriterion("photographs_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlEqualTo(String value) {
            addCriterion("photographs_url =", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlNotEqualTo(String value) {
            addCriterion("photographs_url <>", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlGreaterThan(String value) {
            addCriterion("photographs_url >", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photographs_url >=", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlLessThan(String value) {
            addCriterion("photographs_url <", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlLessThanOrEqualTo(String value) {
            addCriterion("photographs_url <=", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlLike(String value) {
            addCriterion("photographs_url like", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlNotLike(String value) {
            addCriterion("photographs_url not like", value, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlIn(List<String> values) {
            addCriterion("photographs_url in", values, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlNotIn(List<String> values) {
            addCriterion("photographs_url not in", values, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlBetween(String value1, String value2) {
            addCriterion("photographs_url between", value1, value2, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographsUrlNotBetween(String value1, String value2) {
            addCriterion("photographs_url not between", value1, value2, "photographsUrl");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
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