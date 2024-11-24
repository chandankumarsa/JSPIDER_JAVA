package Nov22;

public class SmallestElementOfAnrray {
	public static void main(String[] args) {
		int a[]= {12,1,5,2,65};
		int smallest =a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(smallest);
	}

}
