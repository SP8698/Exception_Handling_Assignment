package deque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingStageQueue 
{
    private BlockingDeque<Item> queue = new LinkedBlockingDeque<>();

    public void addItem(Item item) throws InterruptedException 
    {
        queue.put(item);
    }

    public Item getItem() throws InterruptedException 
    {
        return queue.take();
    }
}
