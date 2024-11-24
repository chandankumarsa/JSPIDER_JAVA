package Nov22;

public class SecoundGratest {
	public static void main(String[] args) {
		int a[]= {12,1,5,2,65,69};
		int gratest =a[0];
		int secgratest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]==gratest)continue;
			if(a[i]>=gratest) {
				secgratest=gratest;
				gratest =a[i];
			}else if(a[i]>secgratest ||secgratest==gratest ) {
				secgratest=a[i];
			}
		}
		System.out.println(secgratest);
	}

}
