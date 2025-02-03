package java_day_2.CollectionsLearn.MapInterface;



import java.util.*;

/**
 * sortedmap 
 * 
 * navigablemap
 * 
 * concurrentmap
 * 
 * treemap
 * 
 * abstractmap
 * 
 * concurrenthashmap
 * 
 * enummap
 * 
 * hashmap
 * 
 * identityhashmap
 * 
 * linkedhashmap -- maintains order
 * 
 * hashtable
 * 
 * properties
 * 
 */


public class MapInterface {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0;i<10;i++){
            map.put(i, i);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet() ){
            System.out.print(entry.getKey()+ " ");
            System.out.println(entry.getValue());
        }
        
    }
}
