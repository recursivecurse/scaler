package multithreading.readerwriter;

import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class ReaderWriter {

    private Integer value=10;
    ReadWriteLock rw = new ReentrantReadWriteLock();
    Lock rl = rw.readLock();
    Lock wl = rw.writeLock();

    public void reader()
    {
        rl.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" is reading "+ value);
        } finally {
            rl.unlock();
        }
    }

    public void writer(int value)
    {
        wl.lock();
        try {
            this.value = value;
            System.out.println(Thread.currentThread().getName()+ " is writing "+value);
        } finally {
            wl.unlock();
        }
    }

    public static void main(String[] args) {
        
        ReaderWriter readerWriter = new ReaderWriter();
        Thread t1 = new Thread(()->{readerWriter.writer(100);});
        Thread t2 = new Thread(()->{readerWriter.reader();});
        Thread t3 = new Thread(()->{readerWriter.reader();});
        Thread t4 = new Thread(()->{readerWriter.reader();});

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


    

}
