package queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private String element;
    private long delayTime;

    public DelayedElement(String element, long delayTime) {
        this.element = element;
        this.delayTime = System.currentTimeMillis() + delayTime;
    }

    
    public long getDelay(TimeUnit unit) {
        long diff = delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    
    public int compareTo(Delayed o) {
        if (this.delayTime < ((DelayedElement) o).delayTime) {
            return -1;
        }
        if (this.delayTime > ((DelayedElement) o).delayTime) {
            return 1;
        }
        return 0;
    }

   
    public String toString() {
        return "DelayedElement{" +
                "element='" + element + '\'' +
                ", delayTime=" + delayTime +
                '}';
    }
}

public class DelayQueueExample {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();

    
        delayQueue.offer(new DelayedElement("Element 1", 2500)); 
        delayQueue.offer(new DelayedElement("Element 2", 2200)); 
        delayQueue.offer(new DelayedElement("Element 3", 1000));

        while (!delayQueue.isEmpty()) {
            try {
            
                DelayedElement element = delayQueue.take();
                System.out.println("Processed: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
