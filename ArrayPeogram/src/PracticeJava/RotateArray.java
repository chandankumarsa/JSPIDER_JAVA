package PracticeJava;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int len =a.length;
		int temp=a[len-1];
		for(int i=len-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}

}
