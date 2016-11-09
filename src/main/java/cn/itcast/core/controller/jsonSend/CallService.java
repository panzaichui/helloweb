package cn.itcast.core.controller.jsonSend;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="callService")
public class CallService {
	private static Logger logger = Logger.getLogger(JsonSend.class);
	@RequestMapping(value="callService")
	public void req(HttpServletRequest res,HttpServletResponse rep) throws Exception{
		InputStream in = res.getInputStream();
		StringBuffer sf = new StringBuffer();
		int len = 0;
		byte[] buffer = new byte[1024];
		while ((len = in.read(buffer)) != -1) {
			String a = new String(buffer, "UTF-8");
			sf.append(a);
			//System.out.println(a);
		}
		logger.info("callService:"+sf.toString());
		rep.setContentType("text/html;charset=utf-8");
		rep.setCharacterEncoding("utf-8");
		rep.setContentType("application/json;charset=utf-8");
		
		rep.getWriter().write(sf.toString());
		rep.getWriter().flush();
		
		
	}

}
