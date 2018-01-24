package com.Mex;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("this executes before any test cases");
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Bob", "Smith", 1000, BankAccount.Checking);
        System.out.println("running test");
    }

    @org.junit.Test
    public void deposit() throws Exception {
       //BankAccount account = new BankAccount("Bob", "Smith", 1000, BankAccount.Checking);
       double balance = account.deposit(200);
       assertEquals(1200, balance, 0);
        //delta parameter allows for a difference between expected and actual value
    }

    @org.junit.Test
    public void withdraw() throws Exception {
       // BankAccount account = new BankAccount("Bob", "Smith", 1000, BankAccount.Checking);
        account.withdraw(200);
        assertEquals(800, account.getBalance(), 0);
        }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
       // BankAccount account = new BankAccount("Bob", "Smith", 1000, BankAccount.Checking);
        account.deposit(200);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
      //  BankAccount account = new BankAccount("Bob", "Smith", 1000, BankAccount.Checking);
        account.withdraw(200);
        assertEquals(800, account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking_true(){
       // BankAccount account = new BankAccount("Bob", "Smith", 1000, BankAccount.Checking);
        assertTrue(account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("this executes after test cases. Count = " + count++);
    }
    @org.junit.After
    public void teardown(){
        System.out.println("count = " + count++);
    }

}