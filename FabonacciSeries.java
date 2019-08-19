/*  Purpose: To find the Fabonacci Series
 *  Author: Ravi maurya
 *  Date: 19/08/2019
 * 	
 */
package programs1;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int temp,n,a=0,b=1;
		System.out.println("Enter the number of Iteration: ");
		n=scanner.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=0;i<n;i++) {
//			
//			temp=b;
//			b=a+b;
//			a=temp;
			
			b=a+b;
			a=b-a;
			System.out.print(b+" ");
			
		}

	}

}
