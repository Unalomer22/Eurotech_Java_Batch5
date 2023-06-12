package Day18_Review;

public class LastDigitTernary {

    public static void main(String[] args) {

        int num1 = 34;
        int num2 = 54;

        boolean result = (num1%10 == num2%10) ? true : false;
        System.out.println("result = " + result);

        System.out.println("result = " + ((num1%10 == num2%10) ? true : false));

    }
}
