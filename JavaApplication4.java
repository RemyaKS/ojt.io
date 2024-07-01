package javaapplication4;

import java.sql.*;


/**
 *
 * @author nsti w
 */
public class JavaApplication4 {

    private static final String url = "jdbc:mysql://localhost:3306/data";
    private static final String user = "root";
    private static final String password = "";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Successfully connected to the database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database!");
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
