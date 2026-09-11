<%-- 
    Document   : sessionScope
    Created on : 11 Sept 2026, 10:53:47 am
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
        pageContext.setAttribute("username","admin",pageContext.SESSION_SCOPE);
        pageContext.setAttribute("password","admin",pageContext.SESSION_SCOPE);
        %>
        <a href="second.jsp">Next Page</a>
    </body>
</html>
