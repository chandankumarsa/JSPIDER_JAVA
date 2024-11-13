package PracticeJava;

import java.util.Arrays;

public class INSERTION {
public static void main(String[] args) {
	int a[]= {6,2,5,4,89,11,1};
	for(int i=1;i<a.length;i++) {
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
