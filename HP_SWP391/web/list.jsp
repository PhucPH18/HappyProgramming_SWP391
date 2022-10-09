<%-- 
    Document   : list
    Created on : Sep 20, 2021, 1:09:05 PM
    Author     : 84344
--%>

<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ArrayList<Student> students = (ArrayList<Student>)request.getAttribute("students");
        
        %>
        <script> 
            function doUpdate(id)
            {
                window.location.href = "update?id=" + id;
            }
            function doDelete(id)
            {
                var c = confirm("are you sure?");
                if(c)
                {
                    window.location.href = "delete?id=" + id;
                }
            }
        
        </script>
    </head>
    <body>
        <table>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Gender</td>
                <td>Dob</td>
                <td>Department</td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <%
                for (Student s : students) {
            %>
            <tr>
                <td><%=s.getId() %></td>
                <td><%=s.getName()%></td>
                <td><% if(s.isGender()){%>
                    <img src="../img/male-icon.png" alt=""/>
                    <%} else {%>
                    <img src="../img/female-icon.png" alt=""/>
                    <%}%>
                </td>
                <td><%=s.getDob()%></td>
                <td><%=s.getDept().getName() %></td>
                <td><a href="detail?id=<%=s.getId() %>">Detail</a></td>
                <td>
                    <input type="button" onclick="doUpdate(<%=s.getId()%>);" value="Update"/>
                </td>
                <td>
                    <input type="button" onclick="doDelete(<%=s.getId()%>);" value="Delete"/>
                </td>
            </tr>
            <%}%>
        </table>
        <a href="insert">Insert</a>
    </body>
</html>
