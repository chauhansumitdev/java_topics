package Semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Semaphore semaphore = new Semaphore(1);

        Shared shared = new Shared();

        Thread one = new Thread(new A(semaphore, shared));
        Thread two = new Thread(new B(semaphore, shared));

        one.start();
        two.start();

        // main to wait till the one thread finishe
        one.join();
        // main to wait till the two thread finished
        two.join();
    }
}
