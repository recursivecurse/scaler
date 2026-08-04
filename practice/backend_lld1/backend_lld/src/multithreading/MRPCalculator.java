package multithreading;

import java.util.concurrent.Callable;

public class MRPCalculator implements Callable<Integer> {
    private Integer id;

    public MRPCalculator(Integer id){
        this.id = id;

    }
    public Integer call(){

        System.out.println("The mrp is: 100 Thread is :"+ Thread.currentThread().getName());

        return 100;
    }
}
