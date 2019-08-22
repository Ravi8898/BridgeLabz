package programs1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=scanner.nextInt();
		int N=(int)(Math.pow(2, n));
		System.out.println("Assume the number between 0 to "+(N-1));

		int binaryIndex=BinarySearching(0,N-1);
		System.out.println("The index of assumed no. is: "+binaryIndex);
		scanner.close();

	}
	
	public static int BinarySearching(int startIndex,int lastIndex) {
		
		int mid=((startIndex)+(lastIndex))/2;
		
		if(startIndex==mid)
			return lastIndex;
	
		System.out.println("Enter 1 if the value "
				+ "of assumed no is between "+startIndex+" and "+mid+" \n if not then enter 0 ");
		Scanner scanner=new Scanner(System.in);
		int varify=scanner.nextInt();
		
		if(varify==0) {

			startIndex=mid;
			
		}
		if(varify==1) {
			
			lastIndex=mid;

		}		
		return BinarySearching(startIndex,lastIndex);
		
}
}
