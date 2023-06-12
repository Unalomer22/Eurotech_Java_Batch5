package Day59_Polymorphism;

public class Animal {

    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{

    public void sound(){
        System.out.println("Dog says : Hav Hav");
    }
}

class Cat extends Animal{

    public void sound(){
        System.out.println("Cat says : Miyav Miyav");
    }

}

class Duck extends Animal{

    public void sound(){
        System.out.println("Cat says : Vak Vak");
    }
}

class PolymorhismExample{

    public static void main(String[] args) {

        //Non-polymorphic way of object creation
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
        Duck duck = new Duck();
        duck.sound();

        //Polymorhic way of object creation
        Animal dog1 = new Dog();
        dog1.sound();
        Animal cat1 = new Cat();
        cat1.sound();
        Animal duck1 = new Duck();
        duck1.sound();

        // Same object name, same method but different behaviour
        Animal animal1 = new Animal();
        animal1.sound();
        animal1 = new Dog();
        animal1.sound();
        animal1 = new Cat();
        animal1.sound();
        animal1 = new Duck();
        animal1.sound();

    }
}
