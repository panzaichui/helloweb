package cn.itcast.core.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(value="merchant")
public class MerchantAction {

	@RequestMapping(value="findAll")
	public String findAll(){
		return "index";
		
	
	}


	
}
