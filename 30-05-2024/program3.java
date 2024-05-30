//	Write a program that reads a comma-separated string of numbers from the user and converts it into an array of integers. Then, print the array.
import java.util.Scanner;

public class program3 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a comma-separated string of numbers:");
        String input = Scanner.nextLine();

        String[] strArray = input.split(",");

        int[] intArray=new int[strArray.length];


        for(int i=0;i<strArray.length;i++ ){
            intArray[i]=Integer.parseInt(strArray[i]);
        }

System.out.println(input);
    }
    
    
}
