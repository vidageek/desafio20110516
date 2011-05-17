package net.vidageek.desafio20110516;

final public class X {
    private static long fib(int n) {
        int a = 0, b = 1;
        while (n --> 0) {
            int c = b;
            b = a + b;
            a = c;
        }
        return b;
    }


    public static long f(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            long c = a;
            a = b;
            b = a * (long) Math.pow(2, fib(i + 1)) + c;
        }
        return a;
    }
}
