package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TProjectExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andMyIdentityIsNull() {
            addCriterion("my_identity is null");
            return (Criteria) this;
        }

        public Criteria andMyIdentityIsNotNull() {
            addCriterion("my_identity is not null");
            return (Criteria) this;
        }

        public Criteria andMyIdentityEqualTo(String value) {
            addCriterion("my_identity =", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityNotEqualTo(String value) {
            addCriterion("my_identity <>", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityGreaterThan(String value) {
            addCriterion("my_identity >", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("my_identity >=", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityLessThan(String value) {
            addCriterion("my_identity <", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityLessThanOrEqualTo(String value) {
            addCriterion("my_identity <=", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityLike(String value) {
            addCriterion("my_identity like", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityNotLike(String value) {
            addCriterion("my_identity not like", value, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityIn(List<String> values) {
            addCriterion("my_identity in", values, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityNotIn(List<String> values) {
            addCriterion("my_identity not in", values, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityBetween(String value1, String value2) {
            addCriterion("my_identity between", value1, value2, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andMyIdentityNotBetween(String value1, String value2) {
            addCriterion("my_identity not between", value1, value2, "myIdentity");
            return (Criteria) this;
        }

        public Criteria andProjectStageIsNull() {
            addCriterion("project_stage is null");
            return (Criteria) this;
        }

        public Criteria andProjectStageIsNotNull() {
            addCriterion("project_stage is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStageEqualTo(String value) {
            addCriterion("project_stage =", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageNotEqualTo(String value) {
            addCriterion("project_stage <>", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageGreaterThan(String value) {
            addCriterion("project_stage >", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageGreaterThanOrEqualTo(String value) {
            addCriterion("project_stage >=", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageLessThan(String value) {
            addCriterion("project_stage <", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageLessThanOrEqualTo(String value) {
            addCriterion("project_stage <=", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageLike(String value) {
            addCriterion("project_stage like", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageNotLike(String value) {
            addCriterion("project_stage not like", value, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageIn(List<String> values) {
            addCriterion("project_stage in", values, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageNotIn(List<String> values) {
            addCriterion("project_stage not in", values, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageBetween(String value1, String value2) {
            addCriterion("project_stage between", value1, value2, "projectStage");
            return (Criteria) this;
        }

        public Criteria andProjectStageNotBetween(String value1, String value2) {
            addCriterion("project_stage not between", value1, value2, "projectStage");
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

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andLabellingIsNull() {
            addCriterion("labelling is null");
            return (Criteria) this;
        }

        public Criteria andLabellingIsNotNull() {
            addCriterion("labelling is not null");
            return (Criteria) this;
        }

        public Criteria andLabellingEqualTo(String value) {
            addCriterion("labelling =", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotEqualTo(String value) {
            addCriterion("labelling <>", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingGreaterThan(String value) {
            addCriterion("labelling >", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingGreaterThanOrEqualTo(String value) {
            addCriterion("labelling >=", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingLessThan(String value) {
            addCriterion("labelling <", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingLessThanOrEqualTo(String value) {
            addCriterion("labelling <=", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingLike(String value) {
            addCriterion("labelling like", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotLike(String value) {
            addCriterion("labelling not like", value, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingIn(List<String> values) {
            addCriterion("labelling in", values, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotIn(List<String> values) {
            addCriterion("labelling not in", values, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingBetween(String value1, String value2) {
            addCriterion("labelling between", value1, value2, "labelling");
            return (Criteria) this;
        }

        public Criteria andLabellingNotBetween(String value1, String value2) {
            addCriterion("labelling not between", value1, value2, "labelling");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsIsNull() {
            addCriterion("financing_rounds is null");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsIsNotNull() {
            addCriterion("financing_rounds is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsEqualTo(String value) {
            addCriterion("financing_rounds =", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsNotEqualTo(String value) {
            addCriterion("financing_rounds <>", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsGreaterThan(String value) {
            addCriterion("financing_rounds >", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsGreaterThanOrEqualTo(String value) {
            addCriterion("financing_rounds >=", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsLessThan(String value) {
            addCriterion("financing_rounds <", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsLessThanOrEqualTo(String value) {
            addCriterion("financing_rounds <=", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsLike(String value) {
            addCriterion("financing_rounds like", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsNotLike(String value) {
            addCriterion("financing_rounds not like", value, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsIn(List<String> values) {
            addCriterion("financing_rounds in", values, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsNotIn(List<String> values) {
            addCriterion("financing_rounds not in", values, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsBetween(String value1, String value2) {
            addCriterion("financing_rounds between", value1, value2, "financingRounds");
            return (Criteria) this;
        }

        public Criteria andFinancingRoundsNotBetween(String value1, String value2) {
            addCriterion("financing_rounds not between", value1, value2, "financingRounds");
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

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
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

        public Criteria andAmountOfFinancingIsNull() {
            addCriterion("amount_of_financing is null");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingIsNotNull() {
            addCriterion("amount_of_financing is not null");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingEqualTo(String value) {
            addCriterion("amount_of_financing =", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingNotEqualTo(String value) {
            addCriterion("amount_of_financing <>", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingGreaterThan(String value) {
            addCriterion("amount_of_financing >", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingGreaterThanOrEqualTo(String value) {
            addCriterion("amount_of_financing >=", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingLessThan(String value) {
            addCriterion("amount_of_financing <", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingLessThanOrEqualTo(String value) {
            addCriterion("amount_of_financing <=", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingLike(String value) {
            addCriterion("amount_of_financing like", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingNotLike(String value) {
            addCriterion("amount_of_financing not like", value, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingIn(List<String> values) {
            addCriterion("amount_of_financing in", values, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingNotIn(List<String> values) {
            addCriterion("amount_of_financing not in", values, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingBetween(String value1, String value2) {
            addCriterion("amount_of_financing between", value1, value2, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andAmountOfFinancingNotBetween(String value1, String value2) {
            addCriterion("amount_of_financing not between", value1, value2, "amountOfFinancing");
            return (Criteria) this;
        }

        public Criteria andFinancingStateIsNull() {
            addCriterion("financing_state is null");
            return (Criteria) this;
        }

        public Criteria andFinancingStateIsNotNull() {
            addCriterion("financing_state is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingStateEqualTo(String value) {
            addCriterion("financing_state =", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateNotEqualTo(String value) {
            addCriterion("financing_state <>", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateGreaterThan(String value) {
            addCriterion("financing_state >", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateGreaterThanOrEqualTo(String value) {
            addCriterion("financing_state >=", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateLessThan(String value) {
            addCriterion("financing_state <", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateLessThanOrEqualTo(String value) {
            addCriterion("financing_state <=", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateLike(String value) {
            addCriterion("financing_state like", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateNotLike(String value) {
            addCriterion("financing_state not like", value, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateIn(List<String> values) {
            addCriterion("financing_state in", values, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateNotIn(List<String> values) {
            addCriterion("financing_state not in", values, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateBetween(String value1, String value2) {
            addCriterion("financing_state between", value1, value2, "financingState");
            return (Criteria) this;
        }

        public Criteria andFinancingStateNotBetween(String value1, String value2) {
            addCriterion("financing_state not between", value1, value2, "financingState");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlIsNull() {
            addCriterion("business_plan_url is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlIsNotNull() {
            addCriterion("business_plan_url is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlEqualTo(String value) {
            addCriterion("business_plan_url =", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlNotEqualTo(String value) {
            addCriterion("business_plan_url <>", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlGreaterThan(String value) {
            addCriterion("business_plan_url >", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlGreaterThanOrEqualTo(String value) {
            addCriterion("business_plan_url >=", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlLessThan(String value) {
            addCriterion("business_plan_url <", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlLessThanOrEqualTo(String value) {
            addCriterion("business_plan_url <=", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlLike(String value) {
            addCriterion("business_plan_url like", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlNotLike(String value) {
            addCriterion("business_plan_url not like", value, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlIn(List<String> values) {
            addCriterion("business_plan_url in", values, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlNotIn(List<String> values) {
            addCriterion("business_plan_url not in", values, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlBetween(String value1, String value2) {
            addCriterion("business_plan_url between", value1, value2, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andBusinessPlanUrlNotBetween(String value1, String value2) {
            addCriterion("business_plan_url not between", value1, value2, "businessPlanUrl");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(String value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(String value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(String value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(String value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(String value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(String value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLike(String value) {
            addCriterion("is_open like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotLike(String value) {
            addCriterion("is_open not like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<String> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<String> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(String value1, String value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(String value1, String value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeIsNull() {
            addCriterion("company_set_up_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeIsNotNull() {
            addCriterion("company_set_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeEqualTo(Date value) {
            addCriterion("company_set_up_time =", value, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeNotEqualTo(Date value) {
            addCriterion("company_set_up_time <>", value, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeGreaterThan(Date value) {
            addCriterion("company_set_up_time >", value, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_set_up_time >=", value, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeLessThan(Date value) {
            addCriterion("company_set_up_time <", value, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_set_up_time <=", value, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeIn(List<Date> values) {
            addCriterion("company_set_up_time in", values, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeNotIn(List<Date> values) {
            addCriterion("company_set_up_time not in", values, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeBetween(Date value1, Date value2) {
            addCriterion("company_set_up_time between", value1, value2, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andCompanySetUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_set_up_time not between", value1, value2, "companySetUpTime");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyIsNull() {
            addCriterion("develop_journey is null");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyIsNotNull() {
            addCriterion("develop_journey is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyEqualTo(String value) {
            addCriterion("develop_journey =", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyNotEqualTo(String value) {
            addCriterion("develop_journey <>", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyGreaterThan(String value) {
            addCriterion("develop_journey >", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyGreaterThanOrEqualTo(String value) {
            addCriterion("develop_journey >=", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyLessThan(String value) {
            addCriterion("develop_journey <", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyLessThanOrEqualTo(String value) {
            addCriterion("develop_journey <=", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyLike(String value) {
            addCriterion("develop_journey like", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyNotLike(String value) {
            addCriterion("develop_journey not like", value, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyIn(List<String> values) {
            addCriterion("develop_journey in", values, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyNotIn(List<String> values) {
            addCriterion("develop_journey not in", values, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyBetween(String value1, String value2) {
            addCriterion("develop_journey between", value1, value2, "developJourney");
            return (Criteria) this;
        }

        public Criteria andDevelopJourneyNotBetween(String value1, String value2) {
            addCriterion("develop_journey not between", value1, value2, "developJourney");
            return (Criteria) this;
        }

        public Criteria andProductsUrlIsNull() {
            addCriterion("products_url is null");
            return (Criteria) this;
        }

        public Criteria andProductsUrlIsNotNull() {
            addCriterion("products_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductsUrlEqualTo(String value) {
            addCriterion("products_url =", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlNotEqualTo(String value) {
            addCriterion("products_url <>", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlGreaterThan(String value) {
            addCriterion("products_url >", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("products_url >=", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlLessThan(String value) {
            addCriterion("products_url <", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlLessThanOrEqualTo(String value) {
            addCriterion("products_url <=", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlLike(String value) {
            addCriterion("products_url like", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlNotLike(String value) {
            addCriterion("products_url not like", value, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlIn(List<String> values) {
            addCriterion("products_url in", values, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlNotIn(List<String> values) {
            addCriterion("products_url not in", values, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlBetween(String value1, String value2) {
            addCriterion("products_url between", value1, value2, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andProductsUrlNotBetween(String value1, String value2) {
            addCriterion("products_url not between", value1, value2, "productsUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
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