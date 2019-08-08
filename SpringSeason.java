/*  Purpose: get to know wheather the given month and date is in spring season or not
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.*;
import com.utility.*;
public class SpringSeason {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int month,day;
		System.out.println("Enter the Month:");
		month=scanner.nextInt();
		System.out.println("Enter the Day:");
		day=scanner.nextInt();
		Utility utility=new Utility();
		boolean season=Utility.springseason(month, day);
		System.out.println(season);
		if(season==true)
		{
			System.out.println("The "+day+"/"+month+" is spring season");
		}
		else
		{
			System.out.println("The "+day+"/"+month+" is not spring season");
		}
		scanner.close();
	}
}
