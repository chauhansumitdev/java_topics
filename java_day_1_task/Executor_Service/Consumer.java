package Executor_Service;

import java.util.concurrent.BlockingQueue;

public class Consumer  implements Runnable{
    BlockingQueue<Integer> blockingQueue;

    Consumer(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    
    @Override
    public void run(){

        for(int i=0;i<10;i++){
            try{
                Integer val = blockingQueue.take();
                System.out.println(" CONSUMED "+val);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
