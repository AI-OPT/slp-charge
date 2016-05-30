package com.ai.runner.center.charge.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class ChgChargeDetailLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ChgChargeDetailLogCriteria() {
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

        public Criteria andFeeDetailIdIsNull() {
            addCriterion("fee_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdIsNotNull() {
            addCriterion("fee_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdEqualTo(Long value) {
            addCriterion("fee_detail_id =", value, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdNotEqualTo(Long value) {
            addCriterion("fee_detail_id <>", value, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdGreaterThan(Long value) {
            addCriterion("fee_detail_id >", value, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fee_detail_id >=", value, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdLessThan(Long value) {
            addCriterion("fee_detail_id <", value, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("fee_detail_id <=", value, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdIn(List<Long> values) {
            addCriterion("fee_detail_id in", values, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdNotIn(List<Long> values) {
            addCriterion("fee_detail_id not in", values, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdBetween(Long value1, Long value2) {
            addCriterion("fee_detail_id between", value1, value2, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andFeeDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("fee_detail_id not between", value1, value2, "feeDetailId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("charge_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(Long value) {
            addCriterion("charge_id =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(Long value) {
            addCriterion("charge_id <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(Long value) {
            addCriterion("charge_id >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("charge_id >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(Long value) {
            addCriterion("charge_id <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(Long value) {
            addCriterion("charge_id <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<Long> values) {
            addCriterion("charge_id in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<Long> values) {
            addCriterion("charge_id not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(Long value1, Long value2) {
            addCriterion("charge_id between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(Long value1, Long value2) {
            addCriterion("charge_id not between", value1, value2, "chargeId");
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

        public Criteria andFeeItemIdIsNull() {
            addCriterion("fee_item_id is null");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdIsNotNull() {
            addCriterion("fee_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdEqualTo(String value) {
            addCriterion("fee_item_id =", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdNotEqualTo(String value) {
            addCriterion("fee_item_id <>", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdGreaterThan(String value) {
            addCriterion("fee_item_id >", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("fee_item_id >=", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdLessThan(String value) {
            addCriterion("fee_item_id <", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdLessThanOrEqualTo(String value) {
            addCriterion("fee_item_id <=", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdLike(String value) {
            addCriterion("fee_item_id like", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdNotLike(String value) {
            addCriterion("fee_item_id not like", value, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdIn(List<String> values) {
            addCriterion("fee_item_id in", values, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdNotIn(List<String> values) {
            addCriterion("fee_item_id not in", values, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdBetween(String value1, String value2) {
            addCriterion("fee_item_id between", value1, value2, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andFeeItemIdNotBetween(String value1, String value2) {
            addCriterion("fee_item_id not between", value1, value2, "feeItemId");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(Long value) {
            addCriterion("total_fee =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(Long value) {
            addCriterion("total_fee <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(Long value) {
            addCriterion("total_fee >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("total_fee >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(Long value) {
            addCriterion("total_fee <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(Long value) {
            addCriterion("total_fee <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<Long> values) {
            addCriterion("total_fee in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<Long> values) {
            addCriterion("total_fee not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(Long value1, Long value2) {
            addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(Long value1, Long value2) {
            addCriterion("total_fee not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNull() {
            addCriterion("discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(Long value) {
            addCriterion("discount_fee =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(Long value) {
            addCriterion("discount_fee <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(Long value) {
            addCriterion("discount_fee >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("discount_fee >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(Long value) {
            addCriterion("discount_fee <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(Long value) {
            addCriterion("discount_fee <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<Long> values) {
            addCriterion("discount_fee in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<Long> values) {
            addCriterion("discount_fee not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(Long value1, Long value2) {
            addCriterion("discount_fee between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(Long value1, Long value2) {
            addCriterion("discount_fee not between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeIsNull() {
            addCriterion("oper_discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeIsNotNull() {
            addCriterion("oper_discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeEqualTo(Long value) {
            addCriterion("oper_discount_fee =", value, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeNotEqualTo(Long value) {
            addCriterion("oper_discount_fee <>", value, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeGreaterThan(Long value) {
            addCriterion("oper_discount_fee >", value, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("oper_discount_fee >=", value, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeLessThan(Long value) {
            addCriterion("oper_discount_fee <", value, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeLessThanOrEqualTo(Long value) {
            addCriterion("oper_discount_fee <=", value, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeIn(List<Long> values) {
            addCriterion("oper_discount_fee in", values, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeNotIn(List<Long> values) {
            addCriterion("oper_discount_fee not in", values, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeBetween(Long value1, Long value2) {
            addCriterion("oper_discount_fee between", value1, value2, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andOperDiscountFeeNotBetween(Long value1, Long value2) {
            addCriterion("oper_discount_fee not between", value1, value2, "operDiscountFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeIsNull() {
            addCriterion("charge_fee is null");
            return (Criteria) this;
        }

        public Criteria andChargeFeeIsNotNull() {
            addCriterion("charge_fee is not null");
            return (Criteria) this;
        }

        public Criteria andChargeFeeEqualTo(Long value) {
            addCriterion("charge_fee =", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeNotEqualTo(Long value) {
            addCriterion("charge_fee <>", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeGreaterThan(Long value) {
            addCriterion("charge_fee >", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("charge_fee >=", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeLessThan(Long value) {
            addCriterion("charge_fee <", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeLessThanOrEqualTo(Long value) {
            addCriterion("charge_fee <=", value, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeIn(List<Long> values) {
            addCriterion("charge_fee in", values, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeNotIn(List<Long> values) {
            addCriterion("charge_fee not in", values, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeBetween(Long value1, Long value2) {
            addCriterion("charge_fee between", value1, value2, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andChargeFeeNotBetween(Long value1, Long value2) {
            addCriterion("charge_fee not between", value1, value2, "chargeFee");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("fee_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("fee_type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("fee_type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("fee_type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fee_type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("fee_type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("fee_type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("fee_type like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("fee_type not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("fee_type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("fee_type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("fee_type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("fee_type not between", value1, value2, "feeType");
            return (Criteria) this;
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