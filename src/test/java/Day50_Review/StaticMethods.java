package Day50_Review;

public class StaticMethods {

    static String name = "Car";
    String model = "Corolla";

    public static void show1(){
        //show2(); // Static methoddan instance methoda ulasilamaz
        show4(); // Static methoddan static methoda ulasilabilir
        System.out.println(name); // Static methoddan static variable a ulasilabilir
        //System.out.println(model); // Static methoddan instance variable a ulasilamaz
    }

    public void show2(){
        show1(); // Instance method dan static methoda ulasilabilir
        System.out.println(name); // Instance method dan static variable ulasilabilir
    }

    public void show3(){
        show2();
        System.out.println(model);
    }

    public static void show4(){

    }
}
