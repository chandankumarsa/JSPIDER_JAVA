package PracticeJava;

import java.util.Scanner;

import oct26.SubString;

public class Substr {
	public static void main(String[] args) {
		System.out.println("ENter a Strings");
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		System.out.println(s.substring(5,10));
	}

}
