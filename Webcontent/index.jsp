<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

    <h2>User Login</h2>

    <%-- Display error message on authentication failure --%>
    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
            out.println("<p style='color:red;'>" + error + "</p>");
        }
    %>

    <%-- Display confirmation message on logout --%>
    <%
        String logoutMsg = (String) request.getAttribute("logout_msg");
        if (logoutMsg != null) {
            out.println("<p style='color:green;'>" + logoutMsg + "</p>");
        }
    %>

    <form action="LoginServlet" method="post">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>
        
        <input type="submit" value="Login">
    </form>

</body>
</html>