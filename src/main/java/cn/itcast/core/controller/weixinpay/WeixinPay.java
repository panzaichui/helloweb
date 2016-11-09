package cn.itcast.core.controller.weixinpay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="weixin")
public class WeixinPay {
	@RequestMapping(value="getURL")
	public String getURL(){
		return "brand/list";
		
		
	}

}
