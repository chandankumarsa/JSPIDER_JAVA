package com.chandan;
import java.util.Scanner;
public class Currency_Calculator {
    
    public static void main(String[] args) {
        System.out.println("Enter the Amount to Calculate The Currency");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int count = 0;
        
        // For 2000 notes
        if(amount >= 2000) {
            count = amount / 2000;
            System.out.println("2000's = 2000 x " + count);
            amount = amount % 2000;
        }
        
        // For 500 notes
        if(amount >= 500) {
            count = amount / 500;
            System.out.println("500's = 500 x " + count);
            amount = amount % 500;
        }
        
        // For 200 notes
        if(amount >= 200) {
            count = amount / 200;
            System.out.println("200's = 200 x " + count);
            amount = amount % 200;
        }
        
        // For 100 notes
        if(amount >= 100) {
            count = amount / 100;
            System.out.println("100's = 100 x " + count);
            amount = amount % 100;
        }
    }
}


//write a java Program to Currency Calculator
