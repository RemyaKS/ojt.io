abstract class car{
    car(){
        System.out.println("owner is John");
    }
    abstract void brandName();

public void color(){
     System.out.println("color of the car is black");
}}
class  car1 extends car{
    public void brandName(){
        System.out.println("brand name is toyota");
    }
}
public class abstractionex {
    public static void main(String[] args) {
        car cobj=new car1();
        cobj.brandName();
        cobj.color();
    }

}


