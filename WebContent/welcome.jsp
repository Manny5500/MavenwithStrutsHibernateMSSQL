<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>Welcome To Struts 2 Tutorial</title>
    </head>
    <body>
        <h3>Welcome <s:property value="username"></s:property>!</h3>
        <h3>The password is <s:property value="password"></s:property></h3>
    </body>
</html>