package PracticeJava;

import java.util.Scanner;

public class Encode5 {
public static void main(String[] args) {
	System.out.println("Enter A  String");
	int k =13;
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
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
