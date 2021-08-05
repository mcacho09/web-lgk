package com.retailsbs.logistikapp.supplier.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    public PlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    protected PlanExample(PlanExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
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
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table lgk_plan
     *
     * @abatorgenerated Tue Mar 08 08:30:15 CST 2016
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

        public Criteria andId_planIsNull() {
            addCriterion("id_plan is null");
            return this;
        }

        public Criteria andId_planIsNotNull() {
            addCriterion("id_plan is not null");
            return this;
        }

        public Criteria andId_planEqualTo(Long value) {
            addCriterion("id_plan =", value, "id_plan");
            return this;
        }

        public Criteria andId_planNotEqualTo(Long value) {
            addCriterion("id_plan <>", value, "id_plan");
            return this;
        }

        public Criteria andId_planGreaterThan(Long value) {
            addCriterion("id_plan >", value, "id_plan");
            return this;
        }

        public Criteria andId_planGreaterThanOrEqualTo(Long value) {
            addCriterion("id_plan >=", value, "id_plan");
            return this;
        }

        public Criteria andId_planLessThan(Long value) {
            addCriterion("id_plan <", value, "id_plan");
            return this;
        }

        public Criteria andId_planLessThanOrEqualTo(Long value) {
            addCriterion("id_plan <=", value, "id_plan");
            return this;
        }

        public Criteria andId_planIn(List<Long> values) {
            addCriterion("id_plan in", values, "id_plan");
            return this;
        }

        public Criteria andId_planNotIn(List<Long> values) {
            addCriterion("id_plan not in", values, "id_plan");
            return this;
        }

        public Criteria andId_planBetween(Long value1, Long value2) {
            addCriterion("id_plan between", value1, value2, "id_plan");
            return this;
        }

        public Criteria andId_planNotBetween(Long value1, Long value2) {
            addCriterion("id_plan not between", value1, value2, "id_plan");
            return this;
        }

        public Criteria andPlan_nameIsNull() {
            addCriterion("plan_name is null");
            return this;
        }

        public Criteria andPlan_nameIsNotNull() {
            addCriterion("plan_name is not null");
            return this;
        }

        public Criteria andPlan_nameEqualTo(String value) {
            addCriterion("plan_name =", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameNotEqualTo(String value) {
            addCriterion("plan_name <>", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameGreaterThan(String value) {
            addCriterion("plan_name >", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameGreaterThanOrEqualTo(String value) {
            addCriterion("plan_name >=", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameLessThan(String value) {
            addCriterion("plan_name <", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameLessThanOrEqualTo(String value) {
            addCriterion("plan_name <=", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameLike(String value) {
            addCriterion("plan_name like", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameNotLike(String value) {
            addCriterion("plan_name not like", value, "plan_name");
            return this;
        }

        public Criteria andPlan_nameIn(List<String> values) {
            addCriterion("plan_name in", values, "plan_name");
            return this;
        }

        public Criteria andPlan_nameNotIn(List<String> values) {
            addCriterion("plan_name not in", values, "plan_name");
            return this;
        }

        public Criteria andPlan_nameBetween(String value1, String value2) {
            addCriterion("plan_name between", value1, value2, "plan_name");
            return this;
        }

        public Criteria andPlan_nameNotBetween(String value1, String value2) {
            addCriterion("plan_name not between", value1, value2, "plan_name");
            return this;
        }

        public Criteria andCustomersIsNull() {
            addCriterion("customers is null");
            return this;
        }

        public Criteria andCustomersIsNotNull() {
            addCriterion("customers is not null");
            return this;
        }

        public Criteria andCustomersEqualTo(Long value) {
            addCriterion("customers =", value, "customers");
            return this;
        }

        public Criteria andCustomersNotEqualTo(Long value) {
            addCriterion("customers <>", value, "customers");
            return this;
        }

        public Criteria andCustomersGreaterThan(Long value) {
            addCriterion("customers >", value, "customers");
            return this;
        }

        public Criteria andCustomersGreaterThanOrEqualTo(Long value) {
            addCriterion("customers >=", value, "customers");
            return this;
        }

        public Criteria andCustomersLessThan(Long value) {
            addCriterion("customers <", value, "customers");
            return this;
        }

        public Criteria andCustomersLessThanOrEqualTo(Long value) {
            addCriterion("customers <=", value, "customers");
            return this;
        }

        public Criteria andCustomersIn(List<Long> values) {
            addCriterion("customers in", values, "customers");
            return this;
        }

        public Criteria andCustomersNotIn(List<Long> values) {
            addCriterion("customers not in", values, "customers");
            return this;
        }

        public Criteria andCustomersBetween(Long value1, Long value2) {
            addCriterion("customers between", value1, value2, "customers");
            return this;
        }

        public Criteria andCustomersNotBetween(Long value1, Long value2) {
            addCriterion("customers not between", value1, value2, "customers");
            return this;
        }

        public Criteria andUsersIsNull() {
            addCriterion("users is null");
            return this;
        }

        public Criteria andUsersIsNotNull() {
            addCriterion("users is not null");
            return this;
        }

        public Criteria andUsersEqualTo(Long value) {
            addCriterion("users =", value, "users");
            return this;
        }

        public Criteria andUsersNotEqualTo(Long value) {
            addCriterion("users <>", value, "users");
            return this;
        }

        public Criteria andUsersGreaterThan(Long value) {
            addCriterion("users >", value, "users");
            return this;
        }

        public Criteria andUsersGreaterThanOrEqualTo(Long value) {
            addCriterion("users >=", value, "users");
            return this;
        }

        public Criteria andUsersLessThan(Long value) {
            addCriterion("users <", value, "users");
            return this;
        }

        public Criteria andUsersLessThanOrEqualTo(Long value) {
            addCriterion("users <=", value, "users");
            return this;
        }

        public Criteria andUsersIn(List<Long> values) {
            addCriterion("users in", values, "users");
            return this;
        }

        public Criteria andUsersNotIn(List<Long> values) {
            addCriterion("users not in", values, "users");
            return this;
        }

        public Criteria andUsersBetween(Long value1, Long value2) {
            addCriterion("users between", value1, value2, "users");
            return this;
        }

        public Criteria andUsersNotBetween(Long value1, Long value2) {
            addCriterion("users not between", value1, value2, "users");
            return this;
        }

        public Criteria andSearchboxIsNull() {
            addCriterion("searchbox is null");
            return this;
        }

        public Criteria andSearchboxIsNotNull() {
            addCriterion("searchbox is not null");
            return this;
        }

        public Criteria andSearchboxEqualTo(String value) {
            addCriterion("searchbox =", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxNotEqualTo(String value) {
            addCriterion("searchbox <>", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxGreaterThan(String value) {
            addCriterion("searchbox >", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxGreaterThanOrEqualTo(String value) {
            addCriterion("searchbox >=", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxLessThan(String value) {
            addCriterion("searchbox <", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxLessThanOrEqualTo(String value) {
            addCriterion("searchbox <=", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxLike(String value) {
            addCriterion("searchbox like", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxNotLike(String value) {
            addCriterion("searchbox not like", value, "searchbox");
            return this;
        }

        public Criteria andSearchboxIn(List<String> values) {
            addCriterion("searchbox in", values, "searchbox");
            return this;
        }

        public Criteria andSearchboxNotIn(List<String> values) {
            addCriterion("searchbox not in", values, "searchbox");
            return this;
        }

        public Criteria andSearchboxBetween(String value1, String value2) {
            addCriterion("searchbox between", value1, value2, "searchbox");
            return this;
        }

        public Criteria andSearchboxNotBetween(String value1, String value2) {
            addCriterion("searchbox not between", value1, value2, "searchbox");
            return this;
        }

        public Criteria andSchedulingIsNull() {
            addCriterion("scheduling is null");
            return this;
        }

        public Criteria andSchedulingIsNotNull() {
            addCriterion("scheduling is not null");
            return this;
        }

        public Criteria andSchedulingEqualTo(String value) {
            addCriterion("scheduling =", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingNotEqualTo(String value) {
            addCriterion("scheduling <>", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingGreaterThan(String value) {
            addCriterion("scheduling >", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingGreaterThanOrEqualTo(String value) {
            addCriterion("scheduling >=", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingLessThan(String value) {
            addCriterion("scheduling <", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingLessThanOrEqualTo(String value) {
            addCriterion("scheduling <=", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingLike(String value) {
            addCriterion("scheduling like", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingNotLike(String value) {
            addCriterion("scheduling not like", value, "scheduling");
            return this;
        }

        public Criteria andSchedulingIn(List<String> values) {
            addCriterion("scheduling in", values, "scheduling");
            return this;
        }

        public Criteria andSchedulingNotIn(List<String> values) {
            addCriterion("scheduling not in", values, "scheduling");
            return this;
        }

        public Criteria andSchedulingBetween(String value1, String value2) {
            addCriterion("scheduling between", value1, value2, "scheduling");
            return this;
        }

        public Criteria andSchedulingNotBetween(String value1, String value2) {
            addCriterion("scheduling not between", value1, value2, "scheduling");
            return this;
        }

        public Criteria andRoutesIsNull() {
            addCriterion("routes is null");
            return this;
        }

        public Criteria andRoutesIsNotNull() {
            addCriterion("routes is not null");
            return this;
        }

        public Criteria andRoutesEqualTo(String value) {
            addCriterion("routes =", value, "routes");
            return this;
        }

        public Criteria andRoutesNotEqualTo(String value) {
            addCriterion("routes <>", value, "routes");
            return this;
        }

        public Criteria andRoutesGreaterThan(String value) {
            addCriterion("routes >", value, "routes");
            return this;
        }

        public Criteria andRoutesGreaterThanOrEqualTo(String value) {
            addCriterion("routes >=", value, "routes");
            return this;
        }

        public Criteria andRoutesLessThan(String value) {
            addCriterion("routes <", value, "routes");
            return this;
        }

        public Criteria andRoutesLessThanOrEqualTo(String value) {
            addCriterion("routes <=", value, "routes");
            return this;
        }

        public Criteria andRoutesLike(String value) {
            addCriterion("routes like", value, "routes");
            return this;
        }

        public Criteria andRoutesNotLike(String value) {
            addCriterion("routes not like", value, "routes");
            return this;
        }

        public Criteria andRoutesIn(List<String> values) {
            addCriterion("routes in", values, "routes");
            return this;
        }

        public Criteria andRoutesNotIn(List<String> values) {
            addCriterion("routes not in", values, "routes");
            return this;
        }

        public Criteria andRoutesBetween(String value1, String value2) {
            addCriterion("routes between", value1, value2, "routes");
            return this;
        }

        public Criteria andRoutesNotBetween(String value1, String value2) {
            addCriterion("routes not between", value1, value2, "routes");
            return this;
        }

        public Criteria andTravelsIsNull() {
            addCriterion("travels is null");
            return this;
        }

        public Criteria andTravelsIsNotNull() {
            addCriterion("travels is not null");
            return this;
        }

        public Criteria andTravelsEqualTo(String value) {
            addCriterion("travels =", value, "travels");
            return this;
        }

        public Criteria andTravelsNotEqualTo(String value) {
            addCriterion("travels <>", value, "travels");
            return this;
        }

        public Criteria andTravelsGreaterThan(String value) {
            addCriterion("travels >", value, "travels");
            return this;
        }

        public Criteria andTravelsGreaterThanOrEqualTo(String value) {
            addCriterion("travels >=", value, "travels");
            return this;
        }

        public Criteria andTravelsLessThan(String value) {
            addCriterion("travels <", value, "travels");
            return this;
        }

        public Criteria andTravelsLessThanOrEqualTo(String value) {
            addCriterion("travels <=", value, "travels");
            return this;
        }

        public Criteria andTravelsLike(String value) {
            addCriterion("travels like", value, "travels");
            return this;
        }

        public Criteria andTravelsNotLike(String value) {
            addCriterion("travels not like", value, "travels");
            return this;
        }

        public Criteria andTravelsIn(List<String> values) {
            addCriterion("travels in", values, "travels");
            return this;
        }

        public Criteria andTravelsNotIn(List<String> values) {
            addCriterion("travels not in", values, "travels");
            return this;
        }

        public Criteria andTravelsBetween(String value1, String value2) {
            addCriterion("travels between", value1, value2, "travels");
            return this;
        }

        public Criteria andTravelsNotBetween(String value1, String value2) {
            addCriterion("travels not between", value1, value2, "travels");
            return this;
        }

        public Criteria andHistoricalIsNull() {
            addCriterion("historical is null");
            return this;
        }

        public Criteria andHistoricalIsNotNull() {
            addCriterion("historical is not null");
            return this;
        }

        public Criteria andHistoricalEqualTo(String value) {
            addCriterion("historical =", value, "historical");
            return this;
        }

        public Criteria andHistoricalNotEqualTo(String value) {
            addCriterion("historical <>", value, "historical");
            return this;
        }

        public Criteria andHistoricalGreaterThan(String value) {
            addCriterion("historical >", value, "historical");
            return this;
        }

        public Criteria andHistoricalGreaterThanOrEqualTo(String value) {
            addCriterion("historical >=", value, "historical");
            return this;
        }

        public Criteria andHistoricalLessThan(String value) {
            addCriterion("historical <", value, "historical");
            return this;
        }

        public Criteria andHistoricalLessThanOrEqualTo(String value) {
            addCriterion("historical <=", value, "historical");
            return this;
        }

        public Criteria andHistoricalLike(String value) {
            addCriterion("historical like", value, "historical");
            return this;
        }

        public Criteria andHistoricalNotLike(String value) {
            addCriterion("historical not like", value, "historical");
            return this;
        }

        public Criteria andHistoricalIn(List<String> values) {
            addCriterion("historical in", values, "historical");
            return this;
        }

        public Criteria andHistoricalNotIn(List<String> values) {
            addCriterion("historical not in", values, "historical");
            return this;
        }

        public Criteria andHistoricalBetween(String value1, String value2) {
            addCriterion("historical between", value1, value2, "historical");
            return this;
        }

        public Criteria andHistoricalNotBetween(String value1, String value2) {
            addCriterion("historical not between", value1, value2, "historical");
            return this;
        }

        public Criteria andCallcenterIsNull() {
            addCriterion("callcenter is null");
            return this;
        }

        public Criteria andCallcenterIsNotNull() {
            addCriterion("callcenter is not null");
            return this;
        }

        public Criteria andCallcenterEqualTo(String value) {
            addCriterion("callcenter =", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterNotEqualTo(String value) {
            addCriterion("callcenter <>", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterGreaterThan(String value) {
            addCriterion("callcenter >", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterGreaterThanOrEqualTo(String value) {
            addCriterion("callcenter >=", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterLessThan(String value) {
            addCriterion("callcenter <", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterLessThanOrEqualTo(String value) {
            addCriterion("callcenter <=", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterLike(String value) {
            addCriterion("callcenter like", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterNotLike(String value) {
            addCriterion("callcenter not like", value, "callcenter");
            return this;
        }

        public Criteria andCallcenterIn(List<String> values) {
            addCriterion("callcenter in", values, "callcenter");
            return this;
        }

        public Criteria andCallcenterNotIn(List<String> values) {
            addCriterion("callcenter not in", values, "callcenter");
            return this;
        }

        public Criteria andCallcenterBetween(String value1, String value2) {
            addCriterion("callcenter between", value1, value2, "callcenter");
            return this;
        }

        public Criteria andCallcenterNotBetween(String value1, String value2) {
            addCriterion("callcenter not between", value1, value2, "callcenter");
            return this;
        }

        public Criteria andNotificationsIsNull() {
            addCriterion("notifications is null");
            return this;
        }

        public Criteria andNotificationsIsNotNull() {
            addCriterion("notifications is not null");
            return this;
        }

        public Criteria andNotificationsEqualTo(String value) {
            addCriterion("notifications =", value, "notifications");
            return this;
        }

        public Criteria andNotificationsNotEqualTo(String value) {
            addCriterion("notifications <>", value, "notifications");
            return this;
        }

        public Criteria andNotificationsGreaterThan(String value) {
            addCriterion("notifications >", value, "notifications");
            return this;
        }

        public Criteria andNotificationsGreaterThanOrEqualTo(String value) {
            addCriterion("notifications >=", value, "notifications");
            return this;
        }

        public Criteria andNotificationsLessThan(String value) {
            addCriterion("notifications <", value, "notifications");
            return this;
        }

        public Criteria andNotificationsLessThanOrEqualTo(String value) {
            addCriterion("notifications <=", value, "notifications");
            return this;
        }

        public Criteria andNotificationsLike(String value) {
            addCriterion("notifications like", value, "notifications");
            return this;
        }

        public Criteria andNotificationsNotLike(String value) {
            addCriterion("notifications not like", value, "notifications");
            return this;
        }

        public Criteria andNotificationsIn(List<String> values) {
            addCriterion("notifications in", values, "notifications");
            return this;
        }

        public Criteria andNotificationsNotIn(List<String> values) {
            addCriterion("notifications not in", values, "notifications");
            return this;
        }

        public Criteria andNotificationsBetween(String value1, String value2) {
            addCriterion("notifications between", value1, value2, "notifications");
            return this;
        }

        public Criteria andNotificationsNotBetween(String value1, String value2) {
            addCriterion("notifications not between", value1, value2, "notifications");
            return this;
        }

        public Criteria andMessagesIsNull() {
            addCriterion("messages is null");
            return this;
        }

        public Criteria andMessagesIsNotNull() {
            addCriterion("messages is not null");
            return this;
        }

        public Criteria andMessagesEqualTo(String value) {
            addCriterion("messages =", value, "messages");
            return this;
        }

        public Criteria andMessagesNotEqualTo(String value) {
            addCriterion("messages <>", value, "messages");
            return this;
        }

        public Criteria andMessagesGreaterThan(String value) {
            addCriterion("messages >", value, "messages");
            return this;
        }

        public Criteria andMessagesGreaterThanOrEqualTo(String value) {
            addCriterion("messages >=", value, "messages");
            return this;
        }

        public Criteria andMessagesLessThan(String value) {
            addCriterion("messages <", value, "messages");
            return this;
        }

        public Criteria andMessagesLessThanOrEqualTo(String value) {
            addCriterion("messages <=", value, "messages");
            return this;
        }

        public Criteria andMessagesLike(String value) {
            addCriterion("messages like", value, "messages");
            return this;
        }

        public Criteria andMessagesNotLike(String value) {
            addCriterion("messages not like", value, "messages");
            return this;
        }

        public Criteria andMessagesIn(List<String> values) {
            addCriterion("messages in", values, "messages");
            return this;
        }

        public Criteria andMessagesNotIn(List<String> values) {
            addCriterion("messages not in", values, "messages");
            return this;
        }

        public Criteria andMessagesBetween(String value1, String value2) {
            addCriterion("messages between", value1, value2, "messages");
            return this;
        }

        public Criteria andMessagesNotBetween(String value1, String value2) {
            addCriterion("messages not between", value1, value2, "messages");
            return this;
        }

        public Criteria andGroupsIsNull() {
            addCriterion("groups is null");
            return this;
        }

        public Criteria andGroupsIsNotNull() {
            addCriterion("groups is not null");
            return this;
        }

        public Criteria andGroupsEqualTo(String value) {
            addCriterion("groups =", value, "groups");
            return this;
        }

        public Criteria andGroupsNotEqualTo(String value) {
            addCriterion("groups <>", value, "groups");
            return this;
        }

        public Criteria andGroupsGreaterThan(String value) {
            addCriterion("groups >", value, "groups");
            return this;
        }

        public Criteria andGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("groups >=", value, "groups");
            return this;
        }

        public Criteria andGroupsLessThan(String value) {
            addCriterion("groups <", value, "groups");
            return this;
        }

        public Criteria andGroupsLessThanOrEqualTo(String value) {
            addCriterion("groups <=", value, "groups");
            return this;
        }

        public Criteria andGroupsLike(String value) {
            addCriterion("groups like", value, "groups");
            return this;
        }

        public Criteria andGroupsNotLike(String value) {
            addCriterion("groups not like", value, "groups");
            return this;
        }

        public Criteria andGroupsIn(List<String> values) {
            addCriterion("groups in", values, "groups");
            return this;
        }

        public Criteria andGroupsNotIn(List<String> values) {
            addCriterion("groups not in", values, "groups");
            return this;
        }

        public Criteria andGroupsBetween(String value1, String value2) {
            addCriterion("groups between", value1, value2, "groups");
            return this;
        }

        public Criteria andGroupsNotBetween(String value1, String value2) {
            addCriterion("groups not between", value1, value2, "groups");
            return this;
        }

        public Criteria andTasksIsNull() {
            addCriterion("tasks is null");
            return this;
        }

        public Criteria andTasksIsNotNull() {
            addCriterion("tasks is not null");
            return this;
        }

        public Criteria andTasksEqualTo(String value) {
            addCriterion("tasks =", value, "tasks");
            return this;
        }

        public Criteria andTasksNotEqualTo(String value) {
            addCriterion("tasks <>", value, "tasks");
            return this;
        }

        public Criteria andTasksGreaterThan(String value) {
            addCriterion("tasks >", value, "tasks");
            return this;
        }

        public Criteria andTasksGreaterThanOrEqualTo(String value) {
            addCriterion("tasks >=", value, "tasks");
            return this;
        }

        public Criteria andTasksLessThan(String value) {
            addCriterion("tasks <", value, "tasks");
            return this;
        }

        public Criteria andTasksLessThanOrEqualTo(String value) {
            addCriterion("tasks <=", value, "tasks");
            return this;
        }

        public Criteria andTasksLike(String value) {
            addCriterion("tasks like", value, "tasks");
            return this;
        }

        public Criteria andTasksNotLike(String value) {
            addCriterion("tasks not like", value, "tasks");
            return this;
        }

        public Criteria andTasksIn(List<String> values) {
            addCriterion("tasks in", values, "tasks");
            return this;
        }

        public Criteria andTasksNotIn(List<String> values) {
            addCriterion("tasks not in", values, "tasks");
            return this;
        }

        public Criteria andTasksBetween(String value1, String value2) {
            addCriterion("tasks between", value1, value2, "tasks");
            return this;
        }

        public Criteria andTasksNotBetween(String value1, String value2) {
            addCriterion("tasks not between", value1, value2, "tasks");
            return this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return this;
        }
    }
}