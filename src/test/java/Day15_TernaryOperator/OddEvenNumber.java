package Day15_TernaryOperator;

public class OddEvenNumber {

    public static void main(String[] args) {

    //Write a program that finds out whether the number is odd or even by using ternary operator

        int number = 11;

        String result = (number%2 == 0) ? "Even Number" : "Odd Number";

        System.out.println(result);

    }
}
