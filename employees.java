import java.util.Scanner;
public class employees {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your gender :");
        String gender=s.nextLine();
        System.out.println("Enter your age :");
        int age=s.nextInt();
        if((gender.equals("F"))||(gender.equals("f"))){
           System.out.println("Work in urbon areas");
        }
        else if((gender.equals("M"))||(gender.equals("m"))){
            if((age>=20)&&(age<=40))
            {
                System.out.println("Work in anywhere");
            }
            else if((age>=40)&&(age<=60)){
                System.out.println("Work in urbon area only");
            }
            else{
                System.err.println("ERROR");
            }

        }
        else{
            System.err.println("invalid input");
        }
     }
}
