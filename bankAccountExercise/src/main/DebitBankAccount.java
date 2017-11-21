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
public class DebitBankAccount extends BankAccount{

    private double debit;
 
public DebitBankAccount(String customerName, String accountNumber, double balance, String Email, String phoneNumber, double debit){
    super(customerName,  accountNumber, balance, Email, phoneNumber);
    this.debit = debit;
}

  public double setDebit(double debit) {
        this.debit = debit;
        return debit;
}
    public double getDebit() {
        return this.debit;
    }


// the method does not work correctly, it does not withdraw properly
    @Override
    public double withdrawFunds(double withdrawnFunds){
    if (withdrawnFunds > balance && withdrawnFunds > (balance + debit)) {
        System.out.println(" The balance is: "+ balance + " and the debit limit is: "+ debit + " Cannot withdraw. "
                + "Given ammount: "+withdrawnFunds+ " exceeds balance.");
        }
    else if( withdrawnFunds > balance &&  (balance + debit)- withdrawnFunds >= 0)
            { balance = balance - withdrawnFunds;
           
            System.out.println(withdrawnFunds + " withdrawn from the account. The balance is now " + balance);
           
    
    }
    else {
    balance = balance - withdrawnFunds;
    System.out.println(withdrawnFunds + " withdrawn from the account. The balance is now " + balance);}
    return balance;

}}