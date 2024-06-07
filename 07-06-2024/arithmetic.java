
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your operator");
        String operator=s.nextLine();
        System.out.println("Enter the fisrt number :");
        int num1=s.nextInt();
        System.out.println("Enter the second number :");
        int num2=s.nextInt();
        
        //String operator="add";
        switch (operator){
            case "add":
            System.out.println("Addition :"+(num1+num2));
            break;
            case "sub":
            System.out.println("Substraction :"+(num1-num2));
            break;
            case "mul":
            System.out.println("Substraction :"+(num1*num2));
            break;
            case "div":
            System.out.println("Substraction :"+(num1/num2));
            break;
        }
        }
            

            
     }

