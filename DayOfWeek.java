package programs1;

import java.util.Scanner;

public class dayodweek {
	
	public int dayofWeek(int d, int y,int m) {
		
		int y0 = y -(14-m)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 *((14-m)/12)-2;
		int d0 = (d + x + 31 * m0 /12)% 7;
		return d0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize veriable
        int jan = 0;
		int d, d0 =0;
		int m;
		int y;
		Scanner sc = new Scanner(System.in);// taking input using scanner
		System.out.println("Enter Day :");
		d= sc.nextInt();
		System.out.println("Enter Month :");
		m = sc.nextInt();
		System.out.println("Enter Year :");
		y = sc.nextInt();
		dayodweek Dow = new dayodweek();// create object to call function
		d0=Dow.dayofWeek(d, y, m);
	
//			if(d0 == 0) {
//			System.out.println("sunday");
//		}
//		else if(d0 == 1) {
//			System.out.println("Monday");
//			
//		}
//		else if(d0 == 2) {
//			System.out.println("Tuesday");
//		}
//		else if(d0 == 3) {
//			System.out.println("wednesday");
//		}
//		else if(d0 == 4) {
//			System.out.println("Thusday");
//		}
//		else if(d0 == 5) {
//			System.out.println("Friday");
//		}
//		else if(d0 == 6) {
//			System.out.println("saturday");
//		}
		
		switch(d0) {
		
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		}
			sc.close();
	}
     

	
}
