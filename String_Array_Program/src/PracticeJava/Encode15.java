package PracticeJava;

import java.util.Scanner;

public class Encode15 {
	public static void main(String[] args) {
		int k =13;
		System.out.println("Enter a String to Encode");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a[] =s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i =0;i<s.length();i++) {
			char c=a[i];
			if(c>='a'&& c<='z') {
				a[i]=letter[(c-'a'+k)%26];
			}
		}
		System.out.println(a);
	}

}
