package programs1;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of input: ");
		int n=scanner.nextInt();
		int[] array1=new int[n];
		System.out.println("Enter the value of "+n+" array: ");
		for(int i=0;i<n;i++) {
			
			array1[i]=scanner.nextInt();
		}
		
		int[] sorted=genSort(array1,n);
		for(int i=0;i<n;i++) {
		
		System.out.print(sorted[i]+" ");
		}

	}
	
	public static int[] genSort(int[] input,int n) {
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(input[j]<input[i]) {
					int temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				
			}
		}
	}
		
		return input;
	

}
}
