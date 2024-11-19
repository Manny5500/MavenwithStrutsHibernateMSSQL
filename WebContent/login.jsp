<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
        <title>Login Page</title>
    </head>
    <body>
        <h3>Welcome to Struts 2 Login Tutorial</h3>
    <s:form action="save">
        <s:textfield name="username" label="User Name"></s:textfield>
        <s:textfield name="password" label="Password" type="password"></s:textfield>
        <s:submit value="Login"></s:submit>
    </s:form>
    </body>
</html>