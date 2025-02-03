package java_day_2.CollectionsLearn.ListInterface;

import java.util.*;

/**
 * arraylist - uses an array to store elements therefore everytime a new element is inserted the size of arrary is changed and the elements are copied again.
 * 
 * linkedlist - used doubly linkedlist for storing elements therefore adding and removing elements is easier whereas reandom access like list[2] is not efficient 
 * 
 * vector - synchronised manipulation
 * 
 * stack - subclass of vector therefore its synchronous too
 */
public class ListLearn {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        
        //Iterator<Integer> iterator = list.iterator();

        // while (iterator.hasNext()) {
        //     System.out.print( iterator.next() );
        // }

        List<Integer> vector_list = new Vector<>();

        list.add(0);
        vector_list.add(0);

        checking_list(vector_list);
        checking_list(list);

        System.out.println(" ARRAYLIST : ");
        System.out.println(list.get(0));
        System.out.println(" VECTOR LIST ");
        System.out.println(vector_list.get(0));

        stack_impl();

    }

    public static void checking_list(List<Integer> list) throws Exception{
        Thread one = new Thread(new A(list));
        Thread two = new Thread(new A(list));


        one.start();
        two.start();

        one.join();
        two.join();
    }

    public static void stack_impl(){

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        
        System.out.println(stack.peek());

        stack.pop();

    }
}
