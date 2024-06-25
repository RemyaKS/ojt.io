package newpackage1;

import java.sql.*;

public class JavaApplication2 {
    private static final String URL = "jdbc:mysql://localhost:3306/newdatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // Call createUser method to create a new intern data
        createUser(1, "Remya", "ksremya718@gmail.com");
        readUser();
    }

    // Define createUser method outside main method
    public static void createUser(int id, String Name, String Email) {
        String query = "INSERT INTO interndetails(id, Name, Email) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, Name);
            ps.setString(3, Email);

            int rowsInserted = ps.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Define readUser method
    public static void readUser() {
        String query = "SELECT * FROM interndetails";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query)) {
            System.out.println("Intern Details:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String Name = rs.getString("name");
                String Email = rs.getString("email");
                System.out.println("ID: " + id + " Name: " + Name + " Email: " + Email);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
