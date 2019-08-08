package com.bridgelabz.functional;
import java.util.*;
import com.utility.*;
public class IntOpt {

	public static void main(String[] args)
	{
		int a,b,c,select;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		a=scanner.nextInt();
		System.out.println("Enter the value of b:");
		b=scanner.nextInt();
		System.out.println("Enter the value of c:");
		c=scanner.nextInt();
		
		System.out.println("Please select the operation which you want to perform \n 1. a+(b*c) \n 2. (a*b)+c \n 3. (a%b)+c");
		select=scanner.nextInt();
    
		Utility utility=new Utility();
		if(select==1)
		{
			int Result=utility.integerOperation1(a,b,c);
			System.out.println("Result of the operation is "+Result);
		}
		if(select==2)
		{
			int Result=utility.integerOperation2(a,b,c);
			System.out.println("Result of the operation is "+Result);
		}
		if(select==3)
		{
			int Result=utility.integerOperation3(a,b,c);
			System.out.println("Result of the operation is "+Result);
		}
		scanner.close();
		
	}
}
