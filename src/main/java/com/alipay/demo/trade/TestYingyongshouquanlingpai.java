package com.alipay.demo.trade;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayOpenAuthTokenAppRequest;
import com.alipay.api.response.AlipayOpenAuthTokenAppResponse;

/**
 * Created by  on 2016/10/21.
 */
public class TestYingyongshouquanlingpai {
    public static void main(String[] args) {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","2016072800110106","MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALS+Qzgq2XI4omL1GY8d2SnPO3AlSTzgJY6fQh2t109jV8XIU6aCtEsHFXeNMome9NhVHgjS00LF4ovyCe/CcurATNJxZQNWUwYwDDbKpZAIC1jZyaVENWufFsNTr4x/4XA/g7omNbG/EBbUV9dThhNV//9MlBM/SRjbIaarDWf5AgMBAAECgYEArlm22BClj4RISPMsQ51EZgtsx8KAAoQqVokUKzMNtpwbCEQ1RTNiHdnogFmpPY4jnCeHgHV2qzveTKcfpLPLSz85CcXTl30FgcCyQXWYQ2hcutM6YfLmI8kUXZfYutAbFjx+inEKUrcsULYjKZzjW/zwEy5Q4nNuwqzAMuoC6e0CQQDb6R5rR7GXE8EIep6k+Z4IPTbrb907CnSRzV+kogl34sgukksRACzORHs59CxI8uB9jUBHaVBSaxOw0arjEouLAkEA0meksHW2di30q+6TjTp+KcXVo+a/uataYQ5rSKAkfoaNsrXGLetnYcUVrdGlsBIXczNPxN245MFj74w+hdVbCwJATq4hjBCioYMX1YjJqg0FVb1RIPttE+qxuljYl3bCHHqvVLpS0UpWvZYS4LFUBuWfHEylaudrLZHSAbmCgqvn8QJAC6XJLCuYCjrJDKuMZ4kRauaUyRoBCxo9Spotvjt/SbHRLk95xRj/BB6Q8KpmbbTSr4HrrI5JqgA6tAwjee0xuQJAZ1/GuczldMSU3/YmLTDSJZXbMXC+YK3QlwFUBurMfTxuf9i4xAIbcqUoM8zvqj49NRa3n/uUd1mnPzPo1lYl2A==","json","GBK","MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB");
        AlipayOpenAuthTokenAppRequest request = new AlipayOpenAuthTokenAppRequest();
        request.setBizContent("{" +
                "    \"grant_type\":\"authorization_code\"," +
                "    \"code\":\"1cc19911172e4f8aaa509c8fb5d12F56\"," +
                "    \"refresh_token\":\"201509BBdcba1e3347de4e75ba3fed2c9abebE36\"" +
                "  }");
        try {
            AlipayOpenAuthTokenAppResponse response = alipayClient.execute(request);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

    }
}
