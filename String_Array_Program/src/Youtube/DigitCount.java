package Youtube;

import java.util.Scanner;

public class DigitCount {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        int digitCount = 0;
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= '0' && ch <= '9') {
	                digitCount++;
	            }
	        }
	        System.out.println("Number of digits: " + digitCount);
	        scanner.close();
	    }
}
