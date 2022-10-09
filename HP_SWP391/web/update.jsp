<%-- 
    Document   : update
    Created on : Sep 27, 2021, 12:21:21 PM
    Author     : dell
--%>

<%@page import="model.Department"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Student s = (Student)request.getAttribute("student");
            ArrayList<Department> depts = (ArrayList<Department>)request.getAttribute("depts");
        %>
        
    </head>
    <body>
        <form action="update" method="POST">
            Id: <%=s.getId() %> <input type="hidden" name="id" value="<%=s.getId()%>" /> <br/>
            Name: <input type="text" value="<%=s.getName()%>" name="name" /> <br/>
            Gender: <input type="radio" 
                           <%= (s.isGender())?"checked=\"checked\"":"" %>
                           name="gender" value="male" /> Male
            <input type="radio" 
                            <%= (!s.isGender())?"checked=\"checked\"":"" %>
                   name="gender" value="female" /> Female <br/>
            Dob: <input type="date" value="<%=s.getDob()%>" name="dob"/> <br/>
            Department: <select name="did">
                <% for (Department d : depts) {
                %>
                <option 
                    <%= (d.getId() == s.getDept().getId())?"selected=\"selected\"":"" %>
                    value="<%=d.getId()%>" ><%=d.getName()%></option>
                <%}%>
            </select>
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
