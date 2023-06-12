package Day21_Methods1;

public class MethodWithLoop {

    public static void main(String[] args) {

        System.out.println("Main method icerisindeyim");

        for(int i=1; i<5; i++){
            displayMessage();
            System.out.println("Tekrar Main Method icerisindeyim");
            System.out.println("----------------");
        }

        System.out.println("Son kez main method icerisindeyim");
    }

    public static void displayMessage(){

        System.out.println("displayMessage icerisindeyim");
    }
}
