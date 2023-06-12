package Day40_ArrayList;

import java.util.ArrayList;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(30);
        list1.add(12);
        list1.add(22);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(335);
        list2.add(3230);
        list2.add(530);
        list2.add(12);
        list2.add(30);
        list2.add(22);

        System.out.println(list1.toString());
        System.out.println(list2.toString());

        list2.removeAll(list1);

        System.out.println(list2.toString());

    }
}
