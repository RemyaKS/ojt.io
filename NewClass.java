import java.sql.DriverManager;
import java.sql.Connection;
//load the driver manager
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class NewClass {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/academy";
        String user = "root";
        String password ="";
       
        try(Connection conn = DriverManager.getConnection
        (url,user,password);Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * from playerss")){
           while(rs.next()){
               String age = rs.getString("age");
               String name = rs.getString("name");
               System.out.println("age :"+age+ ", Student Name :"+name);
           }
        }
        catch(SQLException e){
            System.out.println(e);
           
        }
       
    }
}

