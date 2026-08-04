package lld.solid.builder;

import enumeration.AccountType;

public class Main {

    public static void main(String[] args) {

        Student student = Student.builder()
                .name("aditya")
                .age(26)
                .gradYear(2022)
                .phoneNumber("7023206524")
                .build();

        BankAccount bankAccount = BankAccount.builder()
                .accountType(AccountType.SAVINGS)
                .accountNumber("2342342343")
                .balance(100.00)
                .email("abc@email.com")
                .build();



    }
}
