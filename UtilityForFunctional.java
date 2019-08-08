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
	
	
	/**
	 * @param 		int		a
	 * @param 		int		b
	 * @param 		int		c
	 * @return		int		operation
	 */
	public int integerOperation1(int a,int b, int c)
	{
		int operation=a+(b*c);
		return operation;
	}
	public int integerOperation2(int a,int b, int c)
	{
		int operation=(a*b)+c;
		return operation;
	}
	public int integerOperation3(int a,int b, int c)
	{
		int operation=(a%b)+c;
		return operation;
	}
	
	
	/**
	 * @param 		double	a
	 * @param 		double	b
	 * @param 		double	c
	 * @return		double	operation
	 */
	public double doubleOperation1(double a,double b, double c)
	{
		double operation=a+(b*c);
		return operation;
	}
	public double doubleOperation2(double a,double b, double c)
	{
		double operation=(a*b)+c;
		return operation;
	}
	public double doubleOperation3(double a,double b, double c)
	{
		double operation=(a%b)+c;
		return operation;
	}
}

