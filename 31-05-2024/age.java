import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your date of birth");//(y/m/d)
        String date=s.nextLine();
        LocalDate dob=LocalDate.parse(date);
        LocalDate today=LocalDate.now();
        System.out.println("Today's Date :"+today);
        Period age=Period.between(dob,today);
        System.out.println("My age"+age.getYears());
 }
}
