package Day32_String_Methods;

public class String_Substring {

    public static void main(String[] args) {

        String str = "Java String manupilation is fun";
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,11));

        System.out.println(str.substring(5,str.length()-5));

        String symbols ="{{}}";
        String word = "JAVA IS COOL";
        String newStr = symbols.substring(0,2).concat(word).concat(symbols.substring(2,symbols.length()));
        System.out.println("newStr = " + newStr);
    }
}
