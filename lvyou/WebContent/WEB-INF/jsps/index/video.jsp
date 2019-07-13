<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%String src1=request.getContextPath()+"/upload/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>河南省旅游景点互动平台</title>
<link href="${pageContext.request.contextPath }/static/style/base.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath }/static/style/pagename.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!--header-->

<div class="header"> 

	<div class="w1000">

    	<p>你好，欢迎&nbsp;&nbsp;<font color=red>${userName }</font> &nbsp;&nbsp;光临河南省旅游景点互动平台！</p>


         <div class="contact"><a href="${pageContext.request.contextPath}/index/toindex_login.do">登录</a> <a href="${pageContext.request.contextPath}/admin/quitadmin_register.do" target="_parent">退出管理</a></div>

	</div>

</div>
<div class="w1000">

	<div class="header_bottom">

		<a href="${pageContext.request.contextPath }/index/toindex_index.do"><img src="${pageContext.request.contextPath }/static/img/index/login.png" width="294" height="49" alt="" title="中原之都-郑州"/></a>

       		<ul>

            	<li><a href="${pageContext.request.contextPath }/index/toindex_index.do">网站首页</a></li>       

                <li><a href="${pageContext.request.contextPath }/index/toscenic.do">景点信息</a></li>     

                <li><a href="${pageContext.request.contextPath }/index/toactivity.do">景点活动</a></li>        

                <li><a href="${pageContext.request.contextPath }/index/toways.do">智能路线</a></li>      

                <li><a href="${pageContext.request.contextPath }/index/tovideo.do">直播平台</a></li>      
                <li><a href="${pageContext.request.contextPath }/admin/tomessage.do">在线留言</a></li>       

                <li><a href="${pageContext.request.contextPath }/index/toconnection.do">联系我们</a></li>             
                                 
     		</ul>  

    </div>       

</div>
<!--header结束--> 
<div class="container"> 		

		<!--banner-->

		<div class="banner_erji">

        	<img src="../static/img/index/vivo.jpg" width="1000" height="187" alt="" title=""/>        </div>

		<!--banner end-->
	<div style="margin-left:200px " align="center">
	<ul class="ul_zj clearfix" >
	
	  <c:forEach items="${pageBean.products}" var="Video"> 
	  <!-- 0不推荐 1推荐 -->
	<c:if test="${Video.vidIspush >0 }">  
	  <li style="">

             <a href="${pageContext.request.contextPath }/index/toviewshow.do?vidId=${Video.vidId}">      
  <i style="padding-left: 10px"> <embed  src="${pageContext.request.contextPath }/static/img/ckplay/ckplayer.swf"
     flashvars="video=${src1}${Video.vidLive}"  quality="high" width="300" height="300" 
     align="middle" allowScriptAccess="always" allowFullscreen="true"
      type="application/x-shockwave-flash"></embed> </i>  <span style="margin-left:10px ">${Video.vidName}</span>
            </a>
                  </li>
	  </c:if>
	  </c:forEach>                    	
	</ul>
	
	
<!--分页 -->
	<div align="center">
    <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/index/tovideo.do?page=${pageBean.currentPage-1}">上一页</a>
    </c:if>
        <a href="${pageContext.request.contextPath }/index/tovideo.do?page=${1}">首页</a>
            <c:forEach begin="1" end="${pageBean.totalPage }" step="1" var="i">
                <c:if test="${pageBean.currentPage==i }">
                    <a href="${pageContext.request.contextPath }/index/tovideo.do?page=${i}"><font color="#ff0000">${i}</font></a>
                </c:if>
                <c:if test="${pageBean.currentPage!=i }">
                    <a href="${pageContext.request.contextPath }/index/tovideo.do?page=${i}">${i}</a>
                </c:if>
            </c:forEach>
  <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/index/tovideo.do?page=${pageBean.totalPage}">末页</a>
  </c:if>
    <c:if test="${pageBean.currentPage< pageBean.totalPage }">
        <a href="${pageContext.request.contextPath }/index/tovideo.do?page=${pageBean.currentPage+1}">下一页</a>
    </c:if>
    </div>
	
	
	
	
</div>	
	
	
</div>
<!--footer开始-->

<div class="footer"> 
<p><a href="${pageContext.request.contextPath }/index/toindex_index.do">首页</a> |
	 <a href="${pageContext.request.contextPath }/index/toscenic.do">景点信息</a> | 
	 <a href="${pageContext.request.contextPath }/index/toactivity.do">景点活动</a> | 
	 <a href="${pageContext.request.contextPath }/index/toways.do">智能路线</a> |
	  <a href="${pageContext.request.contextPath }/index/tovideo.do">直播平台</a> |
	   <a href="${pageContext.request.contextPath }/admin/tomessage.do">在线留言</a> | 
	    <a href="${pageContext.request.contextPath }/index/toconnection.do">联系我们</a></p>

<p> &copy; 2018－2019 版权所有  个人</p>
  <p>地址：河南郑州马寨  来源:<a href="${pageContext.request.contextPath }/index/toindex_index.do" target="_blank">郑州科技学院</a> </p>
  
</div>



<!--footer 结束-->

</body>
</html>