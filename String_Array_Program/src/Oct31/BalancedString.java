package Oct31;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(isBalanced("[ 5+{4 * (2 + 3) }]"));
    }

    static boolean isBalanced(String arg) {
        String s = "";
        for (int i = 0; i < arg.length(); i++) {
            char c = arg.charAt(i);
            if (c == '[' || c == ']' || c == '{' || c == '}' || c == 'c' || c == ')')
                s += c;
            
        }

        // System.out.println(s);
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }

        return s.length() == 0;
    }
}


/*
This Java code checks if brackets in a string are balanced. It works as follows:

Filter Brackets: Extracts only the brackets ([, ], {, }, (, )) from the input string.
Remove Pairs: Repeatedly removes matching pairs ([], {}, ()) from the filtered string.
Check Balance: If all brackets are removed and the string is empty, it returns true (balanced); otherwise, it returns false (unbalanced).
*/