package PracticeJava;

import java.util.Scanner;

public class Encode8 {
	public static void main(String[] args) {
		System.out.println("ENter A String");
		int k =13;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char y[]=s.toCharArray();
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		for(int i =0;i<y.length;i++) {
			char c =y[i];
			if(c>='a'&& c<='z') {
				y[i]=letter[(c-'a'+k)%26];
			}
		}
		System.out.println(y);
	}

}
