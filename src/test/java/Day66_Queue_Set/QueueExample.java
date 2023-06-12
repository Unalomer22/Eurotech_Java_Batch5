package Day66_Queue_Set;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        // FIFO
        System.out.println("que = " + que);

        // Removes first element FIFO
        String name = que.remove();
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        // Removes first element
        name = que.poll();
        System.out.println("name = " + name);

        // Retrieves first element in the list
        name = que.peek();
        System.out.println("name = " + name);

        // Difference between poll() and remove()
        // throwing exception ot not
        que.poll();
        que.poll();
        que.poll();
        que.poll();
        System.out.println(que.poll());
        System.out.println("que = " + que);
        System.out.println("lakfjpoqjpfonq");

        try{
            que.remove();
        }catch(Exception e){
            System.out.println("ajjashcbkahvc");
        }
    }
}
