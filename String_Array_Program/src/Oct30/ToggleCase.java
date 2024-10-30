package Oct30;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        
        char[] a = s.toCharArray();
        
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char)(a[i] + 32); // Convert uppercase to lowercase
            } else if(a[i] >= 'a' && a[i] <= 'z') {
                a[i] = (char)(a[i] - 32); // Convert lowercase to uppercase
            }
        }
        
        String toggledString = new String(a);
        System.out.println("Toggled case string: " + toggledString);
        
        scanner.close();
    }
}
/*
Example Run
Input: Java
Output: jAVA
*/