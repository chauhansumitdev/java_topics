package Semaphore;

public class Shared {
    public int shared = 0;

    
    public void increment(){
        shared++;
    }

    public void decrement(){
        shared--;
    }

    public void print(){
        System.out.print(shared);
    }
}