package PracticeArrayJava27;

public class SmallestElementOfAnArray {
	public static void main(String[] args) {
		int a[]= {5,6,7,8,9,4,0,2};
		int smallest =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest =a[i];
			}
		}
		System.out.println(smallest);
	}

}
