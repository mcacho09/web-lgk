package com.retailsbs.logistikapp.retail.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public StateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table lgk_state
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andId_stateIsNull() {
            addCriterion("id_state is null");
            return this;
        }

        public Criteria andId_stateIsNotNull() {
            addCriterion("id_state is not null");
            return this;
        }

        public Criteria andId_stateEqualTo(Long value) {
            addCriterion("id_state =", value, "id_state");
            return this;
        }

        public Criteria andId_stateNotEqualTo(Long value) {
            addCriterion("id_state <>", value, "id_state");
            return this;
        }

        public Criteria andId_stateGreaterThan(Long value) {
            addCriterion("id_state >", value, "id_state");
            return this;
        }

        public Criteria andId_stateGreaterThanOrEqualTo(Long value) {
            addCriterion("id_state >=", value, "id_state");
            return this;
        }

        public Criteria andId_stateLessThan(Long value) {
            addCriterion("id_state <", value, "id_state");
            return this;
        }

        public Criteria andId_stateLessThanOrEqualTo(Long value) {
            addCriterion("id_state <=", value, "id_state");
            return this;
        }

        public Criteria andId_stateIn(List<Long> values) {
            addCriterion("id_state in", values, "id_state");
            return this;
        }

        public Criteria andId_stateNotIn(List<Long> values) {
            addCriterion("id_state not in", values, "id_state");
            return this;
        }

        public Criteria andId_stateBetween(Long value1, Long value2) {
            addCriterion("id_state between", value1, value2, "id_state");
            return this;
        }

        public Criteria andId_stateNotBetween(Long value1, Long value2) {
            addCriterion("id_state not between", value1, value2, "id_state");
            return this;
        }

        public Criteria andId_countryIsNull() {
            addCriterion("id_country is null");
            return this;
        }

        public Criteria andId_countryIsNotNull() {
            addCriterion("id_country is not null");
            return this;
        }

        public Criteria andId_countryEqualTo(Long value) {
            addCriterion("id_country =", value, "id_country");
            return this;
        }

        public Criteria andId_countryNotEqualTo(Long value) {
            addCriterion("id_country <>", value, "id_country");
            return this;
        }

        public Criteria andId_countryGreaterThan(Long value) {
            addCriterion("id_country >", value, "id_country");
            return this;
        }

        public Criteria andId_countryGreaterThanOrEqualTo(Long value) {
            addCriterion("id_country >=", value, "id_country");
            return this;
        }

        public Criteria andId_countryLessThan(Long value) {
            addCriterion("id_country <", value, "id_country");
            return this;
        }

        public Criteria andId_countryLessThanOrEqualTo(Long value) {
            addCriterion("id_country <=", value, "id_country");
            return this;
        }

        public Criteria andId_countryIn(List<Long> values) {
            addCriterion("id_country in", values, "id_country");
            return this;
        }

        public Criteria andId_countryNotIn(List<Long> values) {
            addCriterion("id_country not in", values, "id_country");
            return this;
        }

        public Criteria andId_countryBetween(Long value1, Long value2) {
            addCriterion("id_country between", value1, value2, "id_country");
            return this;
        }

        public Criteria andId_countryNotBetween(Long value1, Long value2) {
            addCriterion("id_country not between", value1, value2, "id_country");
            return this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return this;
        }

        public Criteria andLoginIsNull() {
            addCriterion("login is null");
            return this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("login is not null");
            return this;
        }

        public Criteria andLoginEqualTo(String value) {
            addCriterion("login =", value, "login");
            return this;
        }

        public Criteria andLoginNotEqualTo(String value) {
            addCriterion("login <>", value, "login");
            return this;
        }

        public Criteria andLoginGreaterThan(String value) {
            addCriterion("login >", value, "login");
            return this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(String value) {
            addCriterion("login >=", value, "login");
            return this;
        }

        public Criteria andLoginLessThan(String value) {
            addCriterion("login <", value, "login");
            return this;
        }

        public Criteria andLoginLessThanOrEqualTo(String value) {
            addCriterion("login <=", value, "login");
            return this;
        }

        public Criteria andLoginLike(String value) {
            addCriterion("login like", value, "login");
            return this;
        }

        public Criteria andLoginNotLike(String value) {
            addCriterion("login not like", value, "login");
            return this;
        }

        public Criteria andLoginIn(List<String> values) {
            addCriterion("login in", values, "login");
            return this;
        }

        public Criteria andLoginNotIn(List<String> values) {
            addCriterion("login not in", values, "login");
            return this;
        }

        public Criteria andLoginBetween(String value1, String value2) {
            addCriterion("login between", value1, value2, "login");
            return this;
        }

        public Criteria andLoginNotBetween(String value1, String value2) {
            addCriterion("login not between", value1, value2, "login");
            return this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("orderby is null");
            return this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("orderby is not null");
            return this;
        }

        public Criteria andOrderbyEqualTo(Integer value) {
            addCriterion("orderby =", value, "orderby");
            return this;
        }

        public Criteria andOrderbyNotEqualTo(Integer value) {
            addCriterion("orderby <>", value, "orderby");
            return this;
        }

        public Criteria andOrderbyGreaterThan(Integer value) {
            addCriterion("orderby >", value, "orderby");
            return this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderby >=", value, "orderby");
            return this;
        }

        public Criteria andOrderbyLessThan(Integer value) {
            addCriterion("orderby <", value, "orderby");
            return this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(Integer value) {
            addCriterion("orderby <=", value, "orderby");
            return this;
        }

        public Criteria andOrderbyIn(List<Integer> values) {
            addCriterion("orderby in", values, "orderby");
            return this;
        }

        public Criteria andOrderbyNotIn(List<Integer> values) {
            addCriterion("orderby not in", values, "orderby");
            return this;
        }

        public Criteria andOrderbyBetween(Integer value1, Integer value2) {
            addCriterion("orderby between", value1, value2, "orderby");
            return this;
        }

        public Criteria andOrderbyNotBetween(Integer value1, Integer value2) {
            addCriterion("orderby not between", value1, value2, "orderby");
            return this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return this;
        }

        public Criteria andActiveEqualTo(String value) {
            addCriterion("active =", value, "active");
            return this;
        }

        public Criteria andActiveNotEqualTo(String value) {
            addCriterion("active <>", value, "active");
            return this;
        }

        public Criteria andActiveGreaterThan(String value) {
            addCriterion("active >", value, "active");
            return this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(String value) {
            addCriterion("active >=", value, "active");
            return this;
        }

        public Criteria andActiveLessThan(String value) {
            addCriterion("active <", value, "active");
            return this;
        }

        public Criteria andActiveLessThanOrEqualTo(String value) {
            addCriterion("active <=", value, "active");
            return this;
        }

        public Criteria andActiveLike(String value) {
            addCriterion("active like", value, "active");
            return this;
        }

        public Criteria andActiveNotLike(String value) {
            addCriterion("active not like", value, "active");
            return this;
        }

        public Criteria andActiveIn(List<String> values) {
            addCriterion("active in", values, "active");
            return this;
        }

        public Criteria andActiveNotIn(List<String> values) {
            addCriterion("active not in", values, "active");
            return this;
        }

        public Criteria andActiveBetween(String value1, String value2) {
            addCriterion("active between", value1, value2, "active");
            return this;
        }

        public Criteria andActiveNotBetween(String value1, String value2) {
            addCriterion("active not between", value1, value2, "active");
            return this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("prefix is null");
            return this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("prefix is not null");
            return this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("prefix =", value, "prefix");
            return this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("prefix <>", value, "prefix");
            return this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("prefix >", value, "prefix");
            return this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("prefix >=", value, "prefix");
            return this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("prefix <", value, "prefix");
            return this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("prefix <=", value, "prefix");
            return this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("prefix like", value, "prefix");
            return this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("prefix not like", value, "prefix");
            return this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("prefix in", values, "prefix");
            return this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("prefix not in", values, "prefix");
            return this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("prefix between", value1, value2, "prefix");
            return this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("prefix not between", value1, value2, "prefix");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return this;
        }
    }
}