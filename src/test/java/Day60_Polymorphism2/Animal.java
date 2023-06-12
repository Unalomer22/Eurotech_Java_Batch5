package Day60_Polymorphism2;

public class Animal {
    public void sound(){}
}

class Dog extends Animal{
    public void eat(String x){}
}

class AnimalTest{

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.sound();

        /*
        Dog dog = (Dog) animal;
        dog.sound();
        dog.eat("Meat");
         */

        //Casting in one line
        ((Dog)animal).eat("Meat");
    }
}
