import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i=0;i<10;i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;  
            }
        sum += num;
        }
        System.out.println("The sum of the numbers is: " + sum);
        scanner.close();
    }
}
