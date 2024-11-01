package Oct31;

//Example 1
import java.util.Stack;

public class StackDemo {
 public static void main(String[] args) {
     Stack<Character> st = new Stack<Character>();
     
     System.out.println(st.isEmpty());
     st.push('a');
     st.push('b');
     
     System.out.println(st.isEmpty());
     System.out.println(st.pop());
     System.out.println(st.pop());
     System.out.println(st.isEmpty());
 }
}


//This Java code demonstrates the basic functionality of a stack using the `Stack` class. In the `main` method:
//
//1. A stack of characters (`st`) is created.
//2. It checks if the stack is empty and prints the result.
//3. Two characters (`'a'` and `'b'`) are pushed onto the stack.
//4. It checks again if the stack is empty, then pops (removes and returns) the top character from the stack twice, printing each character.
//5. Finally, it checks if the stack is empty again and prints the result.
//
//The purpose is to illustrate how to use a stack for adding and removing elements while tracking its state (empty or not).