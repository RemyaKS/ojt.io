
import java.util.Scanner;

public class program1{
    public static void main(String[] args) {
        String username="admin";
        String password="admin@123";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter username :");
        String user=s.nextLine();
        System.out.println("Enter password :");
        String pass=s.nextLine();
        if(username.equals(user) && password.equals(pass)){
            System.out.println("Welcome to home page");
        }
        else if(username.equals(user) || password.equals(pass)){
            if(username.equals(user)){
                System.out.println("Incorrect password");
            }
            else{
                System.out.println("Incorrect username");
            }

        }
        else{
            System.out.println("Invalid password or username");
        }

}
}