package deque;

import java.util.Deque;
import java.util.ArrayDeque;

public class StageQueue 
{
    private Deque<Item> queue = new ArrayDeque<>();

    public void addItem(Item item) 
    {
        queue.add(item);
    }

    public Item getItem() 
    {
        return queue.poll();
    }
}
