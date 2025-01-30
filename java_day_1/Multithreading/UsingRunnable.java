package Multithreading;

public class UsingRunnable implements Runnable{

    @Override
    public void run(){

        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(" IMPLEMENTING RUNNABLE INTERFACE ");

    }
}
