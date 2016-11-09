<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><%@ page contentType="text/html;charset=gb2312" %>
<%@ include file="/back_page/taglibs.jsp" %>

<html class=" js touch cssanimations csstransitions">
<head>
<title>tstPage</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<meta name="author" content="">
<meta name="copyright" content="">
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="email=no">
<!-- 启用360浏览器的极速模式(webkit) -->
<meta name="renderer" content="webkit">
<!-- 避免IE使用兼容模式 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- 针对手持设备优化，主要是针对一些老的不识别viewport的浏览器，比如黑莓 -->
<meta name="HandheldFriendly" content="true">
<!-- 微软的老式浏览器 -->
<meta name="MobileOptimized" content="320">
<!-- uc强制竖屏 -->
<meta name="screen-orientation" content="portrait">
<!-- QQ强制竖屏 -->
<meta name="x5-orientation" content="portrait">
<!-- UC强制全屏 -->
<meta name="full-screen" content="yes">
<!-- QQ强制全屏 -->
<meta name="x5-fullscreen" content="true">
<!-- UC应用模式 -->
<meta name="browsermode" content="application">
<!-- QQ应用模式 -->
<meta name="x5-page-mode" content="app">
<!--这meta的作用就是删除默认的苹果工具栏和菜单栏-->
<meta name="apple-mobile-web-app-capable" content="yes">
<!--网站开启对web app程序的支持-->
<meta name="apple-touch-fullscreen" content="yes">
<!--在web app应用下状态条（屏幕顶部条）的颜色-->
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<!-- windows phone 点击无高光 -->
<meta name="msapplication-tap-highlight" content="no">
<!--移动web页面是否自动探测电话号码-->
<meta http-equiv="x-rim-auto-match" content="none">
<!--移动端版本兼容 start -->
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" name="viewport">
<!--移动端版本兼容 end -->
<link rel="stylesheet" type="text/css" href="/hello2/res/css/wap.css">
<script type="text/javascript" src="/hello2/res/common/js/jquery.js"></script>
<script src="/hello2/res/common/js/before.js"></script>
</head>

<body>
	<div id="ajax-form-box"></div>
	<div class="pt-perspective" id="perspective">
		<div class="pt-page pb20 pt-page-current" id="main-box" style="height: 667px;">
			<div>
				<div class="pb-wrap">
					<div class="order-content">
						<div class="order-name t-e">支付宝支付订单</div>
						<div class="order-amount">
							<strong id="amount">${amt}</strong><em>元</em>
						</div>
					</div>
					<dl class="order-details" id="order-details">
						<dt>操作员：${orderID}</dt>
						<dd>订单编号：${order}</dd>
					</dl>
					<dl class="order-pay-way more-two" id="other-pay">
						<dd class="other-pay-link">
							<a href="javascript:;" dataname="alipayWap"
								dataway="支付宝" dataurl=${path}
								datacode="00600110" datatoptips="" datasectips="" class="block-link">
								<b class="bank-icon icon-alipay"></b>支付宝<b class="to-right"></b>
							</a>
						</dd>
						<dd class="other-pay-link">
							<a href="javascript:;" dataname="wePay" dataway="微信支付"
								dataurl="weixin://wap/pay?appid=wx24603f132a6753ea&noncestr=SRJQ0h4fCOZGJFvf&package=WAP&prepayid=wx201610251823466a4f0d0ffd0169512504&sign=63BDE7F3490E3A343BD378D046A78888&timestamp=1477390310" id="wePay" datatoptips=""
								datasectips="" datacode="02802006" class="block-link">
								<b class="bank-icon icon-wechat"></b>微信支付<em class="otherTips">(支持6.0.2及以上版本使用)</em><b class="to-right"></b>
							</a>
						</dd>
						
					</dl>
					<div id="showMorePayWay">
						<span>更多支付方式</span>
					</div>
					<div class="wap-footer">版权所有 2016 测试页面</div>
				</div>
			</div>
		</div>
		<div class="load">
            <div class="loading">
               <div class="loadImg"></div>
               <div class="loadTxt">Tst</div>
            </div>
         </div>
		<div id="errBox">
			<div id="errBoxTxt"></div>
		</div>
		<script type="text/javascript" src="${context_root}/js/tstFunction.js"></script>
</body>
</html>
<!-- <dl class="order-pay-way" id="use-balance" style=""><dt>选择余额：</dt><dd class="disable"><a href="javascript:;" dataway="余额支付" datacode="" datatoptips=""datasectips="" dataurl="/wap/trade/accountPay.htm"class="block-link" id="balance-pay"> <bclass="bank-icon icon-balance"></b>余额支付 <em class="now-balance">可用0元</em><b class="choose-box"></b></a></dd></dl> --><!-- /wap/trade/aliPayWapPay.htm" --><!-- <dd id="hf-pay"><a href="javascript:;" dataname="mobileValue"dataurl="/trade/mobilepay/mobileList.htm?tradeId=201610191417JY954845"upurl="/trade/mobilepay/singleTrade.htm" authorizedpayflag="N" class="block-link"><b class="bank-icon icon-hf"></b>话费支付<b class="to-right"></b></a></dd><dd class="other-pay-link"><a href="javascript:;" dataname="tenpay" dataway="财付通"dataurl="/wap/trade/tenpayWapPay.htm" datatoptips=""datasectips="" datacode="00903218" class="block-link"><b class="bank-icon icon-tenpay"></b>财付通<b class="to-right"></b></a></dd><dd class="addCardDd"><a href="javascript:;" class="block-link" id="newQuickPay"><b class="bank-icon icon-addQuickPay"></b>添加快捷支付<b class="to-right"></b></a></dd> -->