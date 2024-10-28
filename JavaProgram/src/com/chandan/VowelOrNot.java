package com.chandan;

import java.util.Scanner;

public class VowelOrNot {
	public static void main(String[] args) {
		System.out.println("ENter a Character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch) {
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
		System.out.println(ch + " is a vowel");
		break;
		default:
		System.out.println(ch + " is not a vowel");
		}
	}

}


//by using switch statements to check Vowel or not

//charAt(0) is the string class