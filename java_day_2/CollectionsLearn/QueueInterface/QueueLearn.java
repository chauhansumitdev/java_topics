package java_day_2.CollectionsLearn.QueueInterface;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.DelayQueue;

/**
 * BlockingQueue - done
 * 
 * AbstractQueue 
 * 
 * Priority Queue -- uses comparator for ordering of elements
 * 
 * PriorityBlockingQueue - done
 * 
 * ConcurrentLinkedQueue 
 * 
 * DelayQueue 
 * 
 * LinkedBlockingQueue
 * 
 * LinkedTransferQueue
 * 
 * 
 */

public class QueueLearn {
    public static void main(String[] args) throws Exception {
        
        // Comparator<Integer> comparator = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a, Integer b){
        //         return Integer.compare(b, a);
        //     }
        // };


        //Queue<Integer> q = new PriorityQueue<>(comparator);


        // q.offer(10);
        // q.offer(3);
        // q.offer(5);
        // q.offer(100);

        Queue<Integer> q = new ConcurrentLinkedQueue<>();



        concurrent_linked_test(q);

       // Queue<Integer> q = new DelayQueue<>();

        System.out.println(q);


        
    }

    public static void concurrent_linked_test(Queue<Integer> q) throws Exception{
        Thread one = new Thread(new A(q));
        Thread two = new Thread(new B(q));

        one.start();
        two.start();

        one.join();
        two.join();
    }

    public static void delay_queue_test(Queue<Integer> q){

        q.offer(1);
        q.poll();

    }
}
