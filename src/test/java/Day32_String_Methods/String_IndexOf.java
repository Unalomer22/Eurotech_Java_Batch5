package Day32_String_Methods;

public class String_IndexOf {

    public static void main(String[] args) {

        String word = "Germany";
        System.out.println(word.indexOf("G"));
        System.out.println(word.indexOf("rma"));
        System.out.println(word.indexOf("zzz"));
        
        String url = "www.eurotechstudy.com";
        int index = url.indexOf(".");
        System.out.println("index = " + index);
        System.out.println(url.charAt(index));
        System.out.println(url.indexOf(".", index + 1));


    }
}
