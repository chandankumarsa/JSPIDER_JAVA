package Youtube;
public class SwapWithoutUsingthirdString {
    public static void main(String[] args) {
        String a = "ABC";
        String b = "Tech";

        // Display initial values of a and b
        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Step 1: Concatenate both strings and store in 'a'
        a = a + b; // Now, a = "ABCTech"

        // Step 2: Extract original value of 'a' and assign it to 'b'
        b = a.substring(0, a.length() - b.length()); // b becomes "ABC"

        // Step 3: Extract original value of 'b' and assign it to 'a'
        a = a.substring(b.length()); // a becomes "Tech"

        // Display swapped values of a and b
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
