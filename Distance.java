package com.bridgelabz.functional;
import java.util.*;
public class Distance 
{
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of x:");
		int x=sc.nextInt();
		System.out.println("Enter Value of y:");
		int y=sc.nextInt();
		double a=Math.pow(x, 2);
		double b=Math.pow(y, 2);
		double d=Math.sqrt(a+b);
		System.out.println("Euclidean Diatance is:"+d);
		}
}
