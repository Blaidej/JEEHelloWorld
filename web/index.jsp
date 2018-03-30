<%-- 
    Document   : index
    Created on : Jan 9, 2018, 8:59:27 PM
    Author     : rfoy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp">
            <label>Name: </label> <input type="text" name="name" value="" />
            <br>
            <input type="submit" value="Greet" />
        </form>
        <h1>Hello, ${empty param.name ? 'World' : param.name}!</h1>
    </body>
</html>
