import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=s.nextLine();
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("a"));
    }
}
