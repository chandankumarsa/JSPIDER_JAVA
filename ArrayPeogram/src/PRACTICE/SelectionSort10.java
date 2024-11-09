package PRACTICE;

import java.util.Arrays;

public class SelectionSort10 {
public static void main(String[] args) {
	int a[]= {10,5,9,18};
	for(int i=0;i<a.length-1;i++) {
		int minIndex=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[minIndex]) {
				minIndex=j;
			}
		}
		int temp =a[minIndex];
		a[minIndex]=a[i];
		a[i]=temp;
	}
	System.out.println(Arrays.toString(a));
}
}
