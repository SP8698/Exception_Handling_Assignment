package deque;

public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        BlockingStageQueue stage1Queue = new BlockingStageQueue();
        BlockingStageQueue stage2Queue = new BlockingStageQueue();

        ManufacturingProcess process = new ManufacturingProcess();

      
        stage1Queue.addItem(new Item(1, 1, 10, "Item 1"));
        stage1Queue.addItem(new Item(2, 1, 5, "Item 2"));

       
        process.processStage(stage1Queue, stage2Queue);
        process.processStage(stage1Queue, stage2Queue);

       
        Thread.sleep(1000);

        process.shutdown();
    }
}
