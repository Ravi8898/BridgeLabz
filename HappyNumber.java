package com.bridgelabz.functional;
import java.util.*;
public class HappyNumber {

	public static void main(String[] args) 
	{
		int secondDigit=0,number,lastDigit,firstDigit;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		number=scanner.nextInt();
		int originalNum=number;
		while(number!=1 && number!=4 && number!=25 && number!=145)
		{
			
			lastDigit=number%10;
			firstDigit=number/10;
			if(firstDigit>=10)
			{
				secondDigit=firstDigit%10;
				firstDigit=firstDigit/10;
			}
			
			number=((firstDigit*firstDigit)+(secondDigit*secondDigit)+(lastDigit*lastDigit));
			
		}
		if(number==1)
			System.out.println(originalNum+" is Happy Number");
		else
			System.out.println(originalNum+" is not Happy Number");
			scanner.close();
	}

}
