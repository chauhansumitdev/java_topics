package java_day_2.CollectionsLearn.SetInterface;

import java.util.*;

/**
 * abstractset
 * 
 * copyonwritearrayset
 * 
 * enumset
 * 
 * concurrenthashset
 * 
 * 
 * hashset -- does not maintain the ordering
 * 
 * 
 * linkedhashset -- maintains the ordering
 * 
 * 
 * 
 */

public class SetInterface {

    public static void main(String[] args) {
        

        Set<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<10;i++){
            set.add(i);
        }

        set.add(2);

        System.out.println(set);



    }
    
}
