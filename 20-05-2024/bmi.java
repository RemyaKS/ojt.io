import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        double weight=s.nextDouble();
        System.out.println("Enter your height in sentimeter");
        
        double height=s.nextDouble();
        double heightinmeter=height/100;
        double bmi=(weight/(heightinmeter*heightinmeter));
        System.out.println("your bmi is "+bmi);
        if(bmi<18.5){
            System.out.print("You are under weight");
        }
        else if((bmi>=18.5)&&(bmi<25)){
            System.out.println("Normal weight");
        }
        else if((bmi>=25)&&(bmi<30)){
            System.out.println("over weight");
        }
        else if(bmi>=30){
            System.out.println("obesity");
        }
    
    }
    
}
