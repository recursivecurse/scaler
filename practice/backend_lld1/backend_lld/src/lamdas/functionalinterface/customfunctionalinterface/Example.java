package lamdas.functionalinterface.customfunctionalinterface;

public class Example {

    public static void main(String[] args) {
        // Create a functional interface instance using a lambda expression
        IsPositiveven isPositiveEven = (x) -> x > 0 && x % 2 == 0;

        System.out.println("Is 4 positive even? " + isPositiveEven.test(4));
        System.out.println("Is -2 positive even? " + isPositiveEven.test(-2));
        System.out.println("Is 3 positive even? " + isPositiveEven.test(3));
    }
}
