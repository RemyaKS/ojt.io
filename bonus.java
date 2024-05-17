
import java.util.Scanner;
class bonus{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary=s.nextInt();
        System.out.println("Year of experience");
        int year=s.nextInt();
        int bonus=(salary*year)/100;
        if(year>5){
            System.out.println("Bonus is"+bonus+"Net salary"+(salary+bonus));
        }
     
 else{
    System.out.println("No bonus");
 }       
    }

}