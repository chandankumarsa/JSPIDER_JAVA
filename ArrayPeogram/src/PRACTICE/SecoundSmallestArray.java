package PRACTICE;

public class SecoundSmallestArray {
	public static void main(String[] args) {
		int a[]= {3,4,5,6,1,7};
		int smallest =a[0];
		int secsmallest=a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]==smallest)continue;
			if(a[i]<smallest) {
				secsmallest=smallest;
				smallest =a[i];
			}else if(a[i]<secsmallest||secsmallest==smallest) {
				secsmallest=a[i];
			}
		}
		System.out.println("Secound Smallest Element of An Array is "+secsmallest);
	}

}
