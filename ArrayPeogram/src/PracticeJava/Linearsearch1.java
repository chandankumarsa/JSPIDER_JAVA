package PracticeJava;

public class Linearsearch1 {
public static void main(String[] args) {
	int a[]= {5,9,7,58,6,3,4};
	int target =58;
	int res=linearsearch(a,target);
	if(res !=-1) {
		System.out.println("Element Found index no "+res);
	}else {
		System.out.println("element is not found");
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
