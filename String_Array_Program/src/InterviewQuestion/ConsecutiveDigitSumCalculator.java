package InterviewQuestion;

import java.util.Scanner;

public class ConsecutiveDigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int sum = 0;
        String result = "";
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                temp += ch;
            } else {
                if (!temp.equals("")) {
                    int num = 0;
                    for (int j = 0; j < temp.length(); j++) {
                        num = num * 10 + (temp.charAt(j) - '0');
                    }
                    
                    if (!result.equals("")) {
                        result += " + ";
                    }
                    result += temp;
                    sum += num;
                    temp = "";
                }
            }
        }
        
        if (!temp.equals("")) {
            int num = 0;
            for (int j = 0; j < temp.length(); j++) {
                num = num * 10 + (temp.charAt(j) - '0');
            }
            
            if (!result.equals("")) {
                result += " + ";
            }
            result += temp;
            sum += num;
        }
        
        System.out.println(result + " = " + sum);
    }
}
