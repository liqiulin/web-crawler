package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class InvestorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InvestorExample() {
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

        public Criteria andInvestorFormIsNull() {
            addCriterion("investor_form is null");
            return (Criteria) this;
        }

        public Criteria andInvestorFormIsNotNull() {
            addCriterion("investor_form is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorFormEqualTo(String value) {
            addCriterion("investor_form =", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormNotEqualTo(String value) {
            addCriterion("investor_form <>", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormGreaterThan(String value) {
            addCriterion("investor_form >", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormGreaterThanOrEqualTo(String value) {
            addCriterion("investor_form >=", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormLessThan(String value) {
            addCriterion("investor_form <", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormLessThanOrEqualTo(String value) {
            addCriterion("investor_form <=", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormLike(String value) {
            addCriterion("investor_form like", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormNotLike(String value) {
            addCriterion("investor_form not like", value, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormIn(List<String> values) {
            addCriterion("investor_form in", values, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormNotIn(List<String> values) {
            addCriterion("investor_form not in", values, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormBetween(String value1, String value2) {
            addCriterion("investor_form between", value1, value2, "investorForm");
            return (Criteria) this;
        }

        public Criteria andInvestorFormNotBetween(String value1, String value2) {
            addCriterion("investor_form not between", value1, value2, "investorForm");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyIsNull() {
            addCriterion("investor_company is null");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyIsNotNull() {
            addCriterion("investor_company is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyEqualTo(String value) {
            addCriterion("investor_company =", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyNotEqualTo(String value) {
            addCriterion("investor_company <>", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyGreaterThan(String value) {
            addCriterion("investor_company >", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("investor_company >=", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyLessThan(String value) {
            addCriterion("investor_company <", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyLessThanOrEqualTo(String value) {
            addCriterion("investor_company <=", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyLike(String value) {
            addCriterion("investor_company like", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyNotLike(String value) {
            addCriterion("investor_company not like", value, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyIn(List<String> values) {
            addCriterion("investor_company in", values, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyNotIn(List<String> values) {
            addCriterion("investor_company not in", values, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyBetween(String value1, String value2) {
            addCriterion("investor_company between", value1, value2, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorCompanyNotBetween(String value1, String value2) {
            addCriterion("investor_company not between", value1, value2, "investorCompany");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionIsNull() {
            addCriterion("investor_position is null");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionIsNotNull() {
            addCriterion("investor_position is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionEqualTo(String value) {
            addCriterion("investor_position =", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionNotEqualTo(String value) {
            addCriterion("investor_position <>", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionGreaterThan(String value) {
            addCriterion("investor_position >", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionGreaterThanOrEqualTo(String value) {
            addCriterion("investor_position >=", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionLessThan(String value) {
            addCriterion("investor_position <", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionLessThanOrEqualTo(String value) {
            addCriterion("investor_position <=", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionLike(String value) {
            addCriterion("investor_position like", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionNotLike(String value) {
            addCriterion("investor_position not like", value, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionIn(List<String> values) {
            addCriterion("investor_position in", values, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionNotIn(List<String> values) {
            addCriterion("investor_position not in", values, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionBetween(String value1, String value2) {
            addCriterion("investor_position between", value1, value2, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorPositionNotBetween(String value1, String value2) {
            addCriterion("investor_position not between", value1, value2, "investorPosition");
            return (Criteria) this;
        }

        public Criteria andInvestorCardIsNull() {
            addCriterion("investor_card is null");
            return (Criteria) this;
        }

        public Criteria andInvestorCardIsNotNull() {
            addCriterion("investor_card is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorCardEqualTo(String value) {
            addCriterion("investor_card =", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardNotEqualTo(String value) {
            addCriterion("investor_card <>", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardGreaterThan(String value) {
            addCriterion("investor_card >", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardGreaterThanOrEqualTo(String value) {
            addCriterion("investor_card >=", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardLessThan(String value) {
            addCriterion("investor_card <", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardLessThanOrEqualTo(String value) {
            addCriterion("investor_card <=", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardLike(String value) {
            addCriterion("investor_card like", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardNotLike(String value) {
            addCriterion("investor_card not like", value, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardIn(List<String> values) {
            addCriterion("investor_card in", values, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardNotIn(List<String> values) {
            addCriterion("investor_card not in", values, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardBetween(String value1, String value2) {
            addCriterion("investor_card between", value1, value2, "investorCard");
            return (Criteria) this;
        }

        public Criteria andInvestorCardNotBetween(String value1, String value2) {
            addCriterion("investor_card not between", value1, value2, "investorCard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andVisitImgIsNull() {
            addCriterion("visit_img is null");
            return (Criteria) this;
        }

        public Criteria andVisitImgIsNotNull() {
            addCriterion("visit_img is not null");
            return (Criteria) this;
        }

        public Criteria andVisitImgEqualTo(String value) {
            addCriterion("visit_img =", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgNotEqualTo(String value) {
            addCriterion("visit_img <>", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgGreaterThan(String value) {
            addCriterion("visit_img >", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgGreaterThanOrEqualTo(String value) {
            addCriterion("visit_img >=", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgLessThan(String value) {
            addCriterion("visit_img <", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgLessThanOrEqualTo(String value) {
            addCriterion("visit_img <=", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgLike(String value) {
            addCriterion("visit_img like", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgNotLike(String value) {
            addCriterion("visit_img not like", value, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgIn(List<String> values) {
            addCriterion("visit_img in", values, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgNotIn(List<String> values) {
            addCriterion("visit_img not in", values, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgBetween(String value1, String value2) {
            addCriterion("visit_img between", value1, value2, "visitImg");
            return (Criteria) this;
        }

        public Criteria andVisitImgNotBetween(String value1, String value2) {
            addCriterion("visit_img not between", value1, value2, "visitImg");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetIsNull() {
            addCriterion("investor_asset is null");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetIsNotNull() {
            addCriterion("investor_asset is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetEqualTo(String value) {
            addCriterion("investor_asset =", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetNotEqualTo(String value) {
            addCriterion("investor_asset <>", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetGreaterThan(String value) {
            addCriterion("investor_asset >", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetGreaterThanOrEqualTo(String value) {
            addCriterion("investor_asset >=", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetLessThan(String value) {
            addCriterion("investor_asset <", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetLessThanOrEqualTo(String value) {
            addCriterion("investor_asset <=", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetLike(String value) {
            addCriterion("investor_asset like", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetNotLike(String value) {
            addCriterion("investor_asset not like", value, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetIn(List<String> values) {
            addCriterion("investor_asset in", values, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetNotIn(List<String> values) {
            addCriterion("investor_asset not in", values, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetBetween(String value1, String value2) {
            addCriterion("investor_asset between", value1, value2, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andInvestorAssetNotBetween(String value1, String value2) {
            addCriterion("investor_asset not between", value1, value2, "investorAsset");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgIsNull() {
            addCriterion("org_logo_img is null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgIsNotNull() {
            addCriterion("org_logo_img is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgEqualTo(String value) {
            addCriterion("org_logo_img =", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgNotEqualTo(String value) {
            addCriterion("org_logo_img <>", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgGreaterThan(String value) {
            addCriterion("org_logo_img >", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgGreaterThanOrEqualTo(String value) {
            addCriterion("org_logo_img >=", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgLessThan(String value) {
            addCriterion("org_logo_img <", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgLessThanOrEqualTo(String value) {
            addCriterion("org_logo_img <=", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgLike(String value) {
            addCriterion("org_logo_img like", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgNotLike(String value) {
            addCriterion("org_logo_img not like", value, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgIn(List<String> values) {
            addCriterion("org_logo_img in", values, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgNotIn(List<String> values) {
            addCriterion("org_logo_img not in", values, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgBetween(String value1, String value2) {
            addCriterion("org_logo_img between", value1, value2, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgLogoImgNotBetween(String value1, String value2) {
            addCriterion("org_logo_img not between", value1, value2, "orgLogoImg");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIsNull() {
            addCriterion("org_license is null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIsNotNull() {
            addCriterion("org_license is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseEqualTo(String value) {
            addCriterion("org_license =", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNotEqualTo(String value) {
            addCriterion("org_license <>", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseGreaterThan(String value) {
            addCriterion("org_license >", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("org_license >=", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseLessThan(String value) {
            addCriterion("org_license <", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseLessThanOrEqualTo(String value) {
            addCriterion("org_license <=", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseLike(String value) {
            addCriterion("org_license like", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNotLike(String value) {
            addCriterion("org_license not like", value, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseIn(List<String> values) {
            addCriterion("org_license in", values, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNotIn(List<String> values) {
            addCriterion("org_license not in", values, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseBetween(String value1, String value2) {
            addCriterion("org_license between", value1, value2, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgLicenseNotBetween(String value1, String value2) {
            addCriterion("org_license not between", value1, value2, "orgLicense");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteIsNull() {
            addCriterion("org_website is null");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteIsNotNull() {
            addCriterion("org_website is not null");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteEqualTo(String value) {
            addCriterion("org_website =", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteNotEqualTo(String value) {
            addCriterion("org_website <>", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteGreaterThan(String value) {
            addCriterion("org_website >", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("org_website >=", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteLessThan(String value) {
            addCriterion("org_website <", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteLessThanOrEqualTo(String value) {
            addCriterion("org_website <=", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteLike(String value) {
            addCriterion("org_website like", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteNotLike(String value) {
            addCriterion("org_website not like", value, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteIn(List<String> values) {
            addCriterion("org_website in", values, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteNotIn(List<String> values) {
            addCriterion("org_website not in", values, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteBetween(String value1, String value2) {
            addCriterion("org_website between", value1, value2, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgWebsiteNotBetween(String value1, String value2) {
            addCriterion("org_website not between", value1, value2, "orgWebsite");
            return (Criteria) this;
        }

        public Criteria andOrgMembersIsNull() {
            addCriterion("org_members is null");
            return (Criteria) this;
        }

        public Criteria andOrgMembersIsNotNull() {
            addCriterion("org_members is not null");
            return (Criteria) this;
        }

        public Criteria andOrgMembersEqualTo(Integer value) {
            addCriterion("org_members =", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersNotEqualTo(Integer value) {
            addCriterion("org_members <>", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersGreaterThan(Integer value) {
            addCriterion("org_members >", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_members >=", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersLessThan(Integer value) {
            addCriterion("org_members <", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersLessThanOrEqualTo(Integer value) {
            addCriterion("org_members <=", value, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersIn(List<Integer> values) {
            addCriterion("org_members in", values, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersNotIn(List<Integer> values) {
            addCriterion("org_members not in", values, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersBetween(Integer value1, Integer value2) {
            addCriterion("org_members between", value1, value2, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andOrgMembersNotBetween(Integer value1, Integer value2) {
            addCriterion("org_members not between", value1, value2, "orgMembers");
            return (Criteria) this;
        }

        public Criteria andInvestedCountIsNull() {
            addCriterion("invested_count is null");
            return (Criteria) this;
        }

        public Criteria andInvestedCountIsNotNull() {
            addCriterion("invested_count is not null");
            return (Criteria) this;
        }

        public Criteria andInvestedCountEqualTo(Integer value) {
            addCriterion("invested_count =", value, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountNotEqualTo(Integer value) {
            addCriterion("invested_count <>", value, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountGreaterThan(Integer value) {
            addCriterion("invested_count >", value, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("invested_count >=", value, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountLessThan(Integer value) {
            addCriterion("invested_count <", value, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountLessThanOrEqualTo(Integer value) {
            addCriterion("invested_count <=", value, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountIn(List<Integer> values) {
            addCriterion("invested_count in", values, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountNotIn(List<Integer> values) {
            addCriterion("invested_count not in", values, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountBetween(Integer value1, Integer value2) {
            addCriterion("invested_count between", value1, value2, "investedCount");
            return (Criteria) this;
        }

        public Criteria andInvestedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("invested_count not between", value1, value2, "investedCount");
            return (Criteria) this;
        }

        public Criteria andCollectNumberIsNull() {
            addCriterion("collect_number is null");
            return (Criteria) this;
        }

        public Criteria andCollectNumberIsNotNull() {
            addCriterion("collect_number is not null");
            return (Criteria) this;
        }

        public Criteria andCollectNumberEqualTo(Integer value) {
            addCriterion("collect_number =", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberNotEqualTo(Integer value) {
            addCriterion("collect_number <>", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberGreaterThan(Integer value) {
            addCriterion("collect_number >", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_number >=", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberLessThan(Integer value) {
            addCriterion("collect_number <", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberLessThanOrEqualTo(Integer value) {
            addCriterion("collect_number <=", value, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberIn(List<Integer> values) {
            addCriterion("collect_number in", values, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberNotIn(List<Integer> values) {
            addCriterion("collect_number not in", values, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberBetween(Integer value1, Integer value2) {
            addCriterion("collect_number between", value1, value2, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andCollectNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_number not between", value1, value2, "collectNumber");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorStateIsNull() {
            addCriterion("auditor_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditorStateIsNotNull() {
            addCriterion("auditor_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorStateEqualTo(String value) {
            addCriterion("auditor_state =", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateNotEqualTo(String value) {
            addCriterion("auditor_state <>", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateGreaterThan(String value) {
            addCriterion("auditor_state >", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_state >=", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateLessThan(String value) {
            addCriterion("auditor_state <", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateLessThanOrEqualTo(String value) {
            addCriterion("auditor_state <=", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateLike(String value) {
            addCriterion("auditor_state like", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateNotLike(String value) {
            addCriterion("auditor_state not like", value, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateIn(List<String> values) {
            addCriterion("auditor_state in", values, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateNotIn(List<String> values) {
            addCriterion("auditor_state not in", values, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateBetween(String value1, String value2) {
            addCriterion("auditor_state between", value1, value2, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorStateNotBetween(String value1, String value2) {
            addCriterion("auditor_state not between", value1, value2, "auditorState");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNull() {
            addCriterion("auditor_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNotNull() {
            addCriterion("auditor_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeEqualTo(Date value) {
            addCriterion("auditor_time =", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotEqualTo(Date value) {
            addCriterion("auditor_time <>", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThan(Date value) {
            addCriterion("auditor_time >", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditor_time >=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThan(Date value) {
            addCriterion("auditor_time <", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThanOrEqualTo(Date value) {
            addCriterion("auditor_time <=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIn(List<Date> values) {
            addCriterion("auditor_time in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotIn(List<Date> values) {
            addCriterion("auditor_time not in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeBetween(Date value1, Date value2) {
            addCriterion("auditor_time between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotBetween(Date value1, Date value2) {
            addCriterion("auditor_time not between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentIsNull() {
            addCriterion("auditor_comment is null");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentIsNotNull() {
            addCriterion("auditor_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentEqualTo(String value) {
            addCriterion("auditor_comment =", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentNotEqualTo(String value) {
            addCriterion("auditor_comment <>", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentGreaterThan(String value) {
            addCriterion("auditor_comment >", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentGreaterThanOrEqualTo(String value) {
            addCriterion("auditor_comment >=", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentLessThan(String value) {
            addCriterion("auditor_comment <", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentLessThanOrEqualTo(String value) {
            addCriterion("auditor_comment <=", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentLike(String value) {
            addCriterion("auditor_comment like", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentNotLike(String value) {
            addCriterion("auditor_comment not like", value, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentIn(List<String> values) {
            addCriterion("auditor_comment in", values, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentNotIn(List<String> values) {
            addCriterion("auditor_comment not in", values, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentBetween(String value1, String value2) {
            addCriterion("auditor_comment between", value1, value2, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andAuditorCommentNotBetween(String value1, String value2) {
            addCriterion("auditor_comment not between", value1, value2, "auditorComment");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeIsNull() {
            addCriterion("reqauth_time is null");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeIsNotNull() {
            addCriterion("reqauth_time is not null");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeEqualTo(Date value) {
            addCriterion("reqauth_time =", value, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeNotEqualTo(Date value) {
            addCriterion("reqauth_time <>", value, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeGreaterThan(Date value) {
            addCriterion("reqauth_time >", value, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reqauth_time >=", value, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeLessThan(Date value) {
            addCriterion("reqauth_time <", value, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeLessThanOrEqualTo(Date value) {
            addCriterion("reqauth_time <=", value, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeIn(List<Date> values) {
            addCriterion("reqauth_time in", values, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeNotIn(List<Date> values) {
            addCriterion("reqauth_time not in", values, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeBetween(Date value1, Date value2) {
            addCriterion("reqauth_time between", value1, value2, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andReqauthTimeNotBetween(Date value1, Date value2) {
            addCriterion("reqauth_time not between", value1, value2, "reqauthTime");
            return (Criteria) this;
        }

        public Criteria andMailBoxIsNull() {
            addCriterion("mail_box is null");
            return (Criteria) this;
        }

        public Criteria andMailBoxIsNotNull() {
            addCriterion("mail_box is not null");
            return (Criteria) this;
        }

        public Criteria andMailBoxEqualTo(String value) {
            addCriterion("mail_box =", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotEqualTo(String value) {
            addCriterion("mail_box <>", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxGreaterThan(String value) {
            addCriterion("mail_box >", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxGreaterThanOrEqualTo(String value) {
            addCriterion("mail_box >=", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxLessThan(String value) {
            addCriterion("mail_box <", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxLessThanOrEqualTo(String value) {
            addCriterion("mail_box <=", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxLike(String value) {
            addCriterion("mail_box like", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotLike(String value) {
            addCriterion("mail_box not like", value, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxIn(List<String> values) {
            addCriterion("mail_box in", values, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotIn(List<String> values) {
            addCriterion("mail_box not in", values, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxBetween(String value1, String value2) {
            addCriterion("mail_box between", value1, value2, "mailBox");
            return (Criteria) this;
        }

        public Criteria andMailBoxNotBetween(String value1, String value2) {
            addCriterion("mail_box not between", value1, value2, "mailBox");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileIsNull() {
            addCriterion("investors_profile is null");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileIsNotNull() {
            addCriterion("investors_profile is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileEqualTo(String value) {
            addCriterion("investors_profile =", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileNotEqualTo(String value) {
            addCriterion("investors_profile <>", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileGreaterThan(String value) {
            addCriterion("investors_profile >", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileGreaterThanOrEqualTo(String value) {
            addCriterion("investors_profile >=", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileLessThan(String value) {
            addCriterion("investors_profile <", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileLessThanOrEqualTo(String value) {
            addCriterion("investors_profile <=", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileLike(String value) {
            addCriterion("investors_profile like", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileNotLike(String value) {
            addCriterion("investors_profile not like", value, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileIn(List<String> values) {
            addCriterion("investors_profile in", values, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileNotIn(List<String> values) {
            addCriterion("investors_profile not in", values, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileBetween(String value1, String value2) {
            addCriterion("investors_profile between", value1, value2, "investorsProfile");
            return (Criteria) this;
        }

        public Criteria andInvestorsProfileNotBetween(String value1, String value2) {
            addCriterion("investors_profile not between", value1, value2, "investorsProfile");
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