<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>index准备进入的页面</title>
</head>
<body>
 <% response.sendRedirect(request.getContextPath()+"/index/toindex_index.do"); %>
<%-- <%request.getRequestDispatcher("/admin/toadmin.do").forward(request, response); %> --%>
</body>
</html>