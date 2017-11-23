package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class RbEducationMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RbEducationMessageExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMaxEducationIsNull() {
            addCriterion("max_education is null");
            return (Criteria) this;
        }

        public Criteria andMaxEducationIsNotNull() {
            addCriterion("max_education is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEducationEqualTo(Integer value) {
            addCriterion("max_education =", value, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationNotEqualTo(Integer value) {
            addCriterion("max_education <>", value, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationGreaterThan(Integer value) {
            addCriterion("max_education >", value, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_education >=", value, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationLessThan(Integer value) {
            addCriterion("max_education <", value, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationLessThanOrEqualTo(Integer value) {
            addCriterion("max_education <=", value, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationIn(List<Integer> values) {
            addCriterion("max_education in", values, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationNotIn(List<Integer> values) {
            addCriterion("max_education not in", values, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationBetween(Integer value1, Integer value2) {
            addCriterion("max_education between", value1, value2, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andMaxEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("max_education not between", value1, value2, "maxEducation");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNull() {
            addCriterion("date_from is null");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNotNull() {
            addCriterion("date_from is not null");
            return (Criteria) this;
        }

        public Criteria andDateFromEqualTo(Date value) {
            addCriterion("date_from =", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotEqualTo(Date value) {
            addCriterion("date_from <>", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThan(Date value) {
            addCriterion("date_from >", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThanOrEqualTo(Date value) {
            addCriterion("date_from >=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThan(Date value) {
            addCriterion("date_from <", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThanOrEqualTo(Date value) {
            addCriterion("date_from <=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromIn(List<Date> values) {
            addCriterion("date_from in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotIn(List<Date> values) {
            addCriterion("date_from not in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromBetween(Date value1, Date value2) {
            addCriterion("date_from between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotBetween(Date value1, Date value2) {
            addCriterion("date_from not between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateToIsNull() {
            addCriterion("date_to is null");
            return (Criteria) this;
        }

        public Criteria andDateToIsNotNull() {
            addCriterion("date_to is not null");
            return (Criteria) this;
        }

        public Criteria andDateToEqualTo(Date value) {
            addCriterion("date_to =", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotEqualTo(Date value) {
            addCriterion("date_to <>", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThan(Date value) {
            addCriterion("date_to >", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThanOrEqualTo(Date value) {
            addCriterion("date_to >=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThan(Date value) {
            addCriterion("date_to <", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThanOrEqualTo(Date value) {
            addCriterion("date_to <=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToIn(List<Date> values) {
            addCriterion("date_to in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotIn(List<Date> values) {
            addCriterion("date_to not in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToBetween(Date value1, Date value2) {
            addCriterion("date_to between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotBetween(Date value1, Date value2) {
            addCriterion("date_to not between", value1, value2, "dateTo");
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