<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>河南旅游景点管理系统注册页面</title>
<!-- 请求json -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.form.js"></script>
<style>
        .pg_header{
            position: fixed;
            height: 48px;
            top: 0;
            left: 0;
            right: 0;
            background-color: #2459a2; 
            line-height: 48px;
        }
        .pg_header .logo{
            margin: 0 auto;
            float: left;
            width: 200px;
            text-align: center;
            line-height: 48px;
            font-size: 28px;
            color: white;
        }
        
        .pg_header .pg_dl:hover{
            background-color: #2459fb;
            cursor: pointer;
        }

        .left{
            margin-top: 20px;
            width: 400px;
            display: inline-block;
            float: left;        
        }
        .pg_body{
            margin-top: 50px;
            font-size: 18px;
            display: inline-block;
            width: 200px;
        }
        .pg_body .menu{
            width: 800px;
            padding: 15px;    
            float: left;
            font-weight: bold;
        }
        input[type="text"]{
            width: 200px;
            height: 25px;
            border-radius: 6px;
        }
        input[type="password"]{
            width: 200px;
            height: 25px;
            border-radius: 6px;
        }
        input[type="button"]{
            background-color: #555555;
               border: none;
            color: white;
            padding: 12px 29px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 17px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 4px;
        }
        input[type="submit"]{
            background-color: #555555;
               border: none;
            color: white;
            padding: 12px 29px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 17px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 4px;
        }
        .kong{
            margin-top: -54px;
            margin-left: 200px;
            float:left;
            padding: 15px;
        }
        .img{
            width: 50px;
            height: 40px;
        }
        .can{
            width: 1220px;
            height: 40px;
            line-height: 40px;
            margin: 0 auto;
            text-align: center;
            display: inline-block;
        }
        .tian{
            color: red;
            float: right;
            font-size: 12px;
            margin-right: -120px;
            margin-top: -25px;
        }
    </style>
</head>
<body id="i88" style="margin: 0" bgcolor="#2459a2">
    <div class = "pg_header">
        <div align="center">账号注册</div>
          
    </div>

    <form id="tijiao" name="tijiao" method="post" onsubmit="return check()" action="${pageContext.request.contextPath}/index/toaindex_updata.do">
        <div class="left"></div>
        <div class="pg_body">
                <div class="menu">用户名:</div>
                    <div class="kong">
                        <input id="text1" type="text" name="userName" value="${user.userName }" placeholder="请输入用户名" onblur="check()"/><span id="div1" class="tian" style="margin-top: 4px">*(为必填)</span>
                     <!-- 这里的ID不能改 --> 
                <input type="hidden"  name="userId" value="${user.userId }"/>
                    </div>
                <div class="menu">密码:</div>
                    <div class="kong">
                        <input id="text2" type="password" name="userPwd" value="${user.userPwd }" onblur="check()"/>
                        <span id="div2" class="tian" style="margin-top: -25px">*(为必填)</span>
                    </div>
                <div class="menu">年 龄:</div>
                    <div class="kong">
                        <input id="text3" type="text" name="userAge" value="${user.userAge }"  onblur="check()"/>
                        <span id="div3" class="tian">*(为必填)</span>
                    </div>
					<div class="menu">电话号码:</div>
                    <div class="kong">
                        <input id="i5" type="text" name="userPhone" value="${user.userPhone }"/>
                    </div>
                <div class="menu">邮箱地址:</div>
                    <div class="kong">
                        <input id="text4" type="text" name="userEmail" onblur="check()" value="${user.userEmail }"/>
                        <span id="div4" class="tian">*(为必填)</span>
                    </div>

				
                                      
                
                <div class="menu">权 限：</div>
                    <div class="kong" style="width: 300px;">
                         <tr>
				    <td height="24"></td>
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
                    </div>  
					<div class="menu">头像上传:    </div>
                    <div class="kong">
                      <img class="userPicSrc"  src='${src1 }${user.userPic}'  height="50" width="50"/>
		<input type="file" id="userPic1" name="userPic1" onchange="submitImgSize1Upload()" /><br /><span id="imgSize1FileSpan">请上传图片的大小不超过3MB</span>
        <input type="hidden" id="userPic" name="userPic" value="" reg="^.+$" tip="亲！您忘记上传图片了。" /> 
                </div>    
                
        </div>
        <div class="can">
            <input id="i111" type="submit" name="002" value="提  交"/>
            <p style="width: 200px;display: inline-block;"></p>
            <input id="i222" type="button" name="004" value="取  消"/>

        </div>
    </form>
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
   		
   		$("#tijiao").ajaxSubmit(option);
   		
   	}
    
    //刷新or取消
            
            document.getElementById('i222').onclick = function(){
                location.reload();
            }

            //用户名验证
            function checkname(){ 
                var div = document.getElementById("div1"); 
                div.innerHTML = ""; 
                var name1 = document.tijiao.text1.value; 
                if (name1 == "") { 
                div.innerHTML = "用户名不能为空！"; 
                document.tijiao.text1.focus(); 
                return false; 
            } 
               
                return true; 
            } 
                
        

            //密码验证
            function checkpassword(){ 
                var div = document.getElementById("div2"); 
                div.innerHTML = ""; 
                var password = document.tijiao.text2.value; 
                if (password == "") { 
                div.innerHTML = "密码不能为空"; 
                document.tijao.text2.focus(); 
                return false; 
            } 
                
                return true; 
        }

            function checkrepassword(){ 
                var div = document.getElementById("div3"); 
                div.innerHTML = ""; 
                var password = document.tijiao.text2.value; 
                 
                if (repass == "") { 
                div.innerHTML = "密码不能为空"; 
                document.tijiao.text3.focus(); 
                return false; 
            } 
               
                return true; 
        }
        //邮箱验证
        function checkEmail(){ 
            var div = document.getElementById("div4"); 
            div.innerHTML = ""; 
            var email = document.tijiao.text4.value; 
            var sw = email.indexOf("@", 0); 
            var sw1 = email.indexOf(".", 0); 
            var tt = sw1 - sw; 
            if (email.length == 0) { 
            div.innerHTML = "邮箱不能为空"; 
            document.tijiao.text4.focus(); 
            return false; 
        } 

            if (email.indexOf("@", 0) == -1) { 
            div.innerHTML = "必须包含@符号"; 
            document.tijiao.text4.select(); 
            return false; 
        } 

            if (email.indexOf(".", 0) == -1) { 
            div.innerHTML = "必须包含.符号"; 
            document.tijiao.text4.select(); 
            return false; 
        } 

            if (tt == 1) { 
            div.innerHTML = "@和.不能一起"; 
            document.tijiao.text4.select(); 
            return false; 
        }

            if (sw > sw1) { 
            div.innerHTML  = "@符号必须在.之前"; 
            document.tijiao.text4.select(); 
            return false; 
        } 
            else { 
            return true; 
            }
        return ture; 
        }

            function check(){ 
            if (checkname() && checkpassword() && checkrepassword() && checkEmail()) { 
            return true; 
            } 
            else { 
            return false; 
        } 
    } 
    </script>
</body>
</html>