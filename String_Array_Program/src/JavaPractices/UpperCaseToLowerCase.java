package JavaPractices;

import java.util.Scanner;

public class UpperCaseToLowerCase {
	public static void main(String[] args) {
		System.out.println("Enter  A String ");
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char y[]=s.toCharArray();
		int size =y.length;
		char a[]=new char[size];
		int i =0;
		while(i!=size) {
			y[i]=(char)(y[i]+32);
			i++;
		}
		System.out.println(y);
	}

}
