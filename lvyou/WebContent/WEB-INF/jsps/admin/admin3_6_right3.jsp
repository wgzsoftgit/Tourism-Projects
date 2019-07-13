<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>河南旅游景点管理系统添加页面</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.4.4.min.js"></script>



 
</head>
<body>

<div id="right1">
		<div class="main">
			<div class="tit">当前位置》留言管理》修改留言</div>
			<div class="box">
			  <div class="tit1">修改留言：</div>
	 <%
if ((String)request.getAttribute("message1") == "ok") { %>
    <script>
    alert("修改留言成功！");
    </script>
<%}%>	   					   
<!--   -->
	<form  action="${pageContext.request.contextPath}/admin/toadmin3_6_rightupdata.do" method="post">
	<table width="675" border="1" align="center" >				 
				  <tr>	  
				    <td height="36">留言标题 ：</td>
				    <td>
				    <input type="text" name="mesTitle" value="${message.mesTitle }" maxlength="10" onchange="if(this.value ==''){alert('留言标题为空');}"/>
				    <!-- 这里的ID不能改 --> 
                <input type="hidden"  name="mesId" value="${message.mesId }"/>
				    </td>
				  </tr>
				 
				  <tr>
				    <td >留言内容 ：</td>
				    <td >
				    <textarea  name="mesContent" rows="10" cols="50" onchange="if( this.value ==''){alert('留言内容为空');}">${message.mesContent }</textarea>
				    </td>
				  </tr>
			 <tr>	  
				    <td height="36">留言人 ：</td>
				    <td>
				    <input type="text" name="userName" value="${message.userName }" maxlength="10" onchange="if( this.value ==''){alert('留言人不能为空');}"/>
				    </td>
				  </tr>
                  </table>
		 
			 
				 <div align="center"> 
				 <input type="submit" id="button_submit" value="提交"/>
   <input type="reset" value="重置"/>  <input type="button" onclick="history.go(-1)" value="返回" />
  </div>
	
	</form>	
				
			</div>
		</div>
</div>
</body>
</html>