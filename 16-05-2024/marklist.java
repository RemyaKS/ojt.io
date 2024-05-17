import java.util.Scanner;
class marklist {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter your mark");
     int x =s.nextInt();
     if(x>=80){
        System.out.println("A");
     }
     else if(x>=60){
        System.out.println("B");
     }
     else if(x>=50){
        System.out.println("c");
     }
     else if(x>=45){
        System.out.println("D");
     }
     else{
        System.out.println("F");
     }
    }
    
}
