package dao;

import java.sql.*;
import java.io.FileInputStream;
import java.util.Properties;

public class DBConnection {

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {

                Properties props = new Properties();
                FileInputStream fis = new FileInputStream("resources/db.properties");
                props.load(fis);

                String driver = props.getProperty("db.driver");
                String url = props.getProperty("db.url");
                String username = props.getProperty("db.username");
                String password = props.getProperty("db.password");

                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}

