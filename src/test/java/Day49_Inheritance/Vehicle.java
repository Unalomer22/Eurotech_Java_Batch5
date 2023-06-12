package Day49_Inheritance;

public class Vehicle extends GrandParent{

    String name;
    double weight;
    double length;
    int seats;
    int lights;

    public Vehicle(){
        System.out.println("Vehicle Constructor");
    }

    public void start(){
        System.out.println("Arac calisiyor");
    }

    public void stop(){
        System.out.println("Arac duruyor");
    }

    public void move(){
        System.out.println("Arac hareket ediyor");
    }

}
