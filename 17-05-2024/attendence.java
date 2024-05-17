import java.util.Scanner;
public class attendence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of classes held");
        int classes=scan.nextInt();
        System.out.println("Enter the number of classes attended");
        int present=scan.nextInt();
        double percentage=((double) present/classes)*100;
        System.out.println("Attendence percentage = "+percentage);
        if(percentage<75)
        {
            System.out.println("you are not allowed to attend exam");
            
        }
        else{
            System.out.println("you are allowed to attend exam");
        }
    }
}
