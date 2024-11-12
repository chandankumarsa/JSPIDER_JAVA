package PracticeJava;

public class Linearsearch {
	public static void main(String[] args) {
		int a[]= {65,8,2,4,6,5,9,3,96};
		int target=6;
		int res =linearsearch(a,target);
		if(res!=-1) {
			System.out.println("Index"+res);
		}else {
			System.out.println("Element not found");
		}
		
	}

	private static int linearsearch(int[] a, int target) {
		for(int i =0;i<a.length;i++) {
			if(a[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
