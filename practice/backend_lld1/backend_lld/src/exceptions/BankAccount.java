package exceptions;

public class BankAccount {

    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount < 0) throw new IllegalArgumentException("Invalid amount entered");

        if(amount > balance)
        {
            double missingAmount = balance - amount;
            throw new InsufficientBalanceException("Not enough money", missingAmount);
        }


        this.balance -= amount;
        System.out.println("Amount deducted: Balance : " + balance);
    }


    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount(100.00);

        try{

            ba.withdraw(200.0);
        }
        catch(InsufficientBalanceException e)
        {
            e.printStackTrace();
            System.err.println("Amount short by: "+ e.getAmountShort());
        }

        System.out.println("Transaction completed");
    }
}
