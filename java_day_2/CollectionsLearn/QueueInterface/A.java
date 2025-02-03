package java_day_2.CollectionsLearn.QueueInterface;

import java.util.*;

public class A implements Runnable{

    public Queue<Integer> q;

    public A(Queue<Integer> q){
        this.q = q;
    }
    
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            q.offer(i);
        }
    }

}
