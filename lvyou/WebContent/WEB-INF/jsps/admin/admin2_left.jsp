<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>河南旅游景点后台管理系统添加页面</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
body{
	background-color:#013d7c;
}
#navigation {
	width:199px;
	font-family:Arial;
}
#navigation ul {
	list-style-type:none;				
	margin:0px;
	padding:0px;
}
#navigation ul li {
	border-bottom:0;	
}
#navigation ul li a{
	display:block;						
	height:33px; line-height:33px;
	padding-left:50px;
	text-decoration:none;		
	border-bottom:2px solid #2690e4;			
}
#navigation ul li  a:link, #navigation ul li a:visited{
	background:#5dc6fd url(img/icon1.jpg) 25px 10px no-repeat;
	color:#FFFFFF;
	font-size:14px;
	font-weight:bold;
}
#navigation ul li a:hover{		
	background-color:#5dc6fd;			
	color:#ffff00;						
}


#navigation ul li ul{
	list-style-type:none;
	margin:0px;
	padding:0px 0px 0px 0px;
}
#navigation ul li ul li{
	border-top:0;
}
#navigation ul li ul li a{
	display:block;
	height:30px; line-height:30px; 
	padding-left:74px;
	text-decoration:none;
	border-bottom:1px solid #6ddef3;
}
#navigation ul li ul li a:link, #navigation ul li ul li a:visited{
	background:#38ace9 url(img/icon2.jpg) 52px 10px no-repeat;
	color:#FFFFFF;
	font-size:12px;
	font-weight:bold;
}
#navigation ul li ul li a:hover{
	background-color:#38ace9;
	color:#ffff00;
}
-->
</style>
<script src="${pageContext.request.contextPath }/static/js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	$("li").find("ul").prev().click(function(){
		$(this).next().toggle(500);	//
	});
	$("li:has(ul)").find("ul").hide();
});
</script>
</head>
<body>
	<div id="left">
		<div class="main">
			<div class="tit">网站菜单管理</div>
			<div id="navigation">
				<ul id="listUL">
				    <li><a href="#">用户管理</a>
						<ul>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_1_right1.do">添加用户</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_1_right2.do?">查询用户</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_1_right3.do">修改用户</a></li>
						</ul>
					</li>
					<li><a href="#">活动管理</a>
						<ul>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_2_right1.do">添加活动</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_2_right2.do?">查询活动</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_2_right3.do">修改活动</a></li>
						</ul>
					</li>
					<li><a href="#">景点管理</a>
						<ul>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_3_right1.do">添加景点</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_3_right2.do?">查询景点</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_3_right3.do">修改景点</a></li>
						</ul>
					</li>
					<li><a href="#">智能路线</a>
						<ul>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_4_right1.do">添加路线</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_4_right2.do?">查询路线</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_4_right3.do">修改路线信息</a></li>
						</ul>
					</li>
                    <li><a href="#">直播管理</a>
						<ul>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_5_right1.do">添加直播</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_5_right2.do?">查询留言直播</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_5_right3.do">修改直播内容</a></li>
						</ul>
					</li>
					<li><a href="#">留言管理</a>
						<ul>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_6_right1.do">添加留言</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_6_right2.do?">查询留言</a></li>
							<li><a target="rightframe" href="${pageContext.request.contextPath }/admin/toadmin3_6_right3.do">修改留言</a></li>
						</ul>
					</li>
			<!-- 		<li><a href="#">联系我们</a>
						<ul>
							<li><a href="#this">联系我们</a></li>
						</ul>
					</li> -->
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
