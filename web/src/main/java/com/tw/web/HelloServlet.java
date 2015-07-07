package com.tw.web;

import com.tw.core.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.setAttribute("users", new UserService().getUsers());
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("views/users.jsp");
        requestDispatcher.forward(req, res);
    }
}