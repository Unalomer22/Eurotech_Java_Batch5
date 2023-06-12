package Day68_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LoopingMap {

    public static void main(String[] args) {

        Map<String,String> dataMap = new LinkedHashMap<>();
        dataMap.put("url","www.amazon.com");
        dataMap.put("userName","user54");
        dataMap.put("password","12345");
        dataMap.put("userType","Admin");
        dataMap.put("Browser","Chrome");

        //Get list of keys
        System.out.println(dataMap.keySet());

        //Get list of values
        System.out.println(dataMap.values());

        System.out.println("Printing keys....");

        for(String key : dataMap.keySet()){
            System.out.print(key + " | ");
        }

        System.out.println("Printing values....");

        for(String value : dataMap.values()){
            System.out.print(value + " | ");
        }

        System.out.println("");


        // How to print keys and values in same iteration

        for(String key : dataMap.keySet()){

            System.out.println(key + " | " + dataMap.get(key));
        }
    }
}
