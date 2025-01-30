package ConcurrentHashMap;

import java.util.concurrent.*;

public class A  implements Runnable{

    private ConcurrentHashMap<Integer, Integer> map;

    public A(ConcurrentHashMap<Integer, Integer> map){
        this.map = map;
    }

    @Override
    public void run(){
        add();
    }

    public void add(){
        for(int i=0;i<5;i++){
            map.put(i,i);
            System.out.println(" ADDED " + map.get(i));
        }
    }
}
