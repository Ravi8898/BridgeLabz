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
}
