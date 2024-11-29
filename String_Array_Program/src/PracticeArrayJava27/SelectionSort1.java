package PracticeArrayJava27;

import java.util.Arrays;

public class SelectionSort1 {
	public static void main(String[] args) {
		int a[] = { 6, 8, 9, 7, 5, 6, 2 };
		for(int i=0;i<a.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minindex])minindex=j;
			}
			int temp =a[minindex];
			a[minindex]=a[i];
			a[i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
