/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }
    
    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
     
        }
        return false;
    
    }
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        
        return false;
    }
     private Branch findBranch(String branchName) {
    for(int i=0 ; i<this.branches.size() ; i++){
        Branch checkedBranch = this.branches.get(i);
        if(this.branches.get(i).getName().equals(branchName)){
            return checkedBranch;
            }
        }    
    return null;
    }
     
     public boolean listCustomers(String branchName, boolean showTransactions){
     Branch branch = findBranch(branchName);
     if(branch != null){
         System.out.println("customers in the branch" + branch.getName());
         
         ArrayList<Customer> branchCustomers = branch.getCustomers();
         for(int i=0; i<branchCustomers.size();i++){
         Customer branchCustomer = branchCustomers.get(i);
             System.out.println("Customer: " + branchCustomer.getName() + " # " + i);
             if(showTransactions){
                 System.out.println("transactions");
                 ArrayList<Double> transactions = branchCustomer.getTransactions();
                 for(int j=0; j<transactions.size(); j++){
                     System.out.println("# " + (j+1) + " amount is " + transactions.get(j));
                 }
             }
         }
         return true;
     } else 
     {return false;}
     }
     
     
     
     
     
     
     
}
