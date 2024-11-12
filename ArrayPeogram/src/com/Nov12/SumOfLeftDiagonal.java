package com.Nov12;

public class SumOfLeftDiagonal {
public static void main(String[] args) {
	int [][]a= {
			{1,2,3},
			{4,5,6},
			{7,8,9}			
	};
	int len =a.length;
	int sum=0;
	for(int i=0;i<len;i++) {
		sum+=a[i][i];
	}
	System.out.println(sum);
}
}

//"Write a Java program to find the sum of the left diagonal (anti-diagonal) elements of a 3x3 matrix."

