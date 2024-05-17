import java.util.Scanner;
class graterthan{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println(num1 + "graterthan" + num2);
        }
        else if (num2>num1){
            System.out.println(num2 + "greterthan"+num1);
        }
        else{
            System.out.println("both are equale");

        }
    }

}
