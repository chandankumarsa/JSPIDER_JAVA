package PracticeJava;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter A String");
		String s = sc.nextLine();
		char y[] =s.toCharArray();
		int size =y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		 i=0;
		while(i!=size) {
			if(y[i]!=a[i]) {
				System.out.println("Not a Palindrome String");
				return;
			}
			else {
				i++;
				continue;
			}
		}
		System.out.println("Palindrome Strings");
	
	}

}