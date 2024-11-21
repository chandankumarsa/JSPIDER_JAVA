package Nov20;

public class DoubleLinkedList {

    private Node first;
    private int count;

    // Add element at the end of the list
    void add(Object e) {
        if (first == null) {
            first = new Node(e);
            count++;
            return;
        }
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(e, curr, null);
        count++;
    }

    // Add element at a specific index
    public void add(int index, Object e) {
        if (index < 0 || index > size()) { // Allow adding at the end
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            Node n = new Node(e, null, first);
            if (first != null) {
                first.prev = n;
            }
            first = n;
            count++;
            return;
        }
        Node curr = first;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        Node n = new Node(e, curr, curr.next);
        if (curr.next != null) {
            curr.next.prev = n;
        }
        curr.next = n;
        count++;
    }

    // Return the size of the list
    public int size() {
        return count;
    }

    // Get element at a specific index
    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node curr = first;
        for (int i = 0; i < index; i++) { // Fixed loop condition
            curr = curr.next;
        }
        return curr.ele;
    }

    // Traverse and print the list
    public void traverse() {
        Node curr = first;
        while (curr != null) {
            System.out.print(curr.ele + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Remove element at a specific index
    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = first.next;
            if (first != null) { // Prevent NullPointerException
                first.prev = null;
            }
            count--;
            return;
        }
        Node curr = first;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next != null) {
            curr.next.prev = curr;
        }
        count--;
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = first;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        first = prev;
    }

    // Inner class for Node
    private static class Node {
        Object ele;
        Node prev;
        Node next;

        public Node(Object e) {
            ele = e;
        }

        public Node(Object e, Node p, Node n) {
            ele = e;
            prev = p;
            next = n;
        }
    }
}
