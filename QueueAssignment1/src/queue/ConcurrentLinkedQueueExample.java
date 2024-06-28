package queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");
        
      
        System.out.println("Polled: " + queue.poll());
        System.out.println("Polled: " + queue.poll()); 
        System.out.println("Polled: " + queue.poll()); 
        System.out.println("Polled: " + queue.poll()); 
        }
}
