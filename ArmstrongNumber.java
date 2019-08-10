/*  Purpose: Find whether no is Armstrong number is not
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int number, originalNum, numSize, rem=0, sum=0;
		System.out.println("Enter the no. to check Armstrong no.: ");
		String string=new String();
		string=scanner.nextLine();
		numSize=string.length();
		number=Integer.parseInt(string);
		originalNum=number;
		while(number!=0)
		{
			rem=number%10;
			sum=sum+(int)(Math.pow(rem, numSize));
			number=number/10;
		}
		if(sum==originalNum)
		
			System.out.println("The "+originalNum+" is Armstrong number");
		else
			System.out.println("The "+originalNum+" is not Armstrong number");
		scanner.close();
	}

}
