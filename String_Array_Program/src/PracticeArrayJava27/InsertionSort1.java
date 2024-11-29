package PracticeArrayJava27;

import java.util.Arrays;

public class InsertionSort1 {
	public static void main(String[] args) {
		int a[] = { 6, 8, 9, 7, 5, 6, 2 };
		for(int i=0;i<a.length;i++) {
			int key =a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
