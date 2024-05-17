import java.util.Scanner;
public class age{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Age of first person :");
        int a=s.nextInt();
        System.out.println("Age of second person :");
        int b=s.nextInt();
        System.out.println("Age of Third person :");
        int c=s.nextInt();
        if(a>b&&a>c){
            System.out.println("First person is oldest");
        }
        else if(b>a&&b>c){
            System.out.println("Second person is oldest");

        }
        else{
            System.out.println("Third person is oldest");
        }
        }
}
