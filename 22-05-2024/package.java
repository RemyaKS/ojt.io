import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.err.println("Enter your name");
        String username=myobj.nextLine();
        System.out.println("Welcome"+" "+ username);
    }
}