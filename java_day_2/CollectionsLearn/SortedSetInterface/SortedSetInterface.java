package java_day_2.CollectionsLearn.SortedSetInterface;

/**
 * maintains ordering of elements
 */
import java.util.*;


/**
 * navigableset 
 * 
 * treeset
 * 
 * concurrentskiplistset
 */

public class SortedSetInterface {
    public static void main(String[] args) {

        
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer one, Integer two){
                return Integer.compare(two, one);
            }
        };
        
        SortedSet<Integer> sortedSet = new TreeSet<>(comparator);

        sortedSet.add(5);
        sortedSet.add(10);
        sortedSet.add(2);


        System.out.println(sortedSet);



        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(3);
        navigableSet.add(5);
        navigableSet.add(14);

        int value =navigableSet.lower(14);

        System.out.println(value);
    }
}
