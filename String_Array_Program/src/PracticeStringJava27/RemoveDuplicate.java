package PracticeStringJava27;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s ="abcdabcdef";
		char []a=s.toCharArray();
		int n=a.length;
		char b[]=new char[n];
		int k=0;
		for(int i=0;i<n;i++) {
			boolean flag =false;
			for(int j=0;j<k;j++) {
				if(a[i]==b[j]) {
					flag =true;
					break;
				}
			}
			if(!flag) {
				b[k++]=a[i];
			}
		}
		System.out.println("String Without Duplicates");
		for(int i=0;i<k;i++) {
			System.out.print(b[i]);
		}
	}

}