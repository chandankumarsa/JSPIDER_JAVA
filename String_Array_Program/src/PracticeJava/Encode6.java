package PracticeJava;

import java.util.Scanner;

public class Encode6 {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k =13;
		char a[]=s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i =0;i<a.length;i++) {
			char c=a[i];
			if(c>='a'&& c<='z') {
				a[i]=letter[(c-'a'+k)%26];
			}
		}
		System.out.println(a);
		
	}

}
