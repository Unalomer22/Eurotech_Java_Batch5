package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(5, 8, 3, 1));

        System.out.println(SortingArrayListAsc(listOne));

    }

    public static List<Integer> SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);
                }
            }
        }

        return list;
    }

}