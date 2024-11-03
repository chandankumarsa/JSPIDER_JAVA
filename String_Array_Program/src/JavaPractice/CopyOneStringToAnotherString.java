package JavaPractice;

import java.util.Scanner;

public class CopyOneStringToAnotherString {
	public static void main(String[] args) {
		System.out.println("Enter A STring To Copy One String To Another String");
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		char y[] = s.toCharArray();
		int size = y.length;
		char a[] = new char[size];
		int i =0;
		while(i!=size) {
			a[i]=y[i];
			i++;
		}
		System.out.println("copy String is : ");
		System.out.println(a);
		
		
	}

}
