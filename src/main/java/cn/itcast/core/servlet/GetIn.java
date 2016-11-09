package cn.itcast.core.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

/**
 * 
 * @author pzc
 *
 */

public class GetIn extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		InputStream in=request.getInputStream();
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		int len = 0;
//		byte[] buffer = new byte[1024];
//		while ((len = in.read(buffer)) != -1) {
//			System.out.println("iiiiiiiiiiiiii");
//		//	out.write(buffer, 0, len);
//			String a =new String(buffer,"utf-8");
//			System.out.println(a+"!");
//		}
	       Map map=new HashMap<String, String>();
	       map.put("id", "1");
	       map.put("name", "潘在垂");
	       
	       JSONArray jsonArray = JSONArray.fromObject(map);  
	       System.out.println(jsonArray.toString());
		//String result = out.toString();
		//System.out.println(result+"**");
		System.out.println(request.getParameter("name")+"aaaaaaa");
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		//response.setHeader("pragma","no-cache");
		//response.setHeader("cache-control","no-cache");
		PrintWriter p=response.getWriter();
		//p.println(jsonArray.toString());
		p.write("{\"success\":true }");
		p.flush();
		p.close();
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		InputStream in=request.getInputStream();
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		int len = 0;
//		byte[] buffer = new byte[1024];
//		while ((len = in.read(buffer)) != -1) {
//			out.write(buffer, 0, len);
//		}
//
//		String result = out.toString();
//		System.out.println(result+"**");
		doGet(request,response);

		//String str=request.getParameter("people");
		//System.out.println(str);
	}

}
