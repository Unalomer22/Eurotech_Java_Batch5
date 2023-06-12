package Day66_Queue_Set;

import java.util.ArrayDeque;

public class ArrayDequeueExample {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(20);
        arrayDeque.add(10);
        arrayDeque.add(15);
        arrayDeque.add(5);

        System.out.println("arrayDeque = " + arrayDeque);

        // picks first element in the list
        System.out.println(arrayDeque.peekFirst());
        System.out.println("arrayDeque = " + arrayDeque);

        // picks last element in the list
        System.out.println(arrayDeque.peekLast());
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println(arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);

        // adds element in first order
        arrayDeque.addFirst(30);
        System.out.println("arrayDeque = " + arrayDeque);

        // adds element in last order
        arrayDeque.addLast(40);
        System.out.println("arrayDeque = " + arrayDeque);
        
        arrayDeque.clear();
        System.out.println("arrayDeque = " + arrayDeque);

    }
}
