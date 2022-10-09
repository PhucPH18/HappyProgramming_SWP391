<%-- 
    Document   : login
    Created on : Oct 7, 2022, 9:53:51 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST">
            <div>${error}</div>
            Username:<input type="text" name="user" value="" /><br>
            Pw:<input type="password" name="pass" value="" /><br>
            <input type="submit" value="login" />
        </form>
    </body>
</html>
