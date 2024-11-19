package com.Nov08;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {6,9,8,7,5,4,3,79,1};
		for(int i=0;i<a.length;i++) {
			int key=a[i];
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
