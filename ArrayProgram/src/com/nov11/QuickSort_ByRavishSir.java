package com.nov11;
import java.util.Arrays;
public class QuickSort_ByRavishSir {
	public static void main(String[] args) {
		int a[] = {7, 4, 9, 1, 69};
		System.out.println(Arrays.toString(a));
		sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a, int start, int end) {
		if (start >= end) return;

		int pivot = a[(start + end) / 2];
		int i = start;
		int j = end;

		while (i <= j) {
			// Find the first element greater than the pivot from the left
			while (a[i] < pivot) i++;
			// Find the first element smaller than the pivot from the right
			while (a[j] > pivot) j--;

			if (i <= j) {
				// Swap elements on the wrong side of the pivot
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}

		// Recursively sort the partitions
		sort(a, start, j);
		sort(a, i, end);
	}
}
 