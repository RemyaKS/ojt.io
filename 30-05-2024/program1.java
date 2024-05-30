import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;  
            }

            if (num < 0) {
               
                System.out.println("Negative number ignored.");
                continue;
            }

            sum += num;
        }

        System.out.println("The sum of the positive numbers is: " + sum);
        scanner.close();
    }
}
