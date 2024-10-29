package Oct29;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String input = "  Java   is  a   programming   language.  "; // Given string with extra spaces
        String cleanedString = removeExtraSpaces(input); // Remove extra spaces
        System.out.println("Original String: '" + input + "'");
        System.out.println("Cleaned String: '" + cleanedString + "'");
    }

    public static String removeExtraSpaces(String s) {
        // Trim leading and trailing spaces, then replace multiple spaces with a single space
        return s.trim().replaceAll("\\s+", " ");
    }
}

//q=Java Program to Remove Extra Spaces from a Given String