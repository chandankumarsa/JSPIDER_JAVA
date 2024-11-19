package PracticeJava;

import java.util.Arrays;

public class QuickSort {
	public static void quicksort(int a[],int start,int end) {
		if(start<end) {
			int pi =partition(a,start,end);
			quicksort(a,start,pi-1);
			quicksort(a,pi+1,start);
		}
	}
	private static int partition(int[] a, int start, int end) {
		int pivot =a[end];
		int i=start-1;
		for(int j=start;j<end;j++) {
			if(a[j]<pivot) {
				i++;
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp =a[i+1];
		a[i+1]=a[end];
		a[end]=temp;
		return i+1;
	}
	public static void main(String[] args) {
		int a[]= {9,6,7,5,1,4,2};
		System.out.println(Arrays.toString(a));
		quicksort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
