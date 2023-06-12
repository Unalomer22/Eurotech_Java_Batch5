package Day67_Review;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        
        treeSet.add("Mavi");
        treeSet.add("Yesil");
        treeSet.add("Gri");
        treeSet.add("Yesil");
        treeSet.add("Beyaz");
        treeSet.add("Adam");
        treeSet.add("Adem");
        treeSet.add("15");
        treeSet.add("68");
        treeSet.add("A");
        treeSet.add("%");
        treeSet.add("*");
        treeSet.add("67");

        System.out.println("treeSet = " + treeSet);

        for (String each : treeSet){
            System.out.println(each.hashCode());
        }
    }
}
