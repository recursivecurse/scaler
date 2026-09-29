package multithreading.readerwriter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockDowngrade {

    private String sharedData ="Aditya";
    ReadWriteLock rw = new ReentrantReadWriteLock();
    Lock reader = rw.readLock();
    Lock writer = rw.writeLock();

    public void updateAndRead(String data)
    {
        writer.lock();

        try{
            System.out.println("Acquired exclusive lock");
            this.sharedData = data;
            System.out.println("Updated the data");
            reader.lock();
            System.out.println("Acquired shared lock");
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            writer.unlock();
            System.out.println("Left the exclusive lock");
        }

        try{
            System.out.println("Reading the data "+ this.sharedData);
        }
        catch(Exception e){}
        finally{
            reader.unlock();
            System.out.println("Left shared lock");
        }
    }

    public static void main(String[] args) {
        LockDowngrade ld = new LockDowngrade();
        Thread t1 = new Thread(()->{
            ld.updateAndRead("Ashutosh");
        });

        t1.start();
    }

    

}
