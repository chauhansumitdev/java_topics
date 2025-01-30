package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Shared {
    private int count;
    private ReentrantLock reentrantLock;

    public Shared(ReentrantLock reentrantLock){
        count = 100;
        this.reentrantLock = reentrantLock;
    }

    public  void increment(){

        reentrantLock.lock();

        System.out.println(" INCREMENT, LOCK ACQUIRED BY : "+Thread.currentThread().getName());
        count++;

        release_lock_here();
    }

    public  void decrement(){

        reentrantLock.lock();
        System.out.println(" DECREMENET, LOCK ACQUIRED BY : "+Thread.currentThread().getName());

        count--;

        release_lock_here();
    }

    public void release_lock_here(){
        System.out.println(count);
        System.out.println(" LOCK RELEASED BY : "+Thread.currentThread().getName());
        reentrantLock.unlock();
    }
}
