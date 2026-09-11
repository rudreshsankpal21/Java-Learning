<%-- 
    Document   : pageScope
    Created on : 10 Sept 2026, 9:00:05 am
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
        <%
        pageContext.setAttribute("role","admin",pageContext.SESSION_SCOPE);
        %>
        
        <a href="second.jsp">Next</a>
    </body>
</html>
