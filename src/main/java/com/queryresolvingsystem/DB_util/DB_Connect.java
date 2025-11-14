package com.queryresolvingsystem.DB_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {

    public static Connection getConnection() {

        Connection conn = null;

        try {
            // Load PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // JDBC URL for Render PostgreSQL
            String url = "jdbc:postgresql://dpg-d4bhsuodl3ps739dhbjg-a.oregon-postgres.render.com:5432/query_db_qjnm?sslmode=require";

            // Render PostgreSQL credentials
            String username = "query_db_qjnm_user";
            String password = "zQckcceZ7vNTYzAnFb95vQHPi7zwXBiX";

            // Create connection
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }

        return conn;
    }
}
