package Day67_Review;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        
        hashSet.add("Mavi");
        hashSet.add("Yesil");
        hashSet.add("Gri");
        hashSet.add("Yesil");
        hashSet.add("Beyaz");
        hashSet.add("Beyaz");

        // Duplication not allowed
        // insertion order is not preserved
        System.out.println("hashSet = " + hashSet);

        //
        for (String each : hashSet){
            System.out.println(each.hashCode());
        }
    }
}
