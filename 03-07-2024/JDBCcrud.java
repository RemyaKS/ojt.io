package javacoders.JDBCcrud;

import java.sql.*;

public class JDBCcrud {
    public static final String url = "jdbc:mysql://localhost:3306/newdb"; // Include database name here
    private static final String user = "root";
    private static final String password = "nsti";

    public static void main(String[] args) {
        String tableName = "users";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Create a new database if not exists
            createDatabase(connection, "newdb");

            // Use the new database
            connection.setCatalog("newdb");

            // Create a table if not exists
            createTable(connection, tableName);

            // Insert records
            createRecord(connection, tableName, "john", "john@gmail.com");
            createRecord(connection, tableName, "Riha", "riha@gmail.com");

            // Read records
            readRecords(connection, tableName);

            // Update record
            updateRecord(connection, tableName, 1, "John Doe", "john.doe@gmail.com");

            // Delete record
            deleteRecord(connection, tableName, 1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new database if not exists
    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully");
        }
    }

    // Create a new table if not exists
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "email VARCHAR(100) NOT NULL)";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully");
        }
    }

    // Create a new record
    private static void createRecord(Connection connection, String tableName, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (name, email) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();
            System.out.println("Record created successfully");
        }
    }

    // Read records from the database
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        }
    }

    // Update an existing record
    private static void updateRecord(Connection connection, String tableName, int id, String name, String email) throws SQLException {
        String updateSQL = "UPDATE " + tableName + " SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
            System.out.println("Record updated successfully");
        }
    }

    // Delete a record from the database
    private static void deleteRecord(Connection connection, String tableName, int id) throws SQLException {
        String deleteSQL = "DELETE FROM " + tableName + " WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Record deleted successfully");
        }
    }
}
