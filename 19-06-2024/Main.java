//Method Overriding.
class Animal{
    void makeSound(){
        System.out.println("The animal makes a sound");
    }
    }
class Dog extends Animal{
    void makeSound(){
        System.out.println("The dog barks");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("The cat meows");
    }
}
class cow extends Animal{
    void makeSound(){
        System.out.println("The cow moos");
    }
}
public class Main{
    public static void main(String[] args){
       Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2]= new Cat();
        animals[2]= new cow();
        for(Animal Animal:animals){
            Animal.makeSound();
    }
}
}
