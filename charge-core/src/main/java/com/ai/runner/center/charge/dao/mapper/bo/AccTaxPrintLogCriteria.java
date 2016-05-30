package com.ai.runner.center.charge.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AccTaxPrintLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AccTaxPrintLogCriteria() {
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

        public Criteria andSerialCodeIsNull() {
            addCriterion("serial_code is null");
            return (Criteria) this;
        }

        public Criteria andSerialCodeIsNotNull() {
            addCriterion("serial_code is not null");
            return (Criteria) this;
        }

        public Criteria andSerialCodeEqualTo(String value) {
            addCriterion("serial_code =", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotEqualTo(String value) {
            addCriterion("serial_code <>", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeGreaterThan(String value) {
            addCriterion("serial_code >", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("serial_code >=", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLessThan(String value) {
            addCriterion("serial_code <", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLessThanOrEqualTo(String value) {
            addCriterion("serial_code <=", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeLike(String value) {
            addCriterion("serial_code like", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotLike(String value) {
            addCriterion("serial_code not like", value, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeIn(List<String> values) {
            addCriterion("serial_code in", values, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotIn(List<String> values) {
            addCriterion("serial_code not in", values, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeBetween(String value1, String value2) {
            addCriterion("serial_code between", value1, value2, "serialCode");
            return (Criteria) this;
        }

        public Criteria andSerialCodeNotBetween(String value1, String value2) {
            addCriterion("serial_code not between", value1, value2, "serialCode");
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

        public Criteria andBusinessCodeIsNull() {
            addCriterion("business_code is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("business_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("business_code =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("business_code <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("business_code >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("business_code >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("business_code <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("business_code <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("business_code like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("business_code not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("business_code in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("business_code not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("business_code between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("business_code not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
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

        public Criteria andPrintDateIsNull() {
            addCriterion("print_date is null");
            return (Criteria) this;
        }

        public Criteria andPrintDateIsNotNull() {
            addCriterion("print_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrintDateEqualTo(Timestamp value) {
            addCriterion("print_date =", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotEqualTo(Timestamp value) {
            addCriterion("print_date <>", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateGreaterThan(Timestamp value) {
            addCriterion("print_date >", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("print_date >=", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateLessThan(Timestamp value) {
            addCriterion("print_date <", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("print_date <=", value, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateIn(List<Timestamp> values) {
            addCriterion("print_date in", values, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotIn(List<Timestamp> values) {
            addCriterion("print_date not in", values, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("print_date between", value1, value2, "printDate");
            return (Criteria) this;
        }

        public Criteria andPrintDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("print_date not between", value1, value2, "printDate");
            return (Criteria) this;
        }

        public Criteria andCycleMonthIsNull() {
            addCriterion("cycle_month is null");
            return (Criteria) this;
        }

        public Criteria andCycleMonthIsNotNull() {
            addCriterion("cycle_month is not null");
            return (Criteria) this;
        }

        public Criteria andCycleMonthEqualTo(String value) {
            addCriterion("cycle_month =", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthNotEqualTo(String value) {
            addCriterion("cycle_month <>", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthGreaterThan(String value) {
            addCriterion("cycle_month >", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthGreaterThanOrEqualTo(String value) {
            addCriterion("cycle_month >=", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthLessThan(String value) {
            addCriterion("cycle_month <", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthLessThanOrEqualTo(String value) {
            addCriterion("cycle_month <=", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthLike(String value) {
            addCriterion("cycle_month like", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthNotLike(String value) {
            addCriterion("cycle_month not like", value, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthIn(List<String> values) {
            addCriterion("cycle_month in", values, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthNotIn(List<String> values) {
            addCriterion("cycle_month not in", values, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthBetween(String value1, String value2) {
            addCriterion("cycle_month between", value1, value2, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andCycleMonthNotBetween(String value1, String value2) {
            addCriterion("cycle_month not between", value1, value2, "cycleMonth");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoIsNull() {
            addCriterion("inv_certificate_no is null");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoIsNotNull() {
            addCriterion("inv_certificate_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoEqualTo(String value) {
            addCriterion("inv_certificate_no =", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoNotEqualTo(String value) {
            addCriterion("inv_certificate_no <>", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoGreaterThan(String value) {
            addCriterion("inv_certificate_no >", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("inv_certificate_no >=", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoLessThan(String value) {
            addCriterion("inv_certificate_no <", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("inv_certificate_no <=", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoLike(String value) {
            addCriterion("inv_certificate_no like", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoNotLike(String value) {
            addCriterion("inv_certificate_no not like", value, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoIn(List<String> values) {
            addCriterion("inv_certificate_no in", values, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoNotIn(List<String> values) {
            addCriterion("inv_certificate_no not in", values, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoBetween(String value1, String value2) {
            addCriterion("inv_certificate_no between", value1, value2, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvCertificateNoNotBetween(String value1, String value2) {
            addCriterion("inv_certificate_no not between", value1, value2, "invCertificateNo");
            return (Criteria) this;
        }

        public Criteria andInvAddressIsNull() {
            addCriterion("inv_address is null");
            return (Criteria) this;
        }

        public Criteria andInvAddressIsNotNull() {
            addCriterion("inv_address is not null");
            return (Criteria) this;
        }

        public Criteria andInvAddressEqualTo(String value) {
            addCriterion("inv_address =", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotEqualTo(String value) {
            addCriterion("inv_address <>", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressGreaterThan(String value) {
            addCriterion("inv_address >", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressGreaterThanOrEqualTo(String value) {
            addCriterion("inv_address >=", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressLessThan(String value) {
            addCriterion("inv_address <", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressLessThanOrEqualTo(String value) {
            addCriterion("inv_address <=", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressLike(String value) {
            addCriterion("inv_address like", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotLike(String value) {
            addCriterion("inv_address not like", value, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressIn(List<String> values) {
            addCriterion("inv_address in", values, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotIn(List<String> values) {
            addCriterion("inv_address not in", values, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressBetween(String value1, String value2) {
            addCriterion("inv_address between", value1, value2, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvAddressNotBetween(String value1, String value2) {
            addCriterion("inv_address not between", value1, value2, "invAddress");
            return (Criteria) this;
        }

        public Criteria andInvBankIsNull() {
            addCriterion("inv_bank is null");
            return (Criteria) this;
        }

        public Criteria andInvBankIsNotNull() {
            addCriterion("inv_bank is not null");
            return (Criteria) this;
        }

        public Criteria andInvBankEqualTo(String value) {
            addCriterion("inv_bank =", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotEqualTo(String value) {
            addCriterion("inv_bank <>", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankGreaterThan(String value) {
            addCriterion("inv_bank >", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankGreaterThanOrEqualTo(String value) {
            addCriterion("inv_bank >=", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankLessThan(String value) {
            addCriterion("inv_bank <", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankLessThanOrEqualTo(String value) {
            addCriterion("inv_bank <=", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankLike(String value) {
            addCriterion("inv_bank like", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotLike(String value) {
            addCriterion("inv_bank not like", value, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankIn(List<String> values) {
            addCriterion("inv_bank in", values, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotIn(List<String> values) {
            addCriterion("inv_bank not in", values, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankBetween(String value1, String value2) {
            addCriterion("inv_bank between", value1, value2, "invBank");
            return (Criteria) this;
        }

        public Criteria andInvBankNotBetween(String value1, String value2) {
            addCriterion("inv_bank not between", value1, value2, "invBank");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Long value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Long value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Long value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Long value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Long> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Long> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Long value1, Long value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIsNull() {
            addCriterion("gift_amount is null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIsNotNull() {
            addCriterion("gift_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountEqualTo(Long value) {
            addCriterion("gift_amount =", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotEqualTo(Long value) {
            addCriterion("gift_amount <>", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThan(Long value) {
            addCriterion("gift_amount >", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("gift_amount >=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThan(Long value) {
            addCriterion("gift_amount <", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThanOrEqualTo(Long value) {
            addCriterion("gift_amount <=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIn(List<Long> values) {
            addCriterion("gift_amount in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotIn(List<Long> values) {
            addCriterion("gift_amount not in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountBetween(Long value1, Long value2) {
            addCriterion("gift_amount between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotBetween(Long value1, Long value2) {
            addCriterion("gift_amount not between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andBaseRateIsNull() {
            addCriterion("base_rate is null");
            return (Criteria) this;
        }

        public Criteria andBaseRateIsNotNull() {
            addCriterion("base_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBaseRateEqualTo(Double value) {
            addCriterion("base_rate =", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotEqualTo(Double value) {
            addCriterion("base_rate <>", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateGreaterThan(Double value) {
            addCriterion("base_rate >", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateGreaterThanOrEqualTo(Double value) {
            addCriterion("base_rate >=", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateLessThan(Double value) {
            addCriterion("base_rate <", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateLessThanOrEqualTo(Double value) {
            addCriterion("base_rate <=", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateIn(List<Double> values) {
            addCriterion("base_rate in", values, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotIn(List<Double> values) {
            addCriterion("base_rate not in", values, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateBetween(Double value1, Double value2) {
            addCriterion("base_rate between", value1, value2, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotBetween(Double value1, Double value2) {
            addCriterion("base_rate not between", value1, value2, "baseRate");
            return (Criteria) this;
        }

        public Criteria andAddRateIsNull() {
            addCriterion("add_rate is null");
            return (Criteria) this;
        }

        public Criteria andAddRateIsNotNull() {
            addCriterion("add_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAddRateEqualTo(Double value) {
            addCriterion("add_rate =", value, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateNotEqualTo(Double value) {
            addCriterion("add_rate <>", value, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateGreaterThan(Double value) {
            addCriterion("add_rate >", value, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateGreaterThanOrEqualTo(Double value) {
            addCriterion("add_rate >=", value, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateLessThan(Double value) {
            addCriterion("add_rate <", value, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateLessThanOrEqualTo(Double value) {
            addCriterion("add_rate <=", value, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateIn(List<Double> values) {
            addCriterion("add_rate in", values, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateNotIn(List<Double> values) {
            addCriterion("add_rate not in", values, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateBetween(Double value1, Double value2) {
            addCriterion("add_rate between", value1, value2, "addRate");
            return (Criteria) this;
        }

        public Criteria andAddRateNotBetween(Double value1, Double value2) {
            addCriterion("add_rate not between", value1, value2, "addRate");
            return (Criteria) this;
        }

        public Criteria andBaseAmountIsNull() {
            addCriterion("base_amount is null");
            return (Criteria) this;
        }

        public Criteria andBaseAmountIsNotNull() {
            addCriterion("base_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBaseAmountEqualTo(Long value) {
            addCriterion("base_amount =", value, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountNotEqualTo(Long value) {
            addCriterion("base_amount <>", value, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountGreaterThan(Long value) {
            addCriterion("base_amount >", value, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("base_amount >=", value, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountLessThan(Long value) {
            addCriterion("base_amount <", value, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountLessThanOrEqualTo(Long value) {
            addCriterion("base_amount <=", value, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountIn(List<Long> values) {
            addCriterion("base_amount in", values, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountNotIn(List<Long> values) {
            addCriterion("base_amount not in", values, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountBetween(Long value1, Long value2) {
            addCriterion("base_amount between", value1, value2, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andBaseAmountNotBetween(Long value1, Long value2) {
            addCriterion("base_amount not between", value1, value2, "baseAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountIsNull() {
            addCriterion("add_amount is null");
            return (Criteria) this;
        }

        public Criteria andAddAmountIsNotNull() {
            addCriterion("add_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAddAmountEqualTo(Long value) {
            addCriterion("add_amount =", value, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountNotEqualTo(Long value) {
            addCriterion("add_amount <>", value, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountGreaterThan(Long value) {
            addCriterion("add_amount >", value, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("add_amount >=", value, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountLessThan(Long value) {
            addCriterion("add_amount <", value, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountLessThanOrEqualTo(Long value) {
            addCriterion("add_amount <=", value, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountIn(List<Long> values) {
            addCriterion("add_amount in", values, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountNotIn(List<Long> values) {
            addCriterion("add_amount not in", values, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountBetween(Long value1, Long value2) {
            addCriterion("add_amount between", value1, value2, "addAmount");
            return (Criteria) this;
        }

        public Criteria andAddAmountNotBetween(Long value1, Long value2) {
            addCriterion("add_amount not between", value1, value2, "addAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountIsNull() {
            addCriterion("terminal_amount is null");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountIsNotNull() {
            addCriterion("terminal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountEqualTo(Long value) {
            addCriterion("terminal_amount =", value, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountNotEqualTo(Long value) {
            addCriterion("terminal_amount <>", value, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountGreaterThan(Long value) {
            addCriterion("terminal_amount >", value, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("terminal_amount >=", value, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountLessThan(Long value) {
            addCriterion("terminal_amount <", value, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountLessThanOrEqualTo(Long value) {
            addCriterion("terminal_amount <=", value, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountIn(List<Long> values) {
            addCriterion("terminal_amount in", values, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountNotIn(List<Long> values) {
            addCriterion("terminal_amount not in", values, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountBetween(Long value1, Long value2) {
            addCriterion("terminal_amount between", value1, value2, "terminalAmount");
            return (Criteria) this;
        }

        public Criteria andTerminalAmountNotBetween(Long value1, Long value2) {
            addCriterion("terminal_amount not between", value1, value2, "terminalAmount");
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

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
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