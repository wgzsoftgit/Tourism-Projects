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

<style type="text/javascriptv">
 $(function(){
	 $("#button_submit").click(function(){
   
   var actContent = $('#actContent').val();
    alert(actContent);
   var actIspush = $("#actIspush").val();
   var actCount = $("#actCount").val();
   var user = {actContent:"actContent",actIspush:"actIspush",actCount:"actCount"};
  $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/admin/admin3_2_rightadd.do",
            data:user,
            success:function(data){
                alert("成功");
            },
            error:function(e) {
                alert("出错："+e);
            }
        });

    });
 });

</style>

 
</head>
<body>

<div id="right1">
		<div class="main">
			<div class="tit">当前位置》活动管理》添加活动</div>
			<div class="box2">
			  <div class="tit1">添加活动：</div>
				        <%
if ((String)request.getAttribute("message") == "ok") { %>
    <script>
    alert("添加活动成功！");
    </script>
<%}%>	 	   
<!--   -->
	<form  action="${pageContext.request.contextPath}/admin/toadmin3_2_rightadd.do" method="post">
	<table width="675" border="1" align="center" >				 
				  <tr>	  
				    <td height="36">活动内容 ：</td>
				    <td>
				    <textarea name="actContent" id="actContent" rows="10" cols="50"></textarea>
				    </td>
				  </tr>
				 
				 
				  
				  <tr>
				    <td height="24">是否推荐  ：</td>
				    <td><select name="actIspush">
						<option value="1">推荐</option>
						<option value="0">不推荐</option>
						
						</select></td>
				  </tr>
			
				  <tr>
				    <td >景点活动点击量 ：</td>
				    <td >
				    <input type="text" name="actCount" value="" maxlength="10" onchange="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"/></td>
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