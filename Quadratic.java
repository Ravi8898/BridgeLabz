/*  Purpose: To Determines the root of Quadratic Equation
 *
 *  @author  Ravi Maurya
 *  @version 1.0
 *  @since   06-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Co-ordinates of quadratic equation");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		float d=b*b-4*a*c;
		double root1=(-b+Math.sqrt(d))/(2*a);
		double root2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("Roots of Quadratic Equation is:"+root1+"and"+root2);
	}

}
