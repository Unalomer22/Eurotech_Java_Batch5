package Day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsMethod {

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

        System.out.println(months.contains("Jan"));
        System.out.println(months.contains("Dec"));

        //how to check if Feb is in second position
        System.out.println(months.indexOf("Feb")==1);
        System.out.println(months.get(1).equals("Feb"));

        System.out.println("list1 = " + list1.toString());
        System.out.println("months = " + months.toString());

        if(months.containsAll(list1)){
            System.out.println("Months has all list1");
        }else{
            System.out.println("Months has not all list");
        }

        // Tek satirda liste olusturabilmek icin
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a","b","c","d"));

        System.out.println(listOne.toString());
    }
}
