package Semaphore;

import java.util.concurrent.Semaphore;

public class A implements Runnable{
    
    private Semaphore semaphore;
    private Shared shared;

    public A(Semaphore semaphore, Shared shared){
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
