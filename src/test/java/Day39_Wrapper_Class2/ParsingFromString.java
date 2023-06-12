package Day39_Wrapper_Class2;

public class ParsingFromString {

    public static void main(String[] args) {

        String stringNumber = "2022";
        System.out.println(stringNumber);

        int number = Integer.parseInt(stringNumber);
        int number2 = Integer.valueOf(stringNumber);

        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);

        stringNumber = stringNumber + 5;
        number = number + 5;

        System.out.println("stringNumber = " + stringNumber);
        System.out.println("number = " + number);

        Double number3 = Double.parseDouble(stringNumber);
        System.out.println("number3 = " + number3);

        // NUMBEFORMATEXEPTION
        /*
        String s = "2022A";
        int number5 = Integer.parseInt(s);
        System.out.println("number5 = " + number5);

         */

    }
}
