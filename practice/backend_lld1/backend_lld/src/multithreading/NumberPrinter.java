package multithreading;

import java.sql.SQLOutput;

public class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int i)
    {
        this.number = i;
    }

    @Override
    public void run() {
        System.out.println("Printing number : "+ this.number + " The thread is: "+ Thread.currentThread().getName());
    }
}
