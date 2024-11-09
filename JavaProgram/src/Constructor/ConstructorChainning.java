package Constructor;
class Student1 {
    private String name;
    private int age;

    // Default constructor
    public Student1() {
        this("Rohit", 19);  // Calls the constructor with two arguments
        System.out.println("Default Constructor is called");
        name = "Rohan";
        age = 18;
    }

    // Constructor with one argument
    public Student1(String name) {
        this();  // Calls the default constructor
        this.name = name;
        age = 19;
    }

    // Constructor with two arguments
    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method to print the name and age
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorChainning {
    public static void main(String[] args) {
        // Creating an object with default constructor
        Student1 st1 = new Student1();
        st1.disp();

        // Creating an object with constructor that takes one argument
        Student1 st2 = new Student1("Rahul");
        st2.disp();
    }
}
