package exceptions;

public class InsufficientBalanceException extends Exception{

    private double amountShort;

    
    public InsufficientBalanceException(String message, double amountShort)
    {
        super(message);
        this.amountShort = amountShort;
        
    }
    
    
    public double getAmountShort() {
        return amountShort;
    }

}
