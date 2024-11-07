package Nov06;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberFormatValidations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Phone Number:");
        String phn = sc.nextLine(); // Get user input and store it in the variable 'phn'
        
        if (isPhoneNum(phn)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        
        sc.close(); // Close the scanner to prevent resource leak
    }

    static boolean isPhoneNum(String p) {
        Pattern ptrn = Pattern.compile("[6-9][0-9]{9}");
        return ptrn.matcher(p).matches();
    }
}
