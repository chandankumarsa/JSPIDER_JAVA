package com.Nov09;
import java.util.Arrays;

public class Main {
	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(arr, l, mid); // 351
			mergeSort(arr, mid + 1, r); // 462
			merge(arr, l, mid, r);
		}
	}
	public static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int lArr[] = new int[n1];
		int rArr[] = new int[n2];
		
		// Copy values to lArr and rArr
		for (int x = 0; x < n1; x++) {
			lArr[x] = arr[l + x];
		}
		for (int x = 0; x < n2; x++) {
			rArr[x] = arr[mid + 1 + x];
		}
		
		int i = 0, j = 0, k = l;
		
		// Merge lArr and rArr into arr
		while (i < n1 && j < n2) {
			if (lArr[i] <= rArr[j]) {
				arr[k] = lArr[i];
				i++;
			} else {
				arr[k] = rArr[j];
				j++;
			}
			k++;
		}
		
		// Copy any remaining elements of lArr
		while (i < n1) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		
		// Copy any remaining elements of rArr
		while (j < n2) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int arr[] = {3, 5, 1, 4, 6, 2};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length - 1); 
		System.out.println("Array After Merge Sort");
		System.out.println(Arrays.toString(arr));
	}
}
//marge sort