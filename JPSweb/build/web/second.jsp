<%-- 
    Document   : second
    Created on : 10 Sept 2026, 9:04:46 am
    Author     : sangmeshwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username = (String)pageContext.getAttribute("username",pageContext.SESSION_SCOPE);
            String password = (String)pageContext.getAttribute("password",pageContext.SESSION_SCOPE);
             out.print("Username = " + username + " <br> "); 
             out.print("Password = " +password);
             
        %>
     
    </body>
</html>
