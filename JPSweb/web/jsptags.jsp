
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%int age = 29; String name ="Rudresh"; String lname;%>
       <%
           out.print("Age :" + age);
           out.print("Name :" + name);
           
           lname = "ABC";
           out.print("LName :" + lname);
           
           %>
           
    </body>
</html>
