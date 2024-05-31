import java.time.LocalDate;
public class days{
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("Today's Date :"+today);
        LocalDate Yesterday=today.minusDays(1);
        System.out.println("Yesterday :"+ Yesterday);
        LocalDate Tomorrow=today.plusDays(1);
        System.out.println("Tomorrow :"+ Tomorrow);
        boolean year=today.isLeapYear();
        System.out.println(year);
        LocalDate nextday=today.plusMonths(5);
        System.out.println(nextday);
        
    }
}
