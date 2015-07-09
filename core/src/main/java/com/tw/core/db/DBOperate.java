package com.tw.core.db;

import com.tw.core.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOperate {
    Connection conn = DBConnection.getConnInstance();

    public void addUser(User user) throws SQLException {
        PreparedStatement stmt;
        stmt = conn.prepareStatement("INSERT INTO user VALUES(?, ?, ?, ?)");
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getGender());
        stmt.setString(3, user.getEmail());
        stmt.setInt(4, user.getAge());

        stmt.executeUpdate();
        stmt.close();
    }

    public ResultSet showUsers() throws SQLException {
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM USER");
        ResultSet rs = statement.executeQuery();
        return rs;
    }
}
