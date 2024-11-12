package com.nov11;

public class LinearSearchByRavishSir {
	public static void main(String[] args) {
		int a[]= {3,7,4,8,1,9,23,4};
		System.out.println(search(a,23));
		System.out.println(search(a,10));
		
	}

	 static int search(int[]a,int e) {
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==e)return i;
		 }
		 return -1;
	}

}
