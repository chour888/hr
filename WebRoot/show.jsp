<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
  </head>
  
  <body>
  <c:if test="${allDepts != null}"  var="res" >
  	<table border = "1" width = "100%">
		<tr>
		<td>部门编号</td>
		<td>部门名字</td>
		<td>部门位置</td>
		<td>所属公司</td>
		<td>公司网站</td>
		</tr>
  <c:forEach items="${allDepts}" var="dept" step="2" >
  		<tr>
		<td>${dept.deptno}</td>
		<td>${dept.dname}</td>
		<td>${dept.loc}</td>
		<td>${dept.company.name}</td>
		<td>${dept.company.url}</td>
		</tr>
  </c:forEach>
  	</table>
  </c:if>
	
  </body>
</html>
