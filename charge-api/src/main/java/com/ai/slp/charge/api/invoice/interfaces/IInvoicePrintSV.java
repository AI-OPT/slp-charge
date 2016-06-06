package com.ai.slp.charge.api.invoice.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.charge.api.invoice.param.InvoiceTax;
import com.ai.slp.charge.api.invoice.param.InvoiceTaxQryParam;
import com.ai.slp.charge.api.invoice.param.OrderInvoicePrintDetail;
import com.ai.slp.charge.api.invoice.param.OrderInvoicePrintReq;
import com.ai.slp.charge.api.invoice.param.TaxPrintLog;

/**
 * 发票凭证打印服务.<br>
 *
 * Date: 2015年9月15日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface IInvoicePrintSV {

    /**
     * 发票税率查询.<br>
     * @param param 发票税率查询入参
     * @return 增值税发票税率信息
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod 
     * @ApiCode CHG_0032
     */
    InvoiceTax queryInvoiceTax(InvoiceTaxQryParam param) throws BusinessException,SystemException;
       
    /**
     * 订单发票打印数据提取.<br>
     * @param req 订单发票打印请求
     * @return 订单发票打印数据
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0029
     */
    OrderInvoicePrintDetail queryOrderInvoicePrintDetail(OrderInvoicePrintReq req) throws BusinessException,SystemException;
    
    /**
     * 保存增值税发票打印记录.<br>
     * @param log 增值税发票打印日志
     * @throws BusinessException,SystemException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode CHG_0030
     */
    void saveTaxPrintLog(TaxPrintLog log) throws BusinessException,SystemException;
}
