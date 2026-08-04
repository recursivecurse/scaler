package multithreading;

import java.util.concurrent.Callable;

public class DiscountCalculator implements Callable<Integer> {

    private Integer id;

    public DiscountCalculator(Integer id){
        this.id = id;
    }

    public Integer call() {
        System.out.println("The discount is: 20 Thread is :" + Thread.currentThread().getName());

        return 20;
    }
}
