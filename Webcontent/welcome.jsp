<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>

    <%-- The session is checked implicitly; if no "username" attribute exists, this could be null --%>
    <h2>Welcome, <%= session.getAttribute("username") %>!</h2>
    <p>You have successfully logged in.</p>

    <%-- The logout action trigger --%>
    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout">
    </form>

</body>
</html>