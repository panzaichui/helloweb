package cn.itcast.core.controller.admin;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.bean.product.Brand;
import cn.itcast.core.page.Page;
import cn.itcast.core.service.product.BrandService;
import freemarker.cache.StringTemplateLoader;
/**
 * 使用redis
 * @author pzc
 *
 */
@Controller
@RequestMapping(value="brand")
public class BrandController {
	 private static Logger logger = Logger.getLogger(BrandController.class);
	
	@Autowired
	private BrandService brandService;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	
	@RequestMapping(value="list")
	public String getBrandListWithPage(String name,Integer isDisplay,Integer pageNo,ModelMap model,HttpServletRequest res) throws Exception{
		
		//System.out.println(res.getParameter("firstName"));
		InputStream in=res.getInputStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
			String a =new String(buffer,"utf-8");
		}
		//获取连接库
		BoundHashOperations<String, String, String> ops = stringRedisTemplate
				.boundHashOps("0");
		ops.put("cs01", "123");// 存入数据 ops.putAll(maps); 存入多条数据
		String result = out.toString();
		System.out.println(result+"**");
		//System.out.println(res.getParameter("")+"aaaaaaaaa");
		logger.info("这是第一条日志");
		logger.debug("这是第一条日志");
		System.out.println(name+isDisplay+pageNo);
		Brand brand=new Brand();
		if(StringUtils.isNotBlank(name)){
			brand.setName(name);
		}	
		if(isDisplay!=null){
			brand.setIsDisplay(isDisplay);
		}
		if(pageNo==null||pageNo.equals("")){
			brand.setPageNo(1);
		}else{
			brand.setPageNo(pageNo);
		}
		brand.setPageSize(5);//设置最大页数
		//查出记录数
		Integer count=brandService.getBrandCount(brand);
		//设置显示多少的页码
		int pageSize=brand.getPageSize();
		int page=count/pageSize+1;
		List<Page> listPage=new ArrayList<Page>();
		model.addAttribute("name",name);
		for(int i=1;i<=page;i++){
			Page p=new Page();
			p.setPage(i);
			p.setUrl("/hello2/brand/list.do?name="+name+"&isDisplay="+isDisplay+"&pageNo="+i);
			System.out.println(p.getUrl());
			listPage.add(p);
			
		}
		System.out.println(count+"--"+page);
		List<Brand> list=brandService.getBrandListWithPage(brand);
		model.addAttribute("list",list);
		if(pageNo==null||pageNo.equals("")){
			pageNo=1;
		}
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("isDisplay",isDisplay);
		model.addAttribute("listPage",listPage);
		
		
		
	
		
		return "brand/list";
		
	}

}
