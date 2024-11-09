package PRACTICE;

public class SmallestElementsOfAnArray {
	public static void main(String[] args) {
		int a[]= {10,2,3,4,5,6};
		int smallest=a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("smallest Elements of an array is : "+smallest);
	}

}
