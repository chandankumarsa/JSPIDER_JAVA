package LinkedListWithErrorException;
public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        // Test inserting elements
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);

        // Display the list
        System.out.println("Initial list:");
        list.display();

        // Test deleting elements
        System.out.println("Deleted first element: " + list.deleteFirst());
        list.display();

        System.out.println("Deleted last element: " + list.deleteLast());
        list.display();

        System.out.println("Deleted element at index 2: " + list.delete(2));
        list.display();

        // Test reverse functionality
        System.out.println("Reversed list:");
        list.reverse();
        list.display();

        // Attempt operations on empty list
        list = new LL(); // Reset list to empty
        System.out.println("Attempting operations on an empty list:");
        try {
            list.deleteFirst();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            list.deleteLast();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
