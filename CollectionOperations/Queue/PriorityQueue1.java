package CollectionOperations.Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

      public static void main(String[] args) {
        // PriorityQueue<String> queue = new PriorityQueue<String>();

        // queue.add("Pankaj");
        // queue.offer("kumar");
        // queue.offer("km");
        // queue.offer("Mau");
        // queue.offer("Maurya");

        // System.out.println(queue);

        // System.out.println(queue.poll());
        
        // System.out.println(queue);
        // System.out.println(queue.poll());
        // System.out.println(queue);

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(4);
        queue.offer(10);
        queue.offer(50);
        queue.offer(2);
        queue.offer(23);
      
      
      

        System.out.println(queue);

        System.out.println(queue.poll());
        
        System.out.println(queue);

        System.out.println(queue.poll());
        
        System.out.println(queue);

    }

}
