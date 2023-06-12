package Day68_Maps;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        ArrayList<String> players = new ArrayList<>();
        players.add("Weghorst");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        Map<String,Integer> footballPlayers = new LinkedHashMap<String,Integer>();
        footballPlayers.put("Weghorst",10);
        footballPlayers.put("Dele Ali", 11);
        footballPlayers.put("Joseph De Souza",5);
        //footballPlayers.put(10,"Weghorst");

        System.out.println(footballPlayers);

        System.out.println("forma numarasi = " + footballPlayers.get("Weghorst"));
        System.out.println("forma numarasi = " + footballPlayers.get("Dele Ali"));
        System.out.println("forma numarasi = " + footballPlayers.get("Joseph De Souza"));
        //System.out.println("forma numarasi = " + footballPlayers.get(5)); //null
        System.out.println("forma numarasi = " + footballPlayers.get("Sergen")); // null

    }
}
