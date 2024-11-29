package PracticeArrayJava27;

public class secSmallest {
	public static void main(String[] args) {
		int a[] = { 10, 50, 3, 111, 69, 3, 555, 6 };
		int smallest = a[0];
		int secsmallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == smallest)
				continue;
			if (a[i] < smallest) {
				secsmallest = smallest;
				smallest = a[i];

			}else if(a[i]<=secsmallest||secsmallest==smallest) {
				secsmallest=a[i];
			}
		}
		System.out.println(secsmallest);
	}
}
