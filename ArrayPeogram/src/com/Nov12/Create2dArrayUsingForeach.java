package com.Nov12;

public class Create2dArrayUsingForeach {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] temp : a) {
			for (int n : temp) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
	}
}
