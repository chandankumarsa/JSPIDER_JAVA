package PRACTICE;

import java.util.Arrays;

public class bubble {
	public static void main(String[] args) {
		int a[]= {40,10,9,6,7,80,90};
		System.out.println("before sorting "+Arrays.toString(a));
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1-j;i++) {
				if(a[i]>a[i+1]) {
					int temp =a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println("Arrays After Sorting  "+Arrays.toString(a));
	}

}
