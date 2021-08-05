package com.retailsbs.logistikapp.user.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    public GroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
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
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table lgk_group
     *
     * @abatorgenerated Mon Aug 03 13:51:36 CDT 2015
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

        public Criteria andId_groupIsNull() {
            addCriterion("id_group is null");
            return this;
        }

        public Criteria andId_groupIsNotNull() {
            addCriterion("id_group is not null");
            return this;
        }

        public Criteria andId_groupEqualTo(Long value) {
            addCriterion("id_group =", value, "id_group");
            return this;
        }

        public Criteria andId_groupNotEqualTo(Long value) {
            addCriterion("id_group <>", value, "id_group");
            return this;
        }

        public Criteria andId_groupGreaterThan(Long value) {
            addCriterion("id_group >", value, "id_group");
            return this;
        }

        public Criteria andId_groupGreaterThanOrEqualTo(Long value) {
            addCriterion("id_group >=", value, "id_group");
            return this;
        }

        public Criteria andId_groupLessThan(Long value) {
            addCriterion("id_group <", value, "id_group");
            return this;
        }

        public Criteria andId_groupLessThanOrEqualTo(Long value) {
            addCriterion("id_group <=", value, "id_group");
            return this;
        }

        public Criteria andId_groupIn(List<Long> values) {
            addCriterion("id_group in", values, "id_group");
            return this;
        }

        public Criteria andId_groupNotIn(List<Long> values) {
            addCriterion("id_group not in", values, "id_group");
            return this;
        }

        public Criteria andId_groupBetween(Long value1, Long value2) {
            addCriterion("id_group between", value1, value2, "id_group");
            return this;
        }

        public Criteria andId_groupNotBetween(Long value1, Long value2) {
            addCriterion("id_group not between", value1, value2, "id_group");
            return this;
        }

        public Criteria andId_userIsNull() {
            addCriterion("id_user is null");
            return this;
        }

        public Criteria andId_userIsNotNull() {
            addCriterion("id_user is not null");
            return this;
        }

        public Criteria andId_userEqualTo(Long value) {
            addCriterion("id_user =", value, "id_user");
            return this;
        }

        public Criteria andId_userNotEqualTo(Long value) {
            addCriterion("id_user <>", value, "id_user");
            return this;
        }

        public Criteria andId_userGreaterThan(Long value) {
            addCriterion("id_user >", value, "id_user");
            return this;
        }

        public Criteria andId_userGreaterThanOrEqualTo(Long value) {
            addCriterion("id_user >=", value, "id_user");
            return this;
        }

        public Criteria andId_userLessThan(Long value) {
            addCriterion("id_user <", value, "id_user");
            return this;
        }

        public Criteria andId_userLessThanOrEqualTo(Long value) {
            addCriterion("id_user <=", value, "id_user");
            return this;
        }

        public Criteria andId_userIn(List<Long> values) {
            addCriterion("id_user in", values, "id_user");
            return this;
        }

        public Criteria andId_userNotIn(List<Long> values) {
            addCriterion("id_user not in", values, "id_user");
            return this;
        }

        public Criteria andId_userBetween(Long value1, Long value2) {
            addCriterion("id_user between", value1, value2, "id_user");
            return this;
        }

        public Criteria andId_userNotBetween(Long value1, Long value2) {
            addCriterion("id_user not between", value1, value2, "id_user");
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
    }
}