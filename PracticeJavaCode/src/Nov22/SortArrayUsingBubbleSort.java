package Nov22;

import java.util.Arrays;

public class SortArrayUsingBubbleSort {
	public static void main(String[] args) {
		int a[] = { 12, 1, 5, 2, 65 };
		System.out.println(Arrays.toString(a));
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = 0; i < a.length - 1 - j; i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
			
			}

		}
		System.out.println(Arrays.toString(a));
	}

}
