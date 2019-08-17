package programs1;
import java.util.*;
public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scanner.nextInt();
		int originalNum=num;
		int prime=PrimeFactor.getPrimeFactor(num);
//		System.out.println(prime);
		System.out.println("is Prime Factor of "+originalNum);
		scanner.close();
	}
	
	
	public static int getPrimeFactor(int number)
	{
		while(number!=1)
		{
			
			for(int i=2; i<=number; i++)
			{
				int count=0;
				
				for(int j=2; j<=number; j++)
				{
					if(i%j==0) 
					{
						count++;
					}
				}
				if(count==1) {
					if(number%i==0) {
						number=number/i;
						System.out.print(i+" ");
					}
				}
			}
		}
		return number;
	}
}
