package com.Nov08;

import java.util.Arrays;

public class Rotate {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		int len = a.length;
		int temp = a[len - 1];  // Store the last element temporarily

		// Shift each element to the right, starting from the second-to-last element
		for (int i = len - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;  // Place the last element at the start

		System.out.println(Arrays.toString(a));
	}
}


//rotates an integer array by one position to the right