package Day31_String_Class;

import java.util.Scanner;

public class LengthOfName {

    public static void main(String[] args) {

        // Write a program that asks user to enter his/her firstname and lastname.
        // Display int the console total number of character

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Ad Soyad Giriniz");
        
        String adSoyad = input.nextLine();
        
        int adSoyadLength = adSoyad.length();

        System.out.println("adSoyadLength = " + adSoyadLength);
    }
}
