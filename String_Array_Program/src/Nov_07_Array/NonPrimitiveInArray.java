package Nov_07_Array;

import java.util.Arrays;

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

public class NonPrimitiveInArray {
    public static void main(String[] args) {
        Circle[] a = new Circle[4];
        a[0] = new Circle(50);
        a[1] = new Circle(60);
        a[2] = new Circle(30);
        a[3] = new Circle(20);
        
        for (Circle c : a) {
            System.out.println(c);
        }
        
        System.out.println(Arrays.toString(a));
    }
}

