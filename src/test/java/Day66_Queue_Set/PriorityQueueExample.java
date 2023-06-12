package Day66_Queue_Set;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // Stores numbers in natural order
        PriorityQueue<Integer> priority = new PriorityQueue();

        priority.add(20);
        priority.add(15);
        priority.add(9);
        priority.add(18);
        priority.add(5);

        // picks first element in order
        System.out.println(priority.peek());
        System.out.println("priority = " + priority);

        // removes first element in order
        System.out.println(priority.poll());

        System.out.println(priority.peek());
        System.out.println("priority = " + priority);

        PriorityQueue<String> priority2 = new PriorityQueue();

        priority2.add("Aaba");
        priority2.add("Zab");
        priority2.add("Baa");
        priority2.add("Aaab");

        System.out.println(priority2.peek());
        System.out.println("priority2 = " + priority2);

        System.out.println(priority2.poll());
        System.out.println("priority2 = " + priority2);

        System.out.println(priority2.peek());
        System.out.println("priority2 = " + priority2);

        // get method can not be used with PriorityQueue
        //priority.get(3);

    }
}
