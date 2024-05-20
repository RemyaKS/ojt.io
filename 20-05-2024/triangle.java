import java.util.Scanner;
    public class triangle{
        public static void main(String[] args) {
            Scanner s=new  Scanner(System.in);
            System.out.println("enter the first value");
            int a=s.nextInt();
            System.out.println("enter the second value");
            int b=s.nextInt();
            System.out.println("enter the third value");
            int c=s.nextInt();
            int sum=a+b+c;
            if(sum==180){
                System.out.println("it is a valid triangle");
            }
            else{
                System.out.println("it is not a valid triangle");
            }
            
        }
    }
