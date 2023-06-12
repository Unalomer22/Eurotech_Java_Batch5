package Day18_Review;

public class LastDigit {

    public static void main(String[] args) {

        // Write program that checks the last digits of two numbers and compares equality
        // true - false

        int num1 = 2351352;
        int num2 = 982386;
        boolean result;
        
        if (num1%10 == num2%10){
            result = true;
        }else {
            result = false;
        }
        System.out.println("result = " + result);

        System.out.println("///////////////////");

        boolean result2 = num1%10 == num2%10;
        System.out.println("result2 = " + result2);

        System.out.println("//////////////////");

        System.out.println("result = " + (num1%10 == num2%10));

    }

}
