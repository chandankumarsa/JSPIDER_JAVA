package Lec_8;

import java.util.Scanner;

public class TemperatureProgram {
    public static void main(String[] args) {
        System.out.println("Enter Celsius:");
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float res = (9.0f / 5.0f * c) + 32; // Use floating-point division
        System.out.println("Temperature in Fahrenheit: " + res);
    }
}
