package javaapplication4;
import java.sql.*;

public class crud {
    private static final String url="jdbc:mysql://localhost:3306/employeedata";
    private static final String user="root";
    private static final String password="";
    
    public static void main(String[] args){
        try
        {
            Connection connection=DriverManager.getConnection(url,user,password);
            //create a record.
            createRecord(connection,1,"Neeraja","neeraja@gmail.com");
            readRecord(connection);
            updateRecord(connection,1,"Nimmi","nimmi@gmail.com");
            deleteRecord(connection,1);
            connection.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
     }
    
//create a new record.
public static void createRecord(Connection connection,int id,String name,String email)throws SQLException{
String insertSQL="INSERT INTO users(id,name,email)VALUES (?,?,?)";
PreparedStatement ps=connection.prepareStatement(insertSQL);
ps.setInt(1,id);
ps.setString(2, name);
ps.setString(3,email );
ps.executeUpdate();
System.out.println("record created successfully");
}
public static void readRecord(Connection connection)throws SQLException{
String selectfrom="SELECT * FROM users";
PreparedStatement ps=connection.prepareStatement(selectfrom);
ResultSet rs=ps.executeQuery();
while(rs.next()){
    int id =rs.getInt("id");
    String name=rs.getString("name");
    String email=rs.getString("email");
    System.out.println("id"+id+" name "+name+" email"+email);
}

}
public static void updateRecord(Connection connection,int id,String name,String email)throws SQLException{
    String updatequery="UPDATE users SET name=?,email=? where id=?";
    PreparedStatement ps=connection.prepareStatement(updatequery);
    ps.setString(1, name);
    ps.setString(2, email);
    ps.setInt(3, id);
    ps.executeUpdate();
    System.out.println("Record updated successfully");
}
public static void deleteRecord(Connection connection,int id)throws SQLException{
String deletequery="DELETE FROM users WHERE id=?";
PreparedStatement ps=connection.prepareStatement(deletequery);
ps.setInt(1,id);
ps.executeUpdate();
System.out.println("delete record successfully");

}
}