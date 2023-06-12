package Day49_Inheritance;

public class Car extends Vehicle {

    double tireSize;
    String brand;
    int doorNumber;

    public Car(){
        super();
        System.out.println("Car constructor");
    }

    public void honk(){
        System.out.println("Araba korna caliyor");
    }

    public void handBreak(){
        System.out.println("---");
    }

    public void opentrunk(){
        System.out.println("----");
    }
}
