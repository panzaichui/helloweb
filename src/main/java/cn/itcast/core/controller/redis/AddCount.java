package cn.itcast.core.controller.redis;

import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.jdbc.TimeUtil;

import cn.itcast.core.controller.admin.BrandController;
/**
 * 实现设置访问量
 * 实现控制一分钟内一个IP地址访问不能超过3次
 * @author pzc
 *
 */

@Controller
@RequestMapping(value = "addCount")
public class AddCount {
	private static Logger logger = Logger.getLogger(BrandController.class);
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@RequestMapping(value = "add")
	public String getBrandListWithPage(ModelMap model,
			HttpServletRequest request) throws Exception {
		// 获取连接库
		BoundHashOperations<String, String, String> ops = stringRedisTemplate
				.boundHashOps("0");
		String ip=request.getRemoteAddr();
		boolean flagIP = ops.hasKey(ip+"5");
		if(flagIP){
			String sum = ops.get(ip+"5");
			System.out.println(sum);
			if(Integer.parseInt(sum)>3){
				model.addAttribute("count", "您的访问次数已经超限  请稍后继续访问");
				return "redis/count";
			}else{
				ops.increment(ip+"5", 1);
			}
		}else{
			ops.put(ip+"5", "1");
			long a=1;
			stringRedisTemplate.expire(ip+"5",a,TimeUnit.MINUTES);
		System.out.println("aaaaaaaaaaaaaaa");
		}
		
		
		
		// 从redis查找缓存 检查是否缓存了数据
		boolean flag = ops.hasKey("count:for:fangwen");
		String count = "1";
		if (flag) {
			ops.increment("count:for:fangwen", 1);
			count = ops.get("count:for:fangwen");
		} else {
			ops.put("count:for:fangwen", "1");
		}

		model.addAttribute("count", count);
		return "redis/count";

	}
}
