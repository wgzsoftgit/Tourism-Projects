<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>河南旅游景点管理系统添加页面</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.header1{ height:30px; line-height:30px;  border-bottom:1px solid #c5c2c2;}

.header1 p{ float:left;}

.header1 p a{ color:#757575; padding:0 4px;}

.contact{ float:right; color:#757575;}

.contact span{ color:#090808; margin-right:20px;}

.contact a{
	border-radius:2px;
	display:inline-block;
	color:#fff;
	width:70px;
	height:21px;
	line-height:21px;
	text-align:center;
	background-color: #0f8f3a;
}

</style>
</head>
<body>
<div class="header1"> 

	<div class="w1000">

    	<p>你好，欢迎 <font color="red">&nbsp;<%=session.getAttribute("userName")%></font>&nbsp;管理员光临后台管理</p>

        <div class="contact"><a href="${pageContext.request.contextPath}/admin/toadmin_login.do" target="_parent">登录</a> <a href="${pageContext.request.contextPath}/admin/quitadmin_register.do" target="_parent">退出管理</a></div>

	</div>
</div>
</body>
</html>
