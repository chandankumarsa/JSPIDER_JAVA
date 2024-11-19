package Nov17;
public class ArrayListImplementations {
    private Object[] a;
    private int pos;

    public ArrayListImplementations() {
        a = new Object[5];
        pos = 0;
    }

    public void add(Object e) {
        if (pos >= a.length) increase();
        a[pos++] = e;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > pos) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + pos);
        }
        if (pos >= a.length) increase();
        for (int i = pos; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = e;
        pos++;
    }

    public Object get(int index) {
        if (index < 0 || index >= pos) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + pos);
        }
        return a[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= pos) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + pos);
        }
        for (int i = index; i < pos - 1; i++) {
            a[i] = a[i + 1];
        }
        a[--pos] = null; // Clear the last element
    }

    private void increase() {
        Object[] temp = new Object[a.length + 3];
        System.arraycopy(a, 0, temp, 0, a.length);
        a = temp;
    }

    public int size() {
        return pos;
    }

    public void display() {
        for (int i = 0; i < pos; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListImplementations list = new ArrayListImplementations();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("Original list:");
        list.display();

        System.out.println("Add element at index 3:");
        list.add(3, 35);
        list.display();

        System.out.println("Remove element at index 2:");
        list.remove(2);
        list.display();

        System.out.println("Element at index 4: " + list.get(4));

        System.out.println("Size of the list: " + list.size());
    }
}
