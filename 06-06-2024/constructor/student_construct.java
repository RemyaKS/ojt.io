import java.util.Scanner;
public class student_construct {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your name :");
        String my_name=scan.nextLine();
        System.out.println("Enter your marks :");
        int my_marks=scan.nextInt();
        constructor obj=new student_construct(my_name,my_marks);
        //constructor obj=new new_constructor();
        obj.get_details();
        obj.show_details();

    }
}
