package com.Alston;

public class BankAccount {

    private String firstName;
    private String lastNAme;
    private double balence;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;


    public BankAccount(String firstName, String lastNAme, double balence, int typeOfAccount) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.balence = balence;
        this.accountType = typeOfAccount;
    }

    //branch argument is true if the customer is performing the transaction
    //at a branch with a teller.
    //It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balence += amount;
        return balence;
    }

    //branch argument is true if the customer is performing the transaction
    //at a branch with a teller.
    //It's false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        balence -= amount;
        return balence;
    }


    public double getBalance() {
        return balence;
    }

    public boolean isChecking() {
        return accountType == CHECKING;
    }

    //More methods that use firstName, lastName, and perform other functions

}
