import java.util.Scanner;
public class numcheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =s.nextInt();

        if(num < 0){
            System.out.println("Negative number");
        }
        else if(num > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }
       
        
    }
    
}