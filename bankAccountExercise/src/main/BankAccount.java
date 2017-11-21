
package main;

/**
 *
 * @author Mex
 */
public class BankAccount {
    //fields
    private String customerName;
    private String accountNumber;
    public double balance;
    private String Email;
    private String phoneNumber;
    
    //constructor
    public BankAccount(String customerName, String accountNumber, double balance, String Email, String phoneNumber){
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.Email = Email;
    this.phoneNumber = phoneNumber;
    
    }
    //setters and getters for all fields
    public void setcustomerName(String customerName) {
       
        this.customerName = customerName;
}
    public String getcustomerName() {
        return this.customerName;
    }
    public void setaccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
}
    public String getaccountNumber() {
        return this.accountNumber;
    }
    public double setbalance(double balance) {
        this.balance = balance;
        return balance;
}
    public double getbalance() {
        return this.balance;
    }
    public void setEmail(String Email) {
        this.Email = Email;
}
    public String getEmail() {
        return this.Email;
    }
    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
}
    public String getphoneNumber() {
        return this.phoneNumber;
    }
    
   //methods for deposition and withdrawal 
    public double depositFunds(double addedFunds){
    balance = balance + addedFunds;
    System.out.println(addedFunds + " added to the account. The balance is now " + balance);
    return balance;
    }
    
    public double withdrawFunds(double withdrawnFunds){
    if (withdrawnFunds > balance) {
        System.out.println(" The balance is: "+ balance + " Cannot withdraw. Given ammount: "+withdrawnFunds+ " exceeds balance.");
        }
    else {
    balance = balance - withdrawnFunds;
    System.out.println(withdrawnFunds + " withdrawn from the account. The balance is now " + balance);}
    return balance;
    }
}
