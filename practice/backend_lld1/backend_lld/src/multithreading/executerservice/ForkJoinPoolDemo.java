package multithreading.executerservice;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {

    private int[] numbers;
    private int start;
    private int end;

    SumTask(int[] arr,int start,int end)
    {
        this.numbers = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // TODO Auto-generated method stub
        
        if(end - start <=2)
        {
            int sum =0;
            for(int i=start;i<=end;i++)
            {
                sum += numbers[i];
            }
            return sum;
        }
        int mid = (start+end)/2;
        SumTask leftTask = new SumTask(numbers, start, mid);
        SumTask rightTask = new SumTask(numbers, mid+1, end);

        leftTask.fork();
        int computeRight = rightTask.compute();

        int computeLeft = leftTask.join();
        return computeLeft + computeRight;
    }

    
}
class ForkJoinPoolDemo {

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        SumTask task = new SumTask(nums, 0, nums.length-1);

        ForkJoinPool pool = new ForkJoinPool(4);
        int sum = pool.invoke(task);

        System.out.println(sum);
    }
}
