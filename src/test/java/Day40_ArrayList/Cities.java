package Day40_ArrayList;

import java.util.ArrayList;

public class Cities {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Virginia");
        cities.add("DC");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add("Baku");

        System.out.println(cities.toString());

        for(String city : cities){
            System.out.print(city + " ");
        }

        System.out.println();
        System.out.println("-------------");

        for(int i=0; i<cities.size(); i++){
            System.out.print(cities.get(i) + " ");
        }

        System.out.println();
        System.out.println("-------------");

        cities.remove("Baku");

        System.out.println(cities.toString());

        System.out.println("-------------");

        cities.add(0,"Istanbul");
        //cities.add(cities.size(),"Istanbul");

        System.out.println(cities.toString());

        System.out.println("-------------");

        int index = cities.indexOf("Berlin");
        System.out.println("index = " + index);

        System.out.println("-------------");

        cities.clear();
        System.out.println(cities.isEmpty());
        System.out.println(cities.size());

    }
}
