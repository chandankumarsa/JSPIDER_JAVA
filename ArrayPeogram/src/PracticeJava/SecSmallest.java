package PracticeJava;

public class SecSmallest {
	public static void main(String[] args) {
		int a[]= {6,3,5,4,13,21};
		int smallest =a[0];
		int secSmallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==smallest)continue;
			if(a[i]<smallest) {
				secSmallest=smallest;
				smallest=a[i];
			}else if(a[i]<secSmallest||secSmallest==smallest) {
				secSmallest=a[i];
			}
		}
		System.out.println(secSmallest);
	}

}
