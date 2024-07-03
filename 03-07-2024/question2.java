package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class question2 {
    public static final String url = "jdbc:mysql://localhost:3306/customerdb"; // Corrected URL to include the database name
    private static final String user = "root";
    private static final String password = "nsti";

    public static void main(String[] args) {
        String tableName = "Customers";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Insert records
            createRecord(connection, tableName, "Miya", "miya12@gmail.com");
            createRecord(connection, tableName, "Nila", "nila90@gmail.com");

            // Read records
            readRecords(connection, tableName);
            

            // Close the connection
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new record
    private static void createRecord(Connection connection, String tableName, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (customer_name, city) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();
            System.out.println("Record created successfully: " + name + ", " + email);
        }
    }

    // Read records from the database
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String city = resultSet.getString("city");
                System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
            }
        }
    }
}
