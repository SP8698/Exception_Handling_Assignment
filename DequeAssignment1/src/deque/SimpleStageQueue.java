package deque;

import java.util.ArrayDeque;
public class SimpleStageQueue 
{
    private ArrayDeque<Item> queue = new ArrayDeque<>();

    public void addItem(Item item) {
     
    	queue.add(item);
    }

    public Item getItem() 
    {
        return queue.poll();
    }
}
