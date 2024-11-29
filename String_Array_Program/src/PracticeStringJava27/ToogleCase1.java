package PracticeStringJava27;

import java.util.Scanner;

public class ToogleCase1 {
	public static void main(String[] args) {
		System.out.println("ENter a String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a[]=s.toCharArray();
		int size =a.length;
		int i=0;
		while(i!=size) {
			if(a[i]>='A'&& a[i]<='Z') {
				a[i]=(char)(a[i]+32);
			}else if(a[i]>='a'&& a[i]<='z') {
				a[i]=(char)(a[i]-32);
			}
			i++;
		}
		System.out.println(a);
	}

}
