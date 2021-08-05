package com.retailsbs.logistikapp.financial.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlmacenExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    public AlmacenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
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
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table lgk_almacen
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
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

        public Criteria andId_almacenIsNull() {
            addCriterion("id_almacen is null");
            return this;
        }

        public Criteria andId_almacenIsNotNull() {
            addCriterion("id_almacen is not null");
            return this;
        }

        public Criteria andId_almacenEqualTo(Long value) {
            addCriterion("id_almacen =", value, "id_almacen");
            return this;
        }

        public Criteria andId_almacenNotEqualTo(Long value) {
            addCriterion("id_almacen <>", value, "id_almacen");
            return this;
        }

        public Criteria andId_almacenGreaterThan(Long value) {
            addCriterion("id_almacen >", value, "id_almacen");
            return this;
        }

        public Criteria andId_almacenGreaterThanOrEqualTo(Long value) {
            addCriterion("id_almacen >=", value, "id_almacen");
            return this;
        }

        public Criteria andId_almacenLessThan(Long value) {
            addCriterion("id_almacen <", value, "id_almacen");
            return this;
        }

        public Criteria andId_almacenLessThanOrEqualTo(Long value) {
            addCriterion("id_almacen <=", value, "id_almacen");
            return this;
        }

        public Criteria andId_almacenIn(List<Long> values) {
            addCriterion("id_almacen in", values, "id_almacen");
            return this;
        }

        public Criteria andId_almacenNotIn(List<Long> values) {
            addCriterion("id_almacen not in", values, "id_almacen");
            return this;
        }

        public Criteria andId_almacenBetween(Long value1, Long value2) {
            addCriterion("id_almacen between", value1, value2, "id_almacen");
            return this;
        }

        public Criteria andId_almacenNotBetween(Long value1, Long value2) {
            addCriterion("id_almacen not between", value1, value2, "id_almacen");
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

        public Criteria andId_retailIsNull() {
            addCriterion("id_retail is null");
            return this;
        }

        public Criteria andId_retailIsNotNull() {
            addCriterion("id_retail is not null");
            return this;
        }

        public Criteria andId_retailEqualTo(Long value) {
            addCriterion("id_retail =", value, "id_retail");
            return this;
        }

        public Criteria andId_retailNotEqualTo(Long value) {
            addCriterion("id_retail <>", value, "id_retail");
            return this;
        }

        public Criteria andId_retailGreaterThan(Long value) {
            addCriterion("id_retail >", value, "id_retail");
            return this;
        }

        public Criteria andId_retailGreaterThanOrEqualTo(Long value) {
            addCriterion("id_retail >=", value, "id_retail");
            return this;
        }

        public Criteria andId_retailLessThan(Long value) {
            addCriterion("id_retail <", value, "id_retail");
            return this;
        }

        public Criteria andId_retailLessThanOrEqualTo(Long value) {
            addCriterion("id_retail <=", value, "id_retail");
            return this;
        }

        public Criteria andId_retailIn(List<Long> values) {
            addCriterion("id_retail in", values, "id_retail");
            return this;
        }

        public Criteria andId_retailNotIn(List<Long> values) {
            addCriterion("id_retail not in", values, "id_retail");
            return this;
        }

        public Criteria andId_retailBetween(Long value1, Long value2) {
            addCriterion("id_retail between", value1, value2, "id_retail");
            return this;
        }

        public Criteria andId_retailNotBetween(Long value1, Long value2) {
            addCriterion("id_retail not between", value1, value2, "id_retail");
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

        public Criteria andId_supplierIsNull() {
            addCriterion("id_supplier is null");
            return this;
        }

        public Criteria andId_supplierIsNotNull() {
            addCriterion("id_supplier is not null");
            return this;
        }

        public Criteria andId_supplierEqualTo(Long value) {
            addCriterion("id_supplier =", value, "id_supplier");
            return this;
        }

        public Criteria andId_supplierNotEqualTo(Long value) {
            addCriterion("id_supplier <>", value, "id_supplier");
            return this;
        }

        public Criteria andId_supplierGreaterThan(Long value) {
            addCriterion("id_supplier >", value, "id_supplier");
            return this;
        }

        public Criteria andId_supplierGreaterThanOrEqualTo(Long value) {
            addCriterion("id_supplier >=", value, "id_supplier");
            return this;
        }

        public Criteria andId_supplierLessThan(Long value) {
            addCriterion("id_supplier <", value, "id_supplier");
            return this;
        }

        public Criteria andId_supplierLessThanOrEqualTo(Long value) {
            addCriterion("id_supplier <=", value, "id_supplier");
            return this;
        }

        public Criteria andId_supplierIn(List<Long> values) {
            addCriterion("id_supplier in", values, "id_supplier");
            return this;
        }

        public Criteria andId_supplierNotIn(List<Long> values) {
            addCriterion("id_supplier not in", values, "id_supplier");
            return this;
        }

        public Criteria andId_supplierBetween(Long value1, Long value2) {
            addCriterion("id_supplier between", value1, value2, "id_supplier");
            return this;
        }

        public Criteria andId_supplierNotBetween(Long value1, Long value2) {
            addCriterion("id_supplier not between", value1, value2, "id_supplier");
            return this;
        }
    }
}