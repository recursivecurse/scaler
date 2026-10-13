package multithreading.executerservice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class UsingScheduledExecutorService {

    public static void main(String[] args) {
        
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        int value = 10;
        ScheduledFuture<Integer> future = executor.schedule(()->{
            int currvalue = value;
            return currvalue*currvalue;
        }, 2, TimeUnit.SECONDS);

        
        executor.scheduleWithFixedDelay(()->{
             System.out.println("hello from "+Thread.currentThread().getName());
        }, 2, 1, TimeUnit.SECONDS);

        
        System.out.println("hello from main thread");

        
    }
}
