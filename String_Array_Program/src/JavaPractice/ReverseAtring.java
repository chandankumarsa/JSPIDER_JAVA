package JavaPractice;

import java.util.Scanner;

public class ReverseAtring {
	public static void main(String[] args) {
		System.out.println("ENter A String To Reverse");
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
		System.out.println("Reverse String Is : ");
		System.out.println(a);
	}

}
