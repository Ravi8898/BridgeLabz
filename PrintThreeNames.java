package com.bridgelabz.functional;
import java.util.Scanner;
public class PrintThreeNames {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("java Print Three Names");
	String str=sc.nextLine();
	String s[]=new String[5];
			s=str.split(" ");
	System.out.print("Hi"+" ");
	for(int i=s.length-1;i>=0; i--)
	{
		System.out.print(s[i]+","+" ");
	} 
  }
}
