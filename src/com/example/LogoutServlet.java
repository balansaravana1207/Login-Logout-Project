package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the current session, but do not create a new one if it doesn't exist
        HttpSession session = request.getSession(false);
        
        if (session != null) {
            // The current session is invalidated
            session.invalidate();
        }
        
        // Add a confirmation message
        request.setAttribute("logout_msg", "You have successfully logged out.");
        // The user is redirected to the login page
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}