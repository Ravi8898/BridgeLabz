/*  Purpose: To Find whether two given Strings are Anagram or not
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.*;
public class Anagram {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First String:");
		String firstStr=scanner.nextLine();
		String input1=firstStr.toLowerCase();
		String firstInput=input1.replace(" ", "");
		
		System.out.println("Enter the Second String:");
		String secondStr=scanner.nextLine();
		String input2=secondStr.toLowerCase();
		String secondInput=input2.replace(" ", "");
		
		int strSize1=firstInput.length();
		int strSize2=secondInput.length();
		int varifyAnam = 0;
		if(strSize1==strSize2)
		{
			for(int i=0; i<strSize1; i++)
			{
			
				for(int j=0; j<strSize2; j++)
				{
					if(firstInput.charAt(i)==secondInput.charAt(j))
					{
						varifyAnam++;
					}
				}
			}
			
		}
		
		if(varifyAnam==strSize1 && varifyAnam==strSize2)
			System.out.println("Both Strings are Anagram");
		
		else
			System.out.println("Both Strings are not Anagram");
		
		scanner.close();
		
	}

}
