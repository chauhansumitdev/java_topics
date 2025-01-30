package ReentrantLock;

public class A  implements Runnable{

    public Shared shared;

    public A(Shared shared){
        this.shared = shared;
    }
    
    @Override
    public void run(){

        for(int i=0;i<5;i++){
            shared.increment();
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

}
