/*  Purpose: To find the Collinearity using Area
 *  Author: Ravi maurya
 *  Date: 19/08/2019
 * 	
 */

package programs1;

import java.util.Scanner;

public class CollinearUsingArea {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the three points to check collinearity: ");
		System.out.print("x1=");
		int x1=scanner.nextInt();
		System.out.print("y1=");
		int y1=scanner.nextInt();
		System.out.print("x2=");
		int x2=scanner.nextInt();
		System.out.print("y2=");
		int y2=scanner.nextInt();
		System.out.print("x3=");
		int x3=scanner.nextInt();
		System.out.print("y3=");
		int y3=scanner.nextInt();
		boolean collinear=checkCollinear(x1,x2,x3,y1,y2,y3);
		System.out.println(collinear);
		scanner.close();

	}
	
	public static boolean checkCollinear(int x1,int x2,int x3,int y1,int y2,int y3) {
		
		int determinant=findDeterminant(x1,y1,x2,y2,x3,y3);
		double Area=(0.5)*(determinant);
		if(Area==0)
			return true;
		else
			return false;
	}
	public static int findDeterminant(int x1,int y1,int x2,int y2,int x3,int y3) {
		
		int ad=(x1-x2)*(y2-y3);
		int bc=(x2-x3)*(y1-y2);
		int determinant=ad-bc;
		return determinant;
		
	}

}
