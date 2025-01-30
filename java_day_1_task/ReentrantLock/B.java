package ReentrantLock;

public class B implements Runnable {

    private Shared shared;

    public B(Shared shared){
        this.shared = shared;
    }
    
    @Override
    public void run(){

        for(int i=0;i<5;i++){
            shared.decrement();
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
