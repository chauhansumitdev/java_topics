package Synchronisation;

// this is a shared resource
public class Count {
    public static int a = 100;

    public static synchronized void increment(){
        a+=100;

        System.out.println(a);
    }

    public static synchronized void decrement(){
        a-= 100;

        System.out.println(a);
    }
}
