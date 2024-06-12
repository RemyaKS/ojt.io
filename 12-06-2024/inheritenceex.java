class Animal{
    void eat(){
        System.out.println("The animals eats food.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks.");
    }
}
public class inheritenceex {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
