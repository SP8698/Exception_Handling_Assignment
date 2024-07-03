package deque;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ManufacturingProcess 
{
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void processStage(final BlockingStageQueue stageQueue, final BlockingStageQueue nextStageQueue) 
    {
        executorService.submit(() -> 
        {
            try {
                Item item = stageQueue.getItem();
                System.out.println("Processing item: " + item.getDescription() + " at stage: " + item.getStage());
                item.setStage(item.getStage() + 1);
                nextStageQueue.addItem(item);
            } catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        });
    }

    public void shutdown() 
    {
        executorService.shutdown();
    }
}
