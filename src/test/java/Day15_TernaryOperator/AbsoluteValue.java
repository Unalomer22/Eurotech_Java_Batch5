package Day15_TernaryOperator;

public class AbsoluteValue {

    public static void main(String[] args) {

        // Write a program that finds the absolute value by using ternary operator

        int number = -13;
        
        int absolteValue = (number>=0) ? number : -number;

        System.out.println("absolteValue = " + absolteValue);
    }
}
