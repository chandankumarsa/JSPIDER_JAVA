package com.Nov15;

import java.util.Arrays;

class Emp implements Comparable<Emp> { // Changed class name to "Emp"
    String name;
    double sal;

    public Emp(String n, double s) {
        name = n;
        sal = s;
    }

    @Override
    public int compareTo(Emp e) {
        if (sal > e.sal) return 1;
        if (sal < e.sal) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "name=" + name + ", sal=" + sal;
    }
}

public class Demo { // Main class retains the name "Demo"
    public static void main(String[] args) {
        Emp[] arr = { // Use the renamed "Emp" class here
            new Emp("Chandan", 63534.6),
            new Emp("Kumar", 100.6),
            new Emp("ChandaSahu", 69999.34),
            new Emp("Sahu", 66565.34)
        };

        Arrays.sort(arr); // Sorting based on salary

        for (Emp e : arr) {
            System.out.println(e); // Printing sorted employees
        }
    }
}
