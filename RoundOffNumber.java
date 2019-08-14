/* *****************************************************************************
 *  Purpose: To Round Off the Given no.
 *
 *  @author  Sunny Maurya and Ravi maurya
 *  @version 1.0
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

public class RoundOff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be rounded off: ");
		double number = scanner.nextDouble();
		System.out.println("Enter the decimal place to be rounded off: ");
		double decimal = scanner.nextDouble();

		int roundNumber = (int) number;
//		
//		if(decimal==0)
//		{
		if ((number - roundNumber) >= 0.5) {
			roundNumber = roundNumber + 1;
			System.out.print("The rounded value is: ");
			System.out.println(roundNumber);
		} else {
			System.out.print("The rounded value is: ");
			System.out.println((int) number);
		}
//		}

		double num = (number * (Math.pow(10, decimal)));
		double a = (int) num;
		num = (a / (Math.pow(10, decimal)));
		if (decimal > 0) {
			if ((number - num) >= ((0.5) / (Math.pow(10, decimal)))) {
				
				num = num + (1 / (Math.pow(10, decimal)));
				num=(int)(num*(Math.pow(10, decimal)));
				num=num/(Math.pow(10, decimal));
				System.out.print("The rounded value upto " + (int) decimal + " places is: ");
				System.out.println(num);
			} 
			else {

				System.out.print("The rounded value upto " +(int) decimal + " places is: ");
				System.out.println(num);
			}
		}
		scanner.close();
	}
}
