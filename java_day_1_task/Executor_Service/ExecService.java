package Executor_Service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecService {
    
    public static void main(String[] args) throws Exception{       

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=0;i<10;i++){
            executorService.submit(()->{
                System.out.println(" From Runnable ");
            });
        }
        System.out.println(" STATUS : EXECUTOR_SERVICE : " +executorService.isShutdown());


        Callable<Integer> callable = () ->{
            Thread.sleep(500);
            return 3;
        };

        Future<Integer> callable_future = executorService.submit(callable);

        System.out.println(" UNRELATED PRINT ");

        Integer value = callable_future.get();

        System.out.println(" AFTER HALT ");

        System.out.println(value);

        executorService.shutdown();

        Thread.sleep(5000);

        System.out.println(executorService.isShutdown());
    }
}