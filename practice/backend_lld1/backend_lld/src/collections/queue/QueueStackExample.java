package collections.queue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueStackExample {
    
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(3);
        queue.offer(10); //safer than add, returns false if queue is full
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.offer(40));
        System.out.println(queue.add(40));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Deque<Integer> queue1 = new ArrayDeque<>();
        queue1.offer(10);
        queue1.offer(20);
        queue1.offer(30);
        System.out.println(queue1);
        System.out.println(queue1.poll());
        
        queue1.addFirst(40);
        System.out.println(queue1.peek());


        Queue<Integer> queue2 = new LinkedList<>();
        queue2.offer(10);
        queue2.offer(20);
        queue2.offer(30);
        System.out.println(queue2.poll());
        System.out.println(queue2.peek());

        Deque<Integer> list = new LinkedList<>();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println(list.pop());
        System.out.println(list.peek());
    }
    

}
