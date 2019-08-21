package programs1;
//
import java.util.Scanner;
//
public class MaxCharCount {
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String	string=scanner.nextLine();
		string=string.toLowerCase();
		string=string.replace(" ","");
		int counting=getMaxNumber(string);
	//	System.out.println(counting);
		scanner.close();

	}
	
	public static int getMaxNumber(String string) {
		
		int count=0;
		int[] character=new int[26];
		char[] a=new char[26];
		for(int i=0;i<string.length();i++) {
			character[string.charAt(i)-97]++;
		}
		char name;
		for(int i=0;i<string.length();i++) {
			int found=0;
		name=string.charAt(i);
		count=character[string.charAt(i)-97];
		for(int j=0;j<=i;j++) {
			if(string.charAt(i)==string.charAt(j))
				found++;
		
		}
		if(found==1) {
			a[string.charAt(i)-97]=string.charAt(i);
			System.out.println(name+"="+count);
		}
		}
		
		int temp=character[0];
		for(int i=0;i<character.length;i++) {
		if(temp<character[i]) {
			temp=character[i];
		}
		if(temp==character[i]) {
			System.out.println("max time occur: "+a[i]+"="+temp);
		}
		
		}
		return count;
		
