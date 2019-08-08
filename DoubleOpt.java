/*  Purpose: Result of the given operations in double as a input
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) 
	{
		double a,b,c;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		a=scanner.nextDouble();
		System.out.println("Enter the value of b:");
		b=scanner.nextDouble();
		System.out.println("Enter the value of c:");
		c=scanner.nextDouble();
		
		System.out.println("Please select the operation which you want to perform \n 1. a+(b*c) \n 2. (a*b)+c \n 3. (a%b)+c");
		int select=scanner.nextInt();
		
		Utility utility=new Utility();
		if(select==1)
		{
			double Result=utility.doubleOperation1(a,b,c);
			System.out.println("Result of the operation is "+Result);
		}
		if(select==2)
		{
			double Result=utility.doubleOperation2(a,b,c);
			System.out.println("Result of the operation is "+Result);
		}
		if(select==3)
		{
			double Result=utility.doubleOperation3(a,b,c);
			System.out.println("Result of the operation is "+Result);
		}
		scanner.close();		
	}
}
