import java.util.Scanner;

class rectangle{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int x=s.nextInt();
        System.out.println("Enter the breadth");
        int y=s.nextInt();
        if(x==y){
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }
    }
}