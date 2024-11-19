package com.Nov15;

import java.util.Comparator;

class Employee {  // Renamed from "Emp" to "Employee"
    String name;
    double sal;

    public Employee(String n, double s) {
        name = n;
        sal = s;
    }

    public int compareTo(Object arg) {
        Employee e = (Employee) arg;  // Changed to Employee
        return name.compareTo(e.name); // Comparing based on names lexicographically
    }

    @Override
    public String toString() {
        return "name=" + name + ", sal=" + sal;
    }
}

class SalCompare implements Comparator<Employee> {  // Updated comparator to use "Employee"
    @Override
    public int compare(Employee arg1, Employee arg2) {
        double sal1 = arg1.sal;
        double sal2 = arg2.sal;
        if (sal1 > sal2) return 1;
        if (sal1 < sal2) return -1;
        return 0;
    }
}
