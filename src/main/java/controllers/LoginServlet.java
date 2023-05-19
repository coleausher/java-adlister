package controllers;

import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name= "controllers.LoginServlet", urlPatterns= "/login")
public class LoginServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle the POST request here
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // login logic from login.jsp goes here
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }

    }
}



