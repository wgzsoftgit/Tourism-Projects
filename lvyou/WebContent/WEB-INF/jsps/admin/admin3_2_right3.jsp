<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>河南旅游景点管理系统修改页面</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.4.4.min.js"></script>

</head>
<body>

<div id="right1">
		<div class="main">
			<div class="tit">当前位置》活动管理》修改活动</div>
			<div class="box">
			  <div class="tit1">修改活动：</div>
		  <%
if ((String)request.getAttribute("message") == "ok") { %>
    <script>
    alert("修改活动成功！");
    </script>
<%}%>	   		  		   
<!--   -->
	<form  action="${pageContext.request.contextPath}/admin/toadmin3_2_rightupdata.do" method="post">
	<table width="675" border="1" align="center" >				 
				  <tr>	  
				    <td height="36">活动内容 ：</td>
				    <td>
				    <textarea name="actContent" id="actContent" rows="10" cols="50" >${activity.actContent }</textarea>
				    		  <!-- 这里的ID不能改 --> 
                <input type="hidden"  name="actId" value="${activity.actId}"/>
				    </td>
				  </tr>
				 
				 <tr>
				 <td>活动时间</td>
				 <td>
				 <input id="actTime" type="text" name="actTime" value="${activity.actTime }" onchange="if(/^[1-9]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])\s+(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d$/.test(this.value) ){}else{alert('时间格式不正确,正确格式为: 2018-01-01 12:00:00 ');this.value='';}" 
				 placeholder="格式：2019-03-28 09:20:50" max="2030-6-28"/>
				 </td>
				 </tr>
				  
				  <tr>
				 
				    <td height="24">是否推荐  ：</td>
				    <td>
				    <c:choose>
						<c:when test="${activity.actIspush==1}">
						  推荐
						</c:when>
						<c:when test="${activity.actIspush==0 }">
						不推荐
						</c:when>
	                       </c:choose>
				    <select name="actIspush">
						<option value="1">推荐</option>
						<option value="0">不推荐</option>
						
						</select></td>
				  </tr>
			
				  <tr>
				    <td >景点活动点击量 ：</td>
				    <td >
				    <input type="text" name="actCount" value="${activity.actCount}" maxlength="10" onchange="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"/></td>
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