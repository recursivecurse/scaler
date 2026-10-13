package multithreading.producerconsumer;

public class Problem {

    private Integer value = null;
    private boolean flag = false;
    public synchronized void producer(Integer value)
    {
        
            try{
                while(flag == true)
                {
                    wait();
                }
                this.value = value;
                this.flag = true;
                System.out.println("Producer produces : "+this.value);
            }
            catch(InterruptedException e){}
            finally{
                notifyAll();
            }
        
        
    }

    public synchronized void consumer()
    {
       
            try{
                 while(this.flag == false)
                {
                        wait();
                }
                System.out.println("Consumer consumes : "+this.value);
                this.value = null;
                this.flag = false;
            }
            catch(InterruptedException e){}
            finally{
                notifyAll();
            }
        
        


    }

    public static void main(String[] args) {
        
        Problem pc = new Problem();
        Thread t1 = new Thread(()->{
            for(int i=0;i<20;i++)
                pc.producer(10);
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<20;i++)
                pc.consumer();
        });

        t1.start();
        t2.start();
    }

}
