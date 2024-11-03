package JavaPractice;

import java.util.Scanner;

public class PalindromeProgram {
	public static void main(String[] args) {
		System.out.println("ENter A String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char y[] = s.toCharArray();
		int size =y.length;
		char a[] = new char[size];
		int i =0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		i =0;
		while(i!=size) {
			if(a[i]!=y[i]) {
				System.out.println("Not a Palindrome ");
				return;
			}else {
				i++;
				continue;
			}
		}
		System.out.println("String is Palindrome");
	}

}
