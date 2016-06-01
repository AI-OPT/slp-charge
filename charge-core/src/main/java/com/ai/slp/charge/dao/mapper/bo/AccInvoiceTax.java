package com.ai.slp.charge.dao.mapper.bo;

public class AccInvoiceTax {
    private String tenantId;

    private String provCode;

    private String cityCode;

    private Double baseTax;

    private Double addTax;

    private Double terminalTax;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Double getBaseTax() {
        return baseTax;
    }

    public void setBaseTax(Double baseTax) {
        this.baseTax = baseTax;
    }

    public Double getAddTax() {
        return addTax;
    }

    public void setAddTax(Double addTax) {
        this.addTax = addTax;
    }

    public Double getTerminalTax() {
        return terminalTax;
    }

    public void setTerminalTax(Double terminalTax) {
        this.terminalTax = terminalTax;
    }
}