package programs1;

import java.util.Scanner;

public class stopwatch_v {

		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter start to start stopwatch:");
			String startime= sc.next();
			
			//used to get current start time 
			long starttime = System.currentTimeMillis(); 
			Scanner sc1= new Scanner(System.in);
			
			System.out.println("Enter end to end stopwatch:");
			String endtime= sc1.next();
			
			//used to get current end time
			long endtime1 = System.currentTimeMillis();
			
			//formula to calculate Elapsed time
			double time= (endtime1 - starttime)/1000.0;//Convert milliseconds to seconds
			
			System.out.println("Elapsed Time: "+time);
	}

}
