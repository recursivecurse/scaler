package multithreading.executerservice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingCompletableFuture {

    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(10);

        CompletableFuture<Integer> future = new CompletableFuture<>();

        future.completeAsync(()->{

            return 10;
        }, executor)
        .thenApply(a -> a+10)
        .thenAccept(System.out::println)
        .thenRun(()->{
            System.out.println("Running this finally");
        });

        
        Future<String> future2 = executor.submit(()->{

            System.out.println("Hello world!");
            
        },"Success");

        try{

            System.out.println(future2.get());
        }
        catch (Exception e){}
        executor.shutdown();
    }


}
