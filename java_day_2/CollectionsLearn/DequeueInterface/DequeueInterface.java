package java_day_2.CollectionsLearn.DequeueInterface;

import java.util.*;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * BlockingDequeue interface -- provides thread blocking capabilities
 * Concurrent LinkedDeque -- unbounded thread safe 
 * ArrayDeque -- not threadsafe 
 */

public class DequeueInterface {
    
    public static void main(String[] args) throws InterruptedException {
        
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

        blockingDeque.addFirst(10);
        blockingDeque.addLast(20);
        blockingDeque.putFirst(30);
        blockingDeque.putLast(40);
        
        System.out.println("Removed from first: " + blockingDeque.takeFirst());
        System.out.println("Removed from last: " + blockingDeque.takeLast());

        System.out.println("First element: " + blockingDeque.peekFirst());
        System.out.println("Last element: " + blockingDeque.peekLast());
        
        System.out.println("Current size: " + blockingDeque.size());
    }
}