package org.ajay.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        //Creating the connection
        String url = "jdbc:postgresql://localhost/postgres";
        Connection connection = null;

        int rollNo = 1;
        String name = "John";
        int age = 20;
        String sql = "INSERT INTO STUDENT(rollno, name, age) " +
                "values(" + rollNo + ",'" + name + "'," + age + ")";

        try {
            connection = DriverManager.getConnection(url, "postgres", "ajay@123");

            Statement statement = connection.createStatement();
            int m = statement.executeUpdate(sql);

            if (m == 1)
                System.out.println("Inserted successfully " + sql);
            else
                System.out.println("Insertion failed");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (connection != null)
                connection.close();
        }
    }
}
