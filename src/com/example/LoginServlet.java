package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // User credential validation (hardcoded for this example)
        if ("user".equals(user) && "password".equals(pass)) {
            // On successful authentication, a session is created
            HttpSession session = request.getSession();
            // User data is stored
            session.setAttribute("username", user);
            // The user is redirected to a protected page
            response.sendRedirect("welcome.jsp");
        } else {
            // On authentication failure, display an error
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}