package com.chandan;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0) {
			System.out.println(n+ "is Zero");
		}else if(n<0) {
			System.out.println("Negative Number");
		}
		else if(n%2==0) {
			System.out.println(n+" is Even Number");
		}
		else if(n%2!=0) {
			System.out.println(n+"is odd");
		}
	}

}


//write a java program to Check Given Number Is 0 or Even or Odd