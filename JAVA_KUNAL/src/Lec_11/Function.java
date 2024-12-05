package Lec_11;

import java.util.Scanner;

public class Function {
	public static void main(String[] args) {
		sumNum();
		sumNum();
		
	}
	static void sumNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter The Secound Number");
		int b = sc.nextInt();
		int sum =a+b;
		System.out.println("Sum Of Two Number Is : " + sum);
		
	}

}
