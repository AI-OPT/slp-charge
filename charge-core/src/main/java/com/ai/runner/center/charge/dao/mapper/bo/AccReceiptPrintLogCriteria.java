package com.ai.runner.center.charge.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AccReceiptPrintLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AccReceiptPrintLogCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("system_id =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("system_id <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("system_id >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("system_id >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("system_id <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("system_id <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("system_id like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("system_id not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("system_id in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("system_id not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("system_id between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("system_id not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Long value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Long value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Long value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Long value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Long> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Long> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Long value1, Long value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIsNull() {
            addCriterion("paid_fee is null");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIsNotNull() {
            addCriterion("paid_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPaidFeeEqualTo(Long value) {
            addCriterion("paid_fee =", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotEqualTo(Long value) {
            addCriterion("paid_fee <>", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeGreaterThan(Long value) {
            addCriterion("paid_fee >", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("paid_fee >=", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeLessThan(Long value) {
            addCriterion("paid_fee <", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeLessThanOrEqualTo(Long value) {
            addCriterion("paid_fee <=", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIn(List<Long> values) {
            addCriterion("paid_fee in", values, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotIn(List<Long> values) {
            addCriterion("paid_fee not in", values, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeBetween(Long value1, Long value2) {
            addCriterion("paid_fee between", value1, value2, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotBetween(Long value1, Long value2) {
            addCriterion("paid_fee not between", value1, value2, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameIsNull() {
            addCriterion("paystyle_name is null");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameIsNotNull() {
            addCriterion("paystyle_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameEqualTo(String value) {
            addCriterion("paystyle_name =", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameNotEqualTo(String value) {
            addCriterion("paystyle_name <>", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameGreaterThan(String value) {
            addCriterion("paystyle_name >", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameGreaterThanOrEqualTo(String value) {
            addCriterion("paystyle_name >=", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameLessThan(String value) {
            addCriterion("paystyle_name <", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameLessThanOrEqualTo(String value) {
            addCriterion("paystyle_name <=", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameLike(String value) {
            addCriterion("paystyle_name like", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameNotLike(String value) {
            addCriterion("paystyle_name not like", value, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameIn(List<String> values) {
            addCriterion("paystyle_name in", values, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameNotIn(List<String> values) {
            addCriterion("paystyle_name not in", values, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameBetween(String value1, String value2) {
            addCriterion("paystyle_name between", value1, value2, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andPaystyleNameNotBetween(String value1, String value2) {
            addCriterion("paystyle_name not between", value1, value2, "paystyleName");
            return (Criteria) this;
        }

        public Criteria andValueDateIsNull() {
            addCriterion("value_date is null");
            return (Criteria) this;
        }

        public Criteria andValueDateIsNotNull() {
            addCriterion("value_date is not null");
            return (Criteria) this;
        }

        public Criteria andValueDateEqualTo(Timestamp value) {
            addCriterion("value_date =", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateNotEqualTo(Timestamp value) {
            addCriterion("value_date <>", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateGreaterThan(Timestamp value) {
            addCriterion("value_date >", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("value_date >=", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateLessThan(Timestamp value) {
            addCriterion("value_date <", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("value_date <=", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateIn(List<Timestamp> values) {
            addCriterion("value_date in", values, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateNotIn(List<Timestamp> values) {
            addCriterion("value_date not in", values, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("value_date between", value1, value2, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("value_date not between", value1, value2, "valueDate");
            return (Criteria) this;
        }

        public Criteria andChlIdIsNull() {
            addCriterion("chl_id is null");
            return (Criteria) this;
        }

        public Criteria andChlIdIsNotNull() {
            addCriterion("chl_id is not null");
            return (Criteria) this;
        }

        public Criteria andChlIdEqualTo(String value) {
            addCriterion("chl_id =", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdNotEqualTo(String value) {
            addCriterion("chl_id <>", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdGreaterThan(String value) {
            addCriterion("chl_id >", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdGreaterThanOrEqualTo(String value) {
            addCriterion("chl_id >=", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdLessThan(String value) {
            addCriterion("chl_id <", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdLessThanOrEqualTo(String value) {
            addCriterion("chl_id <=", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdLike(String value) {
            addCriterion("chl_id like", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdNotLike(String value) {
            addCriterion("chl_id not like", value, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdIn(List<String> values) {
            addCriterion("chl_id in", values, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdNotIn(List<String> values) {
            addCriterion("chl_id not in", values, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdBetween(String value1, String value2) {
            addCriterion("chl_id between", value1, value2, "chlId");
            return (Criteria) this;
        }

        public Criteria andChlIdNotBetween(String value1, String value2) {
            addCriterion("chl_id not between", value1, value2, "chlId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }
    }

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