package com.ai.runner.center.charge.service.atom.interfaces;

import com.ai.runner.center.charge.dao.mapper.bo.AccInvoiceTax;

/**
 * 增值税发票税率基础服务 
 *
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface IAccInvoiceTaxSV {

    AccInvoiceTax getAccInvoiceTax(String tenantId, String provinceCode, String cityCode);
    
}
