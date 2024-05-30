import java.util.Scanner;

public class program2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String intro = sc.nextLine();
        int i =0;
        int total =1;
        for(i=0;i<intro.length();i++){
            if((intro.charAt(i) == ' ')&& (intro.charAt(i + 1)!=' ')){
                total+=1;
            } 
        }
        System.out.println(total);
    }
}
