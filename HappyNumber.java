/*  Purpose: get to know whether the Number is HappyNumber or not.
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.*;
import com.utility.*;
public class HappyNumber 
{

			public static void main(String[] args) 
			{
				int number;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter a number");
				number=scanner.nextInt();
				int originalNum=number;
				Utility utility=new Utility();
				int varifiedNum=utility.varifyNum(number);
				
				if(varifiedNum==1)
					System.out.println(originalNum+" is Happy Number");
				else
					System.out.println(originalNum+" is not Happy Number");
					scanner.close();
			}

}
