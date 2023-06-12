package Day21_Methods1;

public class DebuggingMethodCall {

    public static void main(String[] args) {

        System.out.println("Main method icindeyim : line 7");

        method();

        System.out.println("Tekrar main method icindeyim line 11");


    }

    public static void method(){

        System.out.println("Method icindeyim : line 18");
    }
}
