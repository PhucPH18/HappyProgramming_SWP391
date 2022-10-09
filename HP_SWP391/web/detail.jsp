<%-- 
    Document   : detail
    Created on : Sep 27, 2021, 12:10:54 PM
    Author     : dell
--%>

<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Student s = (Student)request.getAttribute("student");
        %>
    </head>
    <body>
        ID: <%=s.getId() %> <br/>
        Name: <%=s.getName() %> <br/>
        Dob: <%=s.getDob()%> <br/>
        Gender: <%=s.isGender()?"Male":"Female" %> <br/>
        Department: <%=s.getDept().getName() %> <br/>
    </body>
</html>
