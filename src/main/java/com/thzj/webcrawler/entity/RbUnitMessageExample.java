package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RbUnitMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RbUnitMessageExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIsNull() {
            addCriterion("company_industry is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIsNotNull() {
            addCriterion("company_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryEqualTo(Integer value) {
            addCriterion("company_industry =", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotEqualTo(Integer value) {
            addCriterion("company_industry <>", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryGreaterThan(Integer value) {
            addCriterion("company_industry >", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_industry >=", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryLessThan(Integer value) {
            addCriterion("company_industry <", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("company_industry <=", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIn(List<Integer> values) {
            addCriterion("company_industry in", values, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotIn(List<Integer> values) {
            addCriterion("company_industry not in", values, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryBetween(Integer value1, Integer value2) {
            addCriterion("company_industry between", value1, value2, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("company_industry not between", value1, value2, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("work is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("work is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(Integer value) {
            addCriterion("work =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(Integer value) {
            addCriterion("work <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(Integer value) {
            addCriterion("work >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("work >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(Integer value) {
            addCriterion("work <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(Integer value) {
            addCriterion("work <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<Integer> values) {
            addCriterion("work in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<Integer> values) {
            addCriterion("work not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(Integer value1, Integer value2) {
            addCriterion("work between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("work not between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGradeIsNull() {
            addCriterion("work_grade is null");
            return (Criteria) this;
        }

        public Criteria andWorkGradeIsNotNull() {
            addCriterion("work_grade is not null");
            return (Criteria) this;
        }

        public Criteria andWorkGradeEqualTo(String value) {
            addCriterion("work_grade =", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeNotEqualTo(String value) {
            addCriterion("work_grade <>", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeGreaterThan(String value) {
            addCriterion("work_grade >", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeGreaterThanOrEqualTo(String value) {
            addCriterion("work_grade >=", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeLessThan(String value) {
            addCriterion("work_grade <", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeLessThanOrEqualTo(String value) {
            addCriterion("work_grade <=", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeLike(String value) {
            addCriterion("work_grade like", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeNotLike(String value) {
            addCriterion("work_grade not like", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeIn(List<String> values) {
            addCriterion("work_grade in", values, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeNotIn(List<String> values) {
            addCriterion("work_grade not in", values, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeBetween(String value1, String value2) {
            addCriterion("work_grade between", value1, value2, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeNotBetween(String value1, String value2) {
            addCriterion("work_grade not between", value1, value2, "workGrade");
            return (Criteria) this;
        }

        public Criteria andZhiweiIsNull() {
            addCriterion("zhiwei is null");
            return (Criteria) this;
        }

        public Criteria andZhiweiIsNotNull() {
            addCriterion("zhiwei is not null");
            return (Criteria) this;
        }

        public Criteria andZhiweiEqualTo(String value) {
            addCriterion("zhiwei =", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotEqualTo(String value) {
            addCriterion("zhiwei <>", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiGreaterThan(String value) {
            addCriterion("zhiwei >", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiGreaterThanOrEqualTo(String value) {
            addCriterion("zhiwei >=", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLessThan(String value) {
            addCriterion("zhiwei <", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLessThanOrEqualTo(String value) {
            addCriterion("zhiwei <=", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLike(String value) {
            addCriterion("zhiwei like", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotLike(String value) {
            addCriterion("zhiwei not like", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiIn(List<String> values) {
            addCriterion("zhiwei in", values, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotIn(List<String> values) {
            addCriterion("zhiwei not in", values, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiBetween(String value1, String value2) {
            addCriterion("zhiwei between", value1, value2, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotBetween(String value1, String value2) {
            addCriterion("zhiwei not between", value1, value2, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andServeTimeIsNull() {
            addCriterion("serve_time is null");
            return (Criteria) this;
        }

        public Criteria andServeTimeIsNotNull() {
            addCriterion("serve_time is not null");
            return (Criteria) this;
        }

        public Criteria andServeTimeEqualTo(Date value) {
            addCriterion("serve_time =", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeNotEqualTo(Date value) {
            addCriterion("serve_time <>", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeGreaterThan(Date value) {
            addCriterion("serve_time >", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("serve_time >=", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeLessThan(Date value) {
            addCriterion("serve_time <", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeLessThanOrEqualTo(Date value) {
            addCriterion("serve_time <=", value, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeIn(List<Date> values) {
            addCriterion("serve_time in", values, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeNotIn(List<Date> values) {
            addCriterion("serve_time not in", values, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeBetween(Date value1, Date value2) {
            addCriterion("serve_time between", value1, value2, "serveTime");
            return (Criteria) this;
        }

        public Criteria andServeTimeNotBetween(Date value1, Date value2) {
            addCriterion("serve_time not between", value1, value2, "serveTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeIsNull() {
            addCriterion("to_serve_time is null");
            return (Criteria) this;
        }

        public Criteria andToServeTimeIsNotNull() {
            addCriterion("to_serve_time is not null");
            return (Criteria) this;
        }

        public Criteria andToServeTimeEqualTo(Date value) {
            addCriterion("to_serve_time =", value, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeNotEqualTo(Date value) {
            addCriterion("to_serve_time <>", value, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeGreaterThan(Date value) {
            addCriterion("to_serve_time >", value, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("to_serve_time >=", value, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeLessThan(Date value) {
            addCriterion("to_serve_time <", value, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeLessThanOrEqualTo(Date value) {
            addCriterion("to_serve_time <=", value, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeIn(List<Date> values) {
            addCriterion("to_serve_time in", values, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeNotIn(List<Date> values) {
            addCriterion("to_serve_time not in", values, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeBetween(Date value1, Date value2) {
            addCriterion("to_serve_time between", value1, value2, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andToServeTimeNotBetween(Date value1, Date value2) {
            addCriterion("to_serve_time not between", value1, value2, "toServeTime");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNull() {
            addCriterion("work_year is null");
            return (Criteria) this;
        }

        public Criteria andWorkYearIsNotNull() {
            addCriterion("work_year is not null");
            return (Criteria) this;
        }

        public Criteria andWorkYearEqualTo(Integer value) {
            addCriterion("work_year =", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotEqualTo(Integer value) {
            addCriterion("work_year <>", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThan(Integer value) {
            addCriterion("work_year >", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_year >=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThan(Integer value) {
            addCriterion("work_year <", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearLessThanOrEqualTo(Integer value) {
            addCriterion("work_year <=", value, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearIn(List<Integer> values) {
            addCriterion("work_year in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotIn(List<Integer> values) {
            addCriterion("work_year not in", values, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearBetween(Integer value1, Integer value2) {
            addCriterion("work_year between", value1, value2, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkYearNotBetween(Integer value1, Integer value2) {
            addCriterion("work_year not between", value1, value2, "workYear");
            return (Criteria) this;
        }

        public Criteria andWorkTelIsNull() {
            addCriterion("work_tel is null");
            return (Criteria) this;
        }

        public Criteria andWorkTelIsNotNull() {
            addCriterion("work_tel is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTelEqualTo(String value) {
            addCriterion("work_tel =", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotEqualTo(String value) {
            addCriterion("work_tel <>", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelGreaterThan(String value) {
            addCriterion("work_tel >", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelGreaterThanOrEqualTo(String value) {
            addCriterion("work_tel >=", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelLessThan(String value) {
            addCriterion("work_tel <", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelLessThanOrEqualTo(String value) {
            addCriterion("work_tel <=", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelLike(String value) {
            addCriterion("work_tel like", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotLike(String value) {
            addCriterion("work_tel not like", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelIn(List<String> values) {
            addCriterion("work_tel in", values, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotIn(List<String> values) {
            addCriterion("work_tel not in", values, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelBetween(String value1, String value2) {
            addCriterion("work_tel between", value1, value2, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotBetween(String value1, String value2) {
            addCriterion("work_tel not between", value1, value2, "workTel");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIsNull() {
            addCriterion("company_add is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIsNotNull() {
            addCriterion("company_add is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddEqualTo(String value) {
            addCriterion("company_add =", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotEqualTo(String value) {
            addCriterion("company_add <>", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddGreaterThan(String value) {
            addCriterion("company_add >", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddGreaterThanOrEqualTo(String value) {
            addCriterion("company_add >=", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLessThan(String value) {
            addCriterion("company_add <", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLessThanOrEqualTo(String value) {
            addCriterion("company_add <=", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLike(String value) {
            addCriterion("company_add like", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotLike(String value) {
            addCriterion("company_add not like", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIn(List<String> values) {
            addCriterion("company_add in", values, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotIn(List<String> values) {
            addCriterion("company_add not in", values, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddBetween(String value1, String value2) {
            addCriterion("company_add between", value1, value2, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotBetween(String value1, String value2) {
            addCriterion("company_add not between", value1, value2, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("company_website is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("company_website is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("company_website =", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("company_website <>", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("company_website >", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("company_website >=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("company_website <", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("company_website <=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("company_website like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("company_website not like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("company_website in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("company_website not in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("company_website between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("company_website not between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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