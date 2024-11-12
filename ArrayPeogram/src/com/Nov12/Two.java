package com.Nov12;

public class Two {
	public static void main(String[] args) {
		int [][] a= {
				{1,2,3},
				{3,2,1},
				{2,2,1}
		};
		int[][] b= {
				{2,1,1},
				{3,2,1},
				{1,1,2}
		};
		int [][] c=multilpy(a,b);
		for(int [] temp:c) {
			for(int n:temp) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

	 static int[][] multilpy(int[][] a, int[][] b) {
		 int len =a.length;
		 int[][]c=new int[len][len];
		 for(int i=0;i<len;i++) {
			 for(int j=0;j<len;j++) {
				 for(int k=0;k<len;k++) {
					 c[i][j]+=a[i][k]*b[k][j];
				 }
			 }
		 }
		 return c;
	}

}

//Write a Java program to perform matrix multiplication of two 3x3 matrices
