package com.javaFramework.JDBC;

import java.sql.*;
import java.util.Scanner;

public class AuthenticateStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String dPath = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/kodnest";
        String user = "root";
        String pswd = "Saikrishna@44";
        String query = "select * from students where rollno = ? and password = ? ";
        
        try {
            Class.forName(dPath);
            
            conn = DriverManager.getConnection(url, user, pswd);
            
            stmt = conn.prepareStatement(query);
            System.out.println("Provide rollno and password");
            String rollno = sc.next();
            String password = sc.next();
            stmt.setString(1, rollno);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
            } else {
                InvalidCredentialsException ice = new InvalidCredentialsException();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                if (sc != null) sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
