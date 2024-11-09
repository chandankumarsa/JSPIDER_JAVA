package com.Nov08;

public class SecoundSmallestElementProgram {
	public static void main(String[] args) {
		int []a= {6,8,3,31};
		int smallest =a[0];
		int secsmallest=a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]==smallest)continue;
			if(a[i]<smallest) {
				secsmallest=smallest;
				smallest=a[i];
			}else if(a[i]<secsmallest||smallest==secsmallest) {
				secsmallest=a[i];
			}
		}
		System.out.println(secsmallest);
	}

}
