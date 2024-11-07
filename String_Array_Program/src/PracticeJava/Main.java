package PracticeJava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("ENter a String To Encode");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		int k =13;
		char letter[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char y[] =s.toCharArray();
		for(int i =0;i<y.length;i++) {
			char c =y[i];
			if(c>='a'&& c<='z') {
				y[i]=letter[(c-'a'+k)%26];
			}
		}
		System.out.println(y);
	}

}
