package Lec10;

import java.util.Scanner;

public class SwitchWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		switch(n) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("tueseday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		default:System.out.println("ENter Correct Inputs");
		}
		
	}

}
