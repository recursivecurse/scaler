package multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsingReentrantLock {

    Queue<Integer> buffer;
    int capacity;
    Lock lck = new ReentrantLock();
    Condition bufferNotEmpty = lck.newCondition();
    Condition bufferNotFull = lck.newCondition();

    UsingReentrantLock(int capacity)
    {
        buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public void producer(int value) {

        lck.lock();
        try{
        while(buffer.size()== capacity)
        {
            System.out.println(Thread.currentThread().getName()+ " is in waiting state ");
            bufferNotFull.await();
        }
        buffer.add(value);
        System.out.println(Thread.currentThread().getName()+ " produces this value "+value);
        bufferNotEmpty.signalAll();
    }
    catch(InterruptedException e){e.printStackTrace();}
    finally{
        lck.unlock();
    }
        
    }

    public void consumer() {

        lck.lock();
        try{
        while(buffer.isEmpty())
        {
            System.out.println(Thread.currentThread().getName()+ " is in waiting state ");
            bufferNotEmpty.await();
        }
        int value = buffer.poll();
        System.out.println(Thread.currentThread().getName()+ " consumes this value "+value);
        bufferNotFull.signalAll();
    }
    catch(InterruptedException e){e.printStackTrace();}
    finally{
        lck.unlock();
    }
        
    }

    public static void main(String[] args) {
        UsingReentrantLock rl = new UsingReentrantLock(5);

        Thread t1 = new Thread(()->{
            for(int i=0;i<20;i++)
            {
                rl.producer(i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<20;i++)
            {
                rl.consumer();
            }
        });

        t1.start();
        t2.start();
        
    }



}
