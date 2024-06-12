

class car{
    String color;
    String model;
    void display(){
        System.out.println("Model :"+model+",color:"+color);

    }

}
public class mainclass{
    public static void main(String[] args) {
        car car=new car();
        car.model="Toyota";
        car.color="white";
        car.display();
    }
}