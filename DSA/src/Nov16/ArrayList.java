package Nov16;

public class ArrayList {
    private Object[] a;
    private int pos;

    public ArrayList() {
        a = new Object[5];
        pos = 0;
    }

    public void add(Object e) {
        if (pos >= a.length) increase();
        a[pos++] = e;
    }

    private void increase() {
        Object[] temp = new Object[a.length + 3];
        System.arraycopy(a, 0, temp, 0, a.length);
        a = temp;
    }

    public void display() {
        for (int i = 0; i < pos; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);

        l.display(); // Print the elements of the ArrayList
    }
}
