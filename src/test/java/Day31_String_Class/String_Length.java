package Day31_String_Class;

public class String_Length {

    public static void main(String[] args) {

        String str = "EuroTech Study";
        int uzunluk = str.length();

        System.out.println("String uzunluk = " + uzunluk);

        String str2 = "";
        System.out.println(str2.length());

        String str3 = "      ";
        System.out.println(str3.length());
        
        int carpim = str3.length() * 5;
        System.out.println("carpim = " + carpim);
    }
}
