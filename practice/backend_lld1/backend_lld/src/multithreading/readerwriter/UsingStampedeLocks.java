package multithreading.readerwriter;

import java.util.concurrent.locks.StampedLock;


public class UsingStampedeLocks {

    private String sharedData = "Aditya";
    StampedLock lck = new StampedLock();

    public String reader()
    {
        long stamp = lck.tryOptimisticRead();
        String currentValue = sharedData;

        if(!lck.validate(stamp))
        {

            stamp = lck.readLock();
            try{
                currentValue = this.sharedData;
                return currentValue;
            }
            catch(Exception e){e.printStackTrace();}
            finally{
                lck.unlockRead(stamp);
            }


        }
        
        return currentValue;
    }

    public void writer(String data)
    {
        long stamp = lck.writeLock();

        try{
            System.out.println("Writer is writing data "+data);
            this.sharedData = data;
            
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            lck.unlockWrite(stamp);
        }
    }

    public static void main(String[] args) {
        
        UsingStampedeLocks usl = new UsingStampedeLocks();
        Thread t1 = new Thread(()->
        {
            for(int i=0;i<10;i++)
                usl.writer("John");
        });

        Thread t2 = new Thread(()->
        {
            for(int i=0;i<10;i++)
                System.out.println(usl.reader());
        });

        Thread t3 = new Thread(()->
        {
            for(int i=0;i<10;i++)
                System.out.println(usl.reader());
        });
        Thread t4 = new Thread(()->
        {
            for(int i=0;i<10;i++)
                System.out.println(usl.reader());
        });

        t2.start();
        t3.start();
        t1.start();
        t4.start();

        try{

            t1.join();
            t2.join();
            t3.join();
            t4.join();

        }
        catch(Exception e){}
    }

}
