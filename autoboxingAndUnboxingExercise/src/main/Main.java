/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
public class Main {

    
    
    public static void main(String[] args) {
    
        
    Bank bank = new Bank("First National Bank");
    
    bank.addBranch("Washington");
    
    bank.addCustomer("Washington", "J. Morgan", 500);
    bank.addCustomer("Washington", "R. Sanchez", 9000);
    
    bank.addBranch("New York");
    
    bank.addCustomer("New York", "T. Smith", 100);
    bank.addCustomer("New York", "H. Ardman", 250);
    
    bank.addCustomerTransaction("Washington", "J. Morgan", 10);
    bank.addCustomerTransaction("New York", "T. Smith", 0.99);
    
    bank.listCustomers("Washington", true);
    bank.listCustomers("New York", true);
    
    
    
    
    
    
    
    
    
    }
    
}
