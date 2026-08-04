package multithreading;

import multithreading.DiscountCalculator;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Creating a new Thread
//        for(int i=0;i<10;i++){
//            multithreading.NumberPrinter np = new multithreading.NumberPrinter(i);
//            Thread t = new Thread(np);
//
//            t.start();
//        }

        //Using Executor service

//        ExecutorService ex = Executors.newFixedThreadPool(10);
//        for(int i=0;i<10;i++){
//            multithreading.NumberPrinter np = new multithreading.NumberPrinter(i);
//            ex.execute(np);
//
//        }
//        ex.shutdown();

        //Callable
        MRPCalculator mrp = new MRPCalculator(10);
        DiscountCalculator discount = new DiscountCalculator(10);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> mrpValue = executor.submit(mrp);
        Future<Integer> discountValue = executor.submit(discount);

        Integer finalPrice = (mrpValue.get()-discountValue.get());
        System.out.println("Final Price "+ finalPrice+"Thread :" +Thread.currentThread().getName() );


//        System.out.println("The currect thread is: "+ Thread.currentThread().getName());
    }
}
