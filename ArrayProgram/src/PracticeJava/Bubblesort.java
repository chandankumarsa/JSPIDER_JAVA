package PracticeJava;

import java.util.Arrays;

import com.Nov09.Main;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {6,9,7,8,5,2};
		System.out.println(Arrays.toString(a));
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1-j;i++) {
				if(a[i]>a[i+1]) {
					int temp =a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
