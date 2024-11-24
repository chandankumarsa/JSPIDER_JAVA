package Nov22ExceptionHandling;

public class NestedTyCatch {
    public static void main(String[] args) {
        try {
            try {
                int[] a = {10, 20, 30};
                System.out.println(a[100]); // This will throw ArrayIndexOutOfBoundsException
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e.getMessage());
                System.out.println(10 / 0); // This will throw ArithmeticException
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        }
    }
}
