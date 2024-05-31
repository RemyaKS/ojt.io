import java.time.LocalDate;
import java.util.Scanner;
public class leapyear{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year :");//(yyyy-mm-dd)
        String year=s.nextLine();
        LocalDate leapyear=LocalDate.parse(year);
        boolean isLeapYear=leapyear.isLeapYear();
        System.out.println(isLeapYear);

    }
}