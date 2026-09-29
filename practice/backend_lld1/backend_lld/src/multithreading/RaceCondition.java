package multithreading;

class Counter{
    int counter =0;

    synchronized void increment()
    {
        counter +=1;
    }

}
public class RaceCondition {

    public static void main(String[] args){
        
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
            
            Thread.sleep(5000);
        }
        catch (InterruptedException e){}
        System.out.println(c.counter);
    }
    
    
    
    
}