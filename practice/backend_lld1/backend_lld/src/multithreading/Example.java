package multithreading;

public class Example {

    public static void main(String[] args) throws InterruptedException
    {

        System.out.println("Hello from main thread");

        Thread t1 = new Thread(()->
        {
            while(!Thread.currentThread().isInterrupted())
                System.out.println("Hello from : "+ Thread.currentThread().getName());
        });

        t1.setName("adityathread");
        // t1.setDaemon(true);
        t1.start();
        Thread.sleep(2000);

        Thread t2 = new Thread(()->
        {
            for(int i=0;i<100;i++)
                System.out.println("Hello");
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        t1.interrupt();
        t2.start();
        t2.join();
        System.out.println("Main thread ends");
    }
}
