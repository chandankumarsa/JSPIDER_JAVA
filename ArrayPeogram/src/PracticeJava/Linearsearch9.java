package PracticeJava;

public class Linearsearch9 {
public static void main(String[] args) {
	int a[]= {6,8,7,96,56};
	int target =99;
	int res =linearsearch(a,target);
	if(res!=-1) {
		System.out.println("Element found at index"+res);
	}else {
		System.out.println("Element is not found ");
	}
}

private static int linearsearch(int[] a, int target) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==target) {
			return i;
		}
	}
	return -1;
}
}
