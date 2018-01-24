package com.Mex;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public static final int Checking = 1;
    public static final int Saving = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double deposit(double amount){ //branch is true if operation is made in a bank and false if it is made at th atm
        balance += amount;
        return balance;

    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
    public boolean isChecking(){
        return accountType == Checking;
    }

}
