package synchronization.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Shirt> store;
    private String name;
    private Semaphore semProducer;
    private Semaphore semConsumer;


    public Consumer(Queue<Shirt> store, String name, Semaphore semProducer, Semaphore semConsumer) {
        this.store = store;
        this.name = name;
        this.semProducer = semProducer;
        this.semConsumer = semConsumer;
    }


    @Override
    public void run() {

        while(true) {
            try {
                semConsumer.acquire();
                System.out.println("Shirts in store " + store.size() + "Consumer " + name);
                store.remove();
                semProducer.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
