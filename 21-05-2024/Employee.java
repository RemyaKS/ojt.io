import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

    public class Employee{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter ypur name");
            String name=s.nextLine();
            System.out.println("Enter date of joining :");
            LocalDate joiningDate= LocalDate.parse(s.nextLine());
            LocalDate currentDate=LocalDate.now();
            Period experience=Period.between(joiningDate,currentDate);
            System.out.println("Name :"+name);
            System.out.println("Experience :"+experience.getYears()+"years");

            
        }
    }
