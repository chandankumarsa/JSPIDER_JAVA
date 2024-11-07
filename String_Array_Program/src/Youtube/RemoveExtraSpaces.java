package Youtube;
import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with extra spaces:");
        String input = scanner.nextLine();

        String result = input.trim().replaceAll("\\s+", " ");
        System.out.println("String after removing extra spaces:");
        System.out.println(result);
    }
}
//q=Java Program to Remove Extra Spaces from a Given String