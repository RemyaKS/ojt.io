public class constructor {
    String s_name="";
    int s_marks=0;
    public constructor(String name ,int marks){
        s_name=name;
        s_marks=marks;
    }
    public void show_details(){
        System.out.println("Name of student is :"+s_name);
        System.out.println("Marks of student is :"+s_marks);
    }
}
