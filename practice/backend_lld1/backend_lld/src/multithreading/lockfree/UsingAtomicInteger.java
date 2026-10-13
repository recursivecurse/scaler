package multithreading.lockfree;

import java.util.concurrent.atomic.AtomicInteger;

public class UsingAtomicInteger {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=0;i<10000;i++)
                c.increment();
        }); 

        Thread t2 = new Thread(()->{
             for(int i=0;i<10000;i++)
                c.increment();
        }); 

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
         }
         catch(InterruptedException e){}

         System.out.println(c.counter);

        }
       
}

class Counter{

    AtomicInteger counter = new AtomicInteger(0);

    public void increment()
    {
        counter.getAndIncrement(); //uses rety compare and set method (compare and swap is the algo)
    }
}
    