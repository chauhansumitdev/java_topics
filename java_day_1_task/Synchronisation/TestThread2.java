package Synchronisation;

public class TestThread2 implements Runnable {
    
    @Override
    public void run(){
        Count.decrement();
    }

}
