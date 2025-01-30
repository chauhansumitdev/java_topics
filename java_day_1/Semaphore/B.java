package Semaphore;

import java.util.concurrent.Semaphore;

public class B implements Runnable{
    
    private Semaphore semaphore;
    private Shared shared;

    public B(Semaphore semaphore, Shared shared){
        this.semaphore = semaphore;
        this.shared = shared;
    }

    @Override
    public void run(){

        try{
            semaphore.acquire();

            shared.increment();

            print();

            semaphore.release();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println(Thread.currentThread().getName() +" COUNT : ");
        shared.print();
    }

}
