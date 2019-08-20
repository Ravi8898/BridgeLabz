/* *****************************************************************************
 *  Purpose: Efficient way to find the prime factorization
 *
 *  @author  Sunny Maurya and Ravi maurya
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.*;

public class PrimeFactrorEfficient {
	
	public static void main (String[] args) 
    { 
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the number: ");
        int n=scanner.nextInt(); 
        primeFactors(n); 
        scanner.close();
    } 

	public static void primeFactors(int n) 
    { 
        
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
   
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        if (n > 2) 
            System.out.print(n); 
    } 
  
    
}
