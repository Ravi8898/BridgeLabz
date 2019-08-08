/*  Purpose: Utility for logic programs
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.utility;
public class Utility 
{
	/**
	 * 
	 * @param   min
	 * @param   max
	 * @return  Dice1
	 */
	public static int getRandomNumberDice1(int min, int max)
	{
		int Dice1 = (int)(Math.random()*((max-min)+1))+min;
		return Dice1;
	}
	
	/**
	 * @param   min
	 * @param   max
	 * @return  Dice2
	 */
	public static int getRandomNumberDice2(int min, int max)
	{
		int Dice2 = (int)(Math.random()*((max-min)+1))+min;
		return Dice2;
	}
	
	/**
	 * @param 		int			month
	 * @param 		int			day
	 * @return		boolean		true or false
	 */
	public static boolean springseason(int month,int day)
	{
		switch(month)
		{
		case 3:
			if(day>=20 && day<32)
			{
				return true;
			}
		case 4:
			if(day>0 && day<31)
			{
				return true;
			}
		case 5:
			if(day>0 && day<32)
			{
				return true;
			}
		case 6:
			if(day>0 && day<21)
			{
				return true;
			}
		default: 
			return false;
				
		}
	}
}
