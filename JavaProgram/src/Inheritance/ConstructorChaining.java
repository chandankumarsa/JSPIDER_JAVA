package Inheritance;

class Demo1 {
    int a, b;
    
    public Demo1() {
        System.out.println("Parent class Constructor");
    }
    
    public Demo1(int x, int y) {
        System.out.println("Parameterized Parent class Constructor");
        a = x;
        b = y;
    }
}

class Demo2 extends Demo1 {
    int m, n;
    
    public Demo2() {
        this(10, 20); // Calls the parameterized constructor of Demo2
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y) {
        super(x, y); // Calls the parameterized constructor of Demo1
        System.out.println("Parameterized Child class Constructor");
        m = x;
        n = y;
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2(); // Calls the default constructor of Demo2

        System.out.println("\nCreating a parameterized Demo2 object:");
        Demo2 d2 = new Demo2(30, 40); // Calls the parameterized constructor of Demo2
    }
}
