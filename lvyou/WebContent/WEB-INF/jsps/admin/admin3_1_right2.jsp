<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%String src1=request.getContextPath()+"/upload/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>查询用户列表</title>
<link href="${pageContext.request.contextPath }/static/style/main2.css" rel="stylesheet" type="text/css" />

</head>
<body>
<%-- <form action="${pageContext.request.contextPath }/admin/showUserList.do" method="post">
查询条件：<!--queryussers  -->
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>

</tr> --%>
<div id="right1">
		<div class="main">
			<div class="tit">当前位置》用户管理》查询用户</div>
			<div class="box2">
			  <div class="tit1">用户列表：</div>

<table width="100%" class="tab">
<tr>
	
	<th >用户名</th>
	<th>密码</th>
	<th>年龄</th>
 <th>激活状态 0-未激活 1-已经激活</th>
		<th>注册时间</th>
	<th>邮箱</th>
	<th>电话</th>
	<th>头像</th>
	<th>权限1-用户；2-管理员</th>
	<th>操作</th>
</tr>
<%-- <c:forEach items="${usersList}" var="user"> 只显示查询所有用户--%>
 <c:forEach items="${pageBean.products}" var="user"> 
<tr>
	<td>${user.userName }</td>
	<td><i  style="max-width: 300px;
    overflow: hidden;
    white-space: nowrap;
    text-overflow: ellipsis;
    display:block;
    float:left;">${user.userPwd }</i></td>
	<td>${user.userAge }</td>
	
	 <td><c:choose>
	<c:when test="${user.userState ==1}">
	  已激活
	</c:when>
	<c:when test="${user.userState ==0 }">
	未激活 
	</c:when>
	</c:choose>
	</td>
	<td>
	${user.userTime }
	<%-- <fmt:formatDate value="${user.userTime}" pattern="yyyy-MM-dd HH:mm:ss"/> --%>
	</td>
	<td>${user.userEmail }</td>
	<td>${user.userPhone }</td>
	
	<td><img id='userPic' src='${src1}${user.userPic}'  height="30" width="50" /></td>
	
	<td><c:choose>
	<c:when test="${user.typeId==1}">
	   用户
	</c:when>
	<c:when test="${user.typeId==2 }">
	 管理员
	</c:when>
	</c:choose>
	</td>
	
	<td><a href="${pageContext.request.contextPath }/admin/admin3_1_right3_revise.do?id=${user.userId}">修改</a>
	<a href="${pageContext.request.contextPath }/admin/delUserId.do?id=${user.userId}"
	 onclick="return confirm('是否确定删除${user.userName}');">删除</a></td>

</tr>
</c:forEach>

</table>

<!-- </form> -->
<!--分页 -->
	<div align="center">
    <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_1_right2.do?page=${pageBean.currentPage-1}">上一页</a>
    </c:if>
        <a href="${pageContext.request.contextPath }/admin/toadmin3_1_right2.do?page=${1}">首页</a>
            <c:forEach begin="1" end="${pageBean.totalPage }" step="1" var="i">
                <c:if test="${pageBean.currentPage==i }">
                    <a href="${pageContext.request.contextPath }/admin/toadmin3_1_right2.do?page=${i}"><font color="#ff0000">${i}</font></a>
                </c:if>
                <c:if test="${pageBean.currentPage!=i }">
                    <a href="${pageContext.request.contextPath }/admin/toadmin3_1_right2.do?page=${i}">${i}</a>
                </c:if>
            </c:forEach>
  <c:if test="${pageBean.currentPage>1 }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_1_right2.do?page=${pageBean.totalPage}">末页</a>
  </c:if>
    <c:if test="${pageBean.currentPage< pageBean.totalPage }">
        <a href="${pageContext.request.contextPath }/admin/toadmin3_1_right2.do?page=${pageBean.currentPage+1}">下一页</a>
    </c:if>
    </div>

</div>
		</div>
</div>
</body>
</html>