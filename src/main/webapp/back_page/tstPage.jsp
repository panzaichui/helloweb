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
<!-- ����360������ļ���ģʽ(webkit) -->
<meta name="renderer" content="webkit">
<!-- ����IEʹ�ü���ģʽ -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- ����ֳ��豸�Ż�����Ҫ�����һЩ�ϵĲ�ʶ��viewport��������������ݮ -->
<meta name="HandheldFriendly" content="true">
<!-- ΢�����ʽ����� -->
<meta name="MobileOptimized" content="320">
<!-- ucǿ������ -->
<meta name="screen-orientation" content="portrait">
<!-- QQǿ������ -->
<meta name="x5-orientation" content="portrait">
<!-- UCǿ��ȫ�� -->
<meta name="full-screen" content="yes">
<!-- QQǿ��ȫ�� -->
<meta name="x5-fullscreen" content="true">
<!-- UCӦ��ģʽ -->
<meta name="browsermode" content="application">
<!-- QQӦ��ģʽ -->
<meta name="x5-page-mode" content="app">
<!--��meta�����þ���ɾ��Ĭ�ϵ�ƻ���������Ͳ˵���-->
<meta name="apple-mobile-web-app-capable" content="yes">
<!--��վ������web app�����֧��-->
<meta name="apple-touch-fullscreen" content="yes">
<!--��web appӦ����״̬������Ļ������������ɫ-->
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<!-- windows phone ����޸߹� -->
<meta name="msapplication-tap-highlight" content="no">
<!--�ƶ�webҳ���Ƿ��Զ�̽��绰����-->
<meta http-equiv="x-rim-auto-match" content="none">
<!--�ƶ��˰汾���� start -->
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" name="viewport">
<!--�ƶ��˰汾���� end -->
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
						<div class="order-name t-e">֧����֧������</div>
						<div class="order-amount">
							<strong id="amount">${amt}</strong><em>Ԫ</em>
						</div>
					</div>
					<dl class="order-details" id="order-details">
						<dt>����Ա��${orderID}</dt>
						<dd>������ţ�${order}</dd>
					</dl>
					<dl class="order-pay-way more-two" id="other-pay">
						<dd class="other-pay-link">
							<a href="javascript:;" dataname="alipayWap"
								dataway="֧����" dataurl=${path}
								datacode="00600110" datatoptips="" datasectips="" class="block-link">
								<b class="bank-icon icon-alipay"></b>֧����<b class="to-right"></b>
							</a>
						</dd>
						<dd class="other-pay-link">
							<a href="javascript:;" dataname="wePay" dataway="΢��֧��"
								dataurl="weixin://wap/pay?appid=wx24603f132a6753ea&noncestr=SRJQ0h4fCOZGJFvf&package=WAP&prepayid=wx201610251823466a4f0d0ffd0169512504&sign=63BDE7F3490E3A343BD378D046A78888&timestamp=1477390310" id="wePay" datatoptips=""
								datasectips="" datacode="02802006" class="block-link">
								<b class="bank-icon icon-wechat"></b>΢��֧��<em class="otherTips">(֧��6.0.2�����ϰ汾ʹ��)</em><b class="to-right"></b>
							</a>
						</dd>
						
					</dl>
					<div id="showMorePayWay">
						<span>����֧����ʽ</span>
					</div>
					<div class="wap-footer">��Ȩ���� 2016 ����ҳ��</div>
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
<!-- <dl class="order-pay-way" id="use-balance" style=""><dt>ѡ����</dt><dd class="disable"><a href="javascript:;" dataway="���֧��" datacode="" datatoptips=""datasectips="" dataurl="/wap/trade/accountPay.htm"class="block-link" id="balance-pay"> <bclass="bank-icon icon-balance"></b>���֧�� <em class="now-balance">����0Ԫ</em><b class="choose-box"></b></a></dd></dl> --><!-- /wap/trade/aliPayWapPay.htm" --><!-- <dd id="hf-pay"><a href="javascript:;" dataname="mobileValue"dataurl="/trade/mobilepay/mobileList.htm?tradeId=201610191417JY954845"upurl="/trade/mobilepay/singleTrade.htm" authorizedpayflag="N" class="block-link"><b class="bank-icon icon-hf"></b>����֧��<b class="to-right"></b></a></dd><dd class="other-pay-link"><a href="javascript:;" dataname="tenpay" dataway="�Ƹ�ͨ"dataurl="/wap/trade/tenpayWapPay.htm" datatoptips=""datasectips="" datacode="00903218" class="block-link"><b class="bank-icon icon-tenpay"></b>�Ƹ�ͨ<b class="to-right"></b></a></dd><dd class="addCardDd"><a href="javascript:;" class="block-link" id="newQuickPay"><b class="bank-icon icon-addQuickPay"></b>��ӿ��֧��<b class="to-right"></b></a></dd> -->