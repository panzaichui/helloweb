<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/back_page/head.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>正在跳转支付宝支付</title>
<script type="text/javascript">
	//window.location="https://qr.alipay.com/bax01575xtiovpbcv45u0050"
	// window.location=request.get
	// onload=function(){ <span style="white-space:pre"> </span>//在进入网页的时候加载该方法 
	// setTimeout(go, 3000); <span style="white-space:pre"> </span> /*在js中是ms的单位*/ 
	//  }; 
	function go() {
		//var str=${"#gotoURL"}.html();
	//	var n=document.getElementById("gotoURL").innerText;
		alert(n);
		window.location = "weixin://wap/pay?appid=wx24603f132a6753ea&noncestr=SRJQ0h4fCOZGJFvf&package=WAP&prepayid=wx201610251823466a4f0d0ffd0169512504&sign=63BDE7F3490E3A343BD378D046A78888&timestamp=1477390310";

	}
</script>
</head>
<body>
	<div id="gotoURL">${weixin}</div>
	<button onclick="go()"  style="width: 85px; height: 60px;">点击使用支付宝支付</button>
</body>

</html>
