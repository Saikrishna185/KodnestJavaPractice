// src/com/javaFramework/JDBC/Demo.java
package com.javaFramework.JDBC; // package declaration for the JDBC demo class

// Import JDBC classes needed to connect to the database and handle results
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {
        // Fully-qualified name of the MySQL JDBC driver class
        String dPath = "com.mysql.cj.jdbc.Driver";
        // JDBC connection URL to the 'kodnest' database on localhost port 3306
        String url = "jdbc:mysql://localhost:3306/kodnest";
        // Database username (avoid hardcoding credentials in production)
        String user = "root";
        // Database password (avoid hardcoding credentials in production)
        String password = "Saikrishna@44";

        // Declare JDBC resources outside try so they can be closed in finally
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        // SQL query to retrieve all rows from the 'students' table
        String query = "select * from students";

        try {
            // Load the JDBC driver class (not always required with modern drivers, but kept for compatibility)
            Class.forName(dPath);
            System.out.println("Connection to Driver Successfull");

            // Establish a connection to the database using the URL, user and password
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successfull");

            // Create a Statement object for sending SQL statements to the database
            stmt = conn.createStatement();
            System.out.println("Statement Successfull");

            // Execute the query and obtain the result set
            rs = stmt.executeQuery(query);
            System.out.println("ResultSet Successfull and got the result/data");

            // Iterate over the ResultSet rows
            // rs.next() moves the cursor to the next row and returns false when no more rows
            while (rs.next()) {
                // Retrieve column values by index: indexes start at 1
                // Adjust getters based on actual column types in the 'students' table
                System.out.println(rs.getInt(1) + " " +  rs.getString(2) +  " " +  rs.getInt(3) +   " " +  rs.getInt(4));
            }

        } catch (Exception e) {
            // Print stack trace for any exception (SQLException, ClassNotFoundException, etc.)
            e.printStackTrace();
        }
        finally {
            // Close resources in finally to ensure they are released even if an exception occurs
            // Null-checks are recommended to avoid NullPointerException if a resource was not allocated
            try {
                // Close ResultSet if it was opened
                if (rs != null) {
                    rs.close();
                }
                // Close Statement if it was created
                if (stmt != null) {
                    stmt.close();
                }
                // Close Connection if it was established
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                // Handle exceptions thrown while closing resources
                e.printStackTrace();
            }
        }
    }
}