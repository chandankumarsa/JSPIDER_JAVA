package com.Nov13;

public class NumberToWord_InterviewAsked {
    public static void main(String[] args) {
        int num = 100085;
        pw(num);
    }

    public static void pw(int num) {
        String[] one = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                         "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                         "eighteen", "nineteen" };
        String[] ten = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        if (num == 0) {
            System.out.print("zero");
            return;
        }

        if (num >= 10000000) {
            pw(num / 10000000);
            System.out.print(" crore ");
            pw(num % 10000000);
        } else if (num >= 100000) {
            pw(num / 100000);
            System.out.print(" lakh ");
            pw(num % 100000);
        } else if (num >= 1000) {
            pw(num / 1000);
            System.out.print(" thousand ");
            pw(num % 1000);
        } else if (num >= 100) {
            pw(num / 100);
            System.out.print(" hundred ");
            pw(num % 100);
        } else if (num > 19) {
            System.out.print(ten[num / 10] + " ");
            pw(num % 10);
        } else {
            System.out.print(one[num]);
        }
    }
}
