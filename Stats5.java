/*  Purpose: Prints five uniform random values between 0 and 1,
			 their average value, and their minimum and maximum value. Use Math.random(),
			 Math.min(), and Math.max().
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.utility.*;
public class Stats5 {

	public static void main(String[] args) 
	{
		
		Utility utility=new Utility();
		double Average=utility.generateRandomNumber();
		System.out.println("Average of Random no is: "+Average);
	
	}

}
