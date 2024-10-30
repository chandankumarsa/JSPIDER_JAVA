package Oct30;

public class RemoveDuplicateApproach2 {
    public static void main(String[] args) {
        String s = "abbaccd"; // Example input
        char[] a = s.toCharArray();
        int n = a.length;
        char[] b = new char[n];
        int k = 0;

        // Loop through each character
        for (int i = 0; i < n; i++) {
            boolean flag = false;

            // Check if character a[i] is already in array b
            for (int j = 0; j < k; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }

            // If character is not in array b, add it
            if (!flag) {
                b[k++] = a[i];
            }
        }

        // Print the result
        System.out.print("String without duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(b[i]);
        }
    }
}
