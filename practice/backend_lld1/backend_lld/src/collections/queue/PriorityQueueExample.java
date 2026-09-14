package collections.queue;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

    PriorityQueue<Student> queue = new PriorityQueue<>(
        Comparator.comparing(Student::getAge, Comparator.nullsLast(Comparator.reverseOrder()))
                  .thenComparing(Student::getName, String.CASE_INSENSITIVE_ORDER)
    );
    queue.offer(new Student("Alice", 20));
    queue.offer(new Student("Bob", 22));
    queue.offer(new Student("Charlie", 21));
    queue.offer(new Student("avid", 22));
    
    
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());

    
        

    }
     
}
