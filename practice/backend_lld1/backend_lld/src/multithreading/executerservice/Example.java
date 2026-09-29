package multithreading.executerservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(12);

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out
                        .println("TaskId : " + taskId + " is getting executed by " + Thread.currentThread().getName());

            });
        }

        List<Future<Integer>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final int currNum = i;

            futureList.add(executor.submit(() -> {
                if (currNum < 5) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
                return currNum + 10;
            }));

        }
        for (int i = 0; i < futureList.size(); i++) {
            try {
                System.out.println(futureList.get(i).get());
            } catch (Exception e) {
            }
        }

        // --- ExecutorCompletionService: returns results in COMPLETION order, not submission order ---
        // .take() blocks until the next task finishes, so fastest tasks are retrieved first
        // Useful when you want to process results as soon as they are available
        ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);

        // Submit tasks: 0-4 sleep for 2s, 5-9 finish instantly
        for (int i = 0; i < 10; i++) {
            final int currNum = i;
            completionService.submit(() -> {
                if (currNum < 5) {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }
                }
                return currNum + 10;
            });
        }

        // .take() returns the next COMPLETED future (not submission order)
        // Output: 15,16,17,18,19 first (no sleep), then 10,11,12,13,14 after ~2s
        System.out.println("\n--- CompletionService (completion order) ---");
        List<Integer> completionOrderResults = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            try {
                Future<Integer> f = completionService.take();
                int result = f.get();
                completionOrderResults.add(result);
                System.out.println(result);
            } catch (Exception e) {
            }
        }

        // Comparison:
        // List<Future>                  -> results in SUBMISSION order
        // ExecutorCompletionService     -> results in COMPLETION order (fastest first)
        // invokeAll()                   -> results in SUBMISSION order, but waits for ALL to finish

        executor.shutdown();

    }

}
