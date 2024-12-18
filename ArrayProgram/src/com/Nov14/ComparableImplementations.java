package com.Nov14;

import java.util.Arrays;

class Circle implements Comparable<Circle> {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int compareTo(Circle other) {
        return this.radius - other.radius;
    }

    @Override
    public String toString() {
        return String.valueOf(this.radius);
    }
}

public class ComparableImplementations {
    public static void main(String[] args) {
        Circle[] a = {
            new Circle(40),
            new Circle(10),
            new Circle(50),
            new Circle(20)
        };

        Arrays.sort(a);

        for (Circle c : a) {
            System.out.println(c);
        }
    }
}
