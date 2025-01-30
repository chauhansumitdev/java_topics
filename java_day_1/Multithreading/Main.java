package Multithreading;

public class Main {

    public static void main(String[] args)  throws Exception{
        

        UsingRunnable usingRunnable = new UsingRunnable();
        
        Thread new_thread = new Thread(usingRunnable);

        new_thread.start();

        System.out.println(" FROM MAIN ");

        new_thread.join();


        UsingExtends usingExtends = new UsingExtends();
        usingExtends.start();

        System.out.println(" MAIN ENDS ");

        
    }
}