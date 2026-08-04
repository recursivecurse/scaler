package synchronization.addersubtractor;

import java.sql.SQLOutput;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello World");

        final String lock = "lock";
        Count count = new Count(0);
        ReentrantLock mutex = new ReentrantLock();

        Adder add = new Adder(count , mutex, lock);
        Subtractor sub = new Subtractor(count , mutex, lock);

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(sub);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.getValue());


    }

}
