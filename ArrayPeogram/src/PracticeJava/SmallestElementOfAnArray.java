package PracticeJava;

import java.util.Arrays;

public class SmallestElementOfAnArray {
	public static void main(String[] args) {
		int a[]= {6,3,5,4,13,21};
		int smallest =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(smallest);
	}

}
