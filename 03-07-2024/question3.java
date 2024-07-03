package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class question3 {
    private static final String url = "jdbc:mysql://localhost:3306/customerdb";
    private static final String user = "root";
    private static final String password = "nsti";

    public static void main(String[] args) {
        String tableName = "Books";
        
        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Insert records
            createRecord(connection, tableName, "Long Walk To Freedom", "Nelson Mandela", 5);
            createRecord(connection, tableName, "Wings Of Fire", "APJ", 2);

            // Read records
            readRecords(connection, tableName);
            
            // Update record
            updateRecord(connection, tableName, 1, "Long Walk To Freedom", "Nelson Mandela", 5);
            
            // Delete record
            deleteRecord(connection, tableName, 1);
            
            // Close the connection
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createRecord(Connection connection, String tableName, String title, String author, int quantity) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (title, author, quantity) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setInt(3, quantity);
            preparedStatement.executeUpdate();
            System.out.println("Record created successfully: " + title + ", " + author + ", " + quantity);
        }
    }

    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int book_id = resultSet.getInt("book_id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                int quantity = resultSet.getInt("quantity");
                System.out.println("ID: " + book_id + ", Title: " + title + ", Author: " + author + ", Quantity: " + quantity);
            }
        }
    }

    private static void updateRecord(Connection connection, String tableName, int book_id, String title, String author, int quantity) throws SQLException {
        String updateSQL = "UPDATE " + tableName + " SET title = ?, author = ?, quantity = ? WHERE book_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setInt(3, quantity);
            preparedStatement.setInt(4, book_id);
            preparedStatement.executeUpdate();
            System.out.println("Record updated successfully: ID " + book_id);
        }
    }

    private static void deleteRecord(Connection connection, String tableName, int book_id) throws SQLException {
        String deleteSQL = "DELETE FROM " + tableName + " WHERE book_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, book_id);
            preparedStatement.executeUpdate();
            System.out.println("Record deleted successfully: ID " + book_id);
        }
    }
}
