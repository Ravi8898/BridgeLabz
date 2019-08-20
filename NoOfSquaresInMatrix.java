/* *****************************************************************************
 *  Purpose: Find the no of Squares in m*n matrix
 *
 *  @author  Sunny Maurya and Ravi maurya
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

public class NoOfSquaresInMatrix {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of m: ");
		int m=scanner.nextInt();
		System.out.println("Enter the value of n: ");
		int n=scanner.nextInt();
		System.out.print("No of Squares in "+m+"*"+n+" matrix are: ");
		int count=countSquares(m,n,sum);
		System.out.println(count);
		scanner.close();
		
	}
	
	public static int countSquares(int m,int n,int sum) {
		
		if(n==0 || m==0) 
		return sum;
		
		sum=sum+(m*n);
		return countSquares(m-1,n-1,sum);
	}

}
