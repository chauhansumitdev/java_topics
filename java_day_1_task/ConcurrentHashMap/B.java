package ConcurrentHashMap;

import java.util.concurrent.*;

public class B implements Runnable {
    private ConcurrentHashMap<Integer, Integer> map;

    public B(ConcurrentHashMap<Integer, Integer> map){
        this.map = map;
    }

    @Override
    public void run(){
        System.out.println(" EXEC remove() ");
        remove();
    }

    public void remove(){

        System.out.println(map.containsKey(3));

        while(true){
            if(map.containsKey(3)){
                System.out.println(" REMOVED ");
                map.remove(3);
                return;
            }
        }
    }
}
