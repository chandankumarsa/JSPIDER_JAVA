package PracticeArrayJava27;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 5, 6, 8, 9, 5, 7, 5, 1, 2, 90 };
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[minIndex])
					minIndex = j;

			}
			int temp =a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
