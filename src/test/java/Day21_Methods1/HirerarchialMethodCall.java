package Day21_Methods1;

public class HirerarchialMethodCall {

    public static void main(String[] args) {

        System.out.println("Main method");
        displayMessage();
        System.out.println("Back to Main Method");

    }

    public static void displayMessage(){

        System.out.println("Hello World");
        calculation();
        System.out.println("Back to displayMessage method");
    }

    public static void calculation(){

        System.out.println(10*5/2+1);
    }
}
