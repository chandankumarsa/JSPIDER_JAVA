package PracticeJava;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		System.out.println("Enter a Strings");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char y[] = s.toCharArray();
		int size = y.length;
		char a[] =new char[size];
		int i =0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		System.out.print ("Reverse String is ");
		System.out.println(a);
		
	}

}
