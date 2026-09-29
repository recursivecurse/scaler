package multithreading.executerservice;

import java.sql.Time;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class UsingThreadPoolExecutor {

    public static void main(String[] args) {
        
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            2, 5, 5,
            TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());

            executor.execute(()->{
                
            System.out.println(Thread.currentThread().getName()+ " says hello ");

            });

            
    }




}
