package Day31_String_Class;

import java.util.Scanner;

public class DisplayEachCharacter {

    public static void main(String[] args) {

        // Display each character in the console

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");

        String str = sc.nextLine();

        for(int i=0; i<=str.length()-1;i++){
            System.out.println(str.charAt(i));
        }
    }
}
