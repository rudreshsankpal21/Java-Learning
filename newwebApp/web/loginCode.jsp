<%-- 
    Document   : loginCode
    Created on : 3 Sept 2026, 1:34:42 pm
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
    
    <body>
        <%
            String uname = request.getParameter("username");
            String pass = request.getParameter("password");
            
            if (uname.equals("admin") && pass.equals("12345")) {
                    response.sendRedirect("home.jsp");
                } else {
                    response.sendRedirect("errorPage.jsp");
            }
        %>
    </body>
</html>
