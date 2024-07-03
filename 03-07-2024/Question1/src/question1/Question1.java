package question1;
import java.sql.*;
import java.util.concurrent.Callable;
public class Question1 {
     public static final String url="jdbc:mysql://localhost:3306/";
        private static final String user="root";
        private static final String password="nsti";

    public static void main(String[] args) {
        String databaseName="InventoryDB";
        String tableName="Products";   
        
        
         try {
            //establishing a connection
            Connection connection=DriverManager.getConnection(url,user,password);
            //create a database
            createDatabase(connection,databaseName);
            //use the new database
            connection.setCatalog(databaseName);
            //create a table
            createTable(connection,tableName);
  
            //close the connection
            connection.close();
            
            }catch(SQLException e){
                e.printStackTrace();
            }
         }
    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
       String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
       Statement statement = connection.createStatement();
      statement.executeUpdate(createDatabaseSQL);
      System.out.println("Database created successfully");
   }
 
   // Create a new table
   private static void createTable(Connection connection, String tableName) throws SQLException {
       String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
               + "product_id INT AUTO_INCREMENT PRIMARY KEY, "
               + "product_name VARCHAR(100) NOT NULL, "
               + "price DOUBLE NOT NULL)"
               +"Stock_quantity INT";
      Statement statement = connection.createStatement();
      statement.executeUpdate(createTableSQL);
      System.out.println("Table created successfully");
   }

}
