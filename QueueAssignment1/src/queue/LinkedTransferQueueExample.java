package queue;
import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueExample {
    public static void main(String[] args) {
        LinkedTransferQueue<String> transferQueue = new LinkedTransferQueue<>();

        Thread producer = new Thread(() -> {
            try {
                transferQueue.transfer("Element 6");
                System.out.println("Transferred: Element 4");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                String element = transferQueue.take();
                System.out.println("Received: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumer.start();
        producer.start();
    }
}

