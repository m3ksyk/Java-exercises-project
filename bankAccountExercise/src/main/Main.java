
// This is a simple Class and Constructor exercise
 
package main;

/**
 * @author Mex
 */
public class Main {

    
    public static void main(String[] args) {
        
   // this part is actually redundant after addition of a constructor
    //hence it is commented out
   // BankAccount account1 = new BankAccount();
   
    //        account1.setcustomerName("John Smith");
    //        account1.setaccountNumber("001");
    //        account1.setbalance(10000);
    //        account1.setEmail("JSmith@FU.net");
    //        account1.setphoneNumber("55 55 55");

    BankAccount account1 = new BankAccount("John Smith", "001", 10000,"JSmith@FU.net","55 55 55");
    BankAccount account2 = new BankAccount("John Wayne", "002", 5000,"JWayne@FU.net","00 00 00");
    DebitBankAccount account3 = new DebitBankAccount("Mr. White", "003", 1000, "mrwhite@FU.net", "11 11 11", 1000);
        
        System.out.println("********"); 
        
        System.out.println("This is the basic state"); 
        System.out.println("The balance is: " + account1.getbalance());
        System.out.println("Customer name: " + account1.getcustomerName());
        System.out.println("Account number: " + account1.getaccountNumber());
        System.out.println("Customer Email adress: " + account1.getEmail());
        System.out.println("Customer phone number: " + account1.getphoneNumber());
       
        System.out.println("********"); 
        
        System.out.println("Now we deposit funds"); 
        account1.depositFunds(100);
        System.out.println("The balance is: " + account1.getbalance());
//        System.out.println("Customer name: " + account1.getcustomerName());
//        System.out.println("Account number: " + account1.getaccountNumber());
//        System.out.println("Customer Email adress: " + account1.getEmail());
//        System.out.println("Customer phone number: " + account1.getphoneNumber());
       
        System.out.println("********"); 
       
        System.out.println("Now we withdraw funds"); 
        account1.withdrawFunds(100);
        System.out.println("The balance is: " + account1.getbalance());
//        System.out.println("Customer name: " + account1.getcustomerName());
//        System.out.println("Account number: " + account1.getaccountNumber());
//        System.out.println("Customer Email adress: " + account1.getEmail());
//        System.out.println("Customer phone number: " + account1.getphoneNumber());
      
        System.out.println("********"); 
       
        System.out.println("Now we try to withdraw funds, but the ammount exceeds the balance"); 
        account1.withdrawFunds(100000);
        System.out.println("The balance is: " + account1.getbalance());
//        System.out.println("Customer name: " + account1.getcustomerName());
//        System.out.println("Account number: " + account1.getaccountNumber());
//        System.out.println("Customer Email adress: " + account1.getEmail());
//        System.out.println("Customer phone number: " + account1.getphoneNumber());
    
        System.out.println("********"); 
        System.out.println("Now let's check up on the other account");
        account2.depositFunds(50);
        System.out.println("The balance is: " + account2.getbalance());
        account2.withdrawFunds(250);
        System.out.println("The balance is: " + account2.getbalance());
        account2.withdrawFunds(25000);
        
        System.out.println("********"); 
        System.out.println("Now let's the debit account");
        System.out.println("The balance is: " + account3.getbalance());
        System.out.println("The debit limit is: " + account3.getDebit());
        account3.withdrawFunds(250);
        System.out.println("The balance is: " + account3.getbalance());
        account3.withdrawFunds(1500);
        System.out.println("The balance is: " + account3.getbalance());        
        account3.withdrawFunds(1200);
        System.out.println("The balance is: " + account3.getbalance());
        
        
        
    }
    
}
