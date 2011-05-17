package net.vidageek.desafio20110516;

final public class X {
    private static long fib(int n) {
        int x = 0, y = 1;
        while (n --> 0) {
            int z = y;
            y = x + y;
            x = z;
        }
        return y;
    }


    public static long f(int n) {
        long a = 1, b = 0;
        for (int i = 0; i < n; i++) {
            long c = b;
            b = a;
            a = b * (long) Math.pow(2, fib(i + 1)) + c;
        }
        return b;
    }
}
