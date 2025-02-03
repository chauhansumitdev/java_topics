package java_day_2.CollectionsLearn.ListInterface;


import java.util.*;

public class A implements Runnable{
    
    public List<Integer> list;

    public A(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            list.add(0, list.get(0)+1);
        }
    }
}
