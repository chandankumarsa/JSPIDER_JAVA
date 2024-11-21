package Nov20;
public class Test1 {
    public static void main(String[] args) {
        DoubleLinkedList l = new DoubleLinkedList();
        // Adding elements
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(10);
        // Test cases
        l.add(0, 50); // Add at the beginning
        l.traverse(); // 50 10 20 30 40 10 10

        l.reverse(); // Reverse the list
        l.traverse(); // 10 10 40 30 20 10 50

        l.add(3, 60); // Add at index 3
        l.traverse(); // 10 10 40 60 30 20 10 50

        l.remove(0); // Remove the first element
        l.traverse(); // 10 40 60 30 20 10 50

        l.remove(4); // Remove the element at index 4
        l.traverse(); // 10 40 60 30 10 50
    }
}
