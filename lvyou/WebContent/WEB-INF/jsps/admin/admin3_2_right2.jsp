<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>查询活动列表</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div id="right1">
		<div class="main">
			<div class="tit">当前位置》活动管理》查询活动</div>
			<div class="box2">
			  <div class="tit1">查询活动：</div>

<table  class="tab">
<tr>
	
	<th>活动时间</th>
	<th>活动内容</th>
	
 <th>是否推荐0不推荐1推荐</th>
		
	<th>景点活动点击量</th>
	
	<th>操作</th>
</tr>
 <c:forEach items="${pageBean.products}" var="activity"> 
<tr>
	<td>${activity.actTime }</td>
	<td><i style="max-width: 500px;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    display:block;
    float:left;">   ${activity.actContent } </i>  </td>	
	 <td><c:choose>
	<c:when test="${activity.actIspush ==1}">
	  推荐
	</c:when>
	<c:when test="${activity.actIspush ==0 }">
	不推荐 
	</c:when>
	</c:choose>
	</td>
	<td>${activity.actCount }</td>
	
	<td><a href="${pageContext.request.contextPath }/admin/admin3_2_right3_revise.do?id=${activity.actId}">修改</a>
	<a href="${pageContext.request.contextPath }/admin/delactivityId.do?id=${activity.actId}"
	 onclick="return confirm('是否确定删除');">删除</a></td>

</tr>
</c:forEach>

</table>

<!--分页 -->
	<div align="center">
    <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_2_right2.do?page=${pageBean.currentPage-1}">上一页</a>
    </c:if>
        <a href="${pageContext.request.contextPath }/admin/toadmin3_2_right2.do?page=${1}">首页</a>
            <c:forEach begin="1" end="${pageBean.totalPage }" step="1" var="i">
                <c:if test="${pageBean.currentPage==i }">
                    <a href="${pageContext.request.contextPath }/admin/toadmin3_2_right2.do?page=${i}"><font color="#ff0000">${i}</font></a>
                </c:if>
                <c:if test="${pageBean.currentPage!=i }">
                    <a href="${pageContext.request.contextPath }/admin/toadmin3_2_right2.do?page=${i}">${i}</a>
                </c:if>
            </c:forEach>
   <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_2_right2.do?page=${pageBean.totalPage}">末页</a>
   </c:if>
    <c:if test="${pageBean.currentPage< pageBean.totalPage }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_2_right2.do?page=${pageBean.currentPage+1}">下一页</a>
    </c:if>
    </div>

</div>
		</div>
</div>
</body>
</html>