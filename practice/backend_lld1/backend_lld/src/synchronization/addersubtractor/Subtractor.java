package synchronization.addersubtractor;

import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Runnable{

    private Count count;
    private ReentrantLock mutex;
    private String lock;

    public Subtractor(Count count , ReentrantLock mutex, String lock)
    {
        this.count = count;
        this.mutex = mutex;
        this.lock = lock;
    }


    @Override
    public void run() {

        for(int i=0;i<1000000;i++) {
//            mutex.lock();
            synchronized (this.lock) {
                this.count.setValue(count.getValue() - 1);
            }
//            mutex.unlock();
        }
    }
}
