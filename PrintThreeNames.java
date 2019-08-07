/*  Purpose: Print the names in reverse order
		 *
		 *  @author  Ravi Maurya
		 *  @version 1.0
		 *  @since   06-08-2019
		 *
		 *****************************************************************************/
package com.BridgeLabz.functional;
import java.util.Scanner;
public class PrintThreeNames 
{

	public static void main(String[] args) 
	{		
			Scanner scanner=new Scanner(System.in);
			System.out.println("java Print Three Names");
			String string=scanner.nextLine();
			String string2[]=new String[5];
					string2=string.split(" ");
			System.out.print("Hi"+" ");
			for(int i=string2.length-1;i>0; i--)
			{
				System.out.print(string2[i]+","+ string2[0]);
			} 
			scanner.close();
	}
}
