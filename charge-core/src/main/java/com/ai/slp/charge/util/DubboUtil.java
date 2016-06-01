package com.ai.slp.charge.util;

import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.runner.base.exception.SystemException;
import com.ai.runner.center.common.api.subject.interfaces.IGnSubjectQuerySV;

/**
 * dubbo服务消费工具类
 *
 * Date: 2015年9月16日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public final class DubboUtil {

    private DubboUtil() {

    }

    /*
     * static { System.setProperty(CenterProductDef.CENTER_PRODUCT_SYS_PROPERTY,
     * CenterProductDef.CenterProductName.AM_CENTER); }
     */

    /**
     * 获取公共域科目查询服务
     * 
     * @return
     * @author lilg
     */
    public static IGnSubjectQuerySV getIGnSubjectQuerySV() {
        IGnSubjectQuerySV sv = null;
        try {
            sv = DubboConsumerFactory.getService("IGnSubjectQuerySV", IGnSubjectQuerySV.class);
        } catch (Exception ex) {
            throw new SystemException(ex);
        }
        if (sv == null) {
            throw new SystemException("获取不到远程服务:" + IGnSubjectQuerySV.class);
        }
        return sv;
    }

}
