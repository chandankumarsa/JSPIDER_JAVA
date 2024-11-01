package Practice;

import java.util.Scanner;

public class rev {
	public static void main(String[] args) {
		System.out.println("Enter A String");
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char y[]= s.toCharArray();
		int size = y.length;
		char a[]= new char[size];
		int i= 0;
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		System.out.println("reverse String  is "+a);
		System.out.println(y);
	}

}
