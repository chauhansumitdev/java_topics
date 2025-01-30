package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws Exception{
        
        ReentrantLock lock = new ReentrantLock();

        Shared shared = new Shared(lock);

        Thread one = new Thread(new A(shared));
        one.setName("A");

        Thread two = new Thread(new B(shared));
        two.setName("B");

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(" MAIN ENDS ");

    }
}
