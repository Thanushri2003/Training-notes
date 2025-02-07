package com.mphasis.JDBC_MYSQL;
import java.sql.*;
import java.util.Scanner;

public class jdbc {
    public static void main(String[] args) {
        // 🔹 Database Credentials
        String url = "jdbc:mysql://localhost:3306/thanu2"; // Change 'your_database' to your DB name
        String user = "root"; // Change if your MySQL username is different
        String password = "Password@12"; // Change to your MySQL password

        // 🔹 SQL Query for Insertion
        String sql = "INSERT INTO jdbc (id, name, city) VALUES (?, ?, ?)";

        // 🔹 Try-with-Resources (Auto Close)
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.println("Enter Employee Age: ");
            String city= scanner.nextLine();

            // 🔹 Setting Values in PreparedStatement
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, city);

            // 🔹 Execute Insert
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee added successfully!");
            }

        } 
        catch (SQLException e) 
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
