package PracticeJava;

import java.util.Scanner;

public class Encode {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s ="jsp";
	int k =13;
	char[]a=s.toCharArray();
	char[]letters="abcdefghijklmnopqrstuvwxyz".toCharArray();
	for(int i =0;i<a.length;i++) {
		char c=a[i];
		if(c>='a'&&c<='z') {
			a[i]=letters[(c-'a'+k)%26];
		}
	}
//	String encodedstr=new String(a);
	System.out.println(a);
}
}
