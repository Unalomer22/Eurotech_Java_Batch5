package Day31_String_Class;

public class StringClass {

    public static void main(String[] args) {

        //String Literal yontemle object olusturma
        String s = "Hello World";
        System.out.println("s = " + s);

        //new keyword yontemiyle object olusturma
        String s2 = new String("Hello World");
        System.out.println("s2 = " + s2);

        String str1 = new String("EuroStudy");
        String str2 = new String("EuroStudy");
        String str3 = "EuroStudy";
        String str4 = "EuroStudy";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str2 == str3);
        System.out.println(str2 == str4);
        System.out.println(str3 == str4); // Her iki reference String Pool da olusturulan AYNI objecti refere ettigi icin True dondu
    }
}
