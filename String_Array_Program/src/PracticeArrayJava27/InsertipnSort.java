package PracticeArrayJava27;

import java.util.Arrays;

public class InsertipnSort {
public static void main(String[] args) {
	int a[]= {6,5,8,9,9,95,21,93,5,2,69};
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
