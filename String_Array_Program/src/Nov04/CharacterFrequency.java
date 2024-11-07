package Nov04;
public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "Jaava";
        StringBuilder output = new StringBuilder();
        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int freq = 0;

            // Count occurrences of currentChar
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    freq++;
                }
            }

            // Append to output if currentChar is not already counted
            if (output.indexOf(String.valueOf(currentChar).toLowerCase()) == -1) {
                output.append(currentChar).append("=").append(freq).append(" ");
            }
        }

        // Print the result
        System.out.println(output.toString().trim());
    }
}



