package cn.itcast.core.controller.jsonSend;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.bean.user.User;
import cn.itcast.core.service.product.BrandService;

/**
 * 测试ajax和spring mvc的交互
 * 
 * @author pzc
 * 
 */
@Controller
@RequestMapping(value = "jsonSend")
public class JsonSend {
	private static Logger logger = Logger.getLogger(JsonSend.class);

	@Autowired
	private BrandService brandService;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@RequestMapping(value = "jsonSend")
	public void getBrandListWithPage(HttpServletRequest res,
			HttpServletResponse rep) throws Exception {
		//获取ajax的数据
	//	InputStream in = res.getInputStream();
		StringBuffer sf = new StringBuffer();
//		int len = 0;
//		byte[] buffer = new byte[1024];
//		while ((len = in.read(buffer)) != -1) {
//			String a = new String(buffer, "UTF-8");
//			sf.append(a);
//			// System.out.println(a);
//		}
//		//输出页面数据到日志中
		
		//logger.info("前台数据为："+res.getParameter("people"));
		String  ds=res.getParameter("ds");
		JSONArray json=JSONArray.fromObject(ds);
		logger.info("前台数据为："+json.toString());
		
		//准备数据
		User user=new User();
		user.setId(1);
		user.setName("true");
		JSONArray jsonArrayUser=JSONArray.fromObject(user);
		
		//发送给第三方服务
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(
				"http://localhost:8080/hello2/callService/callService.do");
		StringEntity postEntity = new StringEntity(jsonArrayUser.toString(), "UTF-8");
		httpPost.addHeader("Content-Type", "text/xml");
		httpPost.setEntity(postEntity);
		
		//获取第三方服务的数据
		HttpResponse response = httpClient.execute(httpPost);
		HttpEntity entity = response.getEntity();
		String result = EntityUtils.toString(entity, "UTF-8");
        
		rep.setContentType("text/html;charset=utf-8");
		rep.setCharacterEncoding("utf-8");
		rep.setContentType("application/json;charset=utf-8");
		logger.info(result);
		logger.info("哈哈哈哈哈");
		String str = "{\"success\":true}";
		String str1 = "{\"success\":" + result + "}";
		logger.info(str + "-------" + str1);
        //组装json格式的数据
		Map map = new HashMap<String, String>();
		map.put("success", "true");
	    JSONArray jsonArray = JSONArray.fromObject(map);  
		rep.getWriter().write(str);
		logger.info(jsonArray.toString());
		rep.getWriter().flush();

	}

}
