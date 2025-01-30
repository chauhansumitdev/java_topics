package ConcurrentHashMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapLearn {
    
    public static void main(String[] args) throws Exception{
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        Thread one = new Thread(new A(concurrentHashMap));
        Thread two = new Thread(new B(concurrentHashMap));

        one.start();
        two.start();

        one.join();
        two.join();

        Set<Map.Entry<Integer, Integer>> entry_set = concurrentHashMap.entrySet();

        for(Map.Entry<Integer, Integer> entry : entry_set){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
