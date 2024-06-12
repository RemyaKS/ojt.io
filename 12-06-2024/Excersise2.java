//mutilevel inheritance
class Livingbeing{
    void being(){
        System.out.println("I am a livingbeing");
}
}
class Dog extends Livingbeing{
    void barks(){
        System.out.println(" dog barks");
    }
}
    class BabyDog extends Dog{
        void age(){
            System.out.println("baby dog is 1 year old");
        }
    }
public class Excersise2 {
    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.being();
        obj.barks();
        obj.age();
    }
}

