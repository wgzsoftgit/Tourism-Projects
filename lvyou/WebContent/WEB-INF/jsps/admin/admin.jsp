<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理界面</title>
</head>
<frameset rows="96,*,40" frameborder="0" framespacing="0">
	<frame src="${pageContext.request.contextPath }/admin/toadmin2_top.do" scrolling="no" name="topframe" noresize="noresize" />
	<frameset cols="237,*"  frameborder="0" framespacing="0">
		<frame src="${pageContext.request.contextPath }/admin/toadmin2_left.do" scrolling="auto" name="leftframe" noresize="noresize" />
		<frame src="${pageContext.request.contextPath }/admin/admin3_0_right.do" scrolling="auto" name="rightframe" noresize="noresize" />
	</frameset> 
	<frame src="${pageContext.request.contextPath }/admin/toadmin2_bottom.do" name="bottomframe" scrolling="no" noresize="noresize" />
</frameset>
</html>
