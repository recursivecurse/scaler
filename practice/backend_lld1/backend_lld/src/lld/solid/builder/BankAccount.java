package lld.solid.builder;

import enumeration.AccountType;

public class BankAccount {

    private final String accountNumber;
    private final String accountHolderName;
    private final AccountType accountType;
    private final Double balance;
    private final String routingNumber;
    private final String email;
    private final Double overdraftLimit;
    private final Boolean isInterestBearing;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public String getEmail() {
        return email;
    }

    public Double getOverdraftLimit() {
        return overdraftLimit;
    }

    public Boolean getInterestBearing() {
        return isInterestBearing;
    }


    private BankAccount(Builder builder)
    {
        this.accountNumber = builder.accountNumber;
        this.accountHolderName = builder.accountHolderName;
        this.accountType = builder.accountType;
        this.balance = builder.balance;
        this.routingNumber = builder.routingNumber;
        this.email = builder.email;
        this.overdraftLimit = builder.overdraftLimit;
        this.isInterestBearing = builder.isInterestBearing;

    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder{
        private  String accountNumber;
        private  String accountHolderName;
        private  AccountType accountType;
        private  Double balance;
        private  String routingNumber;
        private  String email;
        private  Double overdraftLimit;
        private  Boolean isInterestBearing;

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder accountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
            return this;
        }

        public Builder accountType(AccountType accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder balance(Double balance) {
            this.balance = balance;
            return this;
        }

        public Builder routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder overdraftLimit(Double overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
            return this;
        }

        public Builder interestBearing(Boolean interestBearing) {
            isInterestBearing = interestBearing;
            return this;
        }

        public void validate() {
            // 1. Validate Mandatory Fields cleanly using OR (||)
            if (accountNumber == null || accountNumber.isBlank()) {
                throw new IllegalArgumentException("Account number is mandatory");
            }
            if (accountHolderName == null || accountHolderName.isBlank()) {
                throw new IllegalArgumentException("Account holder name is mandatory");
            }
            if (accountType == null) {
                throw new IllegalArgumentException("Account type is mandatory");
            }
            if (balance == null) {
                throw new IllegalArgumentException("Initial balance is mandatory");
            }

            // 2. Validate Routing Number if present
            if (routingNumber != null && routingNumber.isBlank()) {
                throw new IllegalArgumentException("Routing Number cannot be blank");
            }

            // 3. Minimum Balance for Savings
            if (accountType == AccountType.SAVINGS && balance < 100.00) {
                throw new IllegalArgumentException("Low Balance: Savings requires at least $100");
            }

            // 4. Negative Balance Check (Allowed ONLY for LOAN)
            if (accountType != AccountType.LOAN && balance < 0.00) {
                throw new IllegalArgumentException("Balance cannot be negative for this account type");
            }

            // 5. Email check
            if (email == null || email.isBlank()) {
                throw new IllegalArgumentException("Please provide a valid email");
            }

            // 6. Overdraft limit check (Safe from NullPointerException)
            double currentOverdraft = (overdraftLimit == null) ? 0.00 : overdraftLimit;
            if (accountType != AccountType.CHECKING && currentOverdraft != 0.00) {
                throw new IllegalArgumentException("Overdraft limit is only allowed for CHECKING accounts");
            }
        }


        public BankAccount build()
        {
            validate();
            return new BankAccount(this);
        }


    }

}
