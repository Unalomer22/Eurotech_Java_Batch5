package Day40_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size()==0);

        nums.add(1);
        nums.add(23);
        nums.add(25);
        nums.add(45);
        nums.add(76);
        nums.add(675);

        System.out.println(nums.size());

        System.out.println(nums.toString());

        nums.remove(5);

        System.out.println(nums.toString());

        Integer n1 = new Integer(25);
        Integer n2 = Integer.valueOf(25);

        nums.remove(n1);

        System.out.println(nums.toString());

        nums.remove(new Integer(45));

        System.out.println(nums.toString());

    }
}
