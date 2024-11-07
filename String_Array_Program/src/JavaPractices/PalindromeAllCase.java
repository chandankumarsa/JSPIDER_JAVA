package JavaPractices;

import java.util.Scanner;

public class PalindromeAllCase {
public static void main(String[] args) {
	System.out.println("Enter A String");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	s=s.replace(" ", "").toUpperCase();
	char y[]=s.toCharArray();
	int size = y.length;
	char a[]= new char[size];
	int i =0;
	while(i!=size) {
		a[size-1-i]=y[i];
		i++;
	}
	i =0;
	while(i!=size) {
		if(a[i]!=y[i]) {
			System.out.println("is not a Palindrome");
			return;
		}else {
			i++;
			continue;
		}
	}
	System.out.println("is a Palindrome Strings");
}
}
