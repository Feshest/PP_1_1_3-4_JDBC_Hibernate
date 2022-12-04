package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("[MESSAGE] Successful connection.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("[MESSAGE] Connection error.");
        }
        return connection;
    }
}
