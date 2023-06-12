package Day40_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {

    public static void main(String[] args) {

        // Creating an ArrayList

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        //Assigning values to Arraylist

        names.add("Ahmet");
        names.add("Ayse");
        names.add("Hasan");
        names.add("Emine");

        numbers.add(99);
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
        //numbers.add("123");
        numbers.add(new Integer("123"));

        // Reading values from Arraylist
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println(numbers.get(4));

        System.out.println("names count : " + names.size());
        System.out.println("numbers count : " + numbers.size());

        System.out.println(names.toString());
        System.out.println(numbers.toString());

        String str2 = names.toString();
        String str = numbers.toString();

        System.out.println(numbers.toString());

        System.out.println("----------");

        // How to sort a list by ascending order
        Collections.sort(numbers);
        System.out.println(numbers.toString());

    }
}
