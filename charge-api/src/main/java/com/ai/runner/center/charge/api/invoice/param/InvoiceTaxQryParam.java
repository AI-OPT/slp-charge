package com.ai.runner.center.charge.api.invoice.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 发票税率查询入参.<br>
 *
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class InvoiceTaxQryParam extends BaseInfo {

    private static final long serialVersionUID = -6548972609260219363L;

    /**
     * 省份编码，必填项<br>
     * 默认填00表示采用全国统一税率<br>
     */
    private String provinceCode;

    /**
     * 地市编码，必填项<br>
     * 默认填000表示采用全国统一税率<br>
     */
    private String cityCode;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
