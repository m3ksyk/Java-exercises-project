/*
 *This is a NOT just the switch challenge exercise from Complete Java Masterclass
 it also  calculates interest via for loop with a given method 
*/
package main;

/**
 *
 * @author Mex
 */
public class Main {

  public static double calculateInterest(double amount, double interestRate){
  return (amount * (interestRate/100));
  }
  
    public static void main(String[] args) {

for(double interestRate = 2; interestRate<=8; interestRate++){

System.out.println("the rate is " +interestRate + " and the interest is " + 
        calculateInterest(10000.0, interestRate));
}

for(double interestRate = 8; interestRate>=2; interestRate--){

System.out.println("the rate is " +interestRate + " and the interest is " + 
        calculateInterest(10000.0, interestRate));

}











//        char switchVal = 'J';
//        switch(switchVal){
//            case 'A':
//                System.out.println("The letter is A");
//                break;
//            case 'B':
//                System.out.println("The letter is B");
//                break;
//            case 'C':
//                System.out.println("The letter is C");
//                break;
//                
//            case 'D':
//                System.out.println("The letter is D");
//                break;
//            case 'E':
//                System.out.println("The letter is E");
//                break;
//            default: 
//                System.out.println("The letter is not a,b,c,d,e");
//                break;
//        }
    }
    
}
