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
<!-- 请求json -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.form.js"></script>

 <script type="text/javascript">
/*数据回显  */
 function submitImgSize1Upload(){
		
		var option={
				type:"POST",
				url:"${pageContext.request.contextPath }/upload/uploadPic.do",
				dataType:"json", // 服务器响应的数据类型
				success:function(data, status, xhr){
					console.log(data);
				$("#userPicSrc").attr("src", data.path); /*回显  */
				$("#userPic").val(data.path);
				
				}
				
			};
		
		$("#itemForm").ajaxSubmit(option);
		
	}


 
 </script>


 

 

</head>
<body>

<div id="right1">
		<div class="main">
			<div class="tit">当前位置》用户管理》添加用户</div>
			<div class="box">
			  <div class="tit1">添加用户：</div>
		             <%
if ((String)request.getAttribute("message") == "ok") { %>
    <script>
    alert("添加用户成功！");
    </script>
<%}%>	   

	<form id="itemForm" action="${pageContext.request.contextPath}/admin/toadmin3_1_rightadd.do"
	 method="post" enctype="multipart/form-data" >

	<table  height="36" >
		       
				  
				  <tr>
				    <td  height="36">用户名:</td>
				    <td width="423">
				    <input type="text" id="userName" name="userName"   placeholder="请输入字母、数字、下划线" onchange="if( this.value ==''){alert('用户名不能为空');}"/>				  
				    </td>
				  
				  </tr>
				 
				  <tr>
				    <td height="30">密 码：</td>
				    <td><input type="password" id="userPwd" name="userPwd" maxlength="10"  placeholder="请输入密码建议小于10位"   onchange="if(this.value == ''){alert('密码不能为空');}else if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}" />
				    </td>
				  </tr>
				 
				  <tr>
				  
				    <td height="36">年 龄：</td>
				    <td><input type="text" name="userAge" placeholder="大于1小于120" onchange="if(/^(?:[1-9][0-9]?|1[01][0-9]|120)$/.test(this.value)){}else{alert('年龄请在 1-120岁');this.value='';}"/>
				    </td>
				  </tr>
				 
				 
				  
				   <tr>
				    <td height="27">邮 箱：</td>
				    <td><input type="text" id="userEmail"  name="userEmail"  placeholder="格式:11@qq.com" onchange="if(/^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/.test(this.value)){}else {alert('邮箱格式不正确，请重新输入！');this.value='';}" />
				    
				    </td>
				  </tr>
				  <tr>
				    <td height="32">电 话：</td>
				    <td>
				    <input type="text" name="userPhone" maxlength="12" onchange="if(/^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\d{8}$/.test(this.value)){}else{alert('手机号码有误，请重填');this.value='';}"/></td>			
				  </tr>
				  <tr>
				    <td height="24">权 限：</td>
				    <td><select name="typeId">
						<option value="1">用户</option>
						<option value="2">管理员</option>
						
						</select></td>
				  </tr>
				  <tr>
				    <td>头 像：</td>
				    <td>
    <img id="userPicSrc"  height="100" width="100" />
		<input type="file" id="userPic1" name="userPic1" onclick="submitImgSize1Upload()" /><br /><span id="imgSize1FileSpan">请上传图片的大小不超过3MB</span>
        <input type="hidden" id="userPic" name="userPic" value="" reg="^.+$" tip="亲！您忘记上传图片了。" />    
					 
				    </td>
				  </tr>
				  
			 
                  </table>
		 
			 
				 <div align="center"> 
				 <input type="submit" value="提交"/>
   <input type="reset" value="重置"/>  <input type="button" onclick="history.go(-1)" value="返回" />
  </div>
	
	</form>	
				
			</div>
		</div>
</div>
</body>
</html>