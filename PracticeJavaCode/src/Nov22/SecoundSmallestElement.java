package Nov22;

public class SecoundSmallestElement {
	public static void main(String[] args) {
		int a[]= {12,1,5,2,65};
		int smallllest =a[0];
		int secsmallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]==smallllest)continue;
			if(a[i]<smallllest) {
				secsmallest=smallllest;
				smallllest=a[i];
			}else if(a[i]<secsmallest || secsmallest==smallllest) {
				secsmallest=a[i];
			}
		}
		System.out.println(secsmallest);
	}

}
