package com.nov11;

public class BinarySearch {
	public static void main(String[] args) {
		int []a= {2,5,7,9,10,13,15,19};
		System.out.println(search(a,15));
		System.out.println(search(a,18));
	}
	public static int search(int[] a,int e) {
		int start=0;int end =a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(e==a[mid])return mid;
			else if(e<a[mid])end=mid-1;
			else start=mid+1;
		}
		return -1;
	}

}
