/*  Purpose: To find the Max and Min value of Array
 *  Author: Ravi maurya
 *  Date: 19/08/2019
 * 	
 */

package programs1;

import java.util.*;

public class MinAndMaxOfArrayString {		

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of Array: ");
		int n=scanner.nextInt();
		int[] ArrayIn=new int[n];
		System.out.println("Enter the Array elements: ");
		
		for(int i=0;i<n;i++) {
			
			ArrayIn[i]=scanner.nextInt();		
		}
		
		int MaxValue=MinAndMaxOfArrayString.getMaxValue(ArrayIn, n);
		int MinValue=MinAndMaxOfArrayString.getMinValue(ArrayIn, n);
		System.out.println("Maximum Value from array is: " +MaxValue);
		System.out.println("Minimum Value from array is: " +MinValue);
		scanner.close();

		
	}
	
	public static int getMinValue(int Array[],int n) {
		
		int result=Array[0];
		for(int i=1;i<n;i++) {
		result=Math.min(Array[i], result);
		}
		return result;
	}
	
	public static int getMaxValue(int Array[],int n) {
		
		int result=Array[0];
		for(int i=1;i<n;i++) {
		result=Math.max(Array[i], result);
		}
		return result;
	}

}
