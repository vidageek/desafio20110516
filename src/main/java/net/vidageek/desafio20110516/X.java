package net.vidageek.desafio20110516;

final public class X {
    private static long fib(int n) {
        int a = 0, b = 1;
        while (n-- > 0) {
            int c = b;
            b = a + b;
            a = c;
        }
        return a;
    }


    public static long f(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            long c = b;
            b = a + b * twoRaisedTo(fib(i + 2));
            a = c;
        }
        return a;
    }


    private static long twoRaisedTo(long exponent) {
        return (long) Math.pow(2, exponent);
    }
}
