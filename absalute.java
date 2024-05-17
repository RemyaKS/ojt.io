import java.util.Scanner;
class absalute{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        System.out.println("Enter the number :");
        if(num1<0){
            System.out.println((num1)+"is absalute value");
        }
        
        else{
            System.out.println((num1)+"is not absalute value");
        }
    }
}