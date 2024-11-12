package com.nov11;

public class LinearSearchByMe {
public static void main(String[] args) {
	int num[]= {5,11,6,7,9};
	int target=6;
	int res=linearsearch(num,target);
	if(res!=-1) {
		System.out.println("Element found at index "+res);
	}else {
		System.out.println("Element not found");
	}
}


public static int linearsearch(int[] num, int target) {
	for(int i=0;i<num.length;i++) {
		if(num[i]==target) {
			return i;
		}
	}
	return -1;
}
}
