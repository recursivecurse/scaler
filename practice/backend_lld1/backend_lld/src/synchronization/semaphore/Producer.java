package synchronization.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Queue<Shirt> store;
    private String name;
    private Semaphore semProducer;
    private Semaphore semConsumer;


    public Producer(Queue<Shirt> store,String name, Semaphore semProducer, Semaphore semConsumer) {
        this.store = store;
        this.name = name;
        this.semProducer = semProducer;
        this.semConsumer = semConsumer;
    }

    @Override
    public void run() {

        while(true) {

            try {
                semProducer.acquire();
                System.out.println("Shirts in store " + store.size() + "Producer " + name);
                store.add(new Shirt("shirt", "100"));
                semConsumer.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
