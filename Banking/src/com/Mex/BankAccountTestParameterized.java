package com.Mex;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

    private BankAccount account;
    private double amount;
    private double expected;

    public BankAccountTestParameterized(double amount, double expected) {
        this.amount = amount;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Bob", "Smith", 1000, BankAccount.Checking);
        System.out.println("running test");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {100, 1100},
                {200, 1200},
                {300, 1300},
                {450, 1450},
                {1000, 2000}
        });
    }

    @org.junit.Test
    public void deposit() throws Exception {
        account.deposit(amount);
        assertEquals(expected, account.getBalance(), 0);

    }




}
