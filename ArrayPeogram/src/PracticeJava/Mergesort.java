package PracticeJava;

import java.util.Arrays;

public class Mergesort {
	public static void mergesort(int a[],int l,int r) {
		if(l<r) {
			int mid =(l+r)/2;
			mergesort(a,l,mid);
			mergesort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}
	private static void merge(int[] a, int l, int mid, int r) {
		int n1=mid-l+1;
		int n2=r-mid;
		int larr[]=new int[n1];
		int rarr[]=new int[n2];
		
		for(int x=0;x<n1;x++) {
			larr[x]=a[l+x];
		}
		for(int x=0;x<n2;x++) {
			rarr[x]=a[mid+1+x];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(larr[i]<=rarr[j]) {
				a[k]=larr[i];
				i++;
			}else {
				a[k]=rarr[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a[k]=larr[i];
			i++;k++;
		}
		while(j<n2) {
			a[k]=rarr[j];
			j++;k++;
		}
		
	}
	public static void main(String[] args) {
		int a[] = { 6, 3, 5, 4, 22, 2, 1 };
		System.out.println(Arrays.toString(a));
		mergesort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
