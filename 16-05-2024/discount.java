import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of students");
        int number=s.nextInt();
        int total=number*100;
        if(total>1000){
           int discount=(total*10)/100;
           System.out.println("your discount amount is :" + discount +"add your amount is" + (total-discount));
        }
        else{
            System.out.println("your amount is :" + total);
        }
    }
    
}
