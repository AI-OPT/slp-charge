package com.ai.slp.charge.util;

import com.ai.opt.sdk.util.BeanUtils;
import com.ai.slp.charge.vo.SubjectFundVo;
import com.ai.slp.charge.vo.SubjectVo;
import com.ai.slp.common.api.subject.param.Subject;
import com.ai.slp.common.api.subject.param.SubjectFund;
import com.ai.slp.common.api.subject.param.SubjectIdParam;


/**
 * 从缓存中获取科目定义 <br>
 *
 * Date: 2015年9月16日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public final class FunSubjectUtil {

    private FunSubjectUtil() {
    }

    /**
     * 从缓存中获取科目，返回对象 <br>
     * 缓存对象融合了FUN_SUBJECT和FUN_SUBJECT_FUND
     * 
     * @param subjectId
     * @return
     * @author lilg
     * @ApiDocMethod
     */
    public static SubjectFundVo getSubjectFund(String tenantId, Long subjectId) {
        SubjectFund subjectFund = DubboUtil.getIGnSubjectQuerySV().getSubjectFund(
                new SubjectIdParam(tenantId, subjectId));
        if (subjectFund == null) {
            return null;
        }
        SubjectFundVo vo = new SubjectFundVo();
        BeanUtils.copyProperties(vo, subjectFund);
        return vo;
    }

    /**
     * 从缓存中获取科目名称
     * 
     * @param subjectId
     * @return
     * @author lilg
     * @ApiDocMethod
     */
    public static String getSubjectName(String tenantId, Long subjectId) {
        return DubboUtil.getIGnSubjectQuerySV().getSubjectName(
                new SubjectIdParam(tenantId, subjectId));
    }
    
    /**
     * 从缓存中获取科目定义
     * @param tenantId
     * @param subjectId
     * @return
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    public static SubjectVo getSubject(String tenantId, Long subjectId) {
        Subject subject = DubboUtil.getIGnSubjectQuerySV().getSubject(new SubjectIdParam(tenantId, subjectId));
        if (subject == null) {
            return null;
        }
        SubjectVo vo = new SubjectVo();
        BeanUtils.copyProperties(vo, subject);
        return vo;
    }

}
