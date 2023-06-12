package Day68_Maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopWithIterator {

    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        
        nums.add(10);
        nums.add(30);
        nums.add(80);
        nums.add(50);
        nums.add(110);
        nums.add(170);
        nums.add(90);
        nums.add(1200);
        nums.add(1190);
        nums.add(20);
        nums.add(70);
        nums.add(10);

        System.out.println("nums = " + nums);

        for(Integer num : nums){
            System.out.print(num + " | ");
        }

        System.out.println("///////////////////");
        Iterator<Integer> it1 = nums.iterator();
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            int val = it.next();
            if(val > 1000){
                it.remove();
            }
        }

        System.out.println("nums = " + nums);


        //for each loop remove methodu ile exception veriyor
        // Bu sebeple Collection da objecti remove edebilmek icin uterator a ihtiyacimiz var
        /*
        for(Integer num : nums){

            if(num > 1000){
                nums.remove(num);
            }
        }
         */


    }
}
