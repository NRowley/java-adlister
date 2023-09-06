package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("WEB-INF/ads/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        if (username.equals("") || password.equals("") || email.equals("")) {
            response.sendRedirect("/register");
        }
//        else if (DaoFactory.getUsersDao().findByUsername(username).getUsername().equals(username)) {
//            response.sendRedirect("/register");
//        }
        else {
            User user = new User(request.getParameter("username"), request.getParameter("email"), request.getParameter("password"));
            DaoFactory.getUsersDao().insert(user);
            response.sendRedirect("/login");
        }
        // TODO: if a user was successfully created, send them to the login page
    }
}
