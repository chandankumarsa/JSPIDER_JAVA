package PracticeJava;

public class SmallestElement {
	public static void main(String[] args) {
		int a[]= {5,8,7,6,69};
		int smallest =a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest =a[i];
			}
		}
		System.out.println(smallest);
	}

}
