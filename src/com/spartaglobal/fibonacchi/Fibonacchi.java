package com.spartaglobal.fibonacchi;

public class Fibonacchi {
    public static void loop(int count) {

        int a = 0, b = 1, c;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < count; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
