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


 function submitImgSize1Upload(){
		
		var option={
				type:"POST",
				url:"${pageContext.request.contextPath }/upload/uploadPic.do",
				dataType:"json", // 服务器响应的数据类型
				success:function(data, status, xhr){
					console.log(data);
				$("#scenicPicSrc").attr("src", data.path); /*回显  */
				$("#scePicture").val(data.path);
				
				}
				
			};
		
		$("#itemForm").ajaxSubmit(option);
		
	}

 
 </script>
</head>
<body>

<div id="right1">
		<div class="main">
			<div class="tit">当前位置》景点管理》添加景点</div>
			<div class="box2">
			  <div class="tit1">添加景点：</div>
		  <%
if ((String)request.getAttribute("message") == "ok") { %>
    <script>
    alert("添加景点成功！");
    </script>
<%}%>	   		  		   

	<form id="itemForm" action="${pageContext.request.contextPath}/admin/toadmin3_3_rightadd.do"
	 method="post" enctype="multipart/form-data">
	<table width="675" border="1" align="center" >
		       
				  
				  <tr>
				    <td width="236" height="33">景点名:</td>
				    <td width="423">
				    <input type="text" name="sceName"  maxlength="6" onchange="if( this.value ==''){alert('景点名不能为空');}"/></td>
				  </tr>
				 
				  <tr>
				    <td height="30">景点介绍：</td>
				    <td><textarea  name="sceContent" rows="4" cols="50" onchange="if( this.value ==''){alert('介绍不能为空');}"></textarea>
				    </td>
				  </tr>
				 
				  <tr>
				  
				    <td height="36">景点参考价格：</td>
				    <td><input type="text" name="scePrice" onchange="if(this.value == ''){alert('价格不能为空');}else if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"/>
				    </td>
				  </tr>
				 
				 
				  
				   <tr>
				    <td height="27">景点优惠价格：</td>
				    <td><input type="text" name="sceVprice"  onchange="if(this.value == ''){alert('价格不能为空');}else if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"/>
				    </td>
				  </tr>
				  <tr>
				    <td height="32">景点浏览量：</td>
				    <td>
				    <input type="text" name="sceCount" maxlength="12"    onchange="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"/></td>			
				  </tr>
				  <tr>
				    <td height="24">景点是否推荐：</td>
				    <td><select name="sceIspush">
						<option value="1">推荐</option>
						<option value="0">不推荐</option>
						
						</select></td>
				  </tr>
				  <tr>
				    <td>图片：</td>
				    <td>
    <img id="scenicPicSrc"  height="100" width="100" />
		<input type="file" id="userPic1" name="userPic1" onchange="submitImgSize1Upload()" /><br /><span id="imgSize1FileSpan">请上传图片的大小不超过3MB</span>
        <input type="hidden" id="scePicture" name="scePicture" value="" reg="^.+$" tip="亲！您忘记上传图片了。" />    
					 
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