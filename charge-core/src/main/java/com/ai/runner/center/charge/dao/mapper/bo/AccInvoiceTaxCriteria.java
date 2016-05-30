package com.ai.runner.center.charge.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class AccInvoiceTaxCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AccInvoiceTaxCriteria() {
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

        public Criteria andProvCodeIsNull() {
            addCriterion("prov_code is null");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNotNull() {
            addCriterion("prov_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvCodeEqualTo(String value) {
            addCriterion("prov_code =", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotEqualTo(String value) {
            addCriterion("prov_code <>", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThan(String value) {
            addCriterion("prov_code >", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prov_code >=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThan(String value) {
            addCriterion("prov_code <", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThanOrEqualTo(String value) {
            addCriterion("prov_code <=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLike(String value) {
            addCriterion("prov_code like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotLike(String value) {
            addCriterion("prov_code not like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeIn(List<String> values) {
            addCriterion("prov_code in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotIn(List<String> values) {
            addCriterion("prov_code not in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeBetween(String value1, String value2) {
            addCriterion("prov_code between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotBetween(String value1, String value2) {
            addCriterion("prov_code not between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andBaseTaxIsNull() {
            addCriterion("base_tax is null");
            return (Criteria) this;
        }

        public Criteria andBaseTaxIsNotNull() {
            addCriterion("base_tax is not null");
            return (Criteria) this;
        }

        public Criteria andBaseTaxEqualTo(Double value) {
            addCriterion("base_tax =", value, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxNotEqualTo(Double value) {
            addCriterion("base_tax <>", value, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxGreaterThan(Double value) {
            addCriterion("base_tax >", value, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("base_tax >=", value, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxLessThan(Double value) {
            addCriterion("base_tax <", value, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxLessThanOrEqualTo(Double value) {
            addCriterion("base_tax <=", value, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxIn(List<Double> values) {
            addCriterion("base_tax in", values, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxNotIn(List<Double> values) {
            addCriterion("base_tax not in", values, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxBetween(Double value1, Double value2) {
            addCriterion("base_tax between", value1, value2, "baseTax");
            return (Criteria) this;
        }

        public Criteria andBaseTaxNotBetween(Double value1, Double value2) {
            addCriterion("base_tax not between", value1, value2, "baseTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxIsNull() {
            addCriterion("add_tax is null");
            return (Criteria) this;
        }

        public Criteria andAddTaxIsNotNull() {
            addCriterion("add_tax is not null");
            return (Criteria) this;
        }

        public Criteria andAddTaxEqualTo(Double value) {
            addCriterion("add_tax =", value, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxNotEqualTo(Double value) {
            addCriterion("add_tax <>", value, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxGreaterThan(Double value) {
            addCriterion("add_tax >", value, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("add_tax >=", value, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxLessThan(Double value) {
            addCriterion("add_tax <", value, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxLessThanOrEqualTo(Double value) {
            addCriterion("add_tax <=", value, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxIn(List<Double> values) {
            addCriterion("add_tax in", values, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxNotIn(List<Double> values) {
            addCriterion("add_tax not in", values, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxBetween(Double value1, Double value2) {
            addCriterion("add_tax between", value1, value2, "addTax");
            return (Criteria) this;
        }

        public Criteria andAddTaxNotBetween(Double value1, Double value2) {
            addCriterion("add_tax not between", value1, value2, "addTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxIsNull() {
            addCriterion("terminal_tax is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxIsNotNull() {
            addCriterion("terminal_tax is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxEqualTo(Double value) {
            addCriterion("terminal_tax =", value, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxNotEqualTo(Double value) {
            addCriterion("terminal_tax <>", value, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxGreaterThan(Double value) {
            addCriterion("terminal_tax >", value, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("terminal_tax >=", value, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxLessThan(Double value) {
            addCriterion("terminal_tax <", value, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxLessThanOrEqualTo(Double value) {
            addCriterion("terminal_tax <=", value, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxIn(List<Double> values) {
            addCriterion("terminal_tax in", values, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxNotIn(List<Double> values) {
            addCriterion("terminal_tax not in", values, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxBetween(Double value1, Double value2) {
            addCriterion("terminal_tax between", value1, value2, "terminalTax");
            return (Criteria) this;
        }

        public Criteria andTerminalTaxNotBetween(Double value1, Double value2) {
            addCriterion("terminal_tax not between", value1, value2, "terminalTax");
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