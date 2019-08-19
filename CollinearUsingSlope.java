/*  Purpose: To find Collinearity using Slope
 *  Author: Ravi maurya
 *  Date: 19/08/2019
 * 	
 */

package programs1;

import java.util.*;

public class CollinearUsingSlope {

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
		
		double slopeAB=findSlope(x1, x2, y1, y2);
		double slopeBC=findSlope(x2, x3, y2, y3);
		double slopeAC=findSlope(x1, x3, y1, y3);
		
		if(slopeAB==slopeBC && slopeBC==slopeAC && slopeAB==slopeAC) {
			
			return true;
		}
		else
			return false;
		
	}
	public static double findSlope(int x1,int x2,int y1, int y2) {
		
		double slope=(y2-y1)/(x2-x1);
		return slope;
		
	}

}
