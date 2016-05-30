package com.ai.runner.center.charge.api.invoice.param;

import java.io.Serializable;

/**
 * 增值税发票税率信息.<br>
 *
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class InvoiceTax implements Serializable {

    private static final long serialVersionUID = -4849415006508423510L;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 省份编码
     */
    private String provCode;

    /**
     * 地市编码
     */
    private String cityCode;

    /**
     * 基础业务税率
     */
    private Double baseTax;

    /**
     * 增值业务税率
     */
    private Double addTax;

    /**
     * 终端税率
     */
    private Double terminalTax;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
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
