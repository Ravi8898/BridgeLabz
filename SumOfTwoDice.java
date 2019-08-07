/*  Purpose: To get Sum of Two Dice
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bootcamp.functional;
import java.util.*;
import com.utility.*;
public class SumOfTwoDice {

	public static void main(String[] args) 
	{
				Utility utility=new Utility();
				int Dice1=Utility.getRandomNumberDice1(1,6);
				int Dice2=Utility.getRandomNumberDice2(1,6);
				System.out.println("The Value of Dice1 is:"+Dice1);
				System.out.println("The Value of Dice2 is:"+Dice2);
				int sum=Dice1+Dice2;
				if (sum<7) {
					System.out.println("Sum of the dice is:"+sum);
				}
				else {
					System.out.println("Sum of dice is gretaer than 6");
				}
			}
		}
