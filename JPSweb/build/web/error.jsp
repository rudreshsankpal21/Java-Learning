<%-- 
    Document   : error
    Created on : 10 Sept 2026, 9:15:49 am
    Author     : sangmeshwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        out.print(exception.getMessage());
        %>
    </body>
</html>
