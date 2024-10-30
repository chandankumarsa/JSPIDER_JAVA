package Oct30;
import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S1 = scanner.nextLine();
        
        String S2 = ""; // Result string
        char[] A = S1.toCharArray(); // Convert S1 to character array
        int i = 0;
        
        while (i < A.length) {
            char C = A[i];
            int Count = 0;
            
            while (i < A.length && A[i] == C) {
                Count++;
                i++;
            }
            
            S2 = S2 + Count + C;
        }
        
        System.out.println("Output: " + S2);
        scanner.close();
    }
}
