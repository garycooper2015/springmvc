<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 4 MVC -HelloWorld</title>
<style>
	body{
		background-color:#f7f7f9;
	}
</style>
</head>
<body>
    <center>
        <h2>Hello World</h2>
        <h2>
            ${message} ${name} </h2>
            
        <c:forEach var="item" items="${list1}">
        		${item}<br/>
        </c:forEach>
        <br/>
        整数:${int1}<br/>
        浮点数:${float1}
            
    </center>
</body>
</html>