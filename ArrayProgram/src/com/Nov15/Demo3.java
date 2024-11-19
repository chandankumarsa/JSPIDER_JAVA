package com.Nov15;
import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        Emplo[] arr = {
            new Emplo("maheshbabu", 222000.4),
            new Emplo("balayya", 333020.3),
            new Emplo("puneeth", 442349.6),
            new Emplo("alluarjun", 883888.5)
        };

        Arrays.sort(arr, new SalCompar());

        for (Emplo e : arr) {
            System.out.println(e);
        }
    }
}

class Emplo {
    String name;
    double sal;

    Emplo(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return name + ": " + sal;
    }
}

class SalCompar implements Comparator<Emplo> {
    public int compare(Emplo arg1, Emplo arg2) {
        double sal1 = arg1.sal;
        double sal2 = arg2.sal;
        if (sal1 > sal2) return 1;
        if (sal1 < sal2) return -1;
        return 0;
    }
}
