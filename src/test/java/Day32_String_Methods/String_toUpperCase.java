package Day32_String_Methods;

import java.util.Locale;

public class String_toUpperCase {

    public static void main(String[] args) {

        String word = "Hello World";
        System.out.println(word.toUpperCase());

        String word2 = "kjKJKBkjbkJKJbkjkfjGGCGhgdKJj";
        System.out.println(word2.toUpperCase());

        String word3 = "£&($)@_)+=+=12345π";
        System.out.println(word3.toUpperCase());
    }
}
