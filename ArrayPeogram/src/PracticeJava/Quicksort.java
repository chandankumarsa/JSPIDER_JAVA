package PracticeJava;

import java.util.Arrays;

public class Quicksort {
	public static void quicksort(int a[],int start,int end) {
		if(start<end) {
			int pi=partition(a,start,end);
			quicksort(a,start,pi-1);
			quicksort(a,pi+1,end);			
		}
	}
	private static int partition(int[] a, int start, int end) {
		int pivot=a[end];
		int i=start-1;
		for(int j=start;j<end;j++) {
			if(a[j]<end) {
				i++;
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[end];
		a[end]=temp;
		return i+1;
	}
	public static void main(String[] args) {
		int a[]= {5,6,7,9,532};
		System.out.println(Arrays.toString(a));
		
	}

}
