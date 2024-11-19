public class ArrayList {
    private Object[] a; // Underlying array to store elements
    private int pos;    // Tracks the current size (number of elements)

    // Constructor to initialize the array with default size
    public ArrayList() {
        a = new Object[5];
        pos = 0;
    }

    // Method to add an element at the end
    public void add(Object e) {
        if (pos >= a.length) increase(); // Resize the array if needed
        a[pos++] = e; // Add the element and increment the position
    }

    // Method to dynamically increase the size of the array
    private void increase() {
        Object[] temp = new Object[a.length + 3]; // Create a larger array
        for (int i = 0; i < a.length; i++) { // Manually copy each element
            temp[i] = a[i];
        }
        a = temp; // Replace the old array with the new one
    }

    // Method to get the current size of the ArrayList
    public int size() {
        return pos;
    }

    // Method to get an element by index
    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(); // Throw exception for invalid index
        }
        return a[index];
    }

    // Method to remove an element by index
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(); // Throw exception for invalid index
        }
        for (int i = index + 1; i < size(); i++) {
            a[i - 1] = a[i]; // Shift elements to the left
        }
        pos--; // Reduce the size
        a[pos] = null; // Nullify the last element
    }

    // Method to add an element at a specific index
    public void add(int index, Object e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException(); // Throw exception for invalid index
        }
        if (pos >= a.length) increase(); // Resize the array if needed
        for (int i = size() - 1; i >= index; i--) {
            a[i + 1] = a[i]; // Shift elements to the right
        }
        a[index] = e; // Insert the new element
        pos++; // Increment the size
    }

    // Main method to demonstrate the ArrayList functionality
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // Printing elements
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Removing an element
        list.remove(3);

        // Printing elements after removal
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Adding an element at a specific index
        list.add(2, 25);

        // Printing elements after insertion
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
