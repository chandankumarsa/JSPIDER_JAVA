package com.chandan;

import java.util.Scanner;

public class SwitchCaseConcepts {
	public static void main(String[] args) {
		int n =3;
		switch(n) {
		case 1:
			System.out.println("Case-1");
			break;
			
		case 2:
			System.out.println("Case-2");
			break;
			
		case 3:
			System.out.println("Case-3");
			break;
			
		case 4:
			System.out.println("Case-4");
			break;
			default:
				System.out.println("Invalid Number");
		}
		
	}

}


//in switch case we can  switch() inside bracket we can pass the value of (value,variable,expression)not anyother