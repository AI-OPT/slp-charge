package com.ai.runner.center.charge.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ChgChargeLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ChgChargeLogCriteria() {
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

        public Criteria andBusiTypeIsNull() {
            addCriterion("busi_type is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNotNull() {
            addCriterion("busi_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeEqualTo(String value) {
            addCriterion("busi_type =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(String value) {
            addCriterion("busi_type <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(String value) {
            addCriterion("busi_type >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_type >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(String value) {
            addCriterion("busi_type <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("busi_type <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLike(String value) {
            addCriterion("busi_type like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotLike(String value) {
            addCriterion("busi_type not like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<String> values) {
            addCriterion("busi_type in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<String> values) {
            addCriterion("busi_type not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(String value1, String value2) {
            addCriterion("busi_type between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(String value1, String value2) {
            addCriterion("busi_type not between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeIsNull() {
            addCriterion("busi_oper_code is null");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeIsNotNull() {
            addCriterion("busi_oper_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeEqualTo(String value) {
            addCriterion("busi_oper_code =", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeNotEqualTo(String value) {
            addCriterion("busi_oper_code <>", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeGreaterThan(String value) {
            addCriterion("busi_oper_code >", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeGreaterThanOrEqualTo(String value) {
            addCriterion("busi_oper_code >=", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeLessThan(String value) {
            addCriterion("busi_oper_code <", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeLessThanOrEqualTo(String value) {
            addCriterion("busi_oper_code <=", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeLike(String value) {
            addCriterion("busi_oper_code like", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeNotLike(String value) {
            addCriterion("busi_oper_code not like", value, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeIn(List<String> values) {
            addCriterion("busi_oper_code in", values, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeNotIn(List<String> values) {
            addCriterion("busi_oper_code not in", values, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeBetween(String value1, String value2) {
            addCriterion("busi_oper_code between", value1, value2, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andBusiOperCodeNotBetween(String value1, String value2) {
            addCriterion("busi_oper_code not between", value1, value2, "busiOperCode");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIsNull() {
            addCriterion("batch_code is null");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIsNotNull() {
            addCriterion("batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andBatchCodeEqualTo(String value) {
            addCriterion("batch_code =", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotEqualTo(String value) {
            addCriterion("batch_code <>", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeGreaterThan(String value) {
            addCriterion("batch_code >", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("batch_code >=", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLessThan(String value) {
            addCriterion("batch_code <", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("batch_code <=", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLike(String value) {
            addCriterion("batch_code like", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotLike(String value) {
            addCriterion("batch_code not like", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIn(List<String> values) {
            addCriterion("batch_code in", values, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotIn(List<String> values) {
            addCriterion("batch_code not in", values, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeBetween(String value1, String value2) {
            addCriterion("batch_code between", value1, value2, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotBetween(String value1, String value2) {
            addCriterion("batch_code not between", value1, value2, "batchCode");
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

        public Criteria andAcctIdIsNull() {
            addCriterion("acct_id is null");
            return (Criteria) this;
        }

        public Criteria andAcctIdIsNotNull() {
            addCriterion("acct_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcctIdEqualTo(Long value) {
            addCriterion("acct_id =", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotEqualTo(Long value) {
            addCriterion("acct_id <>", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThan(Long value) {
            addCriterion("acct_id >", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdGreaterThanOrEqualTo(Long value) {
            addCriterion("acct_id >=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThan(Long value) {
            addCriterion("acct_id <", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdLessThanOrEqualTo(Long value) {
            addCriterion("acct_id <=", value, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdIn(List<Long> values) {
            addCriterion("acct_id in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotIn(List<Long> values) {
            addCriterion("acct_id not in", values, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdBetween(Long value1, Long value2) {
            addCriterion("acct_id between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andAcctIdNotBetween(Long value1, Long value2) {
            addCriterion("acct_id not between", value1, value2, "acctId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateIsNull() {
            addCriterion("last_status_date is null");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateIsNotNull() {
            addCriterion("last_status_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateEqualTo(Timestamp value) {
            addCriterion("last_status_date =", value, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateNotEqualTo(Timestamp value) {
            addCriterion("last_status_date <>", value, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateGreaterThan(Timestamp value) {
            addCriterion("last_status_date >", value, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("last_status_date >=", value, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateLessThan(Timestamp value) {
            addCriterion("last_status_date <", value, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("last_status_date <=", value, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateIn(List<Timestamp> values) {
            addCriterion("last_status_date in", values, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateNotIn(List<Timestamp> values) {
            addCriterion("last_status_date not in", values, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("last_status_date between", value1, value2, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andLastStatusDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("last_status_date not between", value1, value2, "lastStatusDate");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIsNull() {
            addCriterion("print_times is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIsNotNull() {
            addCriterion("print_times is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimesEqualTo(Integer value) {
            addCriterion("print_times =", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotEqualTo(Integer value) {
            addCriterion("print_times <>", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesGreaterThan(Integer value) {
            addCriterion("print_times >", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("print_times >=", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesLessThan(Integer value) {
            addCriterion("print_times <", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesLessThanOrEqualTo(Integer value) {
            addCriterion("print_times <=", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIn(List<Integer> values) {
            addCriterion("print_times in", values, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotIn(List<Integer> values) {
            addCriterion("print_times not in", values, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesBetween(Integer value1, Integer value2) {
            addCriterion("print_times between", value1, value2, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("print_times not between", value1, value2, "printTimes");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeIsNull() {
            addCriterion("op_prov_code is null");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeIsNotNull() {
            addCriterion("op_prov_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeEqualTo(String value) {
            addCriterion("op_prov_code =", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeNotEqualTo(String value) {
            addCriterion("op_prov_code <>", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeGreaterThan(String value) {
            addCriterion("op_prov_code >", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_prov_code >=", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeLessThan(String value) {
            addCriterion("op_prov_code <", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeLessThanOrEqualTo(String value) {
            addCriterion("op_prov_code <=", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeLike(String value) {
            addCriterion("op_prov_code like", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeNotLike(String value) {
            addCriterion("op_prov_code not like", value, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeIn(List<String> values) {
            addCriterion("op_prov_code in", values, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeNotIn(List<String> values) {
            addCriterion("op_prov_code not in", values, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeBetween(String value1, String value2) {
            addCriterion("op_prov_code between", value1, value2, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpProvCodeNotBetween(String value1, String value2) {
            addCriterion("op_prov_code not between", value1, value2, "opProvCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeIsNull() {
            addCriterion("op_city_code is null");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeIsNotNull() {
            addCriterion("op_city_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeEqualTo(String value) {
            addCriterion("op_city_code =", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeNotEqualTo(String value) {
            addCriterion("op_city_code <>", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeGreaterThan(String value) {
            addCriterion("op_city_code >", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_city_code >=", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeLessThan(String value) {
            addCriterion("op_city_code <", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeLessThanOrEqualTo(String value) {
            addCriterion("op_city_code <=", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeLike(String value) {
            addCriterion("op_city_code like", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeNotLike(String value) {
            addCriterion("op_city_code not like", value, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeIn(List<String> values) {
            addCriterion("op_city_code in", values, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeNotIn(List<String> values) {
            addCriterion("op_city_code not in", values, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeBetween(String value1, String value2) {
            addCriterion("op_city_code between", value1, value2, "opCityCode");
            return (Criteria) this;
        }

        public Criteria andOpCityCodeNotBetween(String value1, String value2) {
            addCriterion("op_city_code not between", value1, value2, "opCityCode");
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

        public Criteria andOperIdIsNull() {
            addCriterion("oper_id is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("oper_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(String value) {
            addCriterion("oper_id =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(String value) {
            addCriterion("oper_id <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(String value) {
            addCriterion("oper_id >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("oper_id >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(String value) {
            addCriterion("oper_id <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(String value) {
            addCriterion("oper_id <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLike(String value) {
            addCriterion("oper_id like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotLike(String value) {
            addCriterion("oper_id not like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<String> values) {
            addCriterion("oper_id in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<String> values) {
            addCriterion("oper_id not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(String value1, String value2) {
            addCriterion("oper_id between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(String value1, String value2) {
            addCriterion("oper_id not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Timestamp value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Timestamp value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Timestamp value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Timestamp value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Timestamp> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Timestamp> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdIsNull() {
            addCriterion("cancel_charge_id is null");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdIsNotNull() {
            addCriterion("cancel_charge_id is not null");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdEqualTo(Long value) {
            addCriterion("cancel_charge_id =", value, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdNotEqualTo(Long value) {
            addCriterion("cancel_charge_id <>", value, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdGreaterThan(Long value) {
            addCriterion("cancel_charge_id >", value, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cancel_charge_id >=", value, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdLessThan(Long value) {
            addCriterion("cancel_charge_id <", value, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdLessThanOrEqualTo(Long value) {
            addCriterion("cancel_charge_id <=", value, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdIn(List<Long> values) {
            addCriterion("cancel_charge_id in", values, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdNotIn(List<Long> values) {
            addCriterion("cancel_charge_id not in", values, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdBetween(Long value1, Long value2) {
            addCriterion("cancel_charge_id between", value1, value2, "cancelChargeId");
            return (Criteria) this;
        }

        public Criteria andCancelChargeIdNotBetween(Long value1, Long value2) {
            addCriterion("cancel_charge_id not between", value1, value2, "cancelChargeId");
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