<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>河南省旅游景点互动平台</title>
<link href="${pageContext.request.contextPath }/static/style/base.css" rel="stylesheet" type="text/css" />

<link href="${pageContext.request.contextPath }/static/style/pagename.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.6.2.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.SuperSlide.2.1.js"></script>
</head>
<body>
<!--header开始--> 

<div class="header"> 

	<div class="w1000">

    	<p>你好，欢迎&nbsp;&nbsp;<font color=red>${userName }</font> &nbsp;&nbsp;光临河南省旅游景点互动平台！</p>

        <div class="contact"><a href="${pageContext.request.contextPath}/index/toindex_login.do">登录</a><a href="${pageContext.request.contextPath}/admin/quitadmin_register.do" target="_parent">退出管理</a>
        </div>

	</div>

</div>





<div class="w1000">

	<div class="header_bottom">

			<a href="${pageContext.request.contextPath }/index/toindex_index.do"><img src="${pageContext.request.contextPath }/static/img/index/login.png" width="294" height="49" alt="" title="河南省旅游景点互动平台"/></a>

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

		<!--banner开始-->

		<div class="banner"> 

            <div class="bd">

                <ul>

                    <li style="background:url(../static/img/index/banner_4.jpg) no-repeat center top;"></li>

                    <li style="background:url(../static/img/index/banner_2.jpg) no-repeat center top;"></li>
                    <li style="background:url(../static/img/index/banner_3.jpg) no-repeat center top;"></li>
                  

                </ul>

            </div>

            <div class="hd">

                <ul>

                    <li></li>

                    <li></li>

                </ul>

            </div>

            <a class="prev" href="javascript:void(0)"></a>

            <a class="next" href="javascript:void(0)"></a>

        </div>
		 <!--调用JS模块图片滚动--> 
        <script type="text/javascript">jQuery(".banner").slide({ titCell:".hd ul", mainCell:".bd ul", effect:"fold",delayTime:1000,interTime:5000,autoPlay:true, autoPage:true, trigger:"click" });</script>

		<!--banner结束--> 
           
		


		<!--content开始-->


		<div class="content"> 

			<p class="p_tit1">走进河南</p>	

			<ul class="ul_jishu clearfix">
  <%-- <c:forEach items="${scenic}" var="scenic"> --%> 
  <c:forEach items="${pageBean.products}" var="scenic"> 

 <!--0不推荐，1推荐  -->
 <c:if test="${scenic.sceIspush >0}">
         <li class="fl">
                         <!-- 到景点信息 -->
                	<a href="${pageContext.request.contextPath }/index/tointroduce.do?sceId=${scenic.sceId}"><img src="${scenic.scePicture}" width="291" height="126" alt="" title="" /></a>

                          <p>
                    	<a href="${pageContext.request.contextPath }/index/tointroduce.do?sceId=${scenic.sceId}">${scenic.sceName}</a></p>
                           <p><a href="#" style="max-width: 500px;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    display:block;
    float:left;" >${scenic.sceContent } </a> </p>
                           <br />
                           <p>优惠价格:￥${scenic.sceVprice }</p>
                          <p>浏览量：${scenic. sceCount }人</p>

                </li>
 </c:if>	     
 </c:forEach>
            	
            	
            </ul>	
<!--分页 -->
	<div align="center">
    <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/index/toindex_index.do?page=${pageBean.currentPage-1}">上一页</a>
    </c:if>
        <a href="${pageContext.request.contextPath }/index/toindex_index.do?page=${1}">首页</a>
            <c:forEach begin="1" end="${pageBean.totalPage }" step="1" var="i">
                <c:if test="${pageBean.currentPage==i }">
                    <a href="${pageContext.request.contextPath }/index/toindex_index.do?page=${i}"><font color="#ff0000">${i}</font></a>
                </c:if>
                <c:if test="${pageBean.currentPage!=i }">
                    <a href="${pageContext.request.contextPath }/index/toindex_index.do?page=${i}">${i}</a>
                </c:if>
            </c:forEach>
  <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/index/toindex_index.do?page=${pageBean.totalPage}">末页</a>
  </c:if>
    <c:if test="${pageBean.currentPage< pageBean.totalPage }">
        <a href="${pageContext.request.contextPath }/index/toindex_index.do?page=${pageBean.currentPage+1}">下一页</a>
    </c:if>
    </div>

            <div class="zjfc">

            	<p class="p_tit1">秀丽郑州</p>

                <div class="picScroll-left">

                    <div class="hd">

                        <a class="next"></a>

                        <a class="prev">></a>

                    </div>

                    <div class="bd">

                        <ul class="picList">

     

                     


                                             

                   <li>

                                <div class="pic"><img src="../static/img/index/f1.jpg" width="231" height="151" /></div>

                               

                            </li>

                                             

                   <li>

                                <div class="pic"><img src="../static/img/index/f2.jpg" width="231" height="151" /></div>

                                

                            </li>

                                             

                   <li>

                                <div class="pic"><img src="../static/img/index/f3.jpg" width="231" height="151" /></div>

                               

                            </li>

                                             

                   <li>

                                <div class="pic"><img src="../static/img/index/f4.jpg" width="231" height="151" /></div>

                               

                            </li>

                                             

                   <li>

                                <div class="pic"><img src="../static/img/index/f5.jpg" width="231" height="151" /></div>

                              

                            </li>

                                             

                   <li>

                                <div class="pic"><img src="../static/img/index/f6.jpg" width="231" height="151" /></div>

                            

                            </li>

                                             

                        </ul>

                    </div>

                </div>

        		<!--为秀丽郑州模块图片向左滚到--> 

                <script type="text/javascript">

                jQuery(".picScroll-left").slide({titCell:".hd ul",mainCell:".bd ul",autoPage:true,effect:"left",autoPlay:true,vis:4,trigger:"click"});

                </script>
			


                	

            </div>

		</div>

		<!--content 结束--> 

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