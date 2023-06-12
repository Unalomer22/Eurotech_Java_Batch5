package Day68_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

    public static void main(String[] args) {

        /*
        Write a method that can sort the ArrayList in Ascending/Descending order
        without using the sort method
         */

        List<Integer> myList = new ArrayList<>(Arrays.asList(13,5,8,17,3,1,23));

        System.out.println(sortAscending(myList));

        System.out.println(sortDescending(myList));


    }

    public static List<Integer> sortAscending(List<Integer> list){

        for(int i=0; i< list.size(); i++){

            for(int j=0; j<list.size(); j++){

                if(list.get(i) < list.get(j)){

                    Integer temp = list.get(i);

                    list.set(i,list.get(j));

                    list.set(j,temp);
                }
            }
        }
        return list;
    }

    public static List<Integer> sortDescending(List<Integer> list){

        for(int i=0; i< list.size(); i++){

            for(int j=0; j<list.size(); j++){

                if(list.get(i) > list.get(j)){

                    Integer temp = list.get(i);

                    list.set(i,list.get(j));

                    list.set(j,temp);
                }
            }
        }
        return list;
    }

}
