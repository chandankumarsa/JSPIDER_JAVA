package PracticeProgramJava;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {56,3,2,8,69,3,8,89,9,6};
		System.out.println(Arrays.toString(a));
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1-j;i++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
