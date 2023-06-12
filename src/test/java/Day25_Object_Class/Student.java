package Day25_Object_Class;

public class Student {

    // Write a student template class where we can define
    // - name, - surname, -className, -schoolNumber, -age, -weight
    // -study(), -code(), -run(), -eat()

    String name;
    String surName;
    String className;
    int schoolNumber;
    int age;
    double weight;

    public void study(){
        System.out.println("Studying");
    }

    public void code(){
        System.out.println("Coding");
    }

    public void run(){
        System.out.println("Running");
    }

    public void eat(){
        System.out.println("Eating");
    }
}
