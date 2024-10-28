package com.chandan;

import java.util.Scanner;

public class DaysInMonth {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the Year and Months");
	int year = sc.nextInt();
	int month = sc.nextInt();
	switch(month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("31 Days");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("30 days");
	break;
	case 2:
		if((year %4==0 && year %100!=0)|| (year %400 ==0)) {
			System.out.println("29 Days");
		}else {
			System.out.println("28 Days");
		}
		break;
	}
	
}
}

/*Write a Java program that prompts the user to input a year and a month,
  then outputs the number of days in that month, considering leap years for February.
*/