<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>  

<%String src1=request.getContextPath()+"/upload/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>河南旅游景点管理系统修改页面</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />
<!-- 请求json -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.form.js"></script>
 <script type="text/javascript">

 function submitImgSize1Upload(){
		
		var option={
				type:"POST",
				url:"${pageContext.request.contextPath }/upload/uploadPic.do",
				dataType:"json", // 服务器响应的数据类型
				success:function(data, status, xhr){
					console.log(data);
				$(".userPicSrc").attr("src", data.path); /*回显  */
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
			<div class="tit">当前位置》用户管理》修改用户</div>
			<div class="box">
			  <div class="tit1">修改用户：</div>
		        <%
if ((String)request.getAttribute("message") == "ok") { %>
    <script>
    alert("修改用户成功！");
    </script>
<%}%>	   		   

	<form id="itemForm" action="${pageContext.request.contextPath}/admin/toadmin3_1_rightupdata.do"
	 method="post" enctype="multipart/form-data">
	<table width="675" border="1" align="center" >
				   
				  <tr>
				    <td width="236" height="33">用户名:</td>
				    <td width="423">
				    <input type="text" name="userName" value="${user.userName }" maxlength="6" onchange="if( this.value ==''){alert('用户名不能为空');}else if(/^\w{6,10}$/.test(this.value) ){alert('6-10位字母、数字、下划线');this.value='';}"/>
				  <!-- 这里的ID不能改 --> 
                <input type="hidden"  name="userId" value="${user.userId }"/>
                </td>
				  </tr>
				 
				  <tr>
				    <td height="30">密码：</td>
				    <td><input type="password" name="userPwd" value="${user.userPwd }" maxlength="10" placeholder="建议小于10位" onchange="if(this.value == ''){alert('密码不能为空');}else if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"/>
				    </td>
				  </tr>
				 
				  <tr>
				  
				    <td height="36">年龄：</td>
				    <td><input type="text" name="userAge" value="${user.userAge }" placeholder="大于0小于110"  onchange="if(/^(?:[1-9][0-9]?|1[01][0-9]|120)$/.test(this.value)){}else{alert('年龄请在 1-120岁');this.value='';}"/>
				    </td>
				  </tr>
				 
				 
				  
				   <tr>
				    <td height="27">邮箱：</td>
				    <td><input type="text" name="userEmail"  value="${user.userEmail }" placeholder="格式:11@qq.com" onchange="if(/^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/.test(this.value)){}else {alert('邮箱格式不正确，请重新输入！');this.value='';}" />
				    </td>
				  </tr>
				  <tr>
				    <td height="32">电话：</td>
				    <td>
				    <input type="text" name="userPhone" maxlength="12" value="${user.userPhone }" onchange="if(/^1[34578]\d{9}$/.test(this.value)){}else{alert('手机号码有误，请重填');this.value='';}"/></td>			
				  </tr>
				  <tr>
				    <td height="24">权限：</td>
				    <td>    <c:choose>
						<c:when test="${user.typeId==1}">
						   用户
						</c:when>
						<c:when test="${user.typeId==2 }">
						 管理员
						</c:when>
	                       </c:choose>
				    <select name="typeId">
						<option value="1">用户</option>
						<option value="2">管理员</option>
						
						</select></td>
				  </tr>
				  <tr>
				    <td height="24">激活状态 ： </td>
				    <td>    <c:choose>
						<c:when test="${user.userState==1}">
						   激活
						</c:when>
						<c:when test="${user.userState==0 }">
						未激活
						</c:when>
	                       </c:choose>
				    <select name="userState">
						<option value="1">激活</option>
						<option value="0">未激活</option>
						
						</select></td>
				  </tr>
				  <tr>
				    <td>头像：</td>
				    <td>
    <img class="userPicSrc"  src='${src1 }${user.userPic}'  height="50" width="50"/>
		<input type="file" id="userPic1" name="userPic1" onchange="submitImgSize1Upload()" /><br /><span id="imgSize1FileSpan">请上传图片的大小不超过3MB</span>
        <input type="hidden" id="userPic" name="userPic" value="" reg="^.+$" tip="亲！您忘记上传图片了。" />    
					 
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