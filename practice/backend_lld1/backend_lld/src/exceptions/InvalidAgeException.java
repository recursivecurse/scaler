package exceptions;

public class InvalidAgeException extends IllegalArgumentException{

    private int age;

    public InvalidAgeException(String message, int age)
    {
        super(message);
        this.age = age;
        System.out.println("Age "+ age+ " is invalid");
    }

}
