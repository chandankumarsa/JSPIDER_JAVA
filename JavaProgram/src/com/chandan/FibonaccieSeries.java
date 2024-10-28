package com.chandan;

import java.util.Scanner;

public class FibonaccieSeries {
	public static void main(String[] args) {
		System.out.println("ENter the range");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a =0;
		int b =1;
		if(n>=1) {
			System.out.print(a +" ");
		}
		if(n>=2) {
			System.out.print(b+" ");
		}
		
		for(int i =2;i<n;i++) {
			int c = a+b;
			System.out.print(c+" ");
			
			a=b;
			b=c;
		}
}

}
