package PracticeJava;

public class SmallestElementOfAnArray {
	public static void main(String[] args) {
		int a[]= {6,9,7,8,5,21};
		int smallest =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest =a[i];
			}
		}
		System.out.println(smallest);
	}

}
