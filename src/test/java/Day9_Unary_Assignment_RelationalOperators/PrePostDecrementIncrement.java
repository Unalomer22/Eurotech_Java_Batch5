package Day9_Unary_Assignment_RelationalOperators;

public class PrePostDecrementIncrement {

    public static void main(String[] args) {

        int x = 5;
        int y = x++;
        //y = x; // 6

        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 5
    }
}
