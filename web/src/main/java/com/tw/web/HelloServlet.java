package com.tw.web;

import com.tw.core.Service;
import com.tw.core.db.DBOperate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloServlet extends HttpServlet {
    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();

        out.println(new Service().service());

        try {
            DBOperate dbOperate = new DBOperate();
            ResultSet rs = dbOperate.showUsers();

            out.println("------------------");

            while (rs.next()) {
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                out.println(name);
                out.println("Gender: " + gender);
                out.println("Email: " + email);
                out.println("Age: " + age);
                out.println("~~~~~~~~~~~~~~~~~");
                out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.close();

    }


}