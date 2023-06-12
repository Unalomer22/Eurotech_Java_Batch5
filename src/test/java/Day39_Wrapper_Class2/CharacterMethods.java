package Day39_Wrapper_Class2;

public class CharacterMethods {

    public static void main(String[] args) {

        System.out.println(Character.isAlphabetic('c'));
        System.out.println(Character.isAlphabetic('7'));

        System.out.println(Character.isLetter('K'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetter('£'));

        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isDigit('*'));

        String word = "Java2020";

        System.out.println(Character.isAlphabetic(word.charAt(2)));
        System.out.println(Character.isDigit(word.charAt(5)));
        System.out.println(Character.isLetter(word.charAt(5)));

        // Roma rakami olan 'V' karakteri isLetter ve isAlphabetic metodlarinda farkli deger donduruyor
        System.out.println('\u2164');
        System.out.println(Character.isLetter('\u2164'));
        System.out.println(Character.isAlphabetic('\u2164'));

    }
}
