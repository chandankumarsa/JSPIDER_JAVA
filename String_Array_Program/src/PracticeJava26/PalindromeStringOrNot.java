package PracticeJava26;

public class PalindromeStringOrNot {
	public static void main(String[] args) {
		String s ="aaa";
		char y[]=s.toCharArray();
		int size =y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(a[i]!=y[i]) {
				System.out.println("Not a Palindrome String");
				return;
			}else {
				i++;
				continue;
			}
		}
		
		System.out.println("Palindrome String");
	}

}
