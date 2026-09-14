package lamdas.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Example {

    public static void main(String[] args) {
        // Create a functional interface instance using a lambda expression
        
        Function<Double, Integer> square = x -> (int) (x * x);

        Function<Integer,Double> squareRoot = Math::sqrt;

        System.out.println("Example with 5: " + square.compose(squareRoot).apply(5));
        

        Predicate<Integer> isEven = x -> x%2 == 0;
        Predicate<Integer> isOdd = isEven.negate();
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 5 odd? " + isOdd.test(5));
        System.out.println("Is 10 positive even? " + isPositive.and(isEven).test(10));
        
    }

}
