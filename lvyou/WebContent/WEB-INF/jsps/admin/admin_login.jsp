<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>河南旅游管理系统登陆页面</title>
<link href="${pageContext.request.contextPath}/static/style/login.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>

</head>
<body>
  <%
if ((String)request.getAttribute("message1") == "false") { %>
    <script>
    alert("请登录留言！");
    </script>
<%}%>
<div class="message warning">
	<div class="inset">
		<div class="login-head" >
			<h1>用户登录</h1>
						
		</div>
		
		<form action="${pageContext.request.contextPath}/admin/toadmin3_1_login.do" method="post">
			<ul>
				<li>
				<input type="text" class="text" name="userName" value="用户名" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '用户名';}"/>
				<a href="#" class=" icon user"></a>
				</li>
				<li><input type="password" name="userPwd" value="" /> <a href="#" class="icon lock"></a></li>
			</ul>
			<div><h1 style="color:red">${login }${login1 }${login2 }${login3 }${login4}</h1></div>
			<div class="submit">
				<input type="submit" onClick="myFunction()" value="登录" />
				<h4> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath}/admin/toadmin_register.do">注册</a> </h4>
				
			</div>
		</form>
	</div>					
</div>

<!--- footer --->
<div  align="center">
	<br />
	<p>联系方式：2213858206@qq.com.  版权所有：个人</p>
</div>

</body>
</html>