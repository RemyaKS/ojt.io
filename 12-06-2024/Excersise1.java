class Vehicle{
    void type(){
        System.out.println("car");

    }
    class Car extends Vehicle{
        void brand(String brand){
            System.out.println("This is a "+brand+" car");
        }
    }
}
public class Excersise1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.type();
        Vehicle.Car c = v.new Car();
        c.brand("Toyota");
    }
}
