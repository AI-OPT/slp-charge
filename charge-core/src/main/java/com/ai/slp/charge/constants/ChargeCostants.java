package com.ai.slp.charge.constants;

/**
 * 收费中心常量定义类
 * Date: 2015年8月13日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public final class ChargeCostants {
    
    private ChargeCostants() {
        
    }
    
    /**
     * 收费流水记录表
     * Date: 2015年8月13日 <br>
     * Copyright (c) 2015 asiainfo.com <br>
     * 
     * @author fanpw
     */
    public static final class ChgChargeLog {
        
        private ChgChargeLog() {
            
        }

        /**
         * 业务类型
         * Date: 2015年8月13日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * 
         * @author fanpw
         */
        public static final class BusiType {
            
            private BusiType() {
                
            }
            
            /**
             * 1、订单收费类
             */
            public static final String ORDER_CHARGE = "1";
            
            /**
             * 2、缴费充值类
             */
            public static final String ACCOUNT_CHARGE = "2";
            
        }
        
        /**
         * 收费记录状态
         * Date: 2015年8月13日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * 
         * @author fanpw
         */
        public static final class Status {
            
            private Status() {
                
            }
            
            /**
             * 正常（交费/退费）
             */
            public static final int PAYMENT = 1;
            
            /**
             * 冲正
             */
            public static final int PAYMENT_REVERSAL = 0;
            
        }
        
        /**
         * 对帐/轧帐状态
         * Date: 2015年8月13日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * 
         * @author fanpw
         */
        public static final class CheckStatus {
            
            private CheckStatus() {
                
            }
            
            /**
             * 0：未对帐/轧帐
             */
            public static final int UNCHECK = 0;
            
            /**
             * 1：已对帐/轧帐
             */
            public static final int CHECKED = 1;
            
        }
        
        /**
         * 打印次数
         * Date: 2015年8月13日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * 
         * @author fanpw
         */
        public static final class PrintTimes {
            
            private PrintTimes() {
                
            }
            
            public static final int NEVER = 0;
            
        }
        
        /**
         * 收费渠道
         * Date: 2015年8月14日 <br>
         * Copyright (c) 2015 asiainfo.com <br>
         * 
         * @author fanpw
         */
        public static final class PayChannel {
            
            private PayChannel() {
                
            }
            
            public static final String BUSINESS_HALL  = "1";
            
        }
        
    }
    
    /**
     * 租户常量定义
     *
     * Date: 2015年9月15日 <br>
     * Copyright (c) 2015 asiainfo.com <br>
     * @author fanpw
     */
    public static final class TenantCode {
        
        private TenantCode() {
            
        }
        
        public static final String ALL  = "all";
        
    }
    
    /**
     * 省份编码定义
     *
     * Date: 2015年9月15日 <br>
     * Copyright (c) 2015 asiainfo.com <br>
     * @author fanpw
     */
    public static final class ProvinceCode {
        
        private ProvinceCode() {
            
        }
        
        public static final String ALL  = "00";
        
    }
    
    /**
     * 地市编码定义
     *
     * Date: 2015年9月15日 <br>
     * Copyright (c) 2015 asiainfo.com <br>
     * @author fanpw
     */
    public static final class CityCode {
        
        private CityCode() {
            
        }
        
        public static final String ALL  = "000";
        
    }
    
    /**
     * 税率类型定义
     *
     * Date: 2015年9月16日 <br>
     * Copyright (c) 2015 asiainfo.com <br>
     * @author fanpw
     */
    public static final class TaxType {
        
        private TaxType() {
            
        }

        /**
         * 基础通信费用
         */
        public static final int BASIC_FEE = 1;

        /**
         * 增值通信费用
         */
        public static final int ADDED_VALUE_FEE = 2;
        
        /**
         * 混合比例
         */
        public static final int MIX_FEE = 3;

        /**
         * 终端费用
         */
        public static final int TERMINAL_FEE = 4;
    }
    
}
