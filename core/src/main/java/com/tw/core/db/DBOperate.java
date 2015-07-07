package com.tw.core.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOperate {
    Connection conn = DBConnection.getConnInstance();

//    public void addBook(int isbn, String name, double price, String author) throws SQLException {
//        PreparedStatement stmt;
//        stmt = conn.prepareStatement("INSERT INTO book VALUES(?, ?, ?, ?)");
//        stmt.setInt(1, isbn);
//        stmt.setString(2, name);
//        stmt.setDouble(3, price);
//        stmt.setString(4, author);
//
//        stmt.executeUpdate();
//        stmt.close();
//    }

    public ResultSet showUsers() throws SQLException {
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM USER");
        ResultSet rs = statement.executeQuery();
        return rs;
    }
}
