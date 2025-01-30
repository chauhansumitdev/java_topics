package Executor_Service;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    
    BlockingQueue<Integer> blockingQueue;

    Producer(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    
    @Override
    public void run(){

        for(int i=0;i<10;i++){

            try{
                System.out.println(" PRODUCED "+i);
                blockingQueue.put(i);
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    
}
