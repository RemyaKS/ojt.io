import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        int temp=num;
        int sum=0;
        int reminder;
        while(temp>0){
            reminder=temp%10;
            sum=(sum*10)+reminder;
            temp=temp/10;
            }
            System.out.println(sum);
}
}
        

