package deque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentStageQueue 
{
    private ConcurrentLinkedDeque<Item> queue = new ConcurrentLinkedDeque<>();

    public void addItem(Item item) 
    {
        queue.add(item);
    }

    public Item getItem() {
        return queue.poll();
    }
}
