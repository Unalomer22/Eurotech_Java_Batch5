package Day40_ArrayList;

import java.util.ArrayList;

public class EqualsMethod {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        System.out.println(list1.toString());

        ArrayList<String> list2 = list1;

        System.out.println(list2.toString());

        ArrayList<String> months = new ArrayList<>(list1);

        System.out.println(months.toString());

        if(months.equals(list1)){
            System.out.println("Boths lists are same");
        }else{
            System.out.println("Lists are different");
        }

        System.out.println(months == list1);
    }
}
