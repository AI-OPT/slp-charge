package com.ai.slp.charge.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.slp.charge.api.invoice.param.InvoiceTax;
import com.ai.slp.charge.api.invoice.param.InvoiceTaxQryParam;
import com.ai.slp.charge.api.invoice.param.OrderInvoicePrintDetail;
import com.ai.slp.charge.api.invoice.param.OrderInvoicePrintReq;
import com.ai.slp.charge.api.invoice.param.TaxPrintLog;

/**
 * 发票凭证打印业务接口定义.<br>
 *
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface IInvoicePrintCombSV {

    /**
     * 发票税率查询
     * @param param
     * @return
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    InvoiceTax queryInvoiceTax(InvoiceTaxQryParam param) throws BusinessException;
    
    /**
     * 订单发票打印数据提取
     * @param req
     * @return
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    OrderInvoicePrintDetail queryOrderInvoicePrintDetail(OrderInvoicePrintReq req) throws BusinessException;
    
    /**
     * 保存增值税发票打印记录
     * @param log
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    void saveTaxPrintLog(TaxPrintLog log) throws BusinessException;
    
}
