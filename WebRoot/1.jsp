<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
 
  <body>

 <script>
	 var t=3;//设定跳转的时间
	 setInterval("refer()",1000); //启动1秒定时
	 function refer(){
	 if(t==0){
	 location="${pageContext.request.contextPath}/2.jsp"; //#设定跳转的链接地址
	 }
	 document.getElementById('show').innerHTML="这是一个跳转测试"+t+"秒后跳转到页面2"; // 显示倒计时
	 t--; // 计数器递减
	 //本文转自：
	 }
 </script>
 <span id="show"></span>
 
  </body>
</html>
