package com.javaFramework.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertNewUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn = null;
        PreparedStatement pstmt = null;
        String dPath = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/kodnest ? user=root & password=Saikrishna@44";
        String query = "Insert into students values(?, ?, ?, ?, ?, ?)";
        
        try {
            Class.forName(dPath);
            conn = DriverManager.getConnection(url);
            pstmt = conn.prepareStatement(query);
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("Enter name:");
            sc.nextLine();
            String name =  sc.nextLine();
            System.out.println("Enter age:");
            int age = sc.nextInt();
            System.out.println("Enter marks:");
            int mark = sc.nextInt();
            System.out.println("Enter rollNo:");
            String rollNo = sc.next();
            System.out.println("Enter password:");
            String password = sc.next();
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setInt(4, mark);
            pstmt.setString(5, rollNo);
            pstmt.setString(6, password);
            int rs = pstmt.executeUpdate();
            System.out.println(rs + " row(s) affected");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
               if (pstmt != null) pstmt.close();
               if (conn != null) conn.close();
               if (sc != null) sc.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
        }
    }
}
