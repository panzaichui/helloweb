<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
response.setHeader("Pragma","No-cache"); 
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", 0); 
%>
<%
request.setAttribute("context_root","http://123.125.97.71:8580/qrpmcg");
request.setAttribute("context_url","http://123.125.97.71:8580/qrpmcg");
request.setAttribute("cmpaypersonal_url","http://123.125.97.71:8580/qrpmcg");
%>
<jspFile href="<%=request.getRequestURL()%>">
<link href="/hello2/res/img/liantong/favicon.ico" rel="shortcut icon" type="image/vnd.microsoft.icon">
<link href="/hello2/res/img/liantong/favicon.ico" rel="icon" type="image/vnd.microsoft.icon">
