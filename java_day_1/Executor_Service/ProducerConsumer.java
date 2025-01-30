package Executor_Service;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) throws Exception{

        // BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);

        Comparator<Integer> comparator = (a,b) ->{
            return Integer.compare(b, a);
        };

        BlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>(3, comparator );

        // Thread one = new Thread(new Producer(blockingQueue));
        // Thread two = new Thread(new Consumer(blockingQueue));

        Thread one = new Thread(new Producer(priorityBlockingQueue));
        Thread two = new Thread(new Consumer(priorityBlockingQueue));

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(" MAIN ENDS ");
    }
}
