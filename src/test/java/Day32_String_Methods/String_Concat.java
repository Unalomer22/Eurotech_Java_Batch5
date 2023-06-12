package Day32_String_Methods;

public class String_Concat {

    public static void main(String[] args) {

        String word = "Hello ";
        System.out.println(word);
        System.out.println(word.concat("World"));
        System.out.println(word);
        word = word.concat("World");
        System.out.println(word);

        //word = word.concat(123);
        word.concat("123");
        //word.concat('C');
        word = word + 123;

        word = word.concat(" -Hi").concat(" -How are you").concat(" -I am fine");
        System.out.println(word);

    }
}
