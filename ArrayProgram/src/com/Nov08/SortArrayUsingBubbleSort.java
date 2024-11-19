package com.Nov08;

import java.util.Arrays;

public class SortArrayUsingBubbleSort {
	public static void main(String[] args) {
		int[] a= {3,9,4,6,5,7,8};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void sort(int[]a) {
		for(int j =0;j<a.length-1;j++) {
			for(int i =0;i<a.length-1-j;i++) {
				if(a[i]>a[i+1]) {
					int temp =a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
	}

}
