package Practice;

import java.util.Scanner;

public class Pal {
	public static void main(String[] args) {
		System.out.println("ENter the String To check palindrome ");
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		char y[]=s.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		int i =0;
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
