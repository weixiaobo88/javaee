package com.tw.web;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

import com.tw.core.Service;

public class HelloServlet extends HttpServlet {
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();

        out.println(new Service().service());
        out.close();
    }
}