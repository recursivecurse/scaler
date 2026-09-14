package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void methodA(int a, int b)
    {
        methodB(a,b); 
    }

    public static void methodB(int a, int b)
    {
        try{
            
            System.out.println(a/b);
        }
        
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException  //It is a runtimeException compiler wont ask you to wrap it in try catch
    {
        if(age<=0) throw new InvalidAgeException("Invalid age entered ", age);

        else
            System.out.println("Age is valid");
    }

   

    public static void main(String[] args) {
        
        // methodA(2,0);
        // System.out.println("Handled exception");

        //RuntimeException
        checkAge(-10);

       try(FileReader file = new FileReader("abc.txt"))
       {

       }
       catch(IOException e)
       {
            e.printStackTrace();
       }

    }
}
 