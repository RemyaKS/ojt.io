import java.util.Scanner;
public class medical {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Do you have any medical causes(Y/N) ?");
        String medicals=s.nextLine();
        if((medicals.equals("Y"))||(medicals.equals("y"))){
            System.out.println("Submit your medical certificate");
        }
        else{
            System.out.println("No need of medical certificate");
        }
     }
}
