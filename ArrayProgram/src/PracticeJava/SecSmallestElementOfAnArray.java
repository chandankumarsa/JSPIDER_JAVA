package PracticeJava;

public class SecSmallestElementOfAnArray {
public static void main(String[] args) {
	int a[]= {6,9,3,7,8,50,2};
	int smallest =a[0];
	int secsmallest=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]==smallest)continue;
		if(a[i]<smallest) {
			secsmallest=smallest;
			smallest=a[i];
		}else if(a[i]<secsmallest && smallest ==secsmallest) {
			secsmallest=a[i];
		}
	}
	System.out.println(secsmallest);
}
}
