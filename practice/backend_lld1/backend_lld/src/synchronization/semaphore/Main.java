package synchronization.semaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Queue<Shirt> store = new ConcurrentLinkedDeque<>();
        Semaphore semProducer = new Semaphore(5);
        Semaphore semConsumer = new Semaphore(0);
        Producer p1 = new Producer(store,"P1",semProducer,semConsumer);
        Producer p2 = new Producer(store,"P2",semProducer,semConsumer);
        Producer p3 = new Producer(store,"P3",semProducer,semConsumer);
        Producer p4 = new Producer(store,"P4",semProducer,semConsumer);
        Producer p5 = new Producer(store,"P5",semProducer,semConsumer);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);

        Consumer c1 = new Consumer(store,"C1",semProducer,semConsumer);
        Consumer c2 = new Consumer(store,"C2",semProducer,semConsumer);
        Consumer c3 = new Consumer(store,"C3",semProducer,semConsumer);
        Consumer c4 = new Consumer(store,"C4",semProducer,semConsumer);
        Consumer c5 = new Consumer(store,"C5",semProducer,semConsumer);

        Thread t6 = new Thread(c1);
        Thread t7 = new Thread(c2);
        Thread t8 = new Thread(c3);
        Thread t9 = new Thread(c4);
        Thread t10 = new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
    }
}
