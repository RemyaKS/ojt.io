//Create a Person class with attributes name and age. Write a program that creates an array of Person objects, initializes them with user input, and then prints out the details of each Person.
import java.util.Scanner;
public class program4{
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name=Scanner.nextLine();
        System.out.println("Enter the age:");
        int age=Scanner.nextInt();
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}

