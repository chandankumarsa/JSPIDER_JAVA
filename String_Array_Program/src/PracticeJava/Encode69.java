package PracticeJava;

import java.util.Scanner;

public class Encode69 {
	public static void main(String[] args) {
		System.out.println("ENter a String");
		int k =13;
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		char y[]=s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i=0;i<y.length;i++) {
			char ch =y[i];
			if(ch<='a'&&ch>='z') {
				y[i]=letter[(ch-'a'+k)%26];
			}
		}
		System.out.println(y);
	}

}
