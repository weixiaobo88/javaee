package com.tw.core.db;

import org.apache.commons.dbcp.BasicDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static Connection conn = null;

    private DBConnection() {

    }

    public static Connection getConnInstance() {
        if(null == conn){
            synchronized (DBConnection.class){
                if(null == conn){
                    conn = getConnection();
                }
            }
        }
        return DBConnection.conn;
    }

    private static Connection getConnection() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/USERMANAGEMENT");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection() {
        if (null != conn) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
