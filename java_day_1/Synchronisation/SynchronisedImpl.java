package Synchronisation;

public class SynchronisedImpl {

    public static void main(String[] args) throws Exception {
        



        Thread one = new Thread(new TestThread());
        Thread two = new Thread(new TestThread2());

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(" MAIN ENDS HERE ");
    }

}
