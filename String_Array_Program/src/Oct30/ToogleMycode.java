package Oct30;
import java.util.Scanner;

public class ToogleMycode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        
        char[] a = s.toCharArray(); // Convert string to char array
        int size = a.length;
        int i = 0;
        
        // Loop through each character in the array to toggle the case
        while (i != size) {
            if (a[i] >= 'A' && a[i] <= 'Z') {
                a[i] = (char)(a[i] + 32); // Convert uppercase to lowercase
            } else if (a[i] >= 'a' && a[i] <= 'z') {
                a[i] = (char)(a[i] - 32); // Convert lowercase to uppercase
            }
            i++;
        }
        // Convert the char array back to a string
        String toggledString = new String(a);
        System.out.println("Toggled case string: " + toggledString);
        
        scanner.close();
    }
}
