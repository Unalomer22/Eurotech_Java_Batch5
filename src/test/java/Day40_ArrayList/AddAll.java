package Day40_ArrayList;

import java.util.ArrayList;

public class AddAll {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mercedes");
        list1.add("BMW");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Jaguar");
        list2.add("Toyota");

        System.out.println(list1.toString());
        System.out.println(list2.toString());

        list1.addAll(list2);
        System.out.println(list1.toString());

        list2.addAll(list1);
        System.out.println(list2.toString());

    }
}

