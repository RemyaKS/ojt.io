import java.util.Scanner;
class vote{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter your age");
    int age=s.nextInt();
    if(age>=18){
        System.out.println("You are eligible ");
    }
    else{
        System.out.println("you are not eligible");
    }
}
}
