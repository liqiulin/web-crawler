package com.thzj.webcrawler.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class RbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RbUserExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordIsNull() {
            addCriterion("user_paypassword is null");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordIsNotNull() {
            addCriterion("user_paypassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordEqualTo(String value) {
            addCriterion("user_paypassword =", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotEqualTo(String value) {
            addCriterion("user_paypassword <>", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordGreaterThan(String value) {
            addCriterion("user_paypassword >", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_paypassword >=", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordLessThan(String value) {
            addCriterion("user_paypassword <", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("user_paypassword <=", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordLike(String value) {
            addCriterion("user_paypassword like", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotLike(String value) {
            addCriterion("user_paypassword not like", value, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordIn(List<String> values) {
            addCriterion("user_paypassword in", values, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotIn(List<String> values) {
            addCriterion("user_paypassword not in", values, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordBetween(String value1, String value2) {
            addCriterion("user_paypassword between", value1, value2, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserPaypasswordNotBetween(String value1, String value2) {
            addCriterion("user_paypassword not between", value1, value2, "userPaypassword");
            return (Criteria) this;
        }

        public Criteria andUserVouchIsNull() {
            addCriterion("user_vouch is null");
            return (Criteria) this;
        }

        public Criteria andUserVouchIsNotNull() {
            addCriterion("user_vouch is not null");
            return (Criteria) this;
        }

        public Criteria andUserVouchEqualTo(Integer value) {
            addCriterion("user_vouch =", value, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchNotEqualTo(Integer value) {
            addCriterion("user_vouch <>", value, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchGreaterThan(Integer value) {
            addCriterion("user_vouch >", value, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_vouch >=", value, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchLessThan(Integer value) {
            addCriterion("user_vouch <", value, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchLessThanOrEqualTo(Integer value) {
            addCriterion("user_vouch <=", value, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchIn(List<Integer> values) {
            addCriterion("user_vouch in", values, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchNotIn(List<Integer> values) {
            addCriterion("user_vouch not in", values, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchBetween(Integer value1, Integer value2) {
            addCriterion("user_vouch between", value1, value2, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserVouchNotBetween(Integer value1, Integer value2) {
            addCriterion("user_vouch not between", value1, value2, "userVouch");
            return (Criteria) this;
        }

        public Criteria andUserIslockIsNull() {
            addCriterion("user_islock is null");
            return (Criteria) this;
        }

        public Criteria andUserIslockIsNotNull() {
            addCriterion("user_islock is not null");
            return (Criteria) this;
        }

        public Criteria andUserIslockEqualTo(Integer value) {
            addCriterion("user_islock =", value, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockNotEqualTo(Integer value) {
            addCriterion("user_islock <>", value, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockGreaterThan(Integer value) {
            addCriterion("user_islock >", value, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_islock >=", value, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockLessThan(Integer value) {
            addCriterion("user_islock <", value, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockLessThanOrEqualTo(Integer value) {
            addCriterion("user_islock <=", value, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockIn(List<Integer> values) {
            addCriterion("user_islock in", values, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockNotIn(List<Integer> values) {
            addCriterion("user_islock not in", values, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockBetween(Integer value1, Integer value2) {
            addCriterion("user_islock between", value1, value2, "userIslock");
            return (Criteria) this;
        }

        public Criteria andUserIslockNotBetween(Integer value1, Integer value2) {
            addCriterion("user_islock not between", value1, value2, "userIslock");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNull() {
            addCriterion("invite_userid is null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNotNull() {
            addCriterion("invite_userid is not null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridEqualTo(Integer value) {
            addCriterion("invite_userid =", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotEqualTo(Integer value) {
            addCriterion("invite_userid <>", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThan(Integer value) {
            addCriterion("invite_userid >", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_userid >=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThan(Integer value) {
            addCriterion("invite_userid <", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThanOrEqualTo(Integer value) {
            addCriterion("invite_userid <=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIn(List<Integer> values) {
            addCriterion("invite_userid in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotIn(List<Integer> values) {
            addCriterion("invite_userid not in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid not between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIsNull() {
            addCriterion("invite_money is null");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIsNotNull() {
            addCriterion("invite_money is not null");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyEqualTo(String value) {
            addCriterion("invite_money =", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotEqualTo(String value) {
            addCriterion("invite_money <>", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyGreaterThan(String value) {
            addCriterion("invite_money >", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("invite_money >=", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLessThan(String value) {
            addCriterion("invite_money <", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLessThanOrEqualTo(String value) {
            addCriterion("invite_money <=", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLike(String value) {
            addCriterion("invite_money like", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotLike(String value) {
            addCriterion("invite_money not like", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIn(List<String> values) {
            addCriterion("invite_money in", values, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotIn(List<String> values) {
            addCriterion("invite_money not in", values, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyBetween(String value1, String value2) {
            addCriterion("invite_money between", value1, value2, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotBetween(String value1, String value2) {
            addCriterion("invite_money not between", value1, value2, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("card_number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("card_number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgIsNull() {
            addCriterion("card_front_img is null");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgIsNotNull() {
            addCriterion("card_front_img is not null");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgEqualTo(String value) {
            addCriterion("card_front_img =", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgNotEqualTo(String value) {
            addCriterion("card_front_img <>", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgGreaterThan(String value) {
            addCriterion("card_front_img >", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgGreaterThanOrEqualTo(String value) {
            addCriterion("card_front_img >=", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgLessThan(String value) {
            addCriterion("card_front_img <", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgLessThanOrEqualTo(String value) {
            addCriterion("card_front_img <=", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgLike(String value) {
            addCriterion("card_front_img like", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgNotLike(String value) {
            addCriterion("card_front_img not like", value, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgIn(List<String> values) {
            addCriterion("card_front_img in", values, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgNotIn(List<String> values) {
            addCriterion("card_front_img not in", values, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgBetween(String value1, String value2) {
            addCriterion("card_front_img between", value1, value2, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardFrontImgNotBetween(String value1, String value2) {
            addCriterion("card_front_img not between", value1, value2, "cardFrontImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgIsNull() {
            addCriterion("card_back_img is null");
            return (Criteria) this;
        }

        public Criteria andCardBackImgIsNotNull() {
            addCriterion("card_back_img is not null");
            return (Criteria) this;
        }

        public Criteria andCardBackImgEqualTo(String value) {
            addCriterion("card_back_img =", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotEqualTo(String value) {
            addCriterion("card_back_img <>", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgGreaterThan(String value) {
            addCriterion("card_back_img >", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgGreaterThanOrEqualTo(String value) {
            addCriterion("card_back_img >=", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgLessThan(String value) {
            addCriterion("card_back_img <", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgLessThanOrEqualTo(String value) {
            addCriterion("card_back_img <=", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgLike(String value) {
            addCriterion("card_back_img like", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotLike(String value) {
            addCriterion("card_back_img not like", value, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgIn(List<String> values) {
            addCriterion("card_back_img in", values, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotIn(List<String> values) {
            addCriterion("card_back_img not in", values, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgBetween(String value1, String value2) {
            addCriterion("card_back_img between", value1, value2, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andCardBackImgNotBetween(String value1, String value2) {
            addCriterion("card_back_img not between", value1, value2, "cardBackImg");
            return (Criteria) this;
        }

        public Criteria andUserNationIsNull() {
            addCriterion("user_nation is null");
            return (Criteria) this;
        }

        public Criteria andUserNationIsNotNull() {
            addCriterion("user_nation is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationEqualTo(String value) {
            addCriterion("user_nation =", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotEqualTo(String value) {
            addCriterion("user_nation <>", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationGreaterThan(String value) {
            addCriterion("user_nation >", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationGreaterThanOrEqualTo(String value) {
            addCriterion("user_nation >=", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLessThan(String value) {
            addCriterion("user_nation <", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLessThanOrEqualTo(String value) {
            addCriterion("user_nation <=", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationLike(String value) {
            addCriterion("user_nation like", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotLike(String value) {
            addCriterion("user_nation not like", value, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationIn(List<String> values) {
            addCriterion("user_nation in", values, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotIn(List<String> values) {
            addCriterion("user_nation not in", values, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationBetween(String value1, String value2) {
            addCriterion("user_nation between", value1, value2, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserNationNotBetween(String value1, String value2) {
            addCriterion("user_nation not between", value1, value2, "userNation");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNull() {
            addCriterion("user_realname is null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIsNotNull() {
            addCriterion("user_realname is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealnameEqualTo(String value) {
            addCriterion("user_realname =", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotEqualTo(String value) {
            addCriterion("user_realname <>", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThan(String value) {
            addCriterion("user_realname >", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_realname >=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThan(String value) {
            addCriterion("user_realname <", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLessThanOrEqualTo(String value) {
            addCriterion("user_realname <=", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameLike(String value) {
            addCriterion("user_realname like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotLike(String value) {
            addCriterion("user_realname not like", value, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameIn(List<String> values) {
            addCriterion("user_realname in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotIn(List<String> values) {
            addCriterion("user_realname not in", values, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameBetween(String value1, String value2) {
            addCriterion("user_realname between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserRealnameNotBetween(String value1, String value2) {
            addCriterion("user_realname not between", value1, value2, "userRealname");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNull() {
            addCriterion("user_integral is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNotNull() {
            addCriterion("user_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralEqualTo(String value) {
            addCriterion("user_integral =", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotEqualTo(String value) {
            addCriterion("user_integral <>", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThan(String value) {
            addCriterion("user_integral >", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThanOrEqualTo(String value) {
            addCriterion("user_integral >=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThan(String value) {
            addCriterion("user_integral <", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThanOrEqualTo(String value) {
            addCriterion("user_integral <=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLike(String value) {
            addCriterion("user_integral like", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotLike(String value) {
            addCriterion("user_integral not like", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIn(List<String> values) {
            addCriterion("user_integral in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotIn(List<String> values) {
            addCriterion("user_integral not in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralBetween(String value1, String value2) {
            addCriterion("user_integral between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotBetween(String value1, String value2) {
            addCriterion("user_integral not between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusIsNull() {
            addCriterion("avatar_status is null");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusIsNotNull() {
            addCriterion("avatar_status is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusEqualTo(Integer value) {
            addCriterion("avatar_status =", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusNotEqualTo(Integer value) {
            addCriterion("avatar_status <>", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusGreaterThan(Integer value) {
            addCriterion("avatar_status >", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("avatar_status >=", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusLessThan(Integer value) {
            addCriterion("avatar_status <", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusLessThanOrEqualTo(Integer value) {
            addCriterion("avatar_status <=", value, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusIn(List<Integer> values) {
            addCriterion("avatar_status in", values, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusNotIn(List<Integer> values) {
            addCriterion("avatar_status not in", values, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusBetween(Integer value1, Integer value2) {
            addCriterion("avatar_status between", value1, value2, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andAvatarStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("avatar_status not between", value1, value2, "avatarStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusIsNull() {
            addCriterion("realname_status is null");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusIsNotNull() {
            addCriterion("realname_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusEqualTo(Integer value) {
            addCriterion("realname_status =", value, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusNotEqualTo(Integer value) {
            addCriterion("realname_status <>", value, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusGreaterThan(Integer value) {
            addCriterion("realname_status >", value, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("realname_status >=", value, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusLessThan(Integer value) {
            addCriterion("realname_status <", value, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusLessThanOrEqualTo(Integer value) {
            addCriterion("realname_status <=", value, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusIn(List<Integer> values) {
            addCriterion("realname_status in", values, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusNotIn(List<Integer> values) {
            addCriterion("realname_status not in", values, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusBetween(Integer value1, Integer value2) {
            addCriterion("realname_status between", value1, value2, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andRealnameStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("realname_status not between", value1, value2, "realnameStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNull() {
            addCriterion("email_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNotNull() {
            addCriterion("email_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusEqualTo(Integer value) {
            addCriterion("email_status =", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotEqualTo(Integer value) {
            addCriterion("email_status <>", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThan(Integer value) {
            addCriterion("email_status >", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_status >=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThan(Integer value) {
            addCriterion("email_status <", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("email_status <=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIn(List<Integer> values) {
            addCriterion("email_status in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotIn(List<Integer> values) {
            addCriterion("email_status not in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusBetween(Integer value1, Integer value2) {
            addCriterion("email_status between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("email_status not between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIsNull() {
            addCriterion("phone_status is null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIsNotNull() {
            addCriterion("phone_status is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusEqualTo(Integer value) {
            addCriterion("phone_status =", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotEqualTo(Integer value) {
            addCriterion("phone_status <>", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThan(Integer value) {
            addCriterion("phone_status >", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_status >=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThan(Integer value) {
            addCriterion("phone_status <", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThanOrEqualTo(Integer value) {
            addCriterion("phone_status <=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIn(List<Integer> values) {
            addCriterion("phone_status in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotIn(List<Integer> values) {
            addCriterion("phone_status not in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusBetween(Integer value1, Integer value2) {
            addCriterion("phone_status between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_status not between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNull() {
            addCriterion("video_status is null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIsNotNull() {
            addCriterion("video_status is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStatusEqualTo(Integer value) {
            addCriterion("video_status =", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotEqualTo(Integer value) {
            addCriterion("video_status <>", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThan(Integer value) {
            addCriterion("video_status >", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_status >=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThan(Integer value) {
            addCriterion("video_status <", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("video_status <=", value, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusIn(List<Integer> values) {
            addCriterion("video_status in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotIn(List<Integer> values) {
            addCriterion("video_status not in", values, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusBetween(Integer value1, Integer value2) {
            addCriterion("video_status between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andVideoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("video_status not between", value1, value2, "videoStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNull() {
            addCriterion("scene_status is null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNotNull() {
            addCriterion("scene_status is not null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusEqualTo(Integer value) {
            addCriterion("scene_status =", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotEqualTo(Integer value) {
            addCriterion("scene_status <>", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThan(Integer value) {
            addCriterion("scene_status >", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_status >=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThan(Integer value) {
            addCriterion("scene_status <", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThanOrEqualTo(Integer value) {
            addCriterion("scene_status <=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIn(List<Integer> values) {
            addCriterion("scene_status in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotIn(List<Integer> values) {
            addCriterion("scene_status not in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusBetween(Integer value1, Integer value2) {
            addCriterion("scene_status between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_status not between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andAvatarImgIsNull() {
            addCriterion("avatar_img is null");
            return (Criteria) this;
        }

        public Criteria andAvatarImgIsNotNull() {
            addCriterion("avatar_img is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarImgEqualTo(String value) {
            addCriterion("avatar_img =", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgNotEqualTo(String value) {
            addCriterion("avatar_img <>", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgGreaterThan(String value) {
            addCriterion("avatar_img >", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_img >=", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgLessThan(String value) {
            addCriterion("avatar_img <", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgLessThanOrEqualTo(String value) {
            addCriterion("avatar_img <=", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgLike(String value) {
            addCriterion("avatar_img like", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgNotLike(String value) {
            addCriterion("avatar_img not like", value, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgIn(List<String> values) {
            addCriterion("avatar_img in", values, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgNotIn(List<String> values) {
            addCriterion("avatar_img not in", values, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgBetween(String value1, String value2) {
            addCriterion("avatar_img between", value1, value2, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andAvatarImgNotBetween(String value1, String value2) {
            addCriterion("avatar_img not between", value1, value2, "avatarImg");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("user_tel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("user_tel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("user_tel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("user_tel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("user_tel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("user_tel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("user_tel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("user_tel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("user_tel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("user_tel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("user_tel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("user_tel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("user_tel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNull() {
            addCriterion("user_qq is null");
            return (Criteria) this;
        }

        public Criteria andUserQqIsNotNull() {
            addCriterion("user_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqEqualTo(String value) {
            addCriterion("user_qq =", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotEqualTo(String value) {
            addCriterion("user_qq <>", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThan(String value) {
            addCriterion("user_qq >", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqGreaterThanOrEqualTo(String value) {
            addCriterion("user_qq >=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThan(String value) {
            addCriterion("user_qq <", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLessThanOrEqualTo(String value) {
            addCriterion("user_qq <=", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqLike(String value) {
            addCriterion("user_qq like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotLike(String value) {
            addCriterion("user_qq not like", value, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqIn(List<String> values) {
            addCriterion("user_qq in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotIn(List<String> values) {
            addCriterion("user_qq not in", values, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqBetween(String value1, String value2) {
            addCriterion("user_qq between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQqNotBetween(String value1, String value2) {
            addCriterion("user_qq not between", value1, value2, "userQq");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIsNull() {
            addCriterion("user_question is null");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIsNotNull() {
            addCriterion("user_question is not null");
            return (Criteria) this;
        }

        public Criteria andUserQuestionEqualTo(String value) {
            addCriterion("user_question =", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotEqualTo(String value) {
            addCriterion("user_question <>", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionGreaterThan(String value) {
            addCriterion("user_question >", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("user_question >=", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLessThan(String value) {
            addCriterion("user_question <", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLessThanOrEqualTo(String value) {
            addCriterion("user_question <=", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLike(String value) {
            addCriterion("user_question like", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotLike(String value) {
            addCriterion("user_question not like", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIn(List<String> values) {
            addCriterion("user_question in", values, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotIn(List<String> values) {
            addCriterion("user_question not in", values, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionBetween(String value1, String value2) {
            addCriterion("user_question between", value1, value2, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotBetween(String value1, String value2) {
            addCriterion("user_question not between", value1, value2, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIsNull() {
            addCriterion("user_answer is null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIsNotNull() {
            addCriterion("user_answer is not null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerEqualTo(String value) {
            addCriterion("user_answer =", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotEqualTo(String value) {
            addCriterion("user_answer <>", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerGreaterThan(String value) {
            addCriterion("user_answer >", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("user_answer >=", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLessThan(String value) {
            addCriterion("user_answer <", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLessThanOrEqualTo(String value) {
            addCriterion("user_answer <=", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLike(String value) {
            addCriterion("user_answer like", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotLike(String value) {
            addCriterion("user_answer not like", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIn(List<String> values) {
            addCriterion("user_answer in", values, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotIn(List<String> values) {
            addCriterion("user_answer not in", values, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerBetween(String value1, String value2) {
            addCriterion("user_answer between", value1, value2, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotBetween(String value1, String value2) {
            addCriterion("user_answer not between", value1, value2, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNull() {
            addCriterion("user_province is null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNotNull() {
            addCriterion("user_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceEqualTo(String value) {
            addCriterion("user_province =", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotEqualTo(String value) {
            addCriterion("user_province <>", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThan(String value) {
            addCriterion("user_province >", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_province >=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThan(String value) {
            addCriterion("user_province <", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_province <=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLike(String value) {
            addCriterion("user_province like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotLike(String value) {
            addCriterion("user_province not like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIn(List<String> values) {
            addCriterion("user_province in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotIn(List<String> values) {
            addCriterion("user_province not in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceBetween(String value1, String value2) {
            addCriterion("user_province between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotBetween(String value1, String value2) {
            addCriterion("user_province not between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNull() {
            addCriterion("user_area is null");
            return (Criteria) this;
        }

        public Criteria andUserAreaIsNotNull() {
            addCriterion("user_area is not null");
            return (Criteria) this;
        }

        public Criteria andUserAreaEqualTo(String value) {
            addCriterion("user_area =", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotEqualTo(String value) {
            addCriterion("user_area <>", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThan(String value) {
            addCriterion("user_area >", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaGreaterThanOrEqualTo(String value) {
            addCriterion("user_area >=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThan(String value) {
            addCriterion("user_area <", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLessThanOrEqualTo(String value) {
            addCriterion("user_area <=", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaLike(String value) {
            addCriterion("user_area like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotLike(String value) {
            addCriterion("user_area not like", value, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaIn(List<String> values) {
            addCriterion("user_area in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotIn(List<String> values) {
            addCriterion("user_area not in", values, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaBetween(String value1, String value2) {
            addCriterion("user_area between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAreaNotBetween(String value1, String value2) {
            addCriterion("user_area not between", value1, value2, "userArea");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeIsNull() {
            addCriterion("user_addtime is null");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeIsNotNull() {
            addCriterion("user_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeEqualTo(Date value) {
            addCriterion("user_addtime =", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeNotEqualTo(Date value) {
            addCriterion("user_addtime <>", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeGreaterThan(Date value) {
            addCriterion("user_addtime >", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_addtime >=", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeLessThan(Date value) {
            addCriterion("user_addtime <", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("user_addtime <=", value, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeIn(List<Date> values) {
            addCriterion("user_addtime in", values, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeNotIn(List<Date> values) {
            addCriterion("user_addtime not in", values, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeBetween(Date value1, Date value2) {
            addCriterion("user_addtime between", value1, value2, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("user_addtime not between", value1, value2, "userAddtime");
            return (Criteria) this;
        }

        public Criteria andUserAddipIsNull() {
            addCriterion("user_addip is null");
            return (Criteria) this;
        }

        public Criteria andUserAddipIsNotNull() {
            addCriterion("user_addip is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddipEqualTo(String value) {
            addCriterion("user_addip =", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipNotEqualTo(String value) {
            addCriterion("user_addip <>", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipGreaterThan(String value) {
            addCriterion("user_addip >", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipGreaterThanOrEqualTo(String value) {
            addCriterion("user_addip >=", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipLessThan(String value) {
            addCriterion("user_addip <", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipLessThanOrEqualTo(String value) {
            addCriterion("user_addip <=", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipLike(String value) {
            addCriterion("user_addip like", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipNotLike(String value) {
            addCriterion("user_addip not like", value, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipIn(List<String> values) {
            addCriterion("user_addip in", values, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipNotIn(List<String> values) {
            addCriterion("user_addip not in", values, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipBetween(String value1, String value2) {
            addCriterion("user_addip between", value1, value2, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserAddipNotBetween(String value1, String value2) {
            addCriterion("user_addip not between", value1, value2, "userAddip");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeIsNull() {
            addCriterion("user_logintime is null");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeIsNotNull() {
            addCriterion("user_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeEqualTo(Date value) {
            addCriterion("user_logintime =", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeNotEqualTo(Date value) {
            addCriterion("user_logintime <>", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeGreaterThan(Date value) {
            addCriterion("user_logintime >", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_logintime >=", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeLessThan(Date value) {
            addCriterion("user_logintime <", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("user_logintime <=", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeIn(List<Date> values) {
            addCriterion("user_logintime in", values, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeNotIn(List<Date> values) {
            addCriterion("user_logintime not in", values, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeBetween(Date value1, Date value2) {
            addCriterion("user_logintime between", value1, value2, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("user_logintime not between", value1, value2, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLoginipIsNull() {
            addCriterion("user_loginip is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginipIsNotNull() {
            addCriterion("user_loginip is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginipEqualTo(String value) {
            addCriterion("user_loginip =", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotEqualTo(String value) {
            addCriterion("user_loginip <>", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipGreaterThan(String value) {
            addCriterion("user_loginip >", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginip >=", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipLessThan(String value) {
            addCriterion("user_loginip <", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipLessThanOrEqualTo(String value) {
            addCriterion("user_loginip <=", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipLike(String value) {
            addCriterion("user_loginip like", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotLike(String value) {
            addCriterion("user_loginip not like", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipIn(List<String> values) {
            addCriterion("user_loginip in", values, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotIn(List<String> values) {
            addCriterion("user_loginip not in", values, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipBetween(String value1, String value2) {
            addCriterion("user_loginip between", value1, value2, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotBetween(String value1, String value2) {
            addCriterion("user_loginip not between", value1, value2, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andIsSystemIsNull() {
            addCriterion("is_system is null");
            return (Criteria) this;
        }

        public Criteria andIsSystemIsNotNull() {
            addCriterion("is_system is not null");
            return (Criteria) this;
        }

        public Criteria andIsSystemEqualTo(Integer value) {
            addCriterion("is_system =", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemNotEqualTo(Integer value) {
            addCriterion("is_system <>", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemGreaterThan(Integer value) {
            addCriterion("is_system >", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_system >=", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemLessThan(Integer value) {
            addCriterion("is_system <", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemLessThanOrEqualTo(Integer value) {
            addCriterion("is_system <=", value, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemIn(List<Integer> values) {
            addCriterion("is_system in", values, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemNotIn(List<Integer> values) {
            addCriterion("is_system not in", values, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemBetween(Integer value1, Integer value2) {
            addCriterion("is_system between", value1, value2, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsSystemNotBetween(Integer value1, Integer value2) {
            addCriterion("is_system not between", value1, value2, "isSystem");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyIsNull() {
            addCriterion("isThirdparty is null");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyIsNotNull() {
            addCriterion("isThirdparty is not null");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyEqualTo(Integer value) {
            addCriterion("isThirdparty =", value, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyNotEqualTo(Integer value) {
            addCriterion("isThirdparty <>", value, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyGreaterThan(Integer value) {
            addCriterion("isThirdparty >", value, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyGreaterThanOrEqualTo(Integer value) {
            addCriterion("isThirdparty >=", value, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyLessThan(Integer value) {
            addCriterion("isThirdparty <", value, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyLessThanOrEqualTo(Integer value) {
            addCriterion("isThirdparty <=", value, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyIn(List<Integer> values) {
            addCriterion("isThirdparty in", values, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyNotIn(List<Integer> values) {
            addCriterion("isThirdparty not in", values, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyBetween(Integer value1, Integer value2) {
            addCriterion("isThirdparty between", value1, value2, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andIsthirdpartyNotBetween(Integer value1, Integer value2) {
            addCriterion("isThirdparty not between", value1, value2, "isthirdparty");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNull() {
            addCriterion("invitation_code is null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIsNotNull() {
            addCriterion("invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeEqualTo(String value) {
            addCriterion("invitation_code =", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotEqualTo(String value) {
            addCriterion("invitation_code <>", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThan(String value) {
            addCriterion("invitation_code >", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitation_code >=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThan(String value) {
            addCriterion("invitation_code <", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("invitation_code <=", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeLike(String value) {
            addCriterion("invitation_code like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotLike(String value) {
            addCriterion("invitation_code not like", value, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeIn(List<String> values) {
            addCriterion("invitation_code in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotIn(List<String> values) {
            addCriterion("invitation_code not in", values, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeBetween(String value1, String value2) {
            addCriterion("invitation_code between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("invitation_code not between", value1, value2, "invitationCode");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusIsNull() {
            addCriterion("yb_register_status is null");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusIsNotNull() {
            addCriterion("yb_register_status is not null");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusEqualTo(Integer value) {
            addCriterion("yb_register_status =", value, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusNotEqualTo(Integer value) {
            addCriterion("yb_register_status <>", value, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusGreaterThan(Integer value) {
            addCriterion("yb_register_status >", value, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("yb_register_status >=", value, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusLessThan(Integer value) {
            addCriterion("yb_register_status <", value, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusLessThanOrEqualTo(Integer value) {
            addCriterion("yb_register_status <=", value, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusIn(List<Integer> values) {
            addCriterion("yb_register_status in", values, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusNotIn(List<Integer> values) {
            addCriterion("yb_register_status not in", values, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusBetween(Integer value1, Integer value2) {
            addCriterion("yb_register_status between", value1, value2, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("yb_register_status not between", value1, value2, "ybRegisterStatus");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeIsNull() {
            addCriterion("yb_register_time is null");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeIsNotNull() {
            addCriterion("yb_register_time is not null");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeEqualTo(Date value) {
            addCriterion("yb_register_time =", value, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeNotEqualTo(Date value) {
            addCriterion("yb_register_time <>", value, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeGreaterThan(Date value) {
            addCriterion("yb_register_time >", value, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("yb_register_time >=", value, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeLessThan(Date value) {
            addCriterion("yb_register_time <", value, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("yb_register_time <=", value, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeIn(List<Date> values) {
            addCriterion("yb_register_time in", values, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeNotIn(List<Date> values) {
            addCriterion("yb_register_time not in", values, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("yb_register_time between", value1, value2, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andYbRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("yb_register_time not between", value1, value2, "ybRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountIsNull() {
            addCriterion("partner_account is null");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountIsNotNull() {
            addCriterion("partner_account is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountEqualTo(Integer value) {
            addCriterion("partner_account =", value, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountNotEqualTo(Integer value) {
            addCriterion("partner_account <>", value, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountGreaterThan(Integer value) {
            addCriterion("partner_account >", value, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("partner_account >=", value, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountLessThan(Integer value) {
            addCriterion("partner_account <", value, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountLessThanOrEqualTo(Integer value) {
            addCriterion("partner_account <=", value, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountIn(List<Integer> values) {
            addCriterion("partner_account in", values, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountNotIn(List<Integer> values) {
            addCriterion("partner_account not in", values, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountBetween(Integer value1, Integer value2) {
            addCriterion("partner_account between", value1, value2, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andPartnerAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("partner_account not between", value1, value2, "partnerAccount");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagIsNull() {
            addCriterion("autoRed_flag is null");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagIsNotNull() {
            addCriterion("autoRed_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagEqualTo(Integer value) {
            addCriterion("autoRed_flag =", value, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagNotEqualTo(Integer value) {
            addCriterion("autoRed_flag <>", value, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagGreaterThan(Integer value) {
            addCriterion("autoRed_flag >", value, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("autoRed_flag >=", value, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagLessThan(Integer value) {
            addCriterion("autoRed_flag <", value, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagLessThanOrEqualTo(Integer value) {
            addCriterion("autoRed_flag <=", value, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagIn(List<Integer> values) {
            addCriterion("autoRed_flag in", values, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagNotIn(List<Integer> values) {
            addCriterion("autoRed_flag not in", values, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagBetween(Integer value1, Integer value2) {
            addCriterion("autoRed_flag between", value1, value2, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andAutoredFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("autoRed_flag not between", value1, value2, "autoredFlag");
            return (Criteria) this;
        }

        public Criteria andDepositUseridIsNull() {
            addCriterion("deposit_userid is null");
            return (Criteria) this;
        }

        public Criteria andDepositUseridIsNotNull() {
            addCriterion("deposit_userid is not null");
            return (Criteria) this;
        }

        public Criteria andDepositUseridEqualTo(String value) {
            addCriterion("deposit_userid =", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridNotEqualTo(String value) {
            addCriterion("deposit_userid <>", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridGreaterThan(String value) {
            addCriterion("deposit_userid >", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_userid >=", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridLessThan(String value) {
            addCriterion("deposit_userid <", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridLessThanOrEqualTo(String value) {
            addCriterion("deposit_userid <=", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridLike(String value) {
            addCriterion("deposit_userid like", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridNotLike(String value) {
            addCriterion("deposit_userid not like", value, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridIn(List<String> values) {
            addCriterion("deposit_userid in", values, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridNotIn(List<String> values) {
            addCriterion("deposit_userid not in", values, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridBetween(String value1, String value2) {
            addCriterion("deposit_userid between", value1, value2, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUseridNotBetween(String value1, String value2) {
            addCriterion("deposit_userid not between", value1, value2, "depositUserid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidIsNull() {
            addCriterion("deposit_usrCustId is null");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidIsNotNull() {
            addCriterion("deposit_usrCustId is not null");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidEqualTo(String value) {
            addCriterion("deposit_usrCustId =", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidNotEqualTo(String value) {
            addCriterion("deposit_usrCustId <>", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidGreaterThan(String value) {
            addCriterion("deposit_usrCustId >", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_usrCustId >=", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidLessThan(String value) {
            addCriterion("deposit_usrCustId <", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidLessThanOrEqualTo(String value) {
            addCriterion("deposit_usrCustId <=", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidLike(String value) {
            addCriterion("deposit_usrCustId like", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidNotLike(String value) {
            addCriterion("deposit_usrCustId not like", value, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidIn(List<String> values) {
            addCriterion("deposit_usrCustId in", values, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidNotIn(List<String> values) {
            addCriterion("deposit_usrCustId not in", values, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidBetween(String value1, String value2) {
            addCriterion("deposit_usrCustId between", value1, value2, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andDepositUsrcustidNotBetween(String value1, String value2) {
            addCriterion("deposit_usrCustId not between", value1, value2, "depositUsrcustid");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedIsNull() {
            addCriterion("isOwnerAuthed is null");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedIsNotNull() {
            addCriterion("isOwnerAuthed is not null");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedEqualTo(Integer value) {
            addCriterion("isOwnerAuthed =", value, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedNotEqualTo(Integer value) {
            addCriterion("isOwnerAuthed <>", value, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedGreaterThan(Integer value) {
            addCriterion("isOwnerAuthed >", value, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isOwnerAuthed >=", value, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedLessThan(Integer value) {
            addCriterion("isOwnerAuthed <", value, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedLessThanOrEqualTo(Integer value) {
            addCriterion("isOwnerAuthed <=", value, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedIn(List<Integer> values) {
            addCriterion("isOwnerAuthed in", values, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedNotIn(List<Integer> values) {
            addCriterion("isOwnerAuthed not in", values, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedBetween(Integer value1, Integer value2) {
            addCriterion("isOwnerAuthed between", value1, value2, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andIsownerauthedNotBetween(Integer value1, Integer value2) {
            addCriterion("isOwnerAuthed not between", value1, value2, "isownerauthed");
            return (Criteria) this;
        }

        public Criteria andUserDesIsNull() {
            addCriterion("user_des is null");
            return (Criteria) this;
        }

        public Criteria andUserDesIsNotNull() {
            addCriterion("user_des is not null");
            return (Criteria) this;
        }

        public Criteria andUserDesEqualTo(String value) {
            addCriterion("user_des =", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotEqualTo(String value) {
            addCriterion("user_des <>", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesGreaterThan(String value) {
            addCriterion("user_des >", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesGreaterThanOrEqualTo(String value) {
            addCriterion("user_des >=", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesLessThan(String value) {
            addCriterion("user_des <", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesLessThanOrEqualTo(String value) {
            addCriterion("user_des <=", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesLike(String value) {
            addCriterion("user_des like", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotLike(String value) {
            addCriterion("user_des not like", value, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesIn(List<String> values) {
            addCriterion("user_des in", values, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotIn(List<String> values) {
            addCriterion("user_des not in", values, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesBetween(String value1, String value2) {
            addCriterion("user_des between", value1, value2, "userDes");
            return (Criteria) this;
        }

        public Criteria andUserDesNotBetween(String value1, String value2) {
            addCriterion("user_des not between", value1, value2, "userDes");
            return (Criteria) this;
        }

        public Criteria andCompDesIsNull() {
            addCriterion("comp_des is null");
            return (Criteria) this;
        }

        public Criteria andCompDesIsNotNull() {
            addCriterion("comp_des is not null");
            return (Criteria) this;
        }

        public Criteria andCompDesEqualTo(String value) {
            addCriterion("comp_des =", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesNotEqualTo(String value) {
            addCriterion("comp_des <>", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesGreaterThan(String value) {
            addCriterion("comp_des >", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesGreaterThanOrEqualTo(String value) {
            addCriterion("comp_des >=", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesLessThan(String value) {
            addCriterion("comp_des <", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesLessThanOrEqualTo(String value) {
            addCriterion("comp_des <=", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesLike(String value) {
            addCriterion("comp_des like", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesNotLike(String value) {
            addCriterion("comp_des not like", value, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesIn(List<String> values) {
            addCriterion("comp_des in", values, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesNotIn(List<String> values) {
            addCriterion("comp_des not in", values, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesBetween(String value1, String value2) {
            addCriterion("comp_des between", value1, value2, "compDes");
            return (Criteria) this;
        }

        public Criteria andCompDesNotBetween(String value1, String value2) {
            addCriterion("comp_des not between", value1, value2, "compDes");
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