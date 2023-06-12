package Day68_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {
        
        Map<String,Double> items = new HashMap<String,Double>();
        items.put("Apple",5.3);
        items.put("Orange",3.5);
        items.put("Banana",6.8);
        items.put("Cherry",7.5);

        System.out.println("items = " + items);

        items.put("Apple", 6.5); // key needs to be unique
                                // if key is already exists in the list, map only updates the value 
        System.out.println("items = " + items);

        System.out.println("items.size() = " + items.size());

        items.remove("Apple");
        System.out.println("items.size() = " + items.size());
        System.out.println("items = " + items);

        System.out.println("Apple in the list? " + items.containsKey("Apple"));
        System.out.println("Orange in the list? " + items.containsKey("Orange"));

        System.out.println("Any item has value? = " + items.containsValue(6.8));
        System.out.println("Any item has value? = " + items.containsValue(5.3));

        System.out.println(items.get("Cherry") + 5);

    }
}
