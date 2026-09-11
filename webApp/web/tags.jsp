<%-- 
    Document   : tags
    Created on : 10 Sept 2026, 8:39:42 am
    Author     : sangmeshwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int age = 20; String name = "Rudresh"%>
        
        <%
           out.print("Age = "+age);
           out.print("Name = "+name);
        %>
    </body>
</html>
