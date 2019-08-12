/* *****************************************************************************
 *  Purpose: To Find whether two given Strings are Anagram or not
 *
 *  @author  Sunny Maurya and Ravi maurya
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;
import com.utility.*;
public class AnagramNew {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String str1=scanner.nextLine();
		System.out.println("Enter the 2nd String");
		String str2=scanner.nextLine();
		Utility utility=new Utility();
		boolean b=utility.checkAnagram(str1,str2);
		if(b==true)
		{
			System.out.println("Both strings are Anagram");
		}
		else
			System.out.println("Both strings are not Anagram");
		scanner.close();
	}
}
