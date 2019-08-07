/*  Purpose: To Determines whether the year is leap year or not
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.BridgeLabz.functional;
import java.util.*;
public class LeapYear {
		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the year:");
			int Year=scanner.nextInt();
			if(Year>=1582)
			{
				if((Year%4==0 && Year%100!=0) || Year%400==0)
				{
					System.out.println("Year is a Leap Year");
				}
				else
					System.out.print("Year is not a Leap Year");
			}
				else
					System.out.print("Year is not a Leap Year");
			scanner.close();
		
		}

	}

