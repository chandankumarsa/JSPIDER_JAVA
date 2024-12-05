package Lec_9;

import java.util.Scanner;

public class PrintNumber1_To_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=0;i<=n;i++) {
//			System.out.print(i+"     ");
//		}

		// convert to while loop
		int n = sc.nextInt();
		int i = 0;
		while (i <= n) {
			System.out.println(i);
			i++;
		}

	}

}
