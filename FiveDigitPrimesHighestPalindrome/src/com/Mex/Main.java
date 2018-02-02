package com.Mex;

/**
 * The task: Write a program that returns the largest number-palindrome,
 * which is the product of two prime five-digit numbers and returns
 * the multipliers themselves
 *
 * @author kSzymanski
 */

public class Main {
    /**
     * Main method
     *
     */
    public static void main(String[] args) {

        int i, j, maxProduct = 0;

/**
*this loop checks the numbers and prints result
* if we want the program to find the result in the least amount of loops
*the program will find the correct result faster if we set a smaller limit (like 90000-99999 instead of 10000-99999
*/
        for (i = 90000; i <=99999 ; i++) {
            for (j =90000 ; j <=99999 ; j++) {
                    if (isPrime(i) && isPrime(j)) {
                        int product = i * j;

                        if ((isPalindrome(product)) && (product > maxProduct)) {
                            maxProduct = product;
                            System.out.println(" i= " + i + " j= " + j);
                            System.out.println("Result: " + maxProduct);
                        }
                    }
            }
        }
    }
    /**
     * Checks if i is prime
     *
     * @param i
     * @return boolean
     */
   public static boolean isPrime (int i){
       if (i%2==0) return false;
       for(int n=3;n*n<=i;n+=2) {
           if(i%n==0)
               return false;
       }
       return true;
   }

    /**
     * Checks if product is palindrome.
     *
     * @param product
     * @return boolean
     */
    public static boolean isPalindrome(long product){
        String productString = Long.toString(product);
        String reversedProductString = new StringBuffer(productString).reverse().toString();

        if (productString.equals(reversedProductString)) return true;
        else return false;
    }
}