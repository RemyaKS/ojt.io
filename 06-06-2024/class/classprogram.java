
import java.util.Scanner;

public class classprogram {
   Scanner scan=new Scanner(System.in);
   String name="";
   int marks=0;
   public void get_details(){
    System.out.println("Enter your name :");
    name=scan.nextLine();
    System.out.println("Enter your mark :");
    marks=scan.nextInt();

   }
   
    public  void show_details(){
        System.out.println("Name of student is :"+name);
        System.out.println("Marks of Students :"+marks);
    }
}
