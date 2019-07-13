<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%String src1=request.getContextPath()+"/upload/"; %>
<%-- <%String src1="http://localhost:8004/lvyou-img-phone"+"/upload/"; %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>查询直播列表</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/ckplayer.min.js" charset="UTF-8"></script>


</head>
<body>
<div id="right1">
		<div class="main">
			<div class="tit">当前位置》直播管理》查询直播</div>
			<div class="box2">
			  <div class="tit1">查询直播：</div>

<table width="100%" class="tab">
<tr>
	
	<td>直播名</td>
	<td>直播视频</td>
	<td>直播点击量</td>
 <td>是否推荐0不推荐1推荐</td>			
	<td>操作</td>
</tr>
 <c:forEach items="${pageBean.products}" var="activity"> 
<tr>
	<td>${activity.vidName }</td>
	<td>
    <embed src="${pageContext.request.contextPath }/static/img/ckplay/ckplayer.swf"
     flashvars="video=${src1}${activity.vidLive}"  quality="high" width="300" height="300" 
     align="middle" allowScriptAccess="always" allowFullscreen="true"
      type="application/x-shockwave-flash"></embed>
    <!-- <div id="video" style="width: 300; height: 300px;max-width: 300px;">  
    </div>
    <script type="text/javascript">
			var videoObject = {
				container: '#video', //容器的ID或className
				variable: 'player', //播放函数名称
				loop: false, //播放结束是否循环播放
				autoplay: false,//是否自动播放					
				video:  '${src1}${activity.vidLive}'//视频地址
			    
			};
			var player = new ckplayer(videoObject);
		</script> -->	 
    </td>
		<td>${activity.vidCount }</td>
		
	 <td><c:choose>
	<c:when test="${activity.vidIspush ==1}">
	  推荐
	</c:when>
	<c:when test="${activity.vidIspush ==0 }">
	不推荐
	</c:when>
	</c:choose>
	</td>
	
	
	<td><a href="${pageContext.request.contextPath }/admin/admin3_5_right3_revise.do?id=${activity.vidId}">修改</a>
	<a href="${pageContext.request.contextPath }/admin/delVideoId.do?id=${activity.vidId}"
	 onclick="return confirm('是否确定删除');">删除</a></td>

</tr>
</c:forEach>

</table>

<!--分页 -->
	<div align="center">
    <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_5_right2.do?page=${pageBean.currentPage-1}">上一页</a>
    </c:if>
        <a href="${pageContext.request.contextPath }/admin/toadmin3_5_right2.do?page=${1}">首页</a>
            <c:forEach begin="1" end="${pageBean.totalPage }" step="1" var="i">
                <c:if test="${pageBean.currentPage==i }">
                    <a href="${pageContext.request.contextPath }/admin/toadmin3_5_right2.do?page=${i}"><font color="#ff0000">${i}</font></a>
                </c:if>
                <c:if test="${pageBean.currentPage!=i }">
                    <a href="${pageContext.request.contextPath }/admin/toadmin3_5_right2.do?page=${i}">${i}</a>
                </c:if>
            </c:forEach>
        <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_5_right2.do?page=${pageBean.totalPage}">末页</a>
       </c:if>
    <c:if test="${pageBean.currentPage< pageBean.totalPage }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_5_right2.do?page=${pageBean.currentPage+1}">下一页</a>
    </c:if>
    </div>

</div>
		</div>
</div>
</body>
</html>