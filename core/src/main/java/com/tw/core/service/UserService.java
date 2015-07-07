package com.tw.core.service;

import com.tw.core.db.DBOperate;
import com.tw.core.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();

        try {
            DBOperate dbOperate = new DBOperate();
            ResultSet rs = dbOperate.showUsers();

            while (rs.next()) {
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String email = rs.getString("email");
                int age = rs.getInt("age");
                User user = new User(name, gender, email, age);
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

}
