package com.chandan;

import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Upper Case.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lower Case.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number case");
        } else {
            System.out.println(ch + " is a Special Character.");
        }

    }
}


///write a java program to check given character is Alphabet,number or special character