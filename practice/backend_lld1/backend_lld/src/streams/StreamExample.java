package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // Example code for stream processing can be added here

        //Source

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Stream<String> nameStream = names.stream();
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Integer[] integerArray = {6, 7, 8, 9, 10};
        Stream<Integer> integerStream2 = Arrays.stream(integerArray);
        Stream<Integer> emptyStream = Stream.empty();
        // This will not print anything since the stream is empty

        DoubleStream doubleStream = DoubleStream.generate(() -> (int) (Math.random() * 10)); // Creates a stream of random integers
        doubleStream.limit(5).forEach(System.out::println); // Limit to 5 random numbers and print them

        IntStream intStream = IntStream.iterate(1,x -> x+1).limit(10);
        intStream.forEach(System.out::println);

        IntStream intStream2 = integerStream.mapToInt(Integer::intValue);
        intStream2.forEach(System.out::println);

        // Stream<Integer> integerStream3 = intStream2.boxed();
        // integerStream3.forEach(System.out::println);

        
    }

}
