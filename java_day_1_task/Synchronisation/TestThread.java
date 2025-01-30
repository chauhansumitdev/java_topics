package Synchronisation;


public class TestThread  implements Runnable{
    @Override
    public void run(){
        Count.increment();
    }
}
