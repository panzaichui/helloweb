<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>JEECMS Administrator's Control Panel</title>
<script type="text/javascript">
	function getBarCodeFromICS() {
		var data = [

		{
			"firstName" : "Brett",
			"lastName" : "McLaughlin",
			"email" : "aaaa"
		},

		{
			"firstName" : "Jason",
			"lastName" : "Hunter",
			"email" : "bbbb"
		},

		{
			"firstName" : "Elliotte",
			"lastName" : "Harold",
			"email" : "cccc"
		}

		]

		$.ajax({
			url : "http://localhost:8080/hello2/jsonSend/jsonSend.do", //请求地址
			type : "POST", //请求方式
			data : {
				ds : JSON.stringify(data)
			},
			dataType : "json",
			success : function(msg) {
				//alert(msg[0].name);  msg.success
				if (msg[0].success) {
					//$("#barcd").val(msg.SHOW_NO);
					//getBarCd()
					alert('成功');
				}

			},
			fail : function(status) {
				// 此处放失败后执行的代码
				alert('失败');
			},
			error : function(XMLHttpRequest, textStatus) {
				alert('系统正忙！&nbsp&nbsp请稍候提交。');
			}
		});

	}
</script>
</head>
<body>
	<input type="button" value="获取条码ICS" onclick="getBarCodeFromICS()" />

</body>
</html>
